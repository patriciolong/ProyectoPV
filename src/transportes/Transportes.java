/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportes;

import CONTROLADOR.ControlPersona;
import CONTROLADOR.ControlPrincipal;
import VISTA.VistaPersonas;
import VISTA.VistaPrincipal;

/**
 *
 * @author Usuario
 */
public class Transportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       VistaPrincipal vista= new VistaPrincipal();
        ControlPrincipal control = new ControlPrincipal(vista);
        control.iniciaControl();
    }
    
}
