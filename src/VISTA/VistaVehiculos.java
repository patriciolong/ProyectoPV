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
public class VistaVehiculos extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaEmpleado
     */
    public VistaVehiculos() {
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

        DialogoVehiculos = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtIDEmpleado = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        btnAceptarG = new javax.swing.JButton();
        btnAceptarE = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnCrearr = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVehiculos = new javax.swing.JTable();

        jLabel3.setText("ID EMPLEADO:");

        jLabel4.setText("PLACA");

        jLabel5.setText("SERIE:");

        btnAceptarG.setText("GRABAR");

        btnAceptarE.setText("EDITAR");

        btnCancelar.setText("CANCELAR");

        jLabel6.setText("COLOR");

        javax.swing.GroupLayout DialogoVehiculosLayout = new javax.swing.GroupLayout(DialogoVehiculos.getContentPane());
        DialogoVehiculos.getContentPane().setLayout(DialogoVehiculosLayout);
        DialogoVehiculosLayout.setHorizontalGroup(
            DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoVehiculosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogoVehiculosLayout.createSequentialGroup()
                        .addComponent(btnAceptarG, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(btnAceptarE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DialogoVehiculosLayout.createSequentialGroup()
                        .addGroup(DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DialogoVehiculosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(47, 47, 47)
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DialogoVehiculosLayout.createSequentialGroup()
                                .addGroup(DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(47, 47, 47)
                                .addGroup(DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 175, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DialogoVehiculosLayout.setVerticalGroup(
            DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoVehiculosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptarG, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(btnAceptarE)))
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CRUD VEHICULOS");
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

        TablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SERIE", "ID_EMPLEADO", "PLACA", "COLOR"
            }
        ));
        jScrollPane1.setViewportView(TablaVehiculos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    public JDialog getDialogoVehiculos() {
        return DialogoVehiculos;
    }

    public void setDialogoVehiculos(JDialog DialogoVehiculos) {
        this.DialogoVehiculos = DialogoVehiculos;
    }

    public JTable getTablaVehiculos() {
        return TablaVehiculos;
    }

    public void setTablaVehiculos(JTable TablaVehiculos) {
        this.TablaVehiculos = TablaVehiculos;
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

    public JTextField getTxtColor() {
        return txtColor;
    }

    public void setTxtColor(JTextField txtColor) {
        this.txtColor = txtColor;
    }

    public JTextField getTxtIDEmpleado() {
        return txtIDEmpleado;
    }

    public void setTxtIDEmpleado(JTextField txtIDEmpleado) {
        this.txtIDEmpleado = txtIDEmpleado;
    }

    public JTextField getTxtPlaca() {
        return txtPlaca;
    }

    public void setTxtPlaca(JTextField txtPlaca) {
        this.txtPlaca = txtPlaca;
    }

    public JTextField getTxtSerie() {
        return txtSerie;
    }

    /**
     * @param args the command line arguments
     */
    public void setTxtSerie(JTextField txtSerie) {
        this.txtSerie = txtSerie;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogoVehiculos;
    private javax.swing.JTable TablaVehiculos;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtIDEmpleado;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
