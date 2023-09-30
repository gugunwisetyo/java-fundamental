package com.juaracoding;

public class JavaMethodCh {

    public static void main(String[] args) {
        double penghasilan = 7000;
        String kelamin = "pria";

        double pajak = hitungPajak(penghasilan, kelamin);
        System.out.println("Pajak yang harus dibayarkan: $" + pajak);
    }


    public static double hitungPajak(double penghasilan, String gender) {
        double taxRate;

        if (gender.equalsIgnoreCase("pria")) {
            taxRate = 0.10; // Pajak 10% untuk pria
        } else if (gender.equalsIgnoreCase("wanita")) {
            taxRate = 0.05; // Pajak 5% untuk wanita
        } else {
            System.out.println("Jenis kelamin tidak valid.");
            return 0.0;
        }

        double pajak = penghasilan-(penghasilan * taxRate);
        return pajak;
    }
}

