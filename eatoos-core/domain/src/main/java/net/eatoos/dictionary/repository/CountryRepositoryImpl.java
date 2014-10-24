package net.eatoos.dictionary.repository;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.eatoos.dictionary.model.Country;

// TODO: Auto-generated Javadoc
/**
 * The Class RestaurantRepositoryImpl.
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
@Local(CountryRepository.class)
public class CountryRepositoryImpl implements CountryRepository {

    /** The entity manager. */
    @PersistenceContext
    private EntityManager entityManager;

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#create(java.lang.Object)
     */
    @Override
    public void create(final Country entity) {
        this.entityManager.persist(entity);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#delete(java.lang.Object)
     */
    @Override
    public void delete(final Country entity) {
        Country CountryAttached = this.entityManager
            .getReference(Country.class, entity.getId());
        this.entityManager.remove(CountryAttached);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#delete(java.io.Serializable)
     */
    @Override
    public void delete(final Long id) {
        Country CountryAttached = this.entityManager
            .getReference(Country.class, id);
        this.entityManager.remove(CountryAttached);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#find(java.io.Serializable)
     */
    @Override
    public Country find(final Long id) {
        return this.entityManager.find(Country.class, id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#findAll()
     */
    @Override
    public List<Country> findAll() {
        return this.entityManager.createNamedQuery("Country.findAll", Country.class)
            .getResultList();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#update(java.lang.Object)
     */
    @Override
    public void update(final Country entity) {
        this.entityManager.merge(entity);
    }

}
