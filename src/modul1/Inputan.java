/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.util.Scanner;

public class Inputan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Masukan nilai a : ");
        a = input.nextInt();
        System.out.print("Masukan nilai b : ");
        b = input.nextInt();
        System.out.println();
        System.out.println("Nilai variabel yang ada pada program :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
