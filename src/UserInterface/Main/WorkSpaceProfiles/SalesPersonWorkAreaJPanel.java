/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package UserInterface.Main.WorkSpaceProfiles;

import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.SalesManagement.SalesPersonProfile;
import UserInterface.Main.SalesPersonWorkArea.PerformanceReportSelectionJPanel;
import UserInterface.Main.WorkSpaceProfiles.OrderManagement.ManageSalesPersonOrders;
import UserInterface.Main.WorkSpaceProfiles.OrderManagement.ProcessOrder;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kal
 */
public class SalesPersonWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    SalesPersonProfile salesperson;

    /**
     * Creates new form UnitRiskWorkArea
     * @param b
     * @param spp
     * @param clp
     */

    public SalesPersonWorkAreaJPanel(Business b, SalesPersonProfile spp, JPanel clp) {

        business = b;
        this.CardSequencePanel = clp;
        salesperson = spp;
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

        btnServeCustomers = new javax.swing.JButton();
        btnManageProfile = new javax.swing.JButton();
        btnReviewOrderStatusHistory = new javax.swing.JButton();
        btnReviewCommissions = new javax.swing.JButton();
        btnPerformanceReports = new javax.swing.JButton();
        customerNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(51, 51, 51));

        btnServeCustomers.setBackground(new java.awt.Color(102, 153, 255));
        btnServeCustomers.setFont(getFont());
        btnServeCustomers.setForeground(new java.awt.Color(255, 255, 255));
        btnServeCustomers.setText("Serve Customers");
        btnServeCustomers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnServeCustomers.setMaximumSize(new java.awt.Dimension(200, 40));
        btnServeCustomers.setMinimumSize(new java.awt.Dimension(20, 23));
        btnServeCustomers.setPreferredSize(new java.awt.Dimension(240, 30));
        btnServeCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServeCustomersIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnManageProfile.setBackground(new java.awt.Color(102, 153, 255));
        btnManageProfile.setFont(getFont());
        btnManageProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnManageProfile.setText("Manage Profile");
        btnManageProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageProfile.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageProfile.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageProfile.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfileActionPerformed(evt);
            }
        });

        btnReviewOrderStatusHistory.setBackground(new java.awt.Color(102, 153, 255));
        btnReviewOrderStatusHistory.setFont(getFont());
        btnReviewOrderStatusHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnReviewOrderStatusHistory.setText("Review Order Status History");
        btnReviewOrderStatusHistory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReviewOrderStatusHistory.setMaximumSize(new java.awt.Dimension(200, 40));
        btnReviewOrderStatusHistory.setMinimumSize(new java.awt.Dimension(20, 20));
        btnReviewOrderStatusHistory.setPreferredSize(new java.awt.Dimension(240, 25));
        btnReviewOrderStatusHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewOrderStatusHistoryActionPerformed(evt);
            }
        });

        btnReviewCommissions.setBackground(new java.awt.Color(102, 153, 255));
        btnReviewCommissions.setFont(getFont());
        btnReviewCommissions.setForeground(new java.awt.Color(255, 255, 255));
        btnReviewCommissions.setText("Review Comission");
        btnReviewCommissions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReviewCommissions.setMaximumSize(new java.awt.Dimension(200, 40));
        btnReviewCommissions.setMinimumSize(new java.awt.Dimension(20, 20));
        btnReviewCommissions.setPreferredSize(new java.awt.Dimension(240, 25));
        btnReviewCommissions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewCommissionsActionPerformed(evt);
            }
        });

        btnPerformanceReports.setBackground(new java.awt.Color(102, 153, 255));
        btnPerformanceReports.setFont(getFont());
        btnPerformanceReports.setForeground(new java.awt.Color(255, 255, 255));
        btnPerformanceReports.setText("Performance Reports");
        btnPerformanceReports.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPerformanceReports.setMaximumSize(new java.awt.Dimension(200, 40));
        btnPerformanceReports.setMinimumSize(new java.awt.Dimension(20, 20));
        btnPerformanceReports.setPreferredSize(new java.awt.Dimension(240, 25));
        btnPerformanceReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformanceReportsActionPerformed(evt);
            }
        });

        jLabel1.setText("Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(customerNameTextField)
                    .addComponent(btnServeCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(btnManageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPerformanceReports, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReviewOrderStatusHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(btnReviewCommissions, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnServeCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReviewOrderStatusHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReviewCommissions, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerformanceReports, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnServeCustomersIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServeCustomersIdentifyResourceAssetsActionPerformed
        
// TODO add your handling code here:

 
        String customername = customerNameTextField.getText();
        if (customername.isEmpty()) return;
        
        CustomerProfile selectedcustomer = business.getCustomerDirectory().findCustomer(customername);

        ProcessOrder aos = new ProcessOrder(business, selectedcustomer ,salesperson, CardSequencePanel);

        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnServeCustomersIdentifyResourceAssetsActionPerformed

    private void btnManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfileActionPerformed
        // TODO add your handling code here:


//        ManageVulns aos = new  ManageVulns(businessunit, CardSequencePanel);
        // aos.setAgenda(businessunit.getRiskManagementAgenda());
//        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

}//GEN-LAST:event_btnManageProfileActionPerformed

    private void btnReviewOrderStatusHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewOrderStatusHistoryActionPerformed
        // TODO add your handling code here:

        ManageSalesPersonOrders iet = new ManageSalesPersonOrders(business, CardSequencePanel, salesperson);

        CardSequencePanel.add("FindResourceAsset", iet);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnReviewOrderStatusHistoryActionPerformed

    private void btnReviewCommissionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewCommissionsActionPerformed
        // TODO add your handling code here:

        CardSequencePanel.removeAll();
        //      ViewBusinessUnitRiskProfile drpd= new ViewBusinessUnitRiskProfile(businessunit, CardSequencePanel);
//        ManageHazards drpd = new ManageHazards(businessunit, CardSequencePanel);
//        CardSequencePanel.add("ManageRiskProfiles", drpd);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
}//GEN-LAST:event_btnReviewCommissionsActionPerformed

    private void btnPerformanceReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformanceReportsActionPerformed
        // TODO add your handling code here:
        
       CardSequencePanel.removeAll();
        
       PerformanceReportSelectionJPanel selectionjp = new PerformanceReportSelectionJPanel(business, CardSequencePanel, salesperson);
       CardSequencePanel.add(selectionjp);
       ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

        
//        ManageIncidents aos = new  ManageIncidents(businessunit, CardSequencePanel);
        // aos.setAgenda(businessunit.getRiskManagementAgenda());
//        CardSequencePanel.add("RiskAgendaObjectives", aos);
        
}//GEN-LAST:event_btnPerformanceReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageProfile;
    private javax.swing.JButton btnPerformanceReports;
    private javax.swing.JButton btnReviewCommissions;
    private javax.swing.JButton btnReviewOrderStatusHistory;
    private javax.swing.JButton btnServeCustomers;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
