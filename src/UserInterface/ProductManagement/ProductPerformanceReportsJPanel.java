/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ProductManagement;

import TheBusiness.Business.Business;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Personnel.Profile;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.Supplier.Supplier;
import TheBusiness.UserAccountManagement.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author natnichalerd
 */
public class ProductPerformanceReportsJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ProductPerformanceReportsJPanel
     */
    
    JPanel CardSequencePanel;
    Business business;
    Supplier supplier;
    SalesPersonProfile salesperson;
    
    
    public ProductPerformanceReportsJPanel(Business business, JPanel jp, SalesPersonProfile salesperson) {
        
        initComponents();
        
        this.business = business;
        CardSequencePanel = jp;
        this.salesperson = salesperson;

        
        refreshTable();
        populateTable();
        
        mostExpensiveProduct();
        
    }
    
    public void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) tblProductPerformance.getModel();
        model.setRowCount(0);
        
        tblProductPerformance.setAutoCreateRowSorter(true);
        
        for (Order order : salesperson.getSalesorders()) {
            for (OrderItem orderItem : order.getSortedProducts()) {
                Object[] row = new Object[1];
                row[0] = orderItem.getSelectedProduct();
            
            model.addRow(row);
            
            }
        }
            
    }
    
    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblProductPerformance.getModel();
        model.setRowCount(0);
        
        
        for (Order order : salesperson.getSalesorders()) {
            for (OrderItem orderItem : order.getSortedProducts()) {
                Object[] row = new Object[3];
                row[0] = orderItem;
                row[1] = order.getSupplier();
                row[2] = orderItem.getActualPrice();
            
                model.addRow(row);
            
            }
        }
    }
    
    public void mostExpensiveProduct() {
        txtProductName.setText(String.valueOf(tblProductPerformance.getValueAt(0, 0)));
        txtSupplierName.setText(String.valueOf(tblProductPerformance.getValueAt(0, 1)));
        txtPrice.setText(String.valueOf(tblProductPerformance.getValueAt(0, 2)));
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
        tblProductPerformance = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        lblProductPerformanceRanking = new javax.swing.JLabel();
        lblMostExpensiveProduct = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblProductName = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        lblSupplierName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();

        tblProductPerformance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product name", "Supplier name", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblProductPerformance);
        if (tblProductPerformance.getColumnModel().getColumnCount() > 0) {
            tblProductPerformance.getColumnModel().getColumn(0).setResizable(false);
            tblProductPerformance.getColumnModel().getColumn(1).setResizable(false);
            tblProductPerformance.getColumnModel().getColumn(2).setResizable(false);
        }

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Product Performance Report");

        lblProductPerformanceRanking.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblProductPerformanceRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductPerformanceRanking.setText("Product Performance Ranking (High to Low)");

        lblMostExpensiveProduct.setText("Most expensive product:");

        txtProductName.setEditable(false);

        lblProductName.setText("Product name:");

        txtSupplierName.setEditable(false);

        lblSupplierName.setText("Supplier name:");

        lblPrice.setText("Price:");

        txtPrice.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblProductPerformanceRanking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSupplierName)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMostExpensiveProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblProductName)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitle)
                .addGap(55, 55, 55)
                .addComponent(lblProductPerformanceRanking)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(lblMostExpensiveProduct)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierName)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(355, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMostExpensiveProduct;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPerformanceRanking;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblProductPerformance;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables
}
