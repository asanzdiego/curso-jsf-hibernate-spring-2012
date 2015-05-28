/*
 * Created on May 16, 2004
 *
 */
package com.arcmind.jsfquickstart.controller;

import com.arcmind.jsfquickstart.logic.StoreManagerDelegate;
import com.arcmind.jsfquickstart.model.CD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.faces.component.UIInput;
import javax.faces.component.html.HtmlSelectOneListbox;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;


/**
 * StoreController
 *
 * @author Richard Hightower
 */
public class StoreController implements java.io.Serializable {
    //~ Instance fields --------------------------------------------------------

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * CD being edited, added, or updated.
     *
     * @uml.property name="cd"
     * @uml.associationEnd multiplicity="(0 1)"
     */
    private CD cd;

    /** List of cds for CD listing. */
    private DataModel cdModel = new ListDataModel();

    /** Subcategories list. */
    private List subCategories = Collections.EMPTY_LIST;

    /**
     * Business Delegate
     *
     * @uml.property name="store"
     * @uml.associationEnd multiplicity="(0 1)"
     */
    private StoreManagerDelegate store = new StoreManagerDelegate();

    /** GUI Component that represents the Subcategory list on the CDForm. */
    private UIInput subCategoryList;

    /** Denotes we are in edit mode. */
    private boolean editMode = false;

    {
        cdModel.setWrappedData(store.findTitleAsc());
        subCategoryList = new HtmlSelectOneListbox();
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @return Returns the categories.
     */
    public List getCategories() {
        return getCategoriesList();
    }

    /**
     * DOCUMENT ME!
     *
     * @param aCd The cd to set.
     *
     * @uml.property name="cd"
     */
    public void setCd(CD aCd) {
        this.cd = aCd;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the cd.
     *
     * @uml.property name="cd"
     */
    public CD getCd() {
        return cd;
    }

    /**
     * List of CDs in the system.
     *
     * @return Returns the cds.
     */
    public DataModel getCds() {
        return cdModel;
    }

    /**
     * DOCUMENT ME!
     *
     * @param aEditMode The editMode to set.
     *
     * @uml.property name="editMode"
     */
    public void setEditMode(boolean aEditMode) {
        this.editMode = aEditMode;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the editMode.
     *
     * @uml.property name="editMode"
     */
    public boolean isEditMode() {
        return editMode;
    }

    /**
     * DOCUMENT ME!
     *
     * @param aSubCategories The subCategories to set.
     *
     * @uml.property name="subCategories"
     */
    public void setSubCategories(List aSubCategories) {
        this.subCategories = aSubCategories;
    }

    /**
     * Subcategories
     *
     * @return Returns the subCategories.
     *
     * @uml.property name="subCategories"
     */
    public List getSubCategories() {
        return subCategories;
    }

    /**
     * Subcategory list component
     *
     * @param aSubCategoryList The subCategoryList to set.
     *
     * @uml.property name="subCategoryList"
     */
    public void setSubCategoryList(UIInput aSubCategoryList) {
        this.subCategoryList = aSubCategoryList;
    }

    /**
     * Subcategory list component
     *
     * @return Returns the subCategoryList.
     *
     * @uml.property name="subCategoryList"
     */
    public UIInput getSubCategoryList() {
        return subCategoryList;
    }

    /**
     * Add a cd to the store.
     *
     * @return outcome
     */
    public String addCD() {
        store.addCD(this.cd);

        return "success";
    }

    /**
     * Prepare the cdForm to add a new CD. This gets executed before we prompt
     * the user to add a new CD.
     *
     * @return success
     */
    public String addNew() {
        if (subCategoryList == null) {
            subCategoryList = new HtmlSelectOneListbox();
            subCategoryList.setId("subCategoryList");
        }

        subCategoryList.setRendered(false);
        this.cd = new CD();

        return "success";
    }

    /**
     * Event Handler for a category getting selected.
     *
     * @param event event data
     */
    public void categorySelected(ValueChangeEvent event) {
        subCategoryList.setRendered(true);

        String value = (String) event.getNewValue();

        if (value != null) {
            this.subCategories = this.getSubcategoriesList(value);
        }

        FacesContext context = FacesContext.getCurrentInstance();
        context.renderResponse();
    }

    /**
     * Edit the CD. This get executed before the edit cdForm page gets loaded.
     *
     * @return outcome
     */
    public String editCD() {
        this.cd = (CD) cdModel.getRowData();
        this.cd = (CD) store.getCDById(cd.getId());

        if ((cd.getCategory() != null) || !"".equals(cd.getCategory())) {
            this.subCategoryList.setRendered(true);

            this.subCategories = getSubcategoriesList(cd.getCategory());
        } else {
            this.subCategoryList.setRendered(false);
        }

        this.editMode = true;

        return "success";
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    public String sortArtistAsc() {
        this.cdModel.setWrappedData(store.findArtistAsc());

        return "asc";
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    public String sortArtistDec() {
        this.cdModel.setWrappedData(store.findArtistDec());

        return "dec";
    }

    /**
     * Uses the store delegate to return
     * a sorted list of CDs by title (asceding).
     *
     * @return asc
     */
    public String sortTitleAsc() {
        this.cdModel.setWrappedData(store.findTitleAsc());

        return "asc";
    }

    /**
     * Uses the store delegate to return
     * a sorted list of CDs by title (decseding).
     *
     * @return dec
     */
    public String sortTitleDec() {
        this.cdModel.setWrappedData(store.findTitleDec());

        return "dec";
    }

    /**
     * Update the CD loaded on the form.
     *
     * @return success
     */
    public String updateCD() {
        store.updateCD(this.cd);
        this.editMode = false;

        return "success";
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    private List getCategoriesList() {
        List list = store.getCategories();

        return wrapAsGUIList(list);
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @param category TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    private List getSubcategoriesList(String category) {
        List list = store.getSubcategories(category);

        return wrapAsGUIList(list);
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @param originalList TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    private List wrapAsGUIList(List originalList) {
        List cats = new ArrayList();

        for (Iterator iter = originalList.iterator(); iter.hasNext();) {
            String subcategory = (String) iter.next();
            SelectItem item = new SelectItem(subcategory);
            cats.add(item);
        }

        return cats;
    }
    
    public String sort() {
    	String by = (String) FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("by");
    	String order = (String) FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("order");
    	if ("artist".equals(by)) {
    		if ("asc".equals(order)) {
    			return this.sortArtistAsc();
    		} else if ("dec".equals(order)) {
    			return this.sortArtistDec();
    		}
    	} else if ("title".equals(by)) {
    		if ("asc".equals(order)) {
    			return this.sortTitleAsc();
    		} else if ("dec".equals(order)) {
    			return this.sortTitleDec();
    		}
    	}
    	
    	throw new IllegalStateException("You should never get this far!");
    }
}
