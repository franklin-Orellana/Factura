package ec.edu.ups.vista.cliente;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.ResourceBundle;

public class VentanaCrearCliente extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private Locale localizacion;
    private static ResourceBundle mensajes;

    public VentanaCrearCliente(ControladorCliente controladorCliente) {
        initComponents();
        this.controladorCliente = controladorCliente;
        Ccodigo.setText(String.valueOf(this.controladorCliente.getCodigo()));
    }

    public static void cambiarIdioma(Locale localizacion) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
        CCcodigo.setText(mensajes.getString("cliente.codigo"));
        CCnombre.setText(mensajes.getString("cliente.nombre"));
        CCapellido.setText(mensajes.getString("cliente.apellido"));
        CCcedula.setText(mensajes.getString("cliente.cedula"));
        CCdireccion.setText(mensajes.getString("cliente.direccion"));
        CCtelefono.setText(mensajes.getString("cliente.telefono"));
        Bguardar.setText(mensajes.getString("boton.buscar"));
        Bcancelar.setText(mensajes.getString("boton.cancelar"));
        MCC.setText(mensajes.getString("MCC"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ccedula = new javax.swing.JTextField();
        Cnombre = new javax.swing.JTextField();
        Cdireccion = new javax.swing.JTextField();
        Ctelefono = new javax.swing.JTextField();
        Bguardar = new javax.swing.JButton();
        Bcancelar = new javax.swing.JButton();
        MCC = new javax.swing.JLabel();
        CCcodigo = new javax.swing.JLabel();
        CCcedula = new javax.swing.JLabel();
        Ccodigo = new javax.swing.JTextField();
        CCnombre = new javax.swing.JLabel();
        CCdireccion = new javax.swing.JLabel();
        CCtelefono = new javax.swing.JLabel();
        Capellido = new javax.swing.JTextField();
        CCapellido = new javax.swing.JLabel();

        setClosable(true);

        Bguardar.setText("GUARDAR");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        Bcancelar.setText("CANCELAR");
        Bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcancelarActionPerformed(evt);
            }
        });

        MCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MCC.setText("CREAR CLIENTE");

        CCcodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CCcodigo.setText("CODIGO");

        CCcedula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CCcedula.setText("CEDULA");

        Ccodigo.setEnabled(false);
        Ccodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CcodigoActionPerformed(evt);
            }
        });

        CCnombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CCnombre.setText("NOMBRE");

        CCdireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CCdireccion.setText("DIRECCION");
        CCdireccion.setToolTipText("");

        CCtelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CCtelefono.setText("TELEFONO");

        CCapellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CCapellido.setText("APELLIDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CCcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ccodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(MCC, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CCnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CCcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CCapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Cnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ccedula, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Capellido, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Bguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bcancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CCdireccion)
                            .addComponent(CCtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ctelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(MCC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ccodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ccedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCcedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCnombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Capellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCapellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCdireccion)
                    .addComponent(Cdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCtelefono)
                    .addComponent(Ctelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bguardar)
                    .addComponent(Bcancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        // TODO add your handling code here:
        Cliente crearCliente = new Cliente();
        crearCliente.setCedula(Ccedula.getText());
        crearCliente.setNombre(Cnombre.getText());
        crearCliente.setApellido(Capellido.getText());
        crearCliente.setTelefono(Ctelefono.getText());
        crearCliente.setDireccion(Cdireccion.getText());
        controladorCliente.crear(crearCliente);
        JOptionPane.showMessageDialog(this, "EL CLIENTE SE A CREADO");

        Ccodigo.setText(String.valueOf(this.controladorCliente.getCodigo()));
        Ccedula.setText("");
        Cnombre.setText("");
        Capellido.setText("");
        Ctelefono.setText("");
        Cdireccion.setText("");

    }//GEN-LAST:event_BguardarActionPerformed

    private void BcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BcancelarActionPerformed

    private void CcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CcodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Bcancelar;
    public static javax.swing.JButton Bguardar;
    public static javax.swing.JLabel CCapellido;
    public static javax.swing.JLabel CCcedula;
    public static javax.swing.JLabel CCcodigo;
    public static javax.swing.JLabel CCdireccion;
    public static javax.swing.JLabel CCnombre;
    public static javax.swing.JLabel CCtelefono;
    private javax.swing.JTextField Capellido;
    private javax.swing.JTextField Ccedula;
    private javax.swing.JTextField Ccodigo;
    private javax.swing.JTextField Cdireccion;
    private javax.swing.JTextField Cnombre;
    private javax.swing.JTextField Ctelefono;
    public static javax.swing.JLabel MCC;
    // End of variables declaration//GEN-END:variables
}
