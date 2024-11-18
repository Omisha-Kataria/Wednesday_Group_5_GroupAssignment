/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Supplier;


/**
 *
 * @author natnichalerd
 */
public class SupplierSummary {
    
    Supplier supplier;
    int totalSales;
    double loyaltyScore;
    int averageSpending;
    int top5SaleScore;
    
    

    // constructor
    public SupplierSummary(Supplier supplier) {
        this.supplier = supplier;
        totalSales = supplier.getTotalSales();
        loyaltyScore = supplier.getLoyaltyScore();
        averageSpending = supplier.getAverageSpendingPerCustomer();
        top5SaleScore = supplier.getTop5SaleScore();
    }
    
    // performance

    public String getSupplierName() {
        return supplier.getName();
    }

    public int getTotalSales() {
        return totalSales;
    }

    public double getLoyaltyScore() {
        return loyaltyScore;
    }

    public int getAverageSpendingPerCustomer() {
        return averageSpending;
    }

    public int getTop5SaleScore() {
        return top5SaleScore;
    }
    
    @Override
    public String toString() {
        return supplier.getName();
    }

}
