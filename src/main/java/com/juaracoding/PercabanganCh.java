package com.juaracoding;

public class PercabanganCh {
    public static void main(String[] args) {
        int nilai = 101;
        if (nilai >= 0 && nilai <=25 ){
            System.out.println("Nilai kamu D");
        } else if (nilai >= 26 && nilai <=50 ) {
            System.out.println("Nilai kamu C");
        } else if (nilai >= 51 && nilai <=75) {
            System.out.println("Nilai kamu B");
        } else if (nilai >= 76 && nilai <=100) {
            System.out.println("Nilai kamu A");
        } else{
            System.out.println("Nilai tidak valid");
        }

        boolean a = true, b = false;

        if(a && !b) {

            System.out.println("true");

        } else {

            System.out.println("false");

        }

        int x = 25;

        if(x < 25) {

            System.out.println("1");

        } else if(x > 10) {

            System.out.println("2");

        } else {

            System.out.println("3");

        }
        String kata = "Tess";

        while (kata.length()<12) {

            kata = kata + "y";

        }
        System.out.println(kata);

        for (int i = 0; i < 5; i++) {

            if (i == 3) {

                continue;

            }

            System.out.print("Heu");

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {

            System.out.print("Heu");

            if (i == 3) {

                break;

            }

        }
        System.out.println();
        for (int i = 1; i < 5; i++) {

            for (int j = 0; j<i; j++) {

                System.out.print(5-j);

            }

            System.out.println();

        }

//        for (int i = 1; i < 5; i++) {
//
//            for (int j = 0; j<i; i++) {
//
//                System.out.print(5-j);
//
//            }
//
//            System.out.println();
//
//        }

        int jumlahAnak = 3;

        do {

            jumlahAnak ++;

        }while(jumlahAnak<=2);

        System.out.print("Jumlah anak sekarang = "+jumlahAnak);
    }
}
