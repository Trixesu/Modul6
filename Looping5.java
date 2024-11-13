package com.mycompany.modulvi;

public class Looping5 {
    public static void main(String[] args) {
        int total,liter = 1, bensin = 6500; //Inisialisasi memori total, liter, bensin
        System.out.println("Jumlah liter\tHarga (Rp)");
        System.out.println("==========================");
            while (liter <= 20) { //perulangan untuk menampilkan harga setiap liter hingga liter ke-20
                total = liter * bensin; //Menghitung total harga untuk jumlah liter tertentu
                System.out.println(liter+"\t\t"+total); //Keluaran
                liter++; //Increment variabel liter
            }
        System.out.println("==========================");
    }
}
