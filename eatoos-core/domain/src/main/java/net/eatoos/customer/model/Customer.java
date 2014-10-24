package net.eatoos.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import net.eatoos.IEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class Customer.
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer implements IEntity {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4109226479974201371L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_SEQ")
    @SequenceGenerator(name = "CUSTOMER_SEQ", sequenceName = "CUSTOMER_SEQ")
    @Column(name = "customer_id")
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

    /** The phone. */
    @Column(name = "phone")
    private String phone;

    /** The icon. */
    @OneToOne
    @JoinColumn(name = "image_id", nullable = true)
    private CustomerImage avatar;

    /**
     * Gets the avatar.
     * 
     * @return the avatar
     */
    public CustomerImage getAvatar() {
        return this.avatar;
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
     * Gets the phone.
     * 
     * @return the phone
     */
    public String getPhone() {
        return this.phone;
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
