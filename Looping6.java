package com.mycompany.modulvi;

import java.util.Scanner;

public class Looping6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);                
        int data = 1, banyakdata, ratarata; //Inisialisasi memori data, banyakdata, ratarata
        int jumlah = 0; //Inisialisasi memori jumlah
        
        System.out.print("Masukkan jumlah data : "); //Meminta input jumlah data yang akan diolah
        int jumlahdata = input.nextInt();
        
            while (data <= jumlahdata) { //Perulangan untuk meminta input setiap jumlah yang diinginkan
                System.out.print("Masukkan data ke "+data+" : "); //Memasukkan nilai data setiap data ke-n
                banyakdata = input.nextInt();
                jumlah += banyakdata; //Menambahkan nilai data yang diinput ke dalam variabel jumlah
                data++; //Increment variabel data
            }
        ratarata = jumlah / jumlahdata; //Menghitung rata-rata
        System.out.println("Rata-rata : "+ratarata); //Keluaran
        input.close();
    }
}