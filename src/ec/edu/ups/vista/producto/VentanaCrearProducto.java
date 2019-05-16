
package ec.edu.ups.vista.producto;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.modelo.Producto;
import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.ResourceBundle;
public class VentanaCrearProducto extends javax.swing.JInternalFrame {
    private ControladorProducto controladorProducto;
    private Locale localizacion;
    private static ResourceBundle mensajes;
    public VentanaCrearProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto = controladorProducto;
        Ccodigo.setText(String.valueOf(this.controladorProducto.getCodigo()));
    }
 public static void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        CC.setText(mensajes.getString("cliente.codigo"));
        CN.setText(mensajes.getString("cliente.nombre"));
        CP.setText(mensajes.getString("producto.precio"));
        BG.setText(mensajes.getString("boton.guardar"));
        BC.setText(mensajes.getString("boton.cancelar"));
        MCP.setText(mensajes.getString("MCP"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CC = new javax.swing.JLabel();
        Ccodigo = new javax.swing.JTextField();
        CN = new javax.swing.JLabel();
        Cnombre = new javax.swing.JTextField();
        CP = new javax.swing.JLabel();
        Cprecio = new javax.swing.JTextField();
        BG = new javax.swing.JButton();
        BC = new javax.swing.JButton();
        MCP = new javax.swing.JLabel();

        setClosable(true);

        CC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CC.setText("CODIGO");

        Ccodigo.setEnabled(false);
        Ccodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CcodigoActionPerformed(evt);
            }
        });

        CN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CN.setText("NOMBRE");

        CP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CP.setText("PRECIO");

        BG.setText("GUARDAR");
        BG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGActionPerformed(evt);
            }
        });

        BC.setText("CANCELAR");
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        MCP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MCP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MCP.setText("CREAR PRODUCTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ccodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(MCP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(BG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BC))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CN, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(MCP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ccodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CC, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CP)
                    .addComponent(Cprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BG)
                    .addComponent(BC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CcodigoActionPerformed

    private void BGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGActionPerformed
        // TODO add your handling code here:
        Producto crearProducto = new Producto();
        crearProducto.setNombre(Cnombre.getText());
        crearProducto.setPrecio(Double.valueOf(Cprecio.getText()));
        controladorProducto.crear(crearProducto);
        JOptionPane.showMessageDialog(this,"PRODUCTO CREADO");

        Ccodigo.setText(String.valueOf(this.controladorProducto.getCodigo()));
        Cnombre.setText("");
        Cprecio.setText("");
    }//GEN-LAST:event_BGActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BC;
    public static javax.swing.JButton BG;
    public static javax.swing.JLabel CC;
    public static javax.swing.JLabel CN;
    public static javax.swing.JLabel CP;
    private javax.swing.JTextField Ccodigo;
    private javax.swing.JTextField Cnombre;
    private javax.swing.JTextField Cprecio;
    public static javax.swing.JLabel MCP;
    // End of variables declaration//GEN-END:variables
}
