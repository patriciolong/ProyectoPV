/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.ModeloPersona;
import VISTA.VistaPersonas;
import VISTA.VistaPrincipal;

/**
 *
 * @author patri
 */
public class ControlPrincipal {
    private VistaPrincipal vp;

    public ControlPrincipal() {
    }

    public ControlPrincipal(VistaPrincipal vp) {
        this.vp = vp;
        vp.setVisible(true);
    }
    public void iniciaControl(){
       vp.getMenuCrudPersona().addActionListener(l->crudPersona());
//       vp.getTlbCrudPersona().addActionListener(l->crudPersona());
    }
    
    private void crudPersona(){
        ModeloPersona m = new ModeloPersona();
        VistaPersonas v = new VistaPersonas();
        vp.getDskPrincipal().add(v);
        ControlPersona c=new ControlPersona(m, v);
        c.iniciaControl();
    }
}
