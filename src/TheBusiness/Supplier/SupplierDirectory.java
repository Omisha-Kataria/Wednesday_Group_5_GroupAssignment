/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Supplier;

import TheBusiness.Business.Business;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kal bugrara
 */
public class SupplierDirectory {
    
    Business business;
    ArrayList<Supplier> suppliers;
    
    public SupplierDirectory(Business business){
        suppliers = new ArrayList();
        this.business = business;
    }
    public Supplier newSupplier(String n){
        Supplier supplier = new Supplier(n, this.business);
        suppliers.add(supplier);
        return supplier;

    }
    public Supplier findSupplier(String id){
        
        for (Supplier supplier: suppliers){
            
            if(supplier.getName().equals(id)) return supplier;
        }
        return null;
        }
    public ArrayList<Supplier> getSuplierList(){
        return suppliers;
    }
    
    public Supplier pickRandomSupplier() {
        Random r = new Random();
        int randomIndex = r.nextInt(suppliers.size());
        return suppliers.get(randomIndex);
    }
    
    public SupplierReport generateSupplierReport() {
        SupplierReport supplierReport = new SupplierReport();
        for (Supplier supplier : suppliers) {
            SupplierSummary supplierSummary = new SupplierSummary(supplier);
            supplierReport.newSupplierSummary(supplierSummary);
        }
        return supplierReport;
    }
    
}