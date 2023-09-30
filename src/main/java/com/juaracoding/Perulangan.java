package com.juaracoding;

public class Perulangan {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // tampilkan deret bilangan ganjil
        for (int i = 0; i < 10; i++) {
            if (i%2==1)
                System.out.println(i+" ");
        }
        System.out.println("ganjil tanpa if");
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
            i++;
        }
        System.out.println();
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
        }
        System.out.println();
        //buat pola 5x5 pakai *
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }

        //nested for
        int sisi = 3;
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //segitiga siku
        System.out.println("a");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("b");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //while
        int y = 0;
        while (y < 5){
            System.out.print(y);
            y++;
        }
        System.out.println();

        //break dan continue
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i==5){
            System.out.print(i);
             continue;
            }
//            System.out.print(i);
        }

    }
}
