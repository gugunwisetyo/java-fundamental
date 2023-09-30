package com.juaracoding.oop;

public class Car {
    String bahanBakar;
    int tahunPembuatan = 2000;
//    int alas, sisi = 5;
//    int tinggi = 10;

    Car(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    void warna(){
        System.out.println("Berwarna Merah");
    }

    void mesin(){
        System.out.println("Bermesin 1800cc");
    }

    int getTahunPembuatan(){
        return tahunPembuatan;
    }
    String getBahanBakar(){
        return bahanBakar;
    }

    double luasSegitiga(double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }

    int luasKotak(int sisi){
        return sisi * sisi;
    }

    void polaKotak(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void polaSegitiga(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
