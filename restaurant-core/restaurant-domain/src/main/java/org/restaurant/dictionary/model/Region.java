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
 * The Class Region.
 */
@Entity
@Table(name = "REGION")
public class Region implements IEntity {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6256363359275225147L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REGION_SEQ")
    @SequenceGenerator(name = "REGION_SEQ", sequenceName = "REGION_SEQ")
    @Column(name = "region_id")
    private Long id;

    /** The region code. */
    @NotNull
    @Column(name = "region_code")
    private String regionCode;

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

    /** The city list. */
    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "region_id", referencedColumnName = "region_id")
    @MapKey(name = "cityCode")
    private Map<String, City> cities;

    /**
     * Adds the city.
     * 
     * @param city the city
     */
    public void addCity(final City city) {
        this.cities.put(city.getCityCode(), city);
    }

    /**
     * Gets the cities map.
     * 
     * @return the cities map
     */
    public Map<String, City> getCities() {
        return this.cities;
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

    /**
     * Gets the region code.
     * 
     * @return the region code
     */
    public String getRegionCode() {
        return this.regionCode;
    }

}
