package com.mycompany.modulvi;

public class Looping1 {
    public static void main(String[] args) {
        int bilangan = 1; //Inisialisasi memori bilangan
            while (bilangan < 16) { //Perulangan untuk mencetak bilangan dari 1 hingga 15 dalam satu baris
                System.out.println(bilangan); //Keluaran
                bilangan = bilangan + 1; //Increment variabel bilangan
            }
    }
}