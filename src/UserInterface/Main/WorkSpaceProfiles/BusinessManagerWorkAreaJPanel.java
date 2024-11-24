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
import UserInterface.ManageTheBusiness.ManageTheBusinessJPanel;
import UserInterface.ProductManagement.ManageSuppliersJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kal
 */
public class BusinessManagerWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;

    /**
     * Creates new form UnitRiskWorkArea
     */

    public BusinessManagerWorkAreaJPanel(Business b, JPanel clp) {

        business = b;
        this.CardSequencePanel = clp;
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

        btnManageBusiness = new javax.swing.JButton();
        btnManageSalesPersons = new javax.swing.JButton();
        btnManageSuppliers = new javax.swing.JButton();
        btnManagePrices = new javax.swing.JButton();
        btnManageCustomers = new javax.swing.JButton();
        btnPerformanceReports = new javax.swing.JButton();

        setForeground(new java.awt.Color(51, 51, 51));

        btnManageBusiness.setBackground(new java.awt.Color(102, 153, 255));
        btnManageBusiness.setFont(getFont());
        btnManageBusiness.setForeground(new java.awt.Color(255, 255, 255));
        btnManageBusiness.setText("Manage The Business");
        btnManageBusiness.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageBusiness.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageBusiness.setMinimumSize(new java.awt.Dimension(20, 23));
        btnManageBusiness.setPreferredSize(new java.awt.Dimension(240, 30));
        btnManageBusiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBusinessIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnManageSalesPersons.setBackground(new java.awt.Color(102, 153, 255));
        btnManageSalesPersons.setFont(getFont());
        btnManageSalesPersons.setForeground(new java.awt.Color(255, 255, 255));
        btnManageSalesPersons.setText("Manage Sales Personnel");
        btnManageSalesPersons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageSalesPersons.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageSalesPersons.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageSalesPersons.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageSalesPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSalesPersonsActionPerformed(evt);
            }
        });

        btnManageSuppliers.setBackground(new java.awt.Color(102, 153, 255));
        btnManageSuppliers.setFont(getFont());
        btnManageSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        btnManageSuppliers.setText("Manage Suppliers");
        btnManageSuppliers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageSuppliers.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageSuppliers.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageSuppliers.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });

        btnManagePrices.setBackground(new java.awt.Color(102, 153, 255));
        btnManagePrices.setFont(getFont());
        btnManagePrices.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePrices.setText("Manage Prices");
        btnManagePrices.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManagePrices.setMaximumSize(new java.awt.Dimension(145, 40));
        btnManagePrices.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManagePrices.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManagePrices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePricesIdentifyEventsActionPerformed(evt);
            }
        });

        btnManageCustomers.setBackground(new java.awt.Color(102, 153, 255));
        btnManageCustomers.setFont(getFont());
        btnManageCustomers.setForeground(new java.awt.Color(255, 255, 255));
        btnManageCustomers.setText("Manage Customers");
        btnManageCustomers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageCustomers.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageCustomers.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageCustomers.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnManageSalesPersons, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManagePrices, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnManageBusiness, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnManageSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerformanceReports, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageBusiness, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageSalesPersons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManagePrices, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerformanceReports, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageBusinessIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBusinessIdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.removeAll();

        ManageTheBusinessJPanel aos = new ManageTheBusinessJPanel(business, CardSequencePanel);

        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnManageBusinessIdentifyResourceAssetsActionPerformed

    private void btnManageSalesPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSalesPersonsActionPerformed
        // TODO add your handling code here:

        CardSequencePanel.removeAll();
//        ManageVulns aos = new  ManageVulns(businessunit, CardSequencePanel);
        // aos.setAgenda(businessunit.getRiskManagementAgenda());
//        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

}//GEN-LAST:event_btnManageSalesPersonsActionPerformed

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
        // TODO add your handling code here:

        ManageSuppliersJPanel iet = new ManageSuppliersJPanel(business, CardSequencePanel);

        CardSequencePanel.add("FindResourceAsset", iet);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnManageSuppliersActionPerformed

    private void btnManagePricesIdentifyEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePricesIdentifyEventsActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.removeAll();
        //    IdentifyEventTypes iet= new IdentifyEventTypes(businessunit, CardSequencePanel);

        //    CardSequencePanel.add("IdentifyEventTypes", iet);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        //((java.awt.CardLayout)CardSequencePanel.getLayout()).show(CardSequencePanel, "IdentifyEventTypes");
}//GEN-LAST:event_btnManagePricesIdentifyEventsActionPerformed

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        // TODO add your handling code here:

        CardSequencePanel.removeAll();
        //      ViewBusinessUnitRiskProfile drpd= new ViewBusinessUnitRiskProfile(businessunit, CardSequencePanel);
//        ManageHazards drpd = new ManageHazards(businessunit, CardSequencePanel);
//        CardSequencePanel.add("ManageRiskProfiles", drpd);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
}//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnPerformanceReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformanceReportsActionPerformed
        // TODO add your handling code here:

        CardSequencePanel.removeAll();
//        ManageIncidents aos = new  ManageIncidents(businessunit, CardSequencePanel);
        // aos.setAgenda(businessunit.getRiskManagementAgenda());
//        CardSequencePanel.add("RiskAgendaObjectives", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        
        
}//GEN-LAST:event_btnPerformanceReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageBusiness;
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManagePrices;
    private javax.swing.JButton btnManageSalesPersons;
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JButton btnPerformanceReports;
    // End of variables declaration//GEN-END:variables

}
