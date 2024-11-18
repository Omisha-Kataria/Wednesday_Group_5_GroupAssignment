/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.CustomerManagement;

import TheBusiness.MarketModel.Channel;
import java.util.ArrayList;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.MarketChannelComboCatalog;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;
import TheBusiness.SolutionOrders.SolutionOrder;

/**
 *
 * @author kal bugrara
 */
public class CustomerProfile extends Profile {

    ArrayList<Order> orders;
    ArrayList<Market> markets;
    ArrayList<MarketChannelAssignment> mca;
    ArrayList<SolutionOrder> bundleOrders;
    //ArrayList<Channel> channels;
    

    Person person;

    public CustomerProfile(Person p) {
        super(p);
        person = p;
        orders = new ArrayList();
        markets = new ArrayList();
        mca = new ArrayList();
        bundleOrders = new ArrayList();

    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<SolutionOrder> getBundleOrders() {
        return bundleOrders;
    }

    public void setBundleOrders(ArrayList<SolutionOrder> bundleOrders) {
        this.bundleOrders = bundleOrders;
    }

    
    
    public ArrayList<MarketChannelAssignment> getMca() {
        return mca;
    }
    
    public MarketChannelAssignment addMarketChannelCombo(MarketChannelAssignment mca){
        this.mca.add(mca);
        return mca;
    }

    public void setMca(ArrayList<MarketChannelAssignment> mca) {
        this.mca = mca;
    }

    @Override
    public String getRole(){
        return "Sales";
    }

    public int getTotalPricePerformance() {

        //for each order in the customer orderlist 
        //calculate order price performance and add it to the sum
        return 0;
    }
    
    public int getTotalAmountSpent() {
        int totalAmountSpent = 0;
        for (SolutionOrder so : bundleOrders) {
            totalAmountSpent += so.getSolutionPrice();
            
        }

        return totalAmountSpent;
    }

    public int getNumberOfOrdersAboveTotalTarget() {
        //for each order in the customer order list 
        //calculate if order is positive (actual order total is greater than sum of item targets
        //if yes then add 1 to total 
        int sum = 0;
        for (Order o : orders) {
            if (o.isOrderAboveTotalTarget() == true) {
                sum = sum + 1;
            }
        }

        return sum;
    }

    public int getNumberOfOrdersBelowTotalTarget() {
        int sum = 0;
        for(Order o : orders){
            if(o.isOrderBelowTotalTarget()== true){
                sum = sum + 1;
            }
        }
        return sum;
    }
    //for each order in the customer order list 
    //calculate if order is negative
    //if yes then add 1 to total 

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public void addCustomerOrder(Order o) {
        orders.add(o);
    }

    @Override
    public String toString() {
        return person.getPersonId();
    }

    public String getCustomerId() {
        return person.getPersonId();
    }

    public Person getPerson() {
        return person;
    }

    public ArrayList<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(ArrayList<Market> markets) {
        this.markets = markets;
    } 

    public void removeOrder(SolutionOrder value) {
        bundleOrders.remove(value);
    }
    
    

}
