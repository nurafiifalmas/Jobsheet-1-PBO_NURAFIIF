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
public class Kondisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.print("Masukan nilai akhir PBO : ");
        nilai = input.nextInt();
        if (nilai < 70)
        System.out.println("Siswa tidak lulus");
        if (nilai > 70)
        System.out.println("Siswa lulus");
    }
}
