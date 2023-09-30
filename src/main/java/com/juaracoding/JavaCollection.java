package com.juaracoding;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaCollection {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        //menambahkan item (create) = add
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        //mengakses item (read) = get
        System.out.println(cars.get(1));
        //mengubah item (update) = set
        cars.set(0, "Toyota");
        System.out.println(cars);
        //menghapus item (delete) = remove
        cars.remove(3);
        System.out.println(cars);
        //mengetahui jumlah item pada collection = size
        System.out.println(cars.size());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("---");
        for (String data : cars) {
            System.out.println(data);
        }

        //menu CRUD (input, looping) nama produk
        //1. tampilkan data
        //2. tambah data
        //3. perbaharui data
        //4. hapus
        //5. keluar

        ArrayList<String> buah = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Selamat datang, silahkan pilih menu 1-5.");
            System.out.println("1. Tambahkan produk");
            System.out.println("2. Tampilkan produk");
            System.out.println("3. Perbaharui produk");
            System.out.println("4. Hapus produk");
            System.out.println("5. Selesai");

            String pilih = input.nextLine();

            if (pilih.equals("5")){
                break;
            }

            boolean selesai = true;
            switch (pilih){
                case "1":
                    while (selesai){
                        System.out.println("lakukan penambahan produk (input selesai untuk mengakhiri)");
                        String namaBuah = input.nextLine();
                        if (namaBuah.equalsIgnoreCase("selesai")){
                            selesai = false;
                        } else {
                            buah.add(namaBuah);
                        }
                    }
                    break;
                case "2":
                    System.out.println("Berikut daftar produk yang tersedia");
                    if (buah.size()==0){
                        System.out.println("Tidak ada produk tersedia");
                    } else {
                        int num = 1;
                        for (int i = 0; i < buah.size() ; i++) {
                            System.out.println(num+". "+buah.get(i));
                            num++;
                        }
                    }
                    break;
                case "3":
                    while (selesai){
                        System.out.println("lakukan pembaharuan produk (input selesai untuk mengakhiri)");
                        System.out.println("Produk nomor berapa yang ingin diperbaharui?");
                        String editBuah = input.nextLine();
                        if (editBuah.equalsIgnoreCase("selesai")){
                            selesai = false;
                        } else {
                            System.out.println("anda akan memperbaharui "+buah.get((Integer.parseInt(editBuah)-1))+" dengan?");
                            String update = input.nextLine();
                            String oldBuah = buah.get((Integer.parseInt(editBuah)-1));
                            buah.set((Integer.parseInt(editBuah)-1), update);
                            System.out.println("berhasil memperbaharui "+oldBuah+" dengan "+update);
                        }
                    }
                    break;
                case "4":
                    while (selesai){
                        System.out.println("Anda akan menghapus produk");
                        System.out.println("input semua untuk hapus semua, selesai untuk mengakhiri");
                        System.out.println("Produk nomor berapa yang ingin dihapus?");
                        String delBuah = input.nextLine();
                        if (delBuah.equalsIgnoreCase("selesai")){
                            selesai = false;
                        } else if (delBuah.equalsIgnoreCase("semua")) {
                            buah.clear();
                        } else {
                            System.out.println("Anda berhasil menghapus produk "+buah.get((Integer.parseInt(delBuah)-1)));
                            buah.remove((Integer.parseInt(delBuah)-1));
                        }
                    }
                    break;
                default:
                    System.out.println("Input salah. Masukkan pilihan yang benar");
                    continue;
            }
            System.out.println("=================");
        }
    }
}
