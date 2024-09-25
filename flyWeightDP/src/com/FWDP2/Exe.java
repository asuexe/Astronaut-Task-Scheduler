package com.FWDP2;


public class Exe {
    public static void main(String[] args) {
        FranchiseFactory factory = new FranchiseFactory();

        Franchise franchise1 = factory.getFranchise("Pizza Hut", "New York", "123-456-7890", "Pepperoni Pizza, Cheese Pizza, etc.");
        franchise1.printDetails();

        Franchise franchise2 = factory.getFranchise("Pizza Hut", "Los Angeles", "123-456-7890", "Pepperoni Pizza,Cheese Pizza,etc.");
        franchise2.printDetails();
    }
}