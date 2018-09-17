/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class BiodataDiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tulis Nama             : ");
        String nama = input.nextLine();
        System.out.print("Tulis NIS              : ");
        String nis = input.nextLine();
        System.out.print("Tulis Tempat Lahir     : ");
        String Tempat = input.nextLine();
        System.out.print("Tulis Tanggal Lahir    : ");
        String Tanggal = input.nextLine();
        System.out.print("Tulis Jenis Kelamin    : ");
        String jenis = input.nextLine();
        System.out.print("Tulis Alamat di Malang : ");
        String Alamat = input.nextLine();
        System.out.print("Tulis Motto Hidup      : ");
        String moto = input.nextLine();
        System.out.println("\n=======================");
        System.out.println("Nama             : "+nama);
        System.out.println("NIS              : "+nis);       
        System.out.println("Tempat Lahir     : "+Tempat);      
        System.out.println("Tanggal Lahir    : "+Tanggal);   
        System.out.println("Jenis Kelamin    : "+jenis);
        System.out.println("Alamat di Malang : "+Alamat);       
        System.out.println("Motto Hidup      : "+moto);
        

    }
}
