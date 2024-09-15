/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package colegio.vistas;

import com.mycompany.colegio.Materia;
import com.mycompany.colegio.Alumno;
import java.util.HashSet;

/**
 *
 * @author litob
 */
public class MenuPrincipal extends javax.swing.JFrame {
    public static HashSet<Materia> materiasHash  = new HashSet<>(); //Instancio y declaro en ´public para que pueda ser accedido en otras clases y estatico para que se comporte como un hashSet "Global"
    public static HashSet<Alumno> alumnosHash = new HashSet<>();//idem arriba

    public MenuPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlumno = new javax.swing.JMenu();
        jMenuItemAlumno = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jMenuItemMateria = new javax.swing.JMenuItem();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemRegistro = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenuAlumno.setText("Alumno");

        jMenuItemAlumno.setText("Agregar alumno");
        jMenuItemAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlumnoActionPerformed(evt);
            }
        });
        jMenuAlumno.add(jMenuItemAlumno);

        jMenuBar1.add(jMenuAlumno);

        jMenuMateria.setText("Materia");

        jMenuItemMateria.setText("Agregar Materias");
        jMenuItemMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMateriaActionPerformed(evt);
            }
        });
        jMenuMateria.add(jMenuItemMateria);

        jMenuBar1.add(jMenuMateria);

        jMenuRegistro.setText("Registro");

        jMenuItemRegistro.setText("Inscripción a Materias");
        jMenuItemRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemRegistro);

        jMenuBar1.add(jMenuRegistro);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });

        jMenuItemSalir.setText("Click aquí para salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuSalir.add(jMenuItemSalir);

        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlumnoActionPerformed
        escritorio.removeAll();
	escritorio.removeAll();
        escritorio.repaint();
        AltaAlumnos a1 = new AltaAlumnos();
        a1.setVisible(true);
        escritorio.add(a1);
        escritorio.moveToFront(a1);
    }//GEN-LAST:event_jMenuItemAlumnoActionPerformed

    private void jMenuItemMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMateriaActionPerformed
        escritorio.removeAll();
	escritorio.removeAll();
        escritorio.repaint();
        AltaMaterias a2 = new AltaMaterias();
        a2.setVisible(true);
        escritorio.add(a2);
        escritorio.moveToFront(a2);
    }//GEN-LAST:event_jMenuItemMateriaActionPerformed

    private void jMenuItemRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroActionPerformed
        escritorio.removeAll();
	escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion a2 = new FormularioInscripcion();
        a2.setVisible(true);
        escritorio.add(a2);
        escritorio.moveToFront(a2);
    }//GEN-LAST:event_jMenuItemRegistroActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAlumno;
    private javax.swing.JMenuItem jMenuItemMateria;
    private javax.swing.JMenuItem jMenuItemRegistro;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
