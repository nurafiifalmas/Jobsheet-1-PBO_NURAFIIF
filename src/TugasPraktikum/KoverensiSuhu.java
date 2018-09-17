/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author user
 */
public class KoverensiSuhu {
    public static void main(String[] args) {
        double c = 78.0;
        double R = c*4/5;
        double F = (c*9/5)+32;
        double K = c+273;
        System.out.println("Suhu dalam celcius    : "+c+" C");
        System.out.println("Suhu dalam reamur     : "+R+" R");
        System.out.println("Suhu dalam fahrenheit : "+F+" F");
        System.out.println("Suhu dalam kelvin     : "+K+" K");
    }
}
