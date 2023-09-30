package com.juaracoding;

public class Operator {
    public static void main(String[] args) {
        //operator aritmatika
        int harga = 10000;
        int qty = 5;
        int total = harga * qty;
        System.out.println("Total : "+total);
        int modulus = 7 % 2;
        System.out.println("Modulus : "+modulus);
        modulus++;
        System.out.println("Increment : "+modulus);

        //operator penugasan
        int a = 1;
        System.out.println(a); //maunya 3
        a = a + 2;
        System.out.println(a);
        int b = 10 + 2 * 5;
        int c = (10 + 2) * 5;
        System.out.println(b);
        System.out.println(c);

        //operator gabungan
        a+=b; //a = 3, b = 20 > a+b > 3+20
        System.out.println(a);

        //operator relasi
        boolean d = 5==5;
        boolean e = 5>=5;
        System.out.println(d);
        System.out.println(e);
        int pembagi = 0;
        boolean pembagian = pembagi !=0;
        System.out.println(pembagian);

        //
    }
}
