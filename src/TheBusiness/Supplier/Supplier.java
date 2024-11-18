/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Supplier;

import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.OrderManagement.Order;
import java.util.ArrayList;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.ProductManagement.ProductSummary;
import TheBusiness.ProductManagement.ProductsReport;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kal bugrara
 */
public class Supplier {
    Business business;
    String name;
    ProductCatalog productcatalog;
    ProductsReport productsreport;
    // order list
    ArrayList<Order> orderList;

    
    public Supplier(String n, Business business){
        this.business = business;
        name = n;
        productcatalog = new ProductCatalog("software");
        orderList = new ArrayList<Order>();
    }
    
    public ProductsReport prepareProductsReport(){
        
        productsreport = productcatalog.generatProductPerformanceReport();
        return productsreport;
    }
    
    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget(){
       
        if(productsreport==null) productsreport = prepareProductsReport();
       return productsreport.getProductsAlwaysAboveTarget();
       
    }
    
    public String getName(){
        return name;
    }
    
    public ProductCatalog getProductCatalog(){
        return productcatalog;
    }

     
        
        
    //add supplier product ..
    public void addOrder(Order order) {
        orderList.add(order);
    }
    
    //update supplier product ...
        
    @Override
   public String toString(){
       return name;
   }
   
   
   // method to calculate total sales
   public int getTotalSales() {
       int totalsales = 0;
       for (Order order : orderList) {
           totalsales += order.getOrderTotal();
       }
       return totalsales;
   }
   
   
   // different customers
   public Set<CustomerProfile> getDifferentCustomers() {
       Set<CustomerProfile> customers = new HashSet<>();
       for (Order order : orderList) {
           customers.add(order.getCustomer());
       }
       return customers;
   }
   
   
   public int numberOfUniqueCustomers() {
       int uniqueCustomerCount = getDifferentCustomers().size();
       return uniqueCustomerCount;
   }
   
   
   // get top 5 sales
   public int getTop5Sales() {
       int top5sales = 0;
       // sorting list of orders using Comparator
       orderList.sort((o1, o2) -> o2.getOrderTotal() - o1.getOrderTotal());
       // sort to the top 5 orders and get score
       for (int i = 0; i < 5 && i < orderList.size(); i++) {
           top5sales += orderList.get(i).getOrderTotal();
       }
       // score into int instead of double
       return top5sales * 100;
   }
   
   // loyalty score = number of supplier's unique customers / number of all customers
   public double getLoyaltyScore() {
       CustomerDirectory customerDirectory = business.getCustomerDirectory();
       double loyaltyScore = (numberOfUniqueCustomers() / customerDirectory.getNumberOfCustomers()) * 100;
       return loyaltyScore;
   }
   
   // total sales / number of different customers
   public int getAverageSpendingPerCustomer() {
       if (numberOfUniqueCustomers() == 0) {
           return 0;
       }
       return getTotalSales() / numberOfUniqueCustomers();
   }
   
   // total sales of top 5 customers / total sales
    public int getTop5SaleScore() {
        if (getTotalSales() == 0) {
            return 0;
        }
        return getTop5Sales() / getTotalSales();
    }
}
