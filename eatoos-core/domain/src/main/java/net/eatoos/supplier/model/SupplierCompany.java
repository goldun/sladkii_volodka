package net.eatoos.supplier.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import net.eatoos.IEntity;
import net.eatoos.restaurant.model.RestaurantImage;

// TODO: Auto-generated Javadoc
/**
 * The Class Restaurant.
 */
@Entity
@Table(name = "SUPPLIER_COMPANY")
@NamedQueries({
    @NamedQuery(name = "SupplierCompany.findAll", query = "select supplier from SupplierCompany supplier")
})
public class SupplierCompany implements IEntity {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6097379293402435737L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SUPPLIER_COMPANY_SEQ")
    @SequenceGenerator(name = "SUPPLIER_COMPANY_SEQ", sequenceName = "SUPPLIER_COMPANY_SEQ")
    @Column(name = "supplier_company_id")
    private Long id;

    /** The name. */
    @NotNull
    @Column(name = "name")
    private String name;

    /** The description. */
    @Column(name = "description")
    private String description;

    /** The phone list. */
    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "supplier_company_id", referencedColumnName = "supplier_company_id")
    private List<SupplierPhone> phoneList;

    /** The address list. */
    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "supplier_company_id", referencedColumnName = "supplier_company_id")
    private List<SupplierAddress> addressList;

    /** The icon. */
    @OneToOne
    @JoinColumn(name = "image_id", nullable = true)
    private RestaurantImage icon;

    /**
     * Gets the address list.
     * 
     * @return the address list
     */
    public List<SupplierAddress> getAddressList() {
        return this.addressList;
    }

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the icon.
     * 
     * @return the icon
     */
    public RestaurantImage getIcon() {
        return this.icon;
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
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the phone list.
     * 
     * @return the phone list
     */
    public List<SupplierPhone> getPhoneList() {
        return this.phoneList;
    }
}
