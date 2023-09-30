package com.juaracoding.oop.encapsulation;

public class MainApp {
    public static void main(String[] args) {
        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword("password");

        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());

        User staff = new User();
        staff.setUsername("staff");
        staff.setPassword("123456");

        System.out.println(staff.getUsername());
        System.out.println(staff.getPassword());
    }
}
