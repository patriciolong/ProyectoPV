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
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author patri
 */
public class ControlPersona {
    private ModeloPersona modelo;
    private VistaPersonas vista;

    public ControlPersona(ModeloPersona modelo, VistaPersonas vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.setTitle("CRUD PERSONA");
        vista.setVisible(true);
        cargalista("");
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
//        vista.getBtnCrear().addActionListener(l->cargarDialogo(1));
//        vista.getBtnEditar().addActionListener(l->cargarDialogo(2));
//        vista.getTxtBuscar().addKeyListener(kl);
//        vista.getBtnExaminar().addActionListener(l->examinarFoto());
//        vista.getBtnAceptarG().addActionListener(l->grabaPersona());
//        vista.getBtnEditar().addActionListener(l->seleccionar());
//        vista.getBtnAceptarE().addActionListener(l->editar());
//        vista.getBtnCancelar().addActionListener(l->cancelar());
//        vista.getBtnRemover().addActionListener(l->remover());
//        vista.getBtnImprimir().addActionListener(l->imprimirReporte());
        
        
        
        
    }
    
    
    
    
    
    }
