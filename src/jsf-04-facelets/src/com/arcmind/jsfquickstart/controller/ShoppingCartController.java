/*
 * Created on May 16, 2004
 *
 */
package com.arcmind.jsfquickstart.controller;

import com.arcmind.jsfquickstart.model.CD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.faces.context.FacesContext;


/**
 * DOCUMENT ME!
 *
 * @author Richard Hightower
 */
public class ShoppingCartController {
    //~ Instance fields --------------------------------------------------------

    /** DOCUMENT ME! */
    private List items = new ArrayList();

    /** DOCUMENT ME! */
    private Map itemMap = new TreeMap();

    //~ Methods ----------------------------------------------------------------

    /**
     * TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     *
     * @uml.property name="items"
     */
    public Collection getItems() {
        return items;
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    public String add() {
        /* Grab the request map from the faces context */
        FacesContext context = FacesContext.getCurrentInstance();
        Map map = context.getExternalContext().getRequestParameterMap();

        /* Make sure we don't add the same title twice */
        String title = (String) map.get("title");
        CD cd = (CD) itemMap.get(title);

        if (cd != null) {
            return "add";
        }

        /* Grab the aritst and title fields from the request map */
        String artist = (String) map.get("artist");
        float price = Float.parseFloat((String) map.get("price"));

        /* Create a new CD and add it to the list and map */
        cd = new CD(title, artist, price, "");
        itemMap.put(cd.getTitle(), cd);
        items.add(cd);

        return "add";
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    public String remove() {
        /* Grab the request map from the faces context. */
        FacesContext context = FacesContext.getCurrentInstance();
        Map map = context.getExternalContext().getRequestParameterMap();

        /* Grab the title from the request parameter.
         * Use the title to remove the CD from the collection and map.*/
        String title = (String) map.get("title");
        CD cd = (CD) itemMap.get(title);
        itemMap.remove(cd.getTitle());

        itemMap.remove(title);
        items.remove(cd);

        return "remove";
    }
}
