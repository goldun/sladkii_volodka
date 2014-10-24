package net.eatoos.supplier.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import net.eatoos.IEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class Address.
 */
@Entity
@Table(name = "SUPPLIER_ADDRESS")
public class SupplierAddress implements IEntity {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8174246735799399216L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SUPPLIER_ADDRESS_SEQ")
    @SequenceGenerator(name = "SUPPLIER_ADDRESS_SEQ", sequenceName = "SUPPLIER_ADDRESS_SEQ")
    @Column(name = "address_id")
    private Long id;

    /** The country code. */
    @NotNull
    @Column(name = "country_code")
    private String countryCode;

    /** The city code. */
    @NotNull
    @Column(name = "city_code")
    private String cityCode;

    /** The region code. */
    @Column(name = "region_code")
    private String regionCode;

    /** The street. */
    @NotNull
    @Column(name = "street")
    private String street;

    /** The zipcode. */
    @NotNull
    @Column(name = "zipcode")
    private String zipcode;

    /** The latitude. */
    @Column(name = "latitude")
    private BigDecimal latitude;

    /** The longitude. */
    @Column(name = "longitude")
    private BigDecimal longitude;

    /**
     * Gets the city code.
     * 
     * @return the city code
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * Gets the country code.
     * 
     * @return the country code
     */
    public String getCountryCode() {
        return this.countryCode;
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
     * Gets the latitude.
     * 
     * @return the latitude
     */
    public BigDecimal getLatitude() {
        return this.latitude;
    }

    /**
     * Gets the longitude.
     * 
     * @return the longitude
     */
    public BigDecimal getLongitude() {
        return this.longitude;
    }

    /**
     * Gets the region code.
     * 
     * @return the region code
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * Gets the street.
     * 
     * @return the street
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * Gets the zipcode.
     * 
     * @return the zipcode
     */
    public String getZipcode() {
        return this.zipcode;
    }

}
