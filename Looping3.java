package com.mycompany.modulvi;

public class Looping3 {
    public static void main(String[] args) {
        int jumlah = 0, bilangan = 0; //Inisialisasi memori jumlah dan bilangan
            while (bilangan <= 100) { //Perulangan untuk menambahkan bilangan kelipatan 5
                jumlah = jumlah + bilangan; // Menambahkan nilai bilangan saat ini ke dalam jumlah
                bilangan = bilangan + 5; //Menambahkan 5 ke bilangan untuk menuju bilangan kelipatan berikutnya
            }
        System.out.println("Jumlah dari 5 + 10 + ... + 100 = "+jumlah); //Keluaran
    }
}
