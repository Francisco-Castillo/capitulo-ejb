/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entidades.Carreras;
import entidades.Facultades;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author fcastillo
 */
@Remote
public interface MenuFacadeRemote {

    public List<Carreras> obtenerCarreras();

    public List<Facultades> obtenerFacultades();

}
