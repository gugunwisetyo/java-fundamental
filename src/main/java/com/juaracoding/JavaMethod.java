package com.juaracoding;

public class JavaMethod {
    public static void main(String[] args) {
//        double sisiA = 5;
//        double luasKotakA = sisiA * sisiA;
//        System.out.println(luasKotakA);
//
//        double sisiB = 10;
//        double luasKotakB = sisiB * sisiB;
//        System.out.println(luasKotakB);

        //method
        luasKotak(5);
        luasKotak(10);

        //pemanggilan method dengan return
        System.out.println(luasSegitiga(4, 8));

        String username = setUsername("admin");
        System.out.println(username);

        String bahasa ="Javascript";
        System.out.println(bahasa.equals("Java"));
        System.out.println(bahasa.contains("Java"));

        pola(5);
        pola(3);

        //double hasil = hitung(6,2);
        System.out.println(hitung(6,2));
    }

    static void luasKotak(double sisi) {
        double luas = sisi * sisi;
        System.out.println(luas);
    }

    // buat method return luas segitiga (disebut function oleh org javascript)
    static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    static String setUsername(String username){
        return username;
    }

//    static boolean (String word){
//        return word.equals("Java");
//    }

    //buat method untuk return pola kotak dan segitiga
    static void pola(int s){
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int hitung(int panjang, int lebar){
        return panjang*lebar;
    }
}
