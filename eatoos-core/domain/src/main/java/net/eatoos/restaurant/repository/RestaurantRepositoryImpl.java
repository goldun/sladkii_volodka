package net.eatoos.restaurant.repository;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.eatoos.restaurant.model.Restaurant;

// TODO: Auto-generated Javadoc
/**
 * The Class RestaurantRepositoryImpl.
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
@Local(RestaurantRepository.class)
public class RestaurantRepositoryImpl implements RestaurantRepository {

    /** The entity manager. */
    @PersistenceContext
    private EntityManager entityManager;

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#create(java.lang.Object)
     */
    @Override
    public void create(final Restaurant entity) {
        this.entityManager.persist(entity);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#delete(java.io.Serializable)
     */
    @Override
    public void delete(final Long id) {
        Restaurant restaurantAttached = this.entityManager
            .getReference(Restaurant.class, id);
        this.entityManager.remove(restaurantAttached);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#delete(java.lang.Object)
     */
    @Override
    public void delete(final Restaurant entity) {
        Restaurant restaurantAttached = this.entityManager
            .getReference(Restaurant.class, entity.getId());
        this.entityManager.remove(restaurantAttached);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#find(java.io.Serializable)
     */
    @Override
    public Restaurant find(final Long id) {
        return this.entityManager.find(Restaurant.class, id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#findAll()
     */
    @Override
    public List<Restaurant> findAll() {
        return this.entityManager.createNamedQuery("Restaurant.findAll", Restaurant.class)
            .getResultList();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#update(java.lang.Object)
     */
    @Override
    public void update(final Restaurant entity) {
        this.entityManager.merge(entity);
    }

}
