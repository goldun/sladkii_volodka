package net.eatoos.restaurant.model;

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
 * The Class Staff.
 */
@Entity
@Table(name = "RESTAURANT_STAFF")
public class RestaurantStaff implements IEntity {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3161712978252170090L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESTAURANT_STAFF_SEQ")
    @SequenceGenerator(name = "RESTAURANT_STAFF_SEQ", sequenceName = "RESTAURANT_STAFF_SEQ")
    @Column(name = "staff_id")
    private Long id;

    /** The email. */
    @NotNull
    @Column(name = "email")
    private String email;

    /** The first name. */
    @NotNull
    @Column(name = "first_name")
    private String firstName;

    /** The last name. */
    @NotNull
    @Column(name = "last_name")
    private String lastName;

    /** The middle name. */
    @Column(name = "middle_name")
    private String middleName;

    /** The title. */
    @Column(name = "title")
    private String title;

    /** The is owner. */
    @Column(name = "isOwner")
    private Boolean isOwner;

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Gets the first name.
     * 
     * @return the first name
     */
    public String getFirstName() {
        return this.firstName;
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
     * Gets the checks if is owner.
     * 
     * @return the checks if is owner
     */
    public Boolean getIsOwner() {
        return this.isOwner;
    }

    /**
     * Gets the last name.
     * 
     * @return the last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Gets the middle name.
     * 
     * @return the middle name
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return this.title;
    }
}
