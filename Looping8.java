package com.mycompany.modulvi;

public class Looping8 {
    public static void main(String[] args) {
        int jumlahSuku = 10; //Jumlah minimal suku 
        double konstanta = -2 / Math.PI; //Konstanta -2/Pi
        
        //Menghitung f(x) = 1.5
        double x = 1.5;
        double hasil1 = 0.5;
        int n = 1;

            while (n <= jumlahSuku) {
                int koefisien = 2 * n - 1; //Bilangan terurut bilangan ganjil
                double suku = Math.sin((koefisien) * x) / (koefisien); //Menghitung nilai total suku 
                hasil1 -= konstanta * suku; //Menambahkan suku dengan konstanta ke hasil1
                n++;
            }
        System.out.println("Hasil f(x) untuk x = " + x + " adalah : " + hasil1);
        
        //Menghitung f(x) = 2.75
        x = 2.75;
        double hasil2 = 0.5;
        n = 1;
        
            while (n <= jumlahSuku) {
                int koefisien = 2 * n - 1; //Bilangan terurut bilangan ganjil
                double suku = Math.sin((koefisien) * x) / (koefisien); //Menghitung nilai total suku
                hasil2 -= konstanta * suku; //Menambahkan suku dengan konstanta ke hasil2
                n++;
            }
        System.out.println("Hasil f(x) untuk x = " + x + " adalah : " + hasil2);
    }
}