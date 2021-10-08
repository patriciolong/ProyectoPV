/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class VistaClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaEmpleado
     */
    public VistaClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogoClientes = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        btnAceptarG = new javax.swing.JButton();
        btnAceptarE = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnCrearr = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();

        jLabel3.setText("ID CLIENTE:");

        jLabel5.setText("CEDULA:");

        btnAceptarG.setText("GRABAR");

        btnAceptarE.setText("EDITAR");

        btnCancelar.setText("CANCELAR");

        javax.swing.GroupLayout DialogoClientesLayout = new javax.swing.GroupLayout(DialogoClientes.getContentPane());
        DialogoClientes.getContentPane().setLayout(DialogoClientesLayout);
        DialogoClientesLayout.setHorizontalGroup(
            DialogoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoClientesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(DialogoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47)
                .addGroup(DialogoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(DialogoClientesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAceptarG, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(btnAceptarE)
                .addGap(29, 29, 29)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DialogoClientesLayout.setVerticalGroup(
            DialogoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoClientesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(DialogoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(DialogoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(DialogoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptarG, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(btnAceptarE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CRUD CLIENTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 40));

        jLabel2.setText("BUSCAR:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 250, -1));

        btnCrearr.setText("CREAR");
        getContentPane().add(btnCrearr, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        btnEditar.setText("EDITAR");
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        btnRemover.setText("REMOVER");
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        btnListar.setText("LISTAR");
        getContentPane().add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_CLIENTE", "CEDULA", "NOMBRE", "APELLIDO", "TELEFONO", "EMAIL", "GENERO", "DIRECCION"
            }
        ));
        jScrollPane1.setViewportView(TablaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    public JDialog getDialogoClientes() {
        return DialogoClientes;
    }

    public void setDialogoClientes(JDialog DialogoClientes) {
        this.DialogoClientes = DialogoClientes;
    }

    public JTable getTablaClientes() {
        return TablaClientes;
    }

    public void setTablaClientes(JTable TablaClientes) {
        this.TablaClientes = TablaClientes;
    }

    public JButton getBtnAceptarE() {
        return btnAceptarE;
    }

    public void setBtnAceptarE(JButton btnAceptarE) {
        this.btnAceptarE = btnAceptarE;
    }

    public JButton getBtnAceptarG() {
        return btnAceptarG;
    }

    public void setBtnAceptarG(JButton btnAceptarG) {
        this.btnAceptarG = btnAceptarG;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnCrearr() {
        return btnCrearr;
    }

    public void setBtnCrearr(JButton btnCrearr) {
        this.btnCrearr = btnCrearr;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnListar() {
        return btnListar;
    }

    public void setBtnListar(JButton btnListar) {
        this.btnListar = btnListar;
    }

    public JButton getBtnRemover() {
        return btnRemover;
    }

    public void setBtnRemover(JButton btnRemover) {
        this.btnRemover = btnRemover;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtIDCliente() {
        return txtIDCliente;
    }

    /**
     * @param args the command line arguments
     */
    public void setTxtIDCliente(JTextField txtIDCliente) {
        this.txtIDCliente = txtIDCliente;
    }

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogoClientes;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JButton btnAceptarE;
    private javax.swing.JButton btnAceptarG;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearr;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtIDCliente;
    // End of variables declaration//GEN-END:variables
}
