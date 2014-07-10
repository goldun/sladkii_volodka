package org.restaurant.supplier.repository;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.restaurant.supplier.model.SupplierCompany;

// TODO: Auto-generated Javadoc
/**
 * The Class SupplierRepositoryImpl.
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
@Local(SupplierRepository.class)
public class SupplierRepositoryImpl implements SupplierRepository {

    /** The entity manager. */
    @PersistenceContext
    private EntityManager entityManager;

    /*
     * (non-Javadoc)
     * 
     * @see org.Supplier.IRepository#create(java.lang.Object)
     */
    @Override
    public void create(final SupplierCompany entity) {
        this.entityManager.persist(entity);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.Supplier.IRepository#delete(java.io.Serializable)
     */
    @Override
    public void delete(final Long id) {
        SupplierCompany SupplierCompanyAttached = this.entityManager
            .getReference(SupplierCompany.class, id);
        this.entityManager.remove(SupplierCompanyAttached);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.Supplier.IRepository#delete(java.lang.Object)
     */
    @Override
    public void delete(final SupplierCompany entity) {
        SupplierCompany SupplierCompanyAttached = this.entityManager
            .getReference(SupplierCompany.class, entity.getId());
        this.entityManager.remove(SupplierCompanyAttached);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.Supplier.IRepository#find(java.io.Serializable)
     */
    @Override
    public SupplierCompany find(final Long id) {
        return this.entityManager.find(SupplierCompany.class, id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.Supplier.IRepository#findAll()
     */
    @Override
    public List<SupplierCompany> findAll() {
        return this.entityManager.createNamedQuery("SupplierCompany.findAll", SupplierCompany.class)
            .getResultList();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.Supplier.IRepository#update(java.lang.Object)
     */
    @Override
    public void update(final SupplierCompany entity) {
        this.entityManager.merge(entity);
    }

}
