/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kal bugrara
 */
public class Market {

    String name;
    ArrayList<Channel> validchannels;
    ArrayList<String> characteristics; //a way to describe in plain language what is that group
    ArrayList<Market> submarkets; //Keep redundant
    int size;
    CustomerDirectory customerDirectory;

    public Market(String m) {
        name = m;
        characteristics = new ArrayList();
        submarkets = new ArrayList();
        validchannels = new ArrayList();
    }

    public void addCharactersitic(String c) {
        characteristics.add(c);
    }

    public void addValidChannel(Channel c) {

        validchannels.add(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Channel> getValidchannels() {
        return validchannels;
    }
    
    public static int getRandomNumber(int n) {
        // Create an instance of Random class
        Random random = new Random();

        // Generate a random number between 0 (inclusive) and n (exclusive)
        int randomNumber = random.nextInt(n);

        return randomNumber;
    }
    
    public Channel getRandomChannel(){
        if (validchannels != null && !validchannels.isEmpty()) {
            // Get a random index within the size of the channels list
            int randomIndex = getRandomNumber(validchannels.size());

            // Return the Channel at the random index
            return validchannels.get(randomIndex);
        } else {
            // Handle the case when the channels list is empty or null
            System.out.println("No channels available.");
            return null;
        }
        
    
    
    }
    
    
//    public Channel getRandomValidChannel(){
//        if (validchannels.isEmpty()){
//            return null;
//        }
//        int validChannelSize = validchannels.size()-1;
//        int min = 0;
//        int index = (int) Math.floor(Math.random() * (validChannelSize - min + 1)) + min;
//
//        System.out.println("Index - " +index+ " and size is " + validChannelSize);
//        return validchannels.get(index);
//    }

    public void setValidchannels(ArrayList<Channel> validchannels) {
        this.validchannels = validchannels;
    }

    public ArrayList<String> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(ArrayList<String> characteristics) {
        this.characteristics = characteristics;
    }

    public ArrayList<Market> getSubmarkets() {
        return submarkets;
    }

    public void setSubmarkets(ArrayList<Market> submarkets) {
        this.submarkets = submarkets;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
     public ArrayList<Market> addCustomer(CustomerProfile cs){
        //submarkets.add(cs);
        return submarkets;
      
    }

    

}
