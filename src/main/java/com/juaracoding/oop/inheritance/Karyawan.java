package com.juaracoding.oop.inheritance;

public class Karyawan {
    String name;
    String address;
    double salary;
    double pajak;
    double hitungPajak = salary * pajak;
    double gajiBersih = salary - hitungPajak;
}
