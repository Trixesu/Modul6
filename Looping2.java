package com.mycompany.modulvi;

public class Looping2 {
    public static void main(String[] args) {
        int bilangan = 1; //Inisialisasi variabel bilangan
            while (bilangan < 21) { //Perulangan untuk mencetak bilangan dari 1 hingga 20
                System.out.print(bilangan+", "); //Keluaran
                bilangan = bilangan + 1; //Increment variabel bilangan
            }
    }
}