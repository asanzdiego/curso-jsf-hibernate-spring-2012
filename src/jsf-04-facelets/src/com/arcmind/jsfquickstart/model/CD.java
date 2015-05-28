/*
 * Created on May 16, 2004
 *
 */
package com.arcmind.jsfquickstart.model;

/**
 * DOCUMENT ME!
 *
 * @author Richard Hightower
 */
public class CD implements java.io.Serializable {
    //~ Instance fields --------------------------------------------------------

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** DOCUMENT ME! */
    private Long id;

    /** DOCUMENT ME! */
    private String artist;

    /** DOCUMENT ME! */
    private String category;

    /** DOCUMENT ME! */
    private String subCategory;

    /** DOCUMENT ME! */
    private String title;

    /** DOCUMENT ME! */
    private float price;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new CD object.
     */
    public CD() {
    }

    /**
     * Creates a new CD object.
     *
     * @param aTitle DOCUMENT ME!
     * @param aArtist DOCUMENT ME!
     * @param aPrice DOCUMENT ME!
     * @param aCategory DOCUMENT ME!
     */
    public CD(String aTitle, String aArtist, float aPrice, String aCategory) {
        this.title = aTitle;
        this.artist = aArtist;
        this.price = aPrice;
        this.category = aCategory;
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @param aArtist The artist to set.
     *
     * @uml.property name="artist"
     */
    public void setArtist(String aArtist) {
        this.artist = aArtist;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the artist.
     *
     * @uml.property name="artist"
     */
    public String getArtist() {
        return artist;
    }

    /**
     * DOCUMENT ME!
     *
     * @param aCategory The category to set.
     *
     * @uml.property name="category"
     */
    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the category.
     *
     * @uml.property name="category"
     */
    public String getCategory() {
        return category;
    }

    /**
     * DOCUMENT ME!
     *
     * @param aId The id to set.
     *
     * @uml.property name="id"
     */
    public void setId(Long aId) {
        this.id = aId;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the id.
     *
     * @uml.property name="id"
     */
    public Long getId() {
        return id;
    }

    /**
     * DOCUMENT ME!
     *
     * @param aPrice The price to set.
     *
     * @uml.property name="price"
     */
    public void setPrice(float aPrice) {
        this.price = aPrice;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the price.
     *
     * @uml.property name="price"
     */
    public float getPrice() {
        return price;
    }

    /**
     * DOCUMENT ME!
     *
     * @param aSubCategory The subCategory to set.
     *
     * @uml.property name="subCategory"
     */
    public void setSubCategory(String aSubCategory) {
        this.subCategory = aSubCategory;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the subCategory.
     *
     * @uml.property name="subCategory"
     */
    public String getSubCategory() {
        return subCategory;
    }

    /**
     * DOCUMENT ME!
     *
     * @param aTitle The title to set.
     *
     * @uml.property name="title"
     */
    public void setTitle(String aTitle) {
        this.title = aTitle;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the title.
     *
     * @uml.property name="title"
     */
    public String getTitle() {
        return title;
    }
}
