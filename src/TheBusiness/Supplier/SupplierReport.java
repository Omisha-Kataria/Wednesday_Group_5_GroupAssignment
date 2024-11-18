/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Supplier;
import java.util.ArrayList;

/**
 *
 * @author natnichalerd
 */
public class SupplierReport {

    static ArrayList<SupplierSummary> supplierSummaryList;

    public SupplierReport() {
        supplierSummaryList = new ArrayList();
    }
    
    // method to add supplier summary to the list
    public void newSupplierSummary(SupplierSummary ss) {
        supplierSummaryList.add(ss);
    }

    public ArrayList<SupplierSummary> getSupplierSummaryList() {
        return supplierSummaryList;
    }

    
    
}
