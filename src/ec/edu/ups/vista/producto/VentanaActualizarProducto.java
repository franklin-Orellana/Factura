/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.producto;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.modelo.Producto;
import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.ResourceBundle;
public class VentanaActualizarProducto extends javax.swing.JInternalFrame {
 
    private ControladorProducto controladorProducto;
    private Locale localizacion;
    private static ResourceBundle mensajes;
    public VentanaActualizarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto = controladorProducto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public static void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        Ccodigo.setText(mensajes.getString("cliente.codigo"));
        PN.setText(mensajes.getString("cliente.nombre"));
        PP.setText(mensajes.getString("producto.precio"));
        BB.setText(mensajes.getString("boton.buscar"));
        BA.setText(mensajes.getString("producto.precio"));
        BC.setText(mensajes.getString("boton.cancelar"));
        MAP.setText(mensajes.getString("MAP"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Anombre = new javax.swing.JTextField();
        PP = new javax.swing.JLabel();
        Aprecio = new javax.swing.JTextField();
        BA = new javax.swing.JButton();
        BC = new javax.swing.JButton();
        MAP = new javax.swing.JLabel();
        Ccodigo = new javax.swing.JLabel();
        Acodigo = new javax.swing.JTextField();
        PN = new javax.swing.JLabel();
        BB = new javax.swing.JButton();

        setClosable(true);

        PP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PP.setText("PRECIO");

        BA.setText("ACTUALIZAR");
        BA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAActionPerformed(evt);
            }
        });

        BC.setText("CANCELAR");
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        MAP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MAP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MAP.setText("ACTUALIZAR PRODUCTO");

        Ccodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Ccodigo.setText("CODIGO");

        Acodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcodigoActionPerformed(evt);
            }
        });

        PN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PN.setText("NOMBRE");

        BB.setText("BUSCAR");
        BB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BC))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PN, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Anombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Aprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ccodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Acodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BB)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MAP)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Acodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ccodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PP)
                    .addComponent(Aprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BA)
                    .addComponent(BC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAActionPerformed
        // TODO add your handling code here:
        Producto crearProducto = new Producto();
        crearProducto.setNombre(Anombre.getText());
        crearProducto.setPrecio(Double.valueOf(Aprecio.getText()));
        controladorProducto.update(crearProducto);
        JOptionPane.showMessageDialog(this,"PRODUCTO CREADO");
        Ccodigo.setText(String.valueOf(this.controladorProducto.getCodigo()));
        Anombre.setText("");
        Aprecio.setText("");
    }//GEN-LAST:event_BAActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BCActionPerformed

    private void AcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcodigoActionPerformed

    private void BBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(Acodigo.getText());
        Producto buscarProducto = controladorProducto.read(codigo);
        Anombre.setText(buscarProducto.getNombre());
        Aprecio.setText(String.valueOf(buscarProducto.getPrecio()));
    }//GEN-LAST:event_BBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Acodigo;
    private javax.swing.JTextField Anombre;
    private javax.swing.JTextField Aprecio;
    public static javax.swing.JButton BA;
    public static javax.swing.JButton BB;
    public static javax.swing.JButton BC;
    public static javax.swing.JLabel Ccodigo;
    public static javax.swing.JLabel MAP;
    public static javax.swing.JLabel PN;
    public static javax.swing.JLabel PP;
    // End of variables declaration//GEN-END:variables
}
