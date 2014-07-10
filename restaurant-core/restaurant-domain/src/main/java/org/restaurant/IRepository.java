package org.restaurant;

import java.io.Serializable;
import java.util.List;

/**
 * Interface for generic CRUD operations on a repository for a specific type.
 * 
 * @param <T> the generic type of entity
 * @param <ID> the generic type of entity's id field
 */
public interface IRepository<T, ID extends Serializable> {

    /**
     * Saves a given entity.
     * 
     * @param entity the entity
     */
    void create(T entity);

    /**
     * Deletes the entity with the given id.
     * 
     * @param id the id
     */
    void delete(ID id);

    /**
     * Deletes a given entity.
     * 
     * @param entity the entity
     */
    void delete(T entity);

    /**
     * Retrieves an entity by its primary key.
     * 
     * @param id the id
     * @return the entity with the given primary key or {@code null} if none
     *         found
     */
    T find(ID id);

    /**
     * Returns all instances of the type.
     * 
     * @return all entities
     */
    List<T> findAll();

    /**
     * Updates a given entity.
     * 
     * @param entity the entity
     */
    void update(T entity);

}
