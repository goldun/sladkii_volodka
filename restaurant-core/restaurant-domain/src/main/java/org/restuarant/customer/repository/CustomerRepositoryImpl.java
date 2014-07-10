package org.restuarant.customer.repository;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.restuarant.customer.model.Customer;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomerRepositoryImpl.
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
@Local(CustomerRepository.class)
public class CustomerRepositoryImpl implements CustomerRepository {

    /** The entity manager. */
    @PersistenceContext
    private EntityManager entityManager;

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#create(java.lang.Object)
     */
    @Override
    public void create(final Customer entity) {
        this.entityManager.persist(entity);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#delete(java.lang.Object)
     */
    @Override
    public void delete(final Customer entity) {
        Customer customerAttached = this.entityManager
            .getReference(Customer.class, entity.getId());
        this.entityManager.remove(customerAttached);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#delete(java.io.Serializable)
     */
    @Override
    public void delete(final Long id) {
        Customer customerAttached = this.entityManager
            .getReference(Customer.class, id);
        this.entityManager.remove(customerAttached);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#find(java.io.Serializable)
     */
    @Override
    public Customer find(final Long id) {
        return this.entityManager.find(Customer.class, id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#findAll()
     */
    @Override
    public List<Customer> findAll() {
        return this.entityManager.createNamedQuery("Customer.findAll", Customer.class)
            .getResultList();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.restaurant.IRepository#update(java.lang.Object)
     */
    @Override
    public void update(final Customer entity) {
        this.entityManager.merge(entity);
    }

}
