/*
 * Created on May 16, 2004
 *
 */
package com.arcmind.jsfquickstart.logic;

import com.arcmind.jsfquickstart.model.CD;

import org.apache.commons.beanutils.BeanUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * Business delegate  that represent the inventory of the store.
 *
 * @author Richard Hightower
 */
public class StoreManagerDelegate implements java.io.Serializable {
    //~ Static fields/initializers ---------------------------------------------

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * DOCUMENT ME!
     */
    private static int index = 0;

    //~ Instance fields --------------------------------------------------------

    /**
     * DOCUMENT ME!
     */
    private List cds = new ArrayList();

    /**
     * DOCUMENT ME!
     */
    private Map categories = new TreeMap();

    /**
     * DOCUMENT ME!
     */
    private Map cdMap = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private String sortByProperty = "title";

    /**
     * DOCUMENT ME!
     */
    private transient final Comparator propertyAscendingComparator = new Comparator() {
            public int compare(Object object1, Object object2) {
                try {
                    String property1 = BeanUtils.getProperty(object1,
                            StoreManagerDelegate.this.sortByProperty
                        );
                    String property2 = BeanUtils.getProperty(object2,
                            StoreManagerDelegate.this.sortByProperty
                        );

                    return property1.toLowerCase().compareTo(property2.toLowerCase());
                } catch (Exception e) {
                    return 0;
                }
            }
        };

    /**
     * DOCUMENT ME!
     */
    private transient final Comparator propertyDescendingComparator = new Comparator() {
            public int compare(Object object1, Object object2) {
                try {
                    String property1 = BeanUtils.getProperty(object1,
                            StoreManagerDelegate.this.sortByProperty
                        );
                    String property2 = BeanUtils.getProperty(object2,
                            StoreManagerDelegate.this.sortByProperty
                        );

                    return property2.toLowerCase().compareTo(property1.toLowerCase());
                } catch (Exception e) {
                    return 0;
                }
            }
        };

    /**
     * DOCUMENT ME!
     */
    private List countryCategory = new ArrayList();

    /**
     * DOCUMENT ME!
     */
    private List rAndBCategory = new ArrayList();

    /**
     * DOCUMENT ME!
     */
    private List rockCategory = new ArrayList();

    { //instance initializer to generate some sample data
        countryCategory.add("Blue Grass");
        countryCategory.add("Classic Western");
        countryCategory.add("Popular Western");
        categories.put("Country Western", countryCategory);

        rockCategory.add("Modern");
        rockCategory.add("Classic");
        rockCategory.add("Acid");
        rockCategory.add("Country Fried");
        categories.put("Rock", rockCategory);

        rAndBCategory.add("Soul");
        rAndBCategory.add("Blues");
        rAndBCategory.add("Rap");
        rAndBCategory.add("Motown");
        categories.put("R&B", rAndBCategory);

        addCD(new CD("Scarecrow", "Garth Brooks", 15.89f, "Country Western"));
        addCD(new CD("Downward Spiral", "NIN", 19.89f, "Rock"));
        addCD(new CD("Meat is Murder", "Smiths", 12.89f, "Rock"));
        addCD(new CD("Great Big Sea", "Great Big Sea", 8.39f, "Rock"));
        addCD(new CD("1984", "Van Halen", 8.39f, "Rock"));
        addCD(new CD("Synchronicity", "The Police", 8.39f, "Rock"));
        addCD(new CD("Love Gun", "KISS", 8.39f, "Rock"));
        addCD(new CD("Purple Rain", "Prince", 8.39f, "Rock"));
        addCD(new CD("I missed the bus", "Skank and Pickle", 8.39f, "Rock"));
        addCD(new CD("Jambalaya", "Hank Williams Sr.", 8.39f, "Country Western"));
        addCD(new CD("Seven", "Garth Brooks", 15.89f, "Country Western"));
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @param id id of CD.
     *
     * @return CD
     */
    public CD getCDById(Long id) {
        return (CD) cdMap.get(id);
    }

	/**
	 * TODO DOCUMENT ME!
	 * 
	 * @return TODO DOCUMENT ME!
	 * 
	 * @uml.property name="categories"
	 */
	public List getCategories() {
		return new ArrayList(categories.keySet());
	}

    /**
     * TODO DOCUMENT ME!
     *
     * @param category TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    public List getSubcategories(String category) {
        return (List) categories.get(category);
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @param cd TODO DOCUMENT ME!
     */
    public void addCD(CD cd) {
        cd.setId(new Long(index++));
        cds.add(cd);
        cdMap.put(cd.getId(), cd);
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    public List findArtistAsc() {
        sortByProperty = "artist";
        sort(propertyAscendingComparator);

        return cds;
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    public List findArtistDec() {
        sortByProperty = "artist";
        sort(propertyDescendingComparator);

        return cds;
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    public List findTitleAsc() {
        sortByProperty = "title";
        sort(propertyAscendingComparator);

        return cds;
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    public List findTitleDec() {
        sortByProperty = "title";
        sort(propertyDescendingComparator);

        return cds;
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @param id TODO DOCUMENT ME!
     *
     * @return TODO DOCUMENT ME!
     */
    public CD readCD(int id) {
        CD cd = (CD) this.cds.get(id);

        return cd;
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @param cd TODO DOCUMENT ME!
     */
    public void updateCD(CD cd) {
        //
    }

    /**
     * TODO DOCUMENT ME!
     *
     * @param comparator TODO DOCUMENT ME!
     */
    private void sort(Comparator comparator) {
        Collections.sort(cds, comparator);
    }
}
