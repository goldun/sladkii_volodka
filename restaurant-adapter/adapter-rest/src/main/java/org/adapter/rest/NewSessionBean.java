/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adapter.rest;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author martin
 */
@Singleton
@Startup
@LocalBean
public class NewSessionBean {

	@PostConstruct
    public void businessMethod() {
		@SuppressWarnings("unused")
		int i = 1;
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
