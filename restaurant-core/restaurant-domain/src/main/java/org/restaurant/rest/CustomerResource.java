package org.restaurant.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.restuarant.customer.model.Customer;
import org.restuarant.customer.repository.CustomerRepository;

@Stateless
@ApplicationPath("/resources")
@Path("customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource extends Application {

    @EJB
    private CustomerRepository customerRepository;

    @GET
    public List<Customer> customerList() {
        return this.customerRepository.findAll();
    }

    @POST
    public Customer saveCustomer(final Customer customer) {
        if (customer.getId() == null) {
            this.customerRepository.create(customer);
        } else {
            this.customerRepository.update(customer);
        }
        return customer;
    }
}
