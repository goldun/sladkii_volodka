package org.restaurant.dictionary.model;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.restaurant.IEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class Country.
 */
@Entity
@Table(name = "COUNTRY")
public class Country implements IEntity {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 775211885841024286L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COUNTRY_SEQ")
    @SequenceGenerator(name = "COUNTRY_SEQ", sequenceName = "COUNTRY_SEQ")
    @Column(name = "country_id")
    private Long id;

    /** The countryISO3Code. */
    @NotNull
    @Column(name = "ISO3_code")
    private String countryISO3Code;

    /** The localized name. */
    @NotNull
    @Column(name = "localized_name")
    private String localizedName;

    /** The phone code. */
    @Column(name = "phone_code")
    private String phoneCode;

    /** The region list. */
    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    @MapKey(name = "region_code")
    private Map<String, Region> regions;

    /**
     * Adds the region.
     * 
     * @param region the region
     */
    public void addRegion(final Region region) {
        this.regions.put(region.getName(), region);
    }

    /**
     * Gets the country is o3 code.
     * 
     * @return the country is o3 code
     */
    public String getCountryISO3Code() {
        return this.countryISO3Code;
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
     * Gets the phone code.
     * 
     * @return the phone code
     */
    public String getPhoneCode() {
        return this.phoneCode;
    }

    /**
     * Gets the regions map.
     * 
     * @return the regions map
     */
    public Map<String, Region> getRegions() {
        return this.regions;
    }

}
