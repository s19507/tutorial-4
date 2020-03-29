package com.company;

public class Main {

    public static void main(String[] args) {
        User u1 = new User("Shah","Nishil","sXXXX1@pjwstk.edu.pl","ShahNishil");
        User u2 = new User("sXXXX2@pjwskt.edu.pl");
        u2.createUserFromGuest("nida", "krish", "nidakrish");

        Product p1 = new Product("Noodles",2.19,"XXX1",17);
        Product p2 = new Product("Milk", 3.49, "XXX2",7);
        Product p3 = new Product("Nuts",7.39,"XXX3",5);
        p2.setPrice(99999.99);
        p3.setAmount(999);
    }
}
