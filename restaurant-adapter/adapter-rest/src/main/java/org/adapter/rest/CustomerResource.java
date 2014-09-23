/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adapter.rest;

import java.util.Hashtable;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.restaurant.service.CustomerService;

/**
 * 
 * @author Serhiy Holdun
 */
@Stateless
public class CustomerResource {

    @Resource
    SessionContext context;

    /**
     * The context to invoke foreign EJB's as the SessionContext can not be used
     * for that.
     */
    private InitialContext iCtx;

    @EJB(
        lookup = "ejb:restaurant-core/ejb//CustomerServiceImpl!org.restaurant.service.CustomerService")
    CustomerService customerServiceProxy;

    /**
     * Initialize and store the context for the EJB invocations.
     */
    @PostConstruct
    public void init() {
        try {
            final Hashtable<String, String> p = new Hashtable<String, String>();
            p.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
            this.iCtx = new InitialContext(p);
        } catch (NamingException e) {
            throw new RuntimeException("Could not initialize context", e);
        }
    }
}
