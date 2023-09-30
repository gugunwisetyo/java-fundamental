package com.juaracoding.oop.inheritance;

public class MainApp {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        karyawan.name = "Admin";
//        karyawan.salary = 10000;
//        karyawan.pajak = 0.10;


        Manager manager = new Manager();
        manager.name = "Manager";
        manager.salary = 12000;
        manager.pajak = 0.1;
        System.out.println(manager.name);
        System.out.println(manager.salary);
//        System.out.println("Pajaknya : "+manager.hitungPajak);
//        System.out.println("Gaji bersihnya : "+manager.gajiBersih);
        System.out.println("pajak : "+(manager.salary*manager.pajak));
        System.out.println("gaji bersih :");
    }
}
