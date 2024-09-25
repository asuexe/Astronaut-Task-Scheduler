package com.FWDP2;

class pizza implements Franchise {
    private String name;
    private String location;
    private String phone;
    private String menu;

    public pizza(String name, String location, String phone, String menu) {
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.menu = menu;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Phone: " + phone);
        System.out.println("Menu: " + menu);
    }
}