package com.juaracoding;
import java.util.Arrays;
import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {
        int angka[] = new int[7];

        String[] mobil = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < mobil.length; i++){
            System.out.println(mobil[i]);
        }
        //for each
        System.out.println("Use for each");
        for (String data : mobil) {
            System.out.println(data);
        }
        //implementasi input ke array 1d

//        int x;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("masukkan jumlah data maksimal : ");
//        x=sc.nextInt();
//        int[] array = new int[x];
//        System.out.println("masukkan data : ");
//        for(int i=0; i<x; i++)
//        {
//            array[i]=sc.nextInt();
//        }
//        System.out.println("data yang sudah dimasukkan adalah: ");
//        for (int i=0; i<x; i++)
//        {
//            System.out.println(array[i]);
//        }

        Scanner input = new Scanner(System.in);
//        int jumlahData = 5; // ubah menjadi input
//        String[] firstName = new String[jumlahData];
//        for (int i = 0; i < jumlahData; i++) {
//            System.out.println("Masukkan data first name ke-"+(i+1)+": ");
//            firstName[i] = input.nextLine();
//        }
//        for (String data : firstName) {
//            System.out.println(data);
//        }
//
//        //buat data buah
//        String[] buah = {"Apel", "Jeruk", "Anggur", "Salak"};
//        for (int i = 0; i < buah.length; i++){
//            System.out.println(buah[i]);
//        }

        String fruit[] = {"Nanas", "Jeruk", "Apel", "Pisang", "Semangka"};
        Arrays.sort(fruit);
        System.out.println("sorting sebagai berikut : ");
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }
//        System.out.print("Cari data buah : ");
//        String cari = input.nextLine();
//        boolean found = false;
//        int index = 0;
//
//        for (int i = 0; i < fruit.length; i++) {
//            if (fruit[i].equalsIgnoreCase(cari)){
//                found = true;
//                index = i;
//                break;
//            }
//        }
//        if (found){
//            System.out.println("Buah "+cari+" ditemukan pada index ke-"+index);
//        } else {
//            System.out.println("buah "+cari+" tidak ditemukan didalam array");
//        }
    }
}
