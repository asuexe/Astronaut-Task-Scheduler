package com.FWDP2;

import java.util.HashMap;

class FranchiseFactory {
    private HashMap<String, Franchise> franchises;

    public FranchiseFactory() {
        franchises = new HashMap<String,Franchise>();
    }

    public Franchise getFranchise(String name, String location, String phone, String menu) {
        String key = name +"  " +location;
        Franchise franchise = franchises.get(key);

        if (franchise == null) {
            franchise = new pizza(name, location, phone, menu);
            franchises.put(key, franchise);
            System.out.println("Details of franchise : " + key);

        }

        return franchise;
    }
}
