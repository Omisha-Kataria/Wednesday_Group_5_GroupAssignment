/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.SalesManagement;

import java.util.ArrayList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author kal bugrara
 */
public class SalesPersonProfile extends Profile {
    
    ArrayList<Order> salesorders;


    public SalesPersonProfile(Person p) {

        super(p); 
        salesorders = new ArrayList();

    }
    public void addSalesOrder(Order o){
        salesorders.add(o);
    }

    public ArrayList<Order> getSalesorders() {
        return salesorders;
    }

    public void setSalesorders(ArrayList<Order> salesorders) {
        this.salesorders = salesorders;
    }

    public ArrayList<Order> getSortedOrders() {
        ArrayList<Order> sortedOrders = new ArrayList<>(salesorders);
        sortedOrders.sort((o1, o2) -> o2.getCustomer().getTotalSales() - o1.getCustomer().getTotalSales());
        return sortedOrders;
    }
    

    @Override
    public String getRole(){
        return  "Sales";
    }

}
