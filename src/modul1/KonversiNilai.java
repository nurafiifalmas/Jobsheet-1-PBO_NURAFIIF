/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KonversiNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai WEB : ");
        int nilai=input.nextInt();
        if(nilai>=90)
            System.out.println("Nilai A");
        else if(nilai>=75)
            System.out.println("NIlai B");
        else if(nilai>=50)
            System.out.println("NIlai C");
        else if(nilai>=35)
            System.out.println("NIlai D");
        else
            System.out.println("NIlai E");
    }
}
