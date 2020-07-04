/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDirectorio;
import java.awt.Point;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Anahi
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private ControladorDirectorio controladorDirectorio;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        controladorDirectorio = new ControladorDirectorio();
        this.setTitle("Gestión de Directorios");
        this.setLocation(new Point(300, 100));
    }

     public void llenarLista(List<String> directorio) {
        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();

        for (String nombre : directorio) {
            modelo.addElement(nombre);
        }
        lista.setModel(modelo);
    }

    public void limpiarLista() {
        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();
        lista.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        btnListarD = new javax.swing.JButton();
        btnMostar = new javax.swing.JButton();
        btnDOcultos = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        btnInfo = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        crearMenu = new javax.swing.JMenuItem();
        eliminarMenu = new javax.swing.JMenuItem();
        renombrarMenu = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        btnListarD.setText("Listar Directorios");
        btnListarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDActionPerformed(evt);
            }
        });
        desktopPane.add(btnListarD);
        btnListarD.setBounds(80, 90, 113, 23);

        btnMostar.setText("Mostrar Archivos Ocultos");
        btnMostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarActionPerformed(evt);
            }
        });
        desktopPane.add(btnMostar);
        btnMostar.setBounds(210, 90, 153, 23);

        btnDOcultos.setText("Listar Directorios Ocultos");
        btnDOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDOcultosActionPerformed(evt);
            }
        });
        desktopPane.add(btnDOcultos);
        btnDOcultos.setBounds(370, 90, 170, 23);
        desktopPane.add(txtRuta);
        txtRuta.setBounds(230, 40, 230, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ruta:");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(190, 40, 34, 14);

        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        desktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 310, 160);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane2.setViewportView(txtInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(330, 120, 250, 160);

        btnInfo.setText("Mostrar Información");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        desktopPane.add(btnInfo);
        btnInfo.setBounds(120, 290, 130, 23);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Gestionar");

        crearMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        crearMenu.setMnemonic('o');
        crearMenu.setText("Crear");
        crearMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuActionPerformed(evt);
            }
        });
        fileMenu.add(crearMenu);

        eliminarMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        eliminarMenu.setMnemonic('s');
        eliminarMenu.setText("Eliminar");
        eliminarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuActionPerformed(evt);
            }
        });
        fileMenu.add(eliminarMenu);

        renombrarMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        renombrarMenu.setMnemonic('a');
        renombrarMenu.setText("Renombrar");
        renombrarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renombrarMenuActionPerformed(evt);
            }
        });
        fileMenu.add(renombrarMenu);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnDOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDOcultosActionPerformed
        String ruta = txtRuta.getText();

        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "Obligatorio llenar el campo de ruta");
        } else {
            if (controladorDirectorio.validarRuta(ruta)) {
                List<String> directorios = controladorDirectorio.listarDirectoriosOcultos(ruta);
                if (directorios.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No contiene directorios ocultos");
                    limpiarLista();
                } else {
                    llenarLista(directorios);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ruta del directorio incorrecta");
            }

        }
    }//GEN-LAST:event_btnDOcultosActionPerformed

    private void btnMostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarActionPerformed
        String ruta = txtRuta.getText();

        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "Obligatorio llenar el campo de ruta");
        } else {
            if (controladorDirectorio.validarRuta(ruta)) {
                List<String> directorios = controladorDirectorio.listarArchivosOcultos(ruta);
                if (directorios.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No contiene archivos ocultos");
                    limpiarLista();
                } else {
                    llenarLista(directorios);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ruta del directorio incorrecta");

            }

        }
    }//GEN-LAST:event_btnMostarActionPerformed

    private void btnListarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDActionPerformed
        String ruta = txtRuta.getText();

        String subdirectorio = lista.getSelectedValue();

        if (subdirectorio != null) {
            List<String> directorios = controladorDirectorio.buscarNombre(ruta, subdirectorio);
            
            //
            txtRuta.setText(controladorDirectorio.devolverRuta(ruta, subdirectorio));
            subdirectorio = null;
            if (directorios.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El directorio esta vacío");

                limpiarLista();
            } else {
                llenarLista(directorios);
            }
        } else {
            if (ruta == null) {
                JOptionPane.showMessageDialog(this, "Obligatorio llenar el campo de ruta");
            } else {
                if (controladorDirectorio.validarRuta(ruta)) {
                    List<String> directorios = controladorDirectorio.listarArchivos(ruta);
                    if (directorios.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "El directorio esta vacío");
                        limpiarLista();
                    } else {
                        llenarLista(directorios);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ruta del directorio incorrecta");

                }

            }
        }
    }//GEN-LAST:event_btnListarDActionPerformed

    private void crearMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuActionPerformed
        String nuevo = null;

        nuevo = JOptionPane.showInputDialog("Escriba el nombre del nuevo directorio");
        if (nuevo == null) {
            JOptionPane.showMessageDialog(this, "Agregue un nombre al directorio");
        } else {
            System.out.println(nuevo);
            String ruta = txtRuta.getText();
            if (ruta == null) {
                JOptionPane.showMessageDialog(this, "Obligatorio llenar el campo de ruta");
            } else {
                if (controladorDirectorio.comprobarExistencia(ruta, nuevo)) {
                    int opcion = JOptionPane.showConfirmDialog(this, "La carpeta ya existe, ¿desea reemplazarla?");
                    if (opcion == JOptionPane.YES_OPTION) {
                        controladorDirectorio.crearDirectorio(ruta, nuevo);
                        JOptionPane.showMessageDialog(this, "Directorio creado correctamente");
                        List<String> directorio = controladorDirectorio.listarArchivos(ruta);
                        llenarLista(directorio);
                    }

                } else {
                    controladorDirectorio.crearDirectorio(ruta, nuevo);   
                    JOptionPane.showMessageDialog(this, "Directorio creado correctamente");
                    
                }
            }
        }

    }//GEN-LAST:event_crearMenuActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        String nombre = lista.getSelectedValue();
        String ruta = txtRuta.getText();

        String informacion = controladorDirectorio.mostrarInfo(nombre, ruta);
        txtInfo.setText(informacion);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void eliminarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuActionPerformed
       int opcion = JOptionPane.showConfirmDialog(this, "¿Desea eliminar este directorio?");
        if (opcion == JOptionPane.YES_OPTION) {
            try {
                String eliminar = lista.getSelectedValue();
                String ruta = txtRuta.getText();
                controladorDirectorio.eliminarDirectorio(ruta, eliminar);
                List<String> directorio = controladorDirectorio.listarArchivos(ruta);
                llenarLista(directorio);
                JOptionPane.showMessageDialog(this, "Directorio eliminado correctamente");
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        List<String> directorio = controladorDirectorio.listarArchivos(txtRuta.getText());
        llenarLista(directorio);

    }//GEN-LAST:event_eliminarMenuActionPerformed

    private void renombrarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renombrarMenuActionPerformed
        String renombre = null;

        renombre = JOptionPane.showInputDialog("Escriba el nombre del nuevo directorio");
        if (renombre == null) {
            JOptionPane.showMessageDialog(this, "Agregue un nombre al directorio");
        } else {
            String ruta = txtRuta.getText();
            if (controladorDirectorio.validarRuta(ruta)) {
                String actual = lista.getSelectedValue();
                controladorDirectorio.renombrarDirectorio(ruta, actual, renombre);
                JOptionPane.showMessageDialog(this, "Directorio actualizado");
                List<String> directorio = controladorDirectorio.listarArchivos(ruta);
                llenarLista(directorio);
            } else {
                JOptionPane.showMessageDialog(this, "Inserte la ruta correcta");
            }
        }
    }//GEN-LAST:event_renombrarMenuActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        String nombre = lista.getSelectedValue();
        btnInfo.setEnabled(true);
        System.out.println(nombre);
    }//GEN-LAST:event_listaMouseClicked

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
    private javax.swing.JButton btnDOcultos;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnListarD;
    private javax.swing.JButton btnMostar;
    private javax.swing.JMenuItem crearMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem eliminarMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem renombrarMenu;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables

}
