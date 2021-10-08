/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.ModeloCliente;
import MODELO.ModeloPersona;
import VISTA.VistaClientes;
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
       vp.getTlbCrudPersona().addActionListener(l->crudPersona());
       
       vp.getMenuCrudCliente().addActionListener(l->crudCliente());
       vp.getTlbCrudClientes().addActionListener(l->crudCliente());
       
       vp.getMenuCrudCargas().addActionListener(l->crudPersona());
       vp.getTlbCrudCargas().addActionListener(l->crudPersona());
       
       vp.getMenuCrudVehiculos().addActionListener(l->crudPersona());
       vp.getTlbCrudVehiculos().addActionListener(l->crudPersona());
       
       
    }
    
    private void crudPersona(){
        ModeloPersona m = new ModeloPersona();
        VistaPersonas v = new VistaPersonas();
        vp.getDskPrincipal().add(v);
        ControlPersona c=new ControlPersona(m, v);
        c.iniciaControl();
    }
     private void crudCliente(){
         ModeloCliente m = new ModeloCliente();
         VistaClientes v = new VistaClientes();
        vp.getDskPrincipal().add(v);
        ControlCliente c=new ControlCliente(m, v);
        c.iniciaControl();
    }
      private void crudEmpleado(){
        ModeloPersona m = new ModeloPersona();
        VistaPersonas v = new VistaPersonas();
        vp.getDskPrincipal().add(v);
        ControlPersona c=new ControlPersona(m, v);
        c.iniciaControl();
    }
       private void crudCargas(){
        ModeloPersona m = new ModeloPersona();
        VistaPersonas v = new VistaPersonas();
        vp.getDskPrincipal().add(v);
        ControlPersona c=new ControlPersona(m, v);
        c.iniciaControl();
    }
        private void crudVehiculos(){
        ModeloPersona m = new ModeloPersona();
        VistaPersonas v = new VistaPersonas();
        vp.getDskPrincipal().add(v);
        ControlPersona c=new ControlPersona(m, v);
        c.iniciaControl();
    }
}
