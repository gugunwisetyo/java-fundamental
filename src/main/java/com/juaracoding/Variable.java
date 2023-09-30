package com.juaracoding;

public class Variable {
    public static void main(String[] args) {
//        System.out.println("informasi akun");
        String name = "GugunWisetyo";
//        byte age = 25;
//        boolean isPay = true;
//        System.out.println("Nama\t\t\t\t: "+name);
//        System.out.println("Umur\t\t\t\t: "+age);
//        System.out.println("status pembayaran\t: " +isPay);
//        int umur;
//        umur = 12 % 2;
//        System.out.println(umur);

        //string method
        //upper, lower
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //substring
        System.out.println(name.substring(0,5));

        String path = "Juara Coding";
        System.out.println(path.replace(" ", "_"));
        System.out.println(path.substring(3, path.length()));
    }
}
