/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author fcastillo
 */
@Stateless
public class TestBean implements TestBeanRemote {

    @Override
    public String saludar() {
        return "Hello ";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
