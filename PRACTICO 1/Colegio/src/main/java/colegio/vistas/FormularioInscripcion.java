/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package colegio.vistas;


import com.mycompany.colegio.Alumno;
import com.mycompany.colegio.Materia;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author litob
 */
public class FormularioInscripcion extends javax.swing.JInternalFrame {

    
    public FormularioInscripcion() {
        initComponents();        
        agregarMateria();
        agregarAlumno();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtInscribir = new javax.swing.JButton();
        jButtSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCombMate = new javax.swing.JComboBox<>();
        jCombAlum = new javax.swing.JComboBox<>();

        jButtInscribir.setText("Inscribir");
        jButtInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtInscribirActionPerformed(evt);
            }
        });

        jButtSalir.setText("Salir");
        jButtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Elija una materia");

        jLabel2.setText("Elija un alumno");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Formulario de Inscripción");

        jCombMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombMateActionPerformed(evt);
            }
        });

        jCombAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombAlumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtInscribir)
                        .addGap(66, 66, 66)
                        .addComponent(jButtSalir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCombAlum, 0, 211, Short.MAX_VALUE)
                    .addComponent(jCombMate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCombMate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCombAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtInscribir)
                    .addComponent(jButtSalir))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCombMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombMateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombMateActionPerformed

    private void jCombAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombAlumActionPerformed
    

    //Agregar materias a los hashset:
    private void jButtInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtInscribirActionPerformed
        Alumno a=(Alumno)jCombAlum.getSelectedItem();
        Materia m=(Materia)jCombMate.getSelectedItem();
        a.agregarMaterias(m); //Metodo de la clase Alumno el cual es publico por eso puedo acceder, NO accedo directamente al hashSet de la clase Alumno ya que es private
        a.mostrarMaterias();
        JOptionPane.showMessageDialog(this,"Inscripto Correctamente");
    }//GEN-LAST:event_jButtInscribirActionPerformed

    private void jButtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtSalirActionPerformed
        dispose(); //cierro internalFrame
    }//GEN-LAST:event_jButtSalirActionPerformed
    private void agregarMateria(){ //Agregar materias al comboBox
            for (Materia m : MenuPrincipal.materiasHash) {
            jCombMate.addItem(m); 
            }
    }
    private void agregarAlumno() { //Agregar ALUMNOS al comboBox

            for (Alumno a : MenuPrincipal.alumnosHash) {
            jCombAlum.addItem(a); 
            }
        
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtInscribir;
    private javax.swing.JButton jButtSalir;
    private javax.swing.JComboBox<Alumno> jCombAlum;
    private javax.swing.JComboBox<Materia> jCombMate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
