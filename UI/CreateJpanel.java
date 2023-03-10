/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import javax.swing.JOptionPane;
import Model.MedicineCatalog;
import Model.Medicine;
import Model.Observation;
import Model.VitalSignHistory;

/**
 *
 * @author thran
 */
public class CreateJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJpanel
     */
  private Application application;
    
    CreateJpanel(Application application){
initComponents();

this.application = application;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fieldObservationId = new javax.swing.JTextField();
        fieldTemperature1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldBloodPressure = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addObservationBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fieldObservationId, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 74, 70, -1));
        jPanel1.add(fieldTemperature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 111, 70, -1));

        jLabel1.setText("id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 74, -1, -1));

        jLabel2.setText("temperature");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 114, -1, -1));
        jPanel1.add(fieldBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 148, 70, -1));

        jLabel3.setText("blood pressure");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 151, -1, -1));

        addObservationBtn.setText("add observation");
        addObservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addObservationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addObservationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 208, -1, -1));

        jTextField1.setText("CREATE A VITAL SIGN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addObservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObservationBtnActionPerformed
        // TODO add your handling code here:
        
        
        VitalSignHistory history= this.application.getHistory();
        
        String id= fieldObservationId.getText();
        String temperature= fieldTemperature1.getText();
        String bloodPressure= fieldBloodPressure.getText();
        
        history.createObservation(Integer.valueOf(id), Double.valueOf(bloodPressure), Double.valueOf(temperature));
        
        JOptionPane.showMessageDialog(null, "Added Observation");
    }//GEN-LAST:event_addObservationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addObservationBtn;
    private javax.swing.JTextField fieldBloodPressure;
    private javax.swing.JTextField fieldObservationId;
    private javax.swing.JTextField fieldTemperature1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
