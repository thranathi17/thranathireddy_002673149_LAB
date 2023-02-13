/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import Model.Application;
import Model.Medicine;
import Model.MedicineCatalog;
import Model.Observation;
import Model.VitalSignHistory;
import java.util.ArrayList;

/**
 *
 * @author thran
 */
public class MedicineAssignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicineAssignJPanel
     */
    private Application application;
    
MedicineAssignJPanel(Application application){
initComponents();

this.application = application;

populateDropdowns();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicineBox = new javax.swing.JComboBox();
        ObservationsBox = new javax.swing.JComboBox();
        assignMedBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        ObservationsBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ObservationsBoxItemStateChanged(evt);
            }
        });

        assignMedBtn.setText("assign");
        assignMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignMedBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(medicineBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(ObservationsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(assignMedBtn)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ObservationsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(assignMedBtn)
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignMedBtnActionPerformed
        // TODO add your handling code here:
        Observation o = (Observation) ObservationsBox.getSelectedItem();
        Medicine m= (Medicine) medicineBox.getSelectedItem();
        
        o.setMedication(m);
        
    }//GEN-LAST:event_assignMedBtnActionPerformed

    private void ObservationsBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ObservationsBoxItemStateChanged
        // TODO add your handling code here:
        Observation o = (Observation) ObservationsBox.getSelectedItem();
        
        if(o.getMedication() != null){
        jLabel1.setText(o.getMedication().getMedicineName());
                }
    }//GEN-LAST:event_ObservationsBoxItemStateChanged

    
    
    public void populateDropdowns(){
  ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
  
  ArrayList<Observation> observations = this.application.getHistory().getVitalSignHistory();
  
  for(Observation o: observations){
  ObservationsBox.addItem(o);
  }
  for(Medicine med: medicines){
  medicineBox.addItem(med);
  }    
  
  }
  



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ObservationsBox;
    private javax.swing.JButton assignMedBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox medicineBox;
    // End of variables declaration//GEN-END:variables
}