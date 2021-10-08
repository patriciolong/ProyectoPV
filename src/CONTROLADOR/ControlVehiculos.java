/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.ModeloPersona;
import MODELO.persona;
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
public class ControlVehiculos {
    private ModeloPersona modelo;
    private VistaPersonas vista;

    public ControlVehiculos(ModeloPersona modelo, VistaPersonas vista) {
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
        tablaMd=(DefaultTableModel)vista.getTablaPersonas().getModel();
        tablaMd.setNumRows(0);
        List<persona> lista= modelo.listaPersonas(aguja);
        int ncols=tablaMd.getColumnCount();
        Holder<Integer> i= new Holder<>(0);
        lista.stream().forEach(p->{
            
            tablaMd.addRow(new Object[ncols]);
            vista.getTablaPersonas().setValueAt(p.getCedula(), i.value, 0);
             vista.getTablaPersonas().setValueAt(p.getNombre(), i.value, 1);
              vista.getTablaPersonas().setValueAt(p.getApellido(), i.value, 2);
               vista.getTablaPersonas().setValueAt(p.getTelefono(), i.value, 3);
                vista.getTablaPersonas().setValueAt(p.getEmail(), i.value, 4);
                 vista.getTablaPersonas().setValueAt(p.getGenero(), i.value, 5);
                  vista.getTablaPersonas().setValueAt(p.getDireccion(), i.value, 6);
                   
                   
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
        
        vista.getDialogoPersonas().setSize(600, 500);
        vista.getDialogoPersonas().setLocationRelativeTo(vista);
        if (origen==1) {
            vista.getDialogoPersonas().setTitle("Crear Persona");
            vista.getBtnAceptarE().setVisible(false);
            vista.getBtnAceptarG().setVisible(true);
             vista.getDialogoPersonas().setVisible(true);
        }
        else{
            vista.getDialogoPersonas().setTitle("Editar Persona");
            vista.getBtnAceptarG().setVisible(false);
            vista.getBtnAceptarE().setVisible(true);
//             vista.getDigPersona().setVisible(true);
        }
       
    }
    
    private void seleccionar(){
       
        int seleccion = vista.getTablaPersonas().getSelectedRow();
        if (seleccion<0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN USUARIO");
           
        }else{
        vista.getDialogoPersonas().setVisible(true);
        vista.getTxtCedula().setText(String.valueOf(vista.getTablaPersonas().getValueAt(seleccion,0)));
        vista.getTxtNombre().setText(String.valueOf(vista.getTablaPersonas().getValueAt(seleccion,1)));
        vista.getTxtApellido().setText(String.valueOf(vista.getTablaPersonas().getValueAt(seleccion,2)));
        vista.getTxtTelefono().setText(String.valueOf(vista.getTablaPersonas().getValueAt(seleccion,3)));
        vista.getTxtEmail().setText(String.valueOf(vista.getTablaPersonas().getValueAt(seleccion,4)));
        vista.getTxtGenero().setText(String.valueOf(vista.getTablaPersonas().getValueAt(seleccion,5)));
        vista.getTxtDireccion().setText(String.valueOf(vista.getTablaPersonas().getValueAt(seleccion,6)));
        } 
    }
    
    private void editar(){
        String cedula=vista.getTxtCedula().getText();
        String nombres=vista.getTxtNombre().getText();
        String apellidos=vista.getTxtApellido().getText();
        
        
//        Instant instant= vista.getTxtFecha().getDate().toInstant();
//        ZoneId zid = ZoneId.of("America/Guayaquil");
//        ZonedDateTime zdt=ZonedDateTime.ofInstant(instant, zid);
//        Date fecha=Date.valueOf(zdt.toLocalDate());
        
        String telefono=vista.getTxtTelefono().getText();
        String genero=vista.getTxtGenero().getText();
        String direccion=vista.getTxtDireccion().getText();
        String email=vista.getTxtEmail().getText();
        ModeloPersona persona= new ModeloPersona();
        persona.setApellido(apellidos);
        persona.setNombre(nombres);
        persona.setCedula(cedula);
//        persona.setFechaNacimiento(fecha);
        persona.setTelefono(telefono);
        persona.setGenero(genero);
        persona.setDireccion(direccion);
        persona.setEmail(email);
        
//        ImageIcon ic=(ImageIcon)vista.getTxtFoto().getIcon();
//        persona.setFoto(ic.getImage());
        
        
        persona.editar(cedula);
        
        
        vista.getDialogoPersonas().setVisible(false);
    }
    
    private void remover(){
         int seleccion = vista.getTablaPersonas().getSelectedRow();
        if (seleccion<0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN USUARIO");
           
        }else{
           int salida= JOptionPane.showConfirmDialog(null, "Seguro?",null,JOptionPane.YES_NO_OPTION);
            if (salida==0) {
                vista.getTxtCedula().setText(String.valueOf(vista.getTablaPersonas().getValueAt(seleccion,0)));
        String cedula=vista.getTxtCedula().getText();
        ModeloPersona persona= new ModeloPersona();
        persona.remover(cedula);
        JOptionPane.showMessageDialog(null, "OK Lo Elimine");
            }else{
                JOptionPane.showMessageDialog(null, "OK no hice nada");
            }
        
        
        }
    }
    
    
     private void grabaPersona(){
        String cedula = vista.getTxtCedula().getText();
        //String idpersona=vista.getTxtId().getText();
        String nombres=vista.getTxtNombre().getText();
        String apellidos=vista.getTxtApellido().getText();
        
        
//        Instant instant= vista.getTxtFecha().getDate().toInstant();
//        ZoneId zid = ZoneId.of("America/Guayaquil");
//        ZonedDateTime zdt=ZonedDateTime.ofInstant(instant, zid);
//        Date fecha=Date.valueOf(zdt.toLocalDate());
        
        String telefono=vista.getTxtTelefono().getText();
        String genero=vista.getTxtGenero().getText();
        String email = vista.getTxtEmail().getText();
        String direccion = vista.getTxtDireccion().getText();
        
        
        ModeloPersona persona= new ModeloPersona();
        persona.setApellido(apellidos);
        persona.setNombre(nombres);
        persona.setCedula(cedula);
        
        persona.setTelefono(telefono);
        persona.setEmail(email);
        persona.setGenero(genero);
        persona.setDireccion(direccion);
       
        
       
        
        //FOTO
//        ImageIcon ic=(ImageIcon)vista.getTxtFoto().getIcon();
//        persona.setFoto(ic.getImage());
        
        persona.grabar();
        
        vista.getDialogoPersonas().setVisible(false);

        
    }
    
    
     private void cancelar(){
        vista.getDialogoPersonas().setVisible(false);
    }
    
    
    
    
    }
