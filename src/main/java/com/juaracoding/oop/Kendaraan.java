package com.juaracoding.oop;

public class Kendaraan {
    public static void main(String[] args) {
        Car mobil = new Car("Pertalite");
        mobil.warna();
        mobil.mesin();

        System.out.println("Bahannya : "+mobil.getBahanBakar());
        System.out.println("Tahun pembuatan : "+mobil.getTahunPembuatan());

        System.out.println();

        System.out.println("luas kotak : "+mobil.luasKotak(5));
        System.out.println("luas segitiga : "+mobil.luasSegitiga(5,10));
        mobil.polaKotak();
        mobil.polaSegitiga();
    }
}
