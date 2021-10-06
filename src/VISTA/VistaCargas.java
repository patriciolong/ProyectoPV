/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class VistaCargas extends javax.swing.JFrame {

    /**
     * Creates new form VistaEmpleado
     */
    public VistaCargas() {
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

        DialogoCargas = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtIdCarga = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        btnAceptarG = new javax.swing.JButton();
        btnAceptarE = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtFechaRecp = new com.toedter.calendar.JDateChooser();
        txtFechaEntre = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetalles = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnCrearr = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCargas = new javax.swing.JTable();

        jLabel3.setText("ID_CARGA:");

        jLabel4.setText("PESO:");

        jLabel5.setText("ID_CLIENTE:");

        btnAceptarG.setText("GRABAR");

        btnAceptarE.setText("EDITAR");

        btnCancelar.setText("CANCELAR");

        jLabel6.setText("DETALLES:");

        jLabel7.setText("FECHA RECEPCION:");

        jLabel8.setText("FECHA ENTREGA:");

        jLabel9.setText("DIRECCION ENTREGA:");

        jLabel10.setText("PRECIO:");

        txtDetalles.setColumns(20);
        txtDetalles.setRows(5);
        jScrollPane2.setViewportView(txtDetalles);

        javax.swing.GroupLayout DialogoCargasLayout = new javax.swing.GroupLayout(DialogoCargas.getContentPane());
        DialogoCargas.getContentPane().setLayout(DialogoCargasLayout);
        DialogoCargasLayout.setHorizontalGroup(
            DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoCargasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogoCargasLayout.createSequentialGroup()
                        .addComponent(btnAceptarG, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                        .addComponent(btnAceptarE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(DialogoCargasLayout.createSequentialGroup()
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(47, 47, 47)
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdCarga, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(txtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DialogoCargasLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(47, 47, 47)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DialogoCargasLayout.createSequentialGroup()
                                .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(47, 47, 47)
                                .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtFechaRecp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFechaEntre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(56, 56, 56))))
        );
        DialogoCargasLayout.setVerticalGroup(
            DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoCargasLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogoCargasLayout.createSequentialGroup()
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtFechaRecp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtFechaEntre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptarG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCancelar)
                                .addComponent(btnAceptarE)))
                        .addGap(28, 28, 28))
                    .addGroup(DialogoCargasLayout.createSequentialGroup()
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtIdCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DialogoCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CRUD CARGAS");
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

        TablaCargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_CARGA", "ID_CLIENTE", "PESO", "DETALLES", "FECHA RECEP", "FECHA ENTRE", "DIRECCION ENTRE", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(TablaCargas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 820, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    public JDialog getDialogoCargas() {
        return DialogoCargas;
    }

    public void setDialogoCargas(JDialog DialogoCargas) {
        this.DialogoCargas = DialogoCargas;
    }

    public JTable getTablaCargas() {
        return TablaCargas;
    }

    public void setTablaCargas(JTable TablaCargas) {
        this.TablaCargas = TablaCargas;
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

    public JTextArea getTxtDetalles() {
        return txtDetalles;
    }

    public void setTxtDetalles(JTextArea txtDetalles) {
        this.txtDetalles = txtDetalles;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JDateChooser getTxtFechaEntre() {
        return txtFechaEntre;
    }

    public void setTxtFechaEntre(JDateChooser txtFechaEntre) {
        this.txtFechaEntre = txtFechaEntre;
    }

    public JDateChooser getTxtFechaRecp() {
        return txtFechaRecp;
    }

    public void setTxtFechaRecp(JDateChooser txtFechaRecp) {
        this.txtFechaRecp = txtFechaRecp;
    }

    public JTextField getTxtIdCarga() {
        return txtIdCarga;
    }

    public void setTxtIdCarga(JTextField txtIdCarga) {
        this.txtIdCarga = txtIdCarga;
    }

    public JTextField getTxtIdCliente() {
        return txtIdCliente;
    }

    public void setTxtIdCliente(JTextField txtIdCliente) {
        this.txtIdCliente = txtIdCliente;
    }

    public JTextField getTxtPeso() {
        return txtPeso;
    }

    public void setTxtPeso(JTextField txtPeso) {
        this.txtPeso = txtPeso;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    /**
     * @param args the command line arguments
     */
    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogoCargas;
    private javax.swing.JTable TablaCargas;
    private javax.swing.JButton btnAceptarE;
    private javax.swing.JButton btnAceptarG;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearr;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtDetalles;
    private javax.swing.JTextField txtDireccion;
    private com.toedter.calendar.JDateChooser txtFechaEntre;
    private com.toedter.calendar.JDateChooser txtFechaRecp;
    private javax.swing.JTextField txtIdCarga;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
