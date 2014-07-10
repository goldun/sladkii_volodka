package org.restaurant.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.restaurant.IEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class Image.
 */
@Entity
@Table(name = "RESTAURANT_IMAGE")
public class RestaurantImage implements IEntity {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -414968944291905490L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESTAURANT_IMAGE_SEQ")
    @SequenceGenerator(name = "RESTAURANT_IMAGE_SEQ", sequenceName = "RESTAURANT_IMAGE_SEQ")
    @Column(name = "image_id")
    private Long id;

    /** The metadata. */
    @Column(name = "metadata")
    private String metadata;

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Gets the metadata.
     * 
     * @return the metadata
     */
    public String getMetadata() {
        return this.metadata;
    }

}
