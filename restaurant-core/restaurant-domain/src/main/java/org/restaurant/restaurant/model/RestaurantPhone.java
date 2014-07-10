package org.restaurant.restaurant.model;

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
 * The Class Phone.
 */
@Entity
@Table(name = "RESTAURANT_PHONE")
public class RestaurantPhone implements IEntity {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3792936348168485138L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESTAURANT_PHONE_SEQ")
    @SequenceGenerator(name = "RESTAURANT_PHONE_SEQ", sequenceName = "RESTAURANT_PHONE_SEQ")
    @Column(name = "phone_id")
    private Long id;

    /** The type. */
    @NotNull
    @Column(name = "type")
    private String type;

    /** The number. */
    @NotNull
    @Column(name = "number")
    private String number;

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Gets the number.
     * 
     * @return the number
     */
    public String getNumber() {
        return this.number;
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
