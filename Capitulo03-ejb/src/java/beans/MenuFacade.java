/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entidades.Carreras;
import entidades.Facultades;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author fcastillo
 */
@Stateless
public class MenuFacade implements MenuFacadeRemote {

    // Inyectamos dependencias
    
    @EJB
    FacultadesFacadeLocal facultadEJB;

    @EJB
    CarrerasFacadeLocal carreraEJB;

    @Override
    public List<Carreras> obtenerCarreras() {
        return carreraEJB.findAll();
    }

    @Override
    public List<Facultades> obtenerFacultades() {
        return facultadEJB.findAll();
    }

}
