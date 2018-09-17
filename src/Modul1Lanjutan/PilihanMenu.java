/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1Lanjutan;

import java.util.Scanner;


public class PilihanMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do{System.out.println("\nMENU LUAS BANGUN\n");
           System.out.println("1. Menghitung luas persegi");
           System.out.println("2. Menghitung luas persegi panjang");
           System.out.println("3. Keluar");
                      System.out.print("\nMasukkan pilihan anda : ");
           pilihan = input.nextInt();
           switch(pilihan){
               case 1 : luasPersegi();break;
               case 2 : luasPersegiPanjang();break;
           }
        }while (pilihan != 3);
    }   

    private static void luasPersegi() {
       Scanner angka = new Scanner(System.in);
       double sisi, hasil;
       System.out.print("Masukkan nilai Sisi : ");
       sisi = angka.nextDouble();
       hasil = sisi * sisi;
       System.out.print("Luas Persegi adalah : "+hasil+"\n");
       
    }

    private static void luasPersegiPanjang() {
       Scanner angka = new Scanner(System.in);
       double panjang, lebar,hasil;
       System.out.print("Masukkan nilai panjang :");
       panjang = angka.nextDouble();
       System.out.print("Masukkan nilai lebar : ");
       lebar = angka.nextDouble();
       hasil = panjang * lebar;
       System.out.print("Luas Persegi adalah : "+hasil+"\n");
    }
}
