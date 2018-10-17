/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria;

import co.edu.intecap.veterinaria.gui.Creador;
import co.edu.intecap.veterinaria.gui.Gestor;
import co.edu.intecap.veterinaria.gui.Visualizador;
import co.edu.intecap.veterinaria.negocio.mascotas.Gato;
import co.edu.intecap.veterinaria.negocio.mascotas.Perro;
import co.edu.intecap.veterinaria.util.Utilidad;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author capacitaciones
 */
public class Principal extends javax.swing.JFrame {

    public static ArrayList<Perro> listaPerros;
    public static ArrayList<Gato> listaGatos;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        asignarListeners();
        listaGatos = Utilidad.leerArchivoGatos();
        listaPerros = Utilidad.leerArchivoPerros();
        // Actualizacion al iniciar el proyecto, carga de informacion de los
        // archivos planos
        actualizarListas();
    }

    public static void actualizarListas() {
        lstPerros.removeAll();
        DefaultListModel<String> modeloPerro = new DefaultListModel<>();
        for (Perro perro : listaPerros) {
            modeloPerro.addElement(perro.getNombre());
        }
        lstPerros.setModel(modeloPerro);

        lstGatos.removeAll();
        DefaultListModel<String> modeloGato = new DefaultListModel<>();
        for (Gato gato : listaGatos) {
            modeloGato.addElement(gato.getNombre());
        }
        lstGatos.setModel(modeloGato);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstGatos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPerros = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnDetalle = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();
        btnGuardarInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstGatos);

        jScrollPane2.setViewportView(lstPerros);

        jLabel1.setText("Lista de Perros");

        jLabel2.setText("Lista de Gatos");

        btnCrear.setText("Crear Mascota");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnDetalle.setText("Detalle de Mascota");
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });

        btnActividades.setText("Actividades");
        btnActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesActionPerformed(evt);
            }
        });

        btnGuardarInfo.setText("Guardar Informacion");
        btnGuardarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActividades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarInfo)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        new Creador(this, false, listaPerros, listaGatos).setVisible(true);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
        if (lstPerros.getSelectedIndex() < 0 && lstGatos.getSelectedIndex() < 0) {
            Utilidad.lanzarAlerta(this, "Debe seleccionar una mascota de las listas", "Seleccion de mascotas", JOptionPane.WARNING_MESSAGE);
        }
        if (lstPerros.getSelectedIndex() > -1) {
            Perro perro = listaPerros.get(lstPerros.getSelectedIndex());
            new Visualizador(this, true, perro).setVisible(true);
        }
        if (lstGatos.getSelectedIndex() > -1) {
            Gato gato = listaGatos.get(lstGatos.getSelectedIndex());
            new Visualizador(this, true, gato).setVisible(true);
        }
    }//GEN-LAST:event_btnDetalleActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        if (lstPerros.getSelectedIndex() < 0 && lstGatos.getSelectedIndex() < 0) {
            Utilidad.lanzarAlerta(this, "Debe seleccionar una mascota de las listas", "Seleccion de mascotas", JOptionPane.WARNING_MESSAGE);
        }
        if (lstPerros.getSelectedIndex() > -1) {
            Perro perro = listaPerros.get(lstPerros.getSelectedIndex());
            new Gestor(this, true, perro).setVisible(true);
        }
        if (lstGatos.getSelectedIndex() > -1) {
            Gato gato = listaGatos.get(lstGatos.getSelectedIndex());
            new Gestor(this, true, gato).setVisible(true);
        }
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnGuardarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarInfoActionPerformed
        Utilidad.escribirArchivoPerros(listaPerros);
        Utilidad.escribirArchivoGatos(listaGatos);
    }//GEN-LAST:event_btnGuardarInfoActionPerformed

    private void asignarListeners() {
        ListSelectionListener selector = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                JList<String> lista = (JList<String>) e.getSource();
                if (lista.equals(lstPerros)) {
                    lstGatos.clearSelection();
                }
                if (lista.equals(lstGatos)) {
                    lstPerros.clearSelection();
                }
            }
        };
        lstPerros.addListSelectionListener(selector);
        lstGatos.addListSelectionListener(selector);
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnGuardarInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JList<String> lstGatos;
    private static javax.swing.JList<String> lstPerros;
    // End of variables declaration//GEN-END:variables
}
