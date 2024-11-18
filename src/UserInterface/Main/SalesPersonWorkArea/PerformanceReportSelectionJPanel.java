/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Main.SalesPersonWorkArea;

import TheBusiness.Business.Business;
import TheBusiness.SalesManagement.SalesPersonProfile;
import UserInterface.Main.SupplierReport.SupplierReportJPanel;
import UserInterface.ProductManagement.ProductPerformanceReportsJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author natnichalerd
 */
public class PerformanceReportSelectionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PerformanceReportSelectionJPanel
     */
    
    Business business;
    JPanel CardSequencePanel;
    SalesPersonProfile salesperson;
    
    public PerformanceReportSelectionJPanel(Business business, JPanel jp, SalesPersonProfile salesperson) {
        
        this.business = business;
        CardSequencePanel = jp;
        this.salesperson = salesperson;
        
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCustomerPerformaceReport = new javax.swing.JButton();
        btnProductPerformanceReport = new javax.swing.JButton();
        btnSupplierReport = new javax.swing.JButton();

        btnCustomerPerformaceReport.setText("Customer Performance Report");
        btnCustomerPerformaceReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerPerformaceReportActionPerformed(evt);
            }
        });

        btnProductPerformanceReport.setText("Product Performance Report");
        btnProductPerformanceReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductPerformanceReportActionPerformed(evt);
            }
        });

        btnSupplierReport.setText("Supplier Report");
        btnSupplierReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnProductPerformanceReport, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCustomerPerformaceReport, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSupplierReport, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomerPerformaceReport, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductPerformanceReport, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupplierReport, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(741, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductPerformanceReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductPerformanceReportActionPerformed
        // TODO add your handling code here:
        ProductPerformanceReportsJPanel pprjp = new ProductPerformanceReportsJPanel(business, CardSequencePanel, salesperson);
        CardSequencePanel.add(pprjp);
        CardLayout layout = (CardLayout) CardSequencePanel.getLayout();
        layout.next(CardSequencePanel);
    }//GEN-LAST:event_btnProductPerformanceReportActionPerformed

    private void btnCustomerPerformaceReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerPerformaceReportActionPerformed
        // TODO add your handling code here:
        CustomerPerformanceReportJPanel cprjp = new CustomerPerformanceReportJPanel(business, CardSequencePanel, salesperson);
        CardSequencePanel.add(cprjp);
        CardLayout layout = (CardLayout) CardSequencePanel.getLayout();
        layout.next(CardSequencePanel);
    }//GEN-LAST:event_btnCustomerPerformaceReportActionPerformed

    private void btnSupplierReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierReportActionPerformed
        // TODO add your handling code here:
        
        SupplierReportJPanel srjp = new SupplierReportJPanel(business, CardSequencePanel);
        CardSequencePanel.add(srjp);
        CardLayout layout = (CardLayout) CardSequencePanel.getLayout();
        layout.next(CardSequencePanel);
        
    }//GEN-LAST:event_btnSupplierReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerPerformaceReport;
    private javax.swing.JButton btnProductPerformanceReport;
    private javax.swing.JButton btnSupplierReport;
    // End of variables declaration//GEN-END:variables
}
