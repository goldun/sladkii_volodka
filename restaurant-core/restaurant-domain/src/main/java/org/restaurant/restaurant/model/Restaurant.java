package org.restaurant.restaurant.model;

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

import org.restaurant.IEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class Restaurant.
 */
@Entity
@Table(name = "RESTAURANT")
@NamedQueries({
    @NamedQuery(name = "Restaurant.findAll", query = "select rest from Restaurant rest")
})
public class Restaurant implements IEntity {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6097379293402435737L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESTAURANT_SEQ")
    @SequenceGenerator(name = "RESTAURANT_SEQ", sequenceName = "RESTAURANT_SEQ")
    @Column(name = "restaurant_id")
    private Long id;

    /** The type. */
    @Column(name = "type")
    private String type;

    /** The name. */
    @NotNull
    @Column(name = "name")
    private String name;

    /** The email. */
    @Column(name = "email")
    private String email;

    /** The phone list. */
    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "restaurant_id", referencedColumnName = "restaurant_id")
    private List<RestaurantPhone> phoneList;

    /** The address list. */
    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "restaurant_id", referencedColumnName = "restaurant_id")
    private List<RestaurantAddress> addressList;

    /** The icon. */
    @OneToOne
    @JoinColumn(name = "image_id", nullable = true)
    private RestaurantImage icon;

    /**
     * Gets the address list.
     * 
     * @return the address list
     */
    public List<RestaurantAddress> getAddressList() {
        return this.addressList;
    }

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return this.email;
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
    public List<RestaurantPhone> getPhoneList() {
        return this.phoneList;
    }

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public String getType() {
        return this.type;
    }

}
