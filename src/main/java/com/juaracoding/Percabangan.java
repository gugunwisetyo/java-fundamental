package com.juaracoding;
import java.util.Date;
import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        if (true) {
            System.out.println("Statement IF");
        }
        //statement akan dijalankan jika true, jika false ingin dijalankan gunakan else

        int num = 3;
        if (num > 2){
            System.out.println("Bilangan "+num+" lebih besar daripada 2");
        } else {
            System.out.println("Bilangan "+num+" tidak lebih besar daripada 2");
        }

        if (num % 2 == 0){
            System.out.println("bilangan "+num+" adalah bilangan genap");
        } else {
            System.out.println("bilangan "+num+" adalah bilangan ganjil");
        }

        //if majemuk
        char size = 'M';
        if (size == 'S'){
            System.out.println("Ukuran baju kecil");
        } else if (size == 'M') {
            System.out.println("Ukuran baju sedang");
        } else if (size == 'L') {
            System.out.println("Ukuran baju besar");
        } else {
            System.out.println("Tidak ada ukuran baju tersebut");
        }

        //nested if
        System.out.println("Jalur Ganjil Genap");
        Scanner plat = new Scanner(System.in);
        System.out.print("Masukkan Plat Nomor : ");
        int PlatNomor = plat.nextInt();

        Scanner tgl = new Scanner(System.in);
        System.out.print("Masukkan Tanggal : ");
        int tanggal = tgl.nextInt();
        if (PlatNomor % 2 ==0){
            if (tanggal % 2 ==0){
                System.out.println("Plat genap dan tanggal genap, maka bisa lewat");
            } else {
                System.out.println("Plat genap dan tanggal ganjil, maka tidak bisa lewat");
            }
        } else if (tanggal % 2 ==0){
            System.out.println("Plat ganjil dan tanggal genap, maka tidak bisa lewat");
        } else {
            System.out.println("Plat ganjil dan tanggal ganjil, maka bisa lewat");
        }

        //date
        Date date = new Date();
        System.out.println(date.toString());

        //kondisi if menggunakan sebuah function di string
        String warna = "Biru";
        if (warna.equalsIgnoreCase("biru")){
            System.out.println("Warna baju biru");
        }

        //switch case cocok digunakan jika sebuah kondisi tidak memiliki rentang nilai
        //seperti saat akan konfirmasi penghapusan item barang pada e-commerce

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan pilihan menu : ");
        int pilih = scanner.nextInt();
        switch (pilih){
            case 1:
                System.out.println("1. Tampilkan data");
                break;
            case 2:
                System.out.println("2. Tambah data");
                break;
            case 3:
                System.out.println("3. Perbaharui data");
                break;
            case 4:
                System.out.println("4. Hapus data");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
