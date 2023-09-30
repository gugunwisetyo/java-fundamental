package com.juaracoding;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TaskWeek1 {
    public static void main(String[] args) {
        //no 1
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan Jumlah\t: ");
//        int qty = input.nextInt();
//        System.out.print("Masukkan Harga\t: ");
//        double harga = input.nextInt();
//        System.out.println("-------------");
//        System.out.println("Qty\t\t: "+qty);
//        System.out.println("Harga\t: "+harga);
//        double jumlah = qty * harga;
//        System.out.println("Jumlah\t: "+jumlah);

        //no 2
//        String kata = "Java Juara";
//        System.out.println(kata.length());
//        System.out.println(kata.toUpperCase());
//        System.out.println(kata.toLowerCase());
//        System.out.println(kata.substring(kata.length()-3));

        //no 3
//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukkan hari dari senin s/d minggu.");
//        System.out.println("Masukkan exit untuk selesai.");
//        System.out.println("------------------------------------");
//        while (true){
//            System.out.print("Masukkan hari pemesanan tiket : ");
//            String hari = input.nextLine().toLowerCase();
//
//            if(hari.equals("exit")){
//                break;
//            }
//
//            int hargaTiket;
//
//            switch (hari){
//                case "senin":
//                case "selasa":
//                case "rabu":
//                case "kamis":
//                case "jumat":
//                    hargaTiket = 30000;
//                    break;
//                case "sabtu":
//                case "minggu":
//                    hargaTiket = 45000;
//                    break;
//                default:
//                    System.out.println("Input salah. Masukkan hari yang benar.");
//                    continue;
//            }
//            System.out.println("Harga tiket untuk hari "+hari+" adalah Rp."+hargaTiket);
//        }

        //no 4
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("masukkan angka bebas (0 untuk selesai): ");
//            int number = scanner.nextInt();
//            if (number == 0) {
//                System.out.println("Program selesai.");
//                break;
//            }
//            System.out.println("Angka yang dimasukkan: " + number);
//        }

        //no 5
//        String[] buah = {"nanas","apel","jeruk","pisang","semangka"};
//        String namaBuahTerpanjang = "";
//        int maxLength = 0;
//
//        for (String namaBuah : buah){
//            if (namaBuah.length() > maxLength){
//                maxLength = namaBuah.length();
//                namaBuahTerpanjang = namaBuah;
//            }
//        }
//        System.out.println("Buah dengan nama terpanjang adalah : "+namaBuahTerpanjang);
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getDay());
        int dow = date.getDay();

        //get string date
        Format f = new SimpleDateFormat("EEEE");
        String strDay = f.format(new Date());
        // print day name
        System.out.println("Day name: "+strDay);
        if (dow >= 1 && dow <=5){
            System.out.println("Harga tiket 30000");
        } else {
            System.out.println("Harga tiket 45000");
        }

        for (int i = 1; i <= 7; i++) {
            if (i <= 5){
                continue;
            }
            System.out.println(i);
        }
    }
}