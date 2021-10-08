/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.ModeloCliente;
import MODELO.ModeloPersona;
import MODELO.cliente;
import MODELO.persona;
import VISTA.VistaClientes;
import VISTA.VistaPersonas;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
//import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author patri
 */
public class ControlCliente {
    private ModeloCliente modelo;
    private VistaClientes vista;

    public ControlCliente(ModeloCliente modelo, VistaClientes vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.setTitle("CRUD PERSONA");
        vista.setVisible(true);
        cargalista("");
    }
    
        public void iniciaControl(){
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
           //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent ke) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent ke) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                cargalista(vista.getTxtBuscar().getText());
             
            }
            
        };
        
        /////////////
        vista.getBtnListar().addActionListener(l->cargalista(""));
        vista.getBtnCrearr().addActionListener(l->cargarDialogo(1));
        vista.getBtnEditar().addActionListener(l->cargarDialogo(2));
        vista.getTxtBuscar().addKeyListener(kl);
//        vista.getBtnExaminar().addActionListener(l->examinarFoto());
        vista.getBtnAceptarG().addActionListener(l->grabaPersona());
        vista.getBtnEditar().addActionListener(l->seleccionar());
        vista.getBtnAceptarE().addActionListener(l->editar());
        vista.getBtnCancelar().addActionListener(l->cancelar());
        vista.getBtnRemover().addActionListener(l->remover());
//        vista.getBtnImprimir().addActionListener(l->imprimirReporte());
        
        
        
        
    }

    
    private void cargalista(String aguja){
        //CARGA DATOS DE LA LISTA
//        vista.getTablaPersonas().setDefaultRenderer(Object.class, new ImagenTabla());
//        vista.getjTable1().setRowHeight(100);
//        DefaultTableCellRenderer renderer = new DefaultTableCellHeaderRenderer();
        
        DefaultTableModel tablaMd;
        tablaMd=(DefaultTableModel)vista.getTablaClientes().getModel();
        tablaMd.setNumRows(0);
        List<cliente> lista= modelo.listaCliente(aguja);
        int ncols=tablaMd.getColumnCount();
        Holder<Integer> i= new Holder<>(0);
        lista.stream().forEach(p->{
            
            tablaMd.addRow(new Object[ncols]);
            vista.getTablaClientes().setValueAt(p.getId_cliente(), i.value, 0);
             vista.getTablaClientes().setValueAt(p.getCedula(), i.value, 1);
              vista.getTablaClientes().setValueAt(p.getNombre(), i.value, 2);
              vista.getTablaClientes().setValueAt(p.getApellido(), i.value, 3);
               vista.getTablaClientes().setValueAt(p.getTelefono(), i.value, 4);
                vista.getTablaClientes().setValueAt(p.getEmail(), i.value, 5);
                 vista.getTablaClientes().setValueAt(p.getGenero(), i.value, 6);
                  vista.getTablaClientes().setValueAt(p.getDireccion(), i.value, 7);
              
                   
                   
//                   Image img =p.getFoto();
//                   if (img!=null) {
//                       Image nimg=img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
//                       ImageIcon icon = new ImageIcon(nimg);
//                       renderer.setIcon(icon);
//                        vista.getjTable1().setValueAt(new JLabel(icon), i.value, 8);
//            }else{
//                       vista.getjTable1().setValueAt(null, i.value, 8);
//                   }
                   
            i.value++;
            
//            String[] fila={p.getIdPersona(),p.getNombres(),p.getApellidos(),p.getEdad()+"",p.getTelefono(),p.getSexo()
//            ,p.getCupo()+"",p.getSueldo()+""};
//            tablaMd.addRow(fila);
        });
    
    
    
    
    
    
    
}
    
    
    private void cargarDialogo(int origen){
        
        vista.getDialogoClientes().setSize(600, 500);
        vista.getDialogoClientes().setLocationRelativeTo(vista);
        if (origen==1) {
            vista.getDialogoClientes().setTitle("Crear Cliente");
            vista.getBtnAceptarE().setVisible(false);
            vista.getBtnAceptarG().setVisible(true);
             vista.getDialogoClientes().setVisible(true);
        }
        else{
            vista.getDialogoClientes().setTitle("Editar Cliente");
            vista.getBtnAceptarG().setVisible(false);
            vista.getBtnAceptarE().setVisible(true);
//             vista.getDigPersona().setVisible(true);
        }
       
    }
    
    private void seleccionar(){
       
        int seleccion = vista.getTablaClientes().getSelectedRow();
        if (seleccion<0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN USUARIO");
           
        }else{
        vista.getDialogoClientes().setVisible(true);
        vista.getTxtCedula().setText(String.valueOf(vista.getTablaClientes().getValueAt(seleccion,1)));
        vista.getTxtIDCliente().setText(String.valueOf(vista.getTablaClientes().getValueAt(seleccion,0)));
        
        } 
    }
    
    private void editar(){
        String cedula=vista.getTxtCedula().getText();
        int idCliente=Integer.parseInt(vista.getTxtIDCliente().getText()) ;
        
        ModeloCliente cliente= new ModeloCliente();
        cliente.setCedula(cedula);
        cliente.setId_cliente(idCliente);
        
        
//        ImageIcon ic=(ImageIcon)vista.getTxtFoto().getIcon();
//        persona.setFoto(ic.getImage());
        
        
        cliente.editar(cedula);
        
        
        vista.getDialogoClientes().setVisible(false);
    }
    
    private void remover(){
         int seleccion = vista.getTablaClientes().getSelectedRow();
        if (seleccion<0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN USUARIO");
           
        }else{
           int salida= JOptionPane.showConfirmDialog(null, "Seguro?",null,JOptionPane.YES_NO_OPTION);
            if (salida==0) {
                vista.getTxtCedula().setText(String.valueOf(vista.getTablaClientes().getValueAt(seleccion,1)));
        String cedula=vista.getTxtCedula().getText();
        ModeloCliente cliente= new ModeloCliente();
        cliente.remover(cedula);
        JOptionPane.showMessageDialog(null, "OK Lo Elimine");
            }else{
                JOptionPane.showMessageDialog(null, "OK no hice nada");
            }
        
        
        }
    }
    
    
     private void grabaPersona(){
        String cedula = vista.getTxtCedula().getText();
        //String idpersona=vista.getTxtId().getText();
        int idCliente=Integer.parseInt(vista.getTxtIDCliente().getText());
        
        
        
        ModeloCliente cliente= new ModeloCliente();
        cliente.setCedula(cedula);
        cliente.setId_cliente(idCliente);
        
       
        
       
        
        //FOTO
//        ImageIcon ic=(ImageIcon)vista.getTxtFoto().getIcon();
//        persona.setFoto(ic.getImage());
        
        cliente.grabar();
        
        vista.getDialogoClientes().setVisible(false);

        
    }
    
    
     private void cancelar(){
        vista.getDialogoClientes().setVisible(false);
    }
    
    
    
    
    }
