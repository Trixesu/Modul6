package com.mycompany.modulvi;

import java.util.Scanner;

public class Looping4 {
    public static void main(String[] args) {
        int putar = 1; //Inisialisasi memori putar
        double jumlah = 0; //Inisialisasi memori jumlah
        double bilangan; //Inisialisasi memori bilangan
        Scanner input = new Scanner (System.in);
            while (putar <= 5) { //Perulangan untuk meminta input sebanyak 5 kali
                System.out.print("Masukkan data ke "+putar+" : ");
                bilangan = input.nextDouble();
                jumlah = jumlah + bilangan; // Menambahkan bilangan yang diinput ke dalam jumlah total
                putar++; //Increment variabel putar
            }
        System.out.println("Jumlah 5 bilangan tersebut adalah "+jumlah); //Keluaran
    }
}
