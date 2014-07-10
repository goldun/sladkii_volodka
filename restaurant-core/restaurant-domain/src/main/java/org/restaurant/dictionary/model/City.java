package org.restaurant.dictionary.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.restaurant.IEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class City.
 */
@Entity
@Table(name = "CITY")
public class City implements IEntity {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5280934701939187999L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REGION_SEQ")
    @SequenceGenerator(name = "REGION_SEQ", sequenceName = "REGION_SEQ")
    @Column(name = "region_id")
    private Long id;

    /** The city code. */
    @NotNull
    @Column(name = "city_code")
    private String cityCode;

    /** The name. */
    @NotNull
    @Column(name = "name")
    private String name;

    /** The localized name. */
    @NotNull
    @Column(name = "localized_name")
    private String localizedName;

    /** The phone code. */
    @Column(name = "phone_code")
    private String phoneCode;

    /**
     * Gets the city code.
     * 
     * @return the city code
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Gets the localized name.
     * 
     * @return the localized name
     */
    public String getLocalizedName() {
        return this.localizedName;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the phone code.
     * 
     * @return the phone code
     */
    public String getPhoneCode() {
        return this.phoneCode;
    }

}
