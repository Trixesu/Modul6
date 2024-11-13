package com.mycompany.modulvi;  

import java.util.Scanner;

public class Looping7 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double total = 0;
        double kuadrat = 0;

        System.out.print("Masukkan banyak data yang diolah : "); //Memonta input data yang diolah
        int banyakData = input.nextInt();
        
        System.out.print("Masukkan data ke-1 : "); //Meminta input data pertama
        int data1 = input.nextInt();        
        int max = data1, min = data1; //Inisialisasi nilai maksimum dan minimum dengan data pertama
        total += data1; //Menambahkan data pertama ke total
        kuadrat += Math.pow(data1, 2); //Menambahkan kuadrat data pertama ke kuadrat

        int dataN = 2; //Mulai data ke-2 hingga data ke-N
            while (dataN <= banyakData) {
                System.out.print("Masukkan data ke-"+dataN+" : "); //Meminta input untuk setiap data
                int nilaiData = input.nextInt();

                if (nilaiData > max) { //Memeriksa apakah nilai data lebih besar dari nilai maksimum saat ini
                    max = nilaiData; //Jika ya, perbarui nilai maksimum
                }
                if (nilaiData < min) { //Memeriksa apakah nilai data lebih kecil dari nilai minimum saat ini
                    min = nilaiData; //Jika ya, perbarui nilai minimum
                }   
            total += nilaiData; //Menambahkan data pertama ke total
            kuadrat += Math.pow(nilaiData, 2); //Menambahkan kuadrat data pertama ke kuadrat
            dataN++; //Increment vaariabel dataN
            }

        double ratarata = total/data1; //Menghitung rata-rata
        double rentangData = max - min; //Menghitung rentang data
        double variansi = (kuadrat - data1 * Math.pow(ratarata, 2))/data1; //Menghitung variansi
        double deviasiStd = Math.sqrt(variansi); //Menghitung deviasi standard
        
        //Keluaran
        System.out.println("Rata-rata\t: "+ratarata);
        System.out.println("Data terbesar\t: "+max);
        System.out.println("Data terkecil\t: "+min);
        System.out.println("Rentang data\t: "+rentangData);
        System.out.println("Variansi\t: "+variansi);
        System.out.println("Deviasi Standard : "+deviasiStd);
        input.close();
    }    
}