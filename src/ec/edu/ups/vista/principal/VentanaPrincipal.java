package ec.edu.ups.vista.principal;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.controladores.ControladorFactura;
import ec.edu.ups.controladores.ControladorFacturaDetalle;
import ec.edu.ups.modelo.Factura;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Producto;
import ec.edu.ups.vista.factura.VentanaFactura;
import ec.edu.ups.vista.cliente.VentanaActualizarCliente;
import ec.edu.ups.vista.cliente.VentanaBuscarCliente;
import ec.edu.ups.vista.cliente.VentanaCrearCliente;
import ec.edu.ups.vista.cliente.VentanaEliminarCliente;
import ec.edu.ups.vista.cliente.VentanaListarCliente;
import ec.edu.ups.vista.producto.VentanaActualizarProducto;
import ec.edu.ups.vista.producto.VentanaBuscarProducto;
import ec.edu.ups.vista.producto.VentanaCrearProducto;
import ec.edu.ups.vista.producto.VentanaEliminarProducto;
import ec.edu.ups.vista.producto.VentanaListaProducto;
import java.util.Locale;
import java.util.ResourceBundle;

public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;
    private ControladorFactura controladorFactura;
    private Locale localizacion;
    private ResourceBundle mensajes;
    private ControladorFacturaDetalle controladorFacturaDetalle;

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        controladorFactura = new ControladorFactura();
        controladorCliente = new ControladorCliente();
        controladorProducto = new ControladorProducto();        
        //System.out.println("localizacion por defecto: "+Locale.getDefault().getLanguage());
        localizacion = new Locale("en", "US");
        Locale.setDefault(localizacion);
        
        //System.out.println(""+Locale.getDefault().getLanguage());
        //mensajes = ResourceBundle.getBundle("ec.edu.ups.idimas.mensajes",Locale.getDefault());
        //System.out.println("Mensajes");
        //System.out.println(mensajes.getString("menu.item.Crear"));
    }
    
    public void cambiarIdioma(){
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
        Cliente.setText(mensajes.getString("menu.cliente"));
        Producto.setText(mensajes.getString("menu.producto"));
        Factura.setText(mensajes.getString("menu.factura"));
        Idioma.setText(mensajes.getString("menu.idiomas"));
        
        Ccrear.setText(mensajes.getString("menu.item.Crear"));
        Pcrear.setText(mensajes.getString("menu.item.Crear"));
        Fcrear.setText(mensajes.getString("menu.item.Crear"));
        
        Clistar.setText(mensajes.getString("menu.item.Listar"));
        Plistar.setText(mensajes.getString("menu.item.Listar"));
        Flistar.setText(mensajes.getString("menu.item.Listar"));
        
        Cbuscar.setText(mensajes.getString("menu.item.Buscar"));
        Pbuscar.setText(mensajes.getString("menu.item.Buscar"));
        Fbuscar.setText(mensajes.getString("menu.item.Buscar"));
        
        Cactualizar.setText(mensajes.getString("menu.item.Actualizar"));
        Pactualizar.setText(mensajes.getString("menu.item.Actualizar"));
        Factualizar.setText(mensajes.getString("menu.item.Actualizar"));
        
        Celiminar.setText(mensajes.getString("menu.item.Eliminar"));
        Peliminar.setText(mensajes.getString("menu.item.Eliminar"));
        Feliminar.setText(mensajes.getString("menu.item.Eliminar"));
        
        //Iingles.setText(mensajes.getString(""));
        //Iespanol.setText(mensajes.getString(""));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        Cliente = new javax.swing.JMenu();
        Ccrear = new javax.swing.JMenuItem();
        Clistar = new javax.swing.JMenuItem();
        Cbuscar = new javax.swing.JMenuItem();
        Cactualizar = new javax.swing.JMenuItem();
        Celiminar = new javax.swing.JMenuItem();
        Producto = new javax.swing.JMenu();
        Pcrear = new javax.swing.JMenuItem();
        Plistar = new javax.swing.JMenuItem();
        Pbuscar = new javax.swing.JMenuItem();
        Pactualizar = new javax.swing.JMenuItem();
        Peliminar = new javax.swing.JMenuItem();
        Factura = new javax.swing.JMenu();
        Fcrear = new javax.swing.JMenuItem();
        Flistar = new javax.swing.JMenuItem();
        Fbuscar = new javax.swing.JMenuItem();
        Factualizar = new javax.swing.JMenuItem();
        Feliminar = new javax.swing.JMenuItem();
        Idioma = new javax.swing.JMenu();
        Iingles = new javax.swing.JMenuItem();
        Iespanol = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cliente.setMnemonic('f');
        Cliente.setText("Cliente");

        Ccrear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Ccrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/crear.png"))); // NOI18N
        Ccrear.setMnemonic('o');
        Ccrear.setText("Crear");
        Ccrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CcrearActionPerformed(evt);
            }
        });
        Cliente.add(Ccrear);

        Clistar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        Clistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/lista.png"))); // NOI18N
        Clistar.setMnemonic('s');
        Clistar.setText("Listar");
        Clistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClistarActionPerformed(evt);
            }
        });
        Cliente.add(Clistar);

        Cbuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Cbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/buscar.png"))); // NOI18N
        Cbuscar.setMnemonic('a');
        Cbuscar.setText("Buscar");
        Cbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbuscarActionPerformed(evt);
            }
        });
        Cliente.add(Cbuscar);

        Cactualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Cactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/actualizar.png"))); // NOI18N
        Cactualizar.setMnemonic('x');
        Cactualizar.setText("Actualizar");
        Cactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CactualizarActionPerformed(evt);
            }
        });
        Cliente.add(Cactualizar);

        Celiminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Celiminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/eliminar.png"))); // NOI18N
        Celiminar.setMnemonic('s');
        Celiminar.setText("Eliminar");
        Celiminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CeliminarActionPerformed(evt);
            }
        });
        Cliente.add(Celiminar);

        menuBar.add(Cliente);

        Producto.setMnemonic('e');
        Producto.setText("Producto");

        Pcrear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Pcrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/crear.png"))); // NOI18N
        Pcrear.setMnemonic('t');
        Pcrear.setText("Crear");
        Pcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PcrearActionPerformed(evt);
            }
        });
        Producto.add(Pcrear);

        Plistar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        Plistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/lista.png"))); // NOI18N
        Plistar.setMnemonic('y');
        Plistar.setText("Listar");
        Plistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlistarActionPerformed(evt);
            }
        });
        Producto.add(Plistar);

        Pbuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Pbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/buscar.png"))); // NOI18N
        Pbuscar.setMnemonic('p');
        Pbuscar.setText("Buscar");
        Pbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PbuscarActionPerformed(evt);
            }
        });
        Producto.add(Pbuscar);

        Pactualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Pactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/actualizar.png"))); // NOI18N
        Pactualizar.setMnemonic('d');
        Pactualizar.setText("Actualizar");
        Pactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PactualizarActionPerformed(evt);
            }
        });
        Producto.add(Pactualizar);

        Peliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Peliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/eliminar.png"))); // NOI18N
        Peliminar.setMnemonic('d');
        Peliminar.setText("Eliminar");
        Peliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeliminarActionPerformed(evt);
            }
        });
        Producto.add(Peliminar);

        menuBar.add(Producto);

        Factura.setMnemonic('e');
        Factura.setText("Factura");

        Fcrear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Fcrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/crear.png"))); // NOI18N
        Fcrear.setMnemonic('t');
        Fcrear.setText("Crear");
        Fcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FcrearActionPerformed(evt);
            }
        });
        Factura.add(Fcrear);

        Flistar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        Flistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/lista.png"))); // NOI18N
        Flistar.setMnemonic('y');
        Flistar.setText("Listar");
        Flistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlistarActionPerformed(evt);
            }
        });
        Factura.add(Flistar);

        Fbuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Fbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/buscar.png"))); // NOI18N
        Fbuscar.setMnemonic('p');
        Fbuscar.setText("Buscar");
        Fbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FbuscarActionPerformed(evt);
            }
        });
        Factura.add(Fbuscar);

        Factualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Factualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/actualizar.png"))); // NOI18N
        Factualizar.setMnemonic('d');
        Factualizar.setText("Actualizar");
        Factualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FactualizarActionPerformed(evt);
            }
        });
        Factura.add(Factualizar);

        Feliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Feliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/eliminar.png"))); // NOI18N
        Feliminar.setMnemonic('d');
        Feliminar.setText("Eliminar");
        Feliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeliminarActionPerformed(evt);
            }
        });
        Factura.add(Feliminar);

        menuBar.add(Factura);

        Idioma.setMnemonic('e');
        Idioma.setText("Idioma");

        Iingles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Iingles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/idioma.png"))); // NOI18N
        Iingles.setMnemonic('t');
        Iingles.setText("Ingles");
        Iingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IinglesActionPerformed(evt);
            }
        });
        Idioma.add(Iingles);

        Iespanol.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        Iespanol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/principal/idioma.png"))); // NOI18N
        Iespanol.setMnemonic('y');
        Iespanol.setText("Español");
        Iespanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IespanolActionPerformed(evt);
            }
        });
        Idioma.add(Iespanol);

        menuBar.add(Idioma);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CactualizarActionPerformed
       VentanaActualizarCliente actualizarCliente= new VentanaActualizarCliente(controladorCliente);
        actualizarCliente.setVisible(true);
        desktopPane.add(actualizarCliente);
    }//GEN-LAST:event_CactualizarActionPerformed

    private void CcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CcrearActionPerformed
        // TODO add your handling code here:
        VentanaCrearCliente crearCliente = new VentanaCrearCliente(controladorCliente);
        crearCliente.setVisible(true);
        desktopPane.add(crearCliente);
    }//GEN-LAST:event_CcrearActionPerformed

    private void PcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PcrearActionPerformed
        // TODO add your handling code here:
        VentanaCrearProducto crearProducto = new VentanaCrearProducto(controladorProducto);
        crearProducto.setVisible(true);
        desktopPane.add(crearProducto);
    }//GEN-LAST:event_PcrearActionPerformed

    private void ClistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClistarActionPerformed
        // TODO add your handling code here:
        VentanaListarCliente listarCliente= new VentanaListarCliente(controladorCliente);
        listarCliente.setVisible(true);
        desktopPane.add(listarCliente);
    }//GEN-LAST:event_ClistarActionPerformed

    private void CbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbuscarActionPerformed
        // TODO add your handling code here:
        VentanaBuscarCliente buscarCliente= new VentanaBuscarCliente(controladorCliente);
        buscarCliente.setVisible(true);
        desktopPane.add(buscarCliente);
    }//GEN-LAST:event_CbuscarActionPerformed

    private void CeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeliminarActionPerformed
        // TODO add your handling code here:
        VentanaEliminarCliente eliminarCliente= new VentanaEliminarCliente(controladorCliente);
        eliminarCliente.setVisible(true);
        desktopPane.add(eliminarCliente);
    }//GEN-LAST:event_CeliminarActionPerformed

    private void PlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlistarActionPerformed
        // TODO add your handling code here:
        VentanaListaProducto listaProducto = new VentanaListaProducto(controladorProducto);
        listaProducto.setVisible(true);
        desktopPane.add(listaProducto);
    }//GEN-LAST:event_PlistarActionPerformed

    private void PbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PbuscarActionPerformed
        // TODO add your handling code here:
        VentanaBuscarProducto buscarProducto = new VentanaBuscarProducto(controladorProducto);
        buscarProducto.setVisible(true);
        desktopPane.add(buscarProducto);
    }//GEN-LAST:event_PbuscarActionPerformed

    private void PactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PactualizarActionPerformed
        // TODO add your handling code here:
        VentanaActualizarProducto actualizarProducto = new VentanaActualizarProducto(controladorProducto);
        actualizarProducto.setVisible(true);
        desktopPane.add(actualizarProducto);
    }//GEN-LAST:event_PactualizarActionPerformed

    private void PeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeliminarActionPerformed
        // TODO add your handling code here:
        VentanaEliminarProducto eliminarProducto = new VentanaEliminarProducto(controladorProducto);
        eliminarProducto.setVisible(true);
        desktopPane.add(eliminarProducto);
    }//GEN-LAST:event_PeliminarActionPerformed

    private void FcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FcrearActionPerformed
        // TODO add your handling code here:
        VentanaFactura ventanaFactura = new VentanaFactura(controladorFactura, controladorFacturaDetalle, controladorCliente, controladorProducto);
        ventanaFactura.setVisible(true);
        desktopPane.add(ventanaFactura);
    }//GEN-LAST:event_FcrearActionPerformed

    private void FlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlistarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlistarActionPerformed

    private void FbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FbuscarActionPerformed

    private void FactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FactualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FactualizarActionPerformed

    private void FeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeliminarActionPerformed

    private void IinglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IinglesActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("en","US");
        Locale.setDefault(localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_IinglesActionPerformed

    private void IespanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IespanolActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("es","EC");
        Locale.setDefault(localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_IespanolActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cactualizar;
    private javax.swing.JMenuItem Cbuscar;
    private javax.swing.JMenuItem Ccrear;
    private javax.swing.JMenuItem Celiminar;
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenuItem Clistar;
    private javax.swing.JMenuItem Factualizar;
    private javax.swing.JMenu Factura;
    private javax.swing.JMenuItem Fbuscar;
    private javax.swing.JMenuItem Fcrear;
    private javax.swing.JMenuItem Feliminar;
    private javax.swing.JMenuItem Flistar;
    private javax.swing.JMenu Idioma;
    private javax.swing.JMenuItem Iespanol;
    private javax.swing.JMenuItem Iingles;
    private javax.swing.JMenuItem Pactualizar;
    private javax.swing.JMenuItem Pbuscar;
    private javax.swing.JMenuItem Pcrear;
    private javax.swing.JMenuItem Peliminar;
    private javax.swing.JMenuItem Plistar;
    private javax.swing.JMenu Producto;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
