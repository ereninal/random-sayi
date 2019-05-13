/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarastgelesayilar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eren
 */
public class JavaRastgeleSayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner oku = new Scanner(System.in); 
        Random r = new Random();
        System.out.println("Kaç Sayı Üretilsin : ");
        int sayi = oku.nextInt();
        int toplam =0,uretilenSayi;
        for (int i = 1; i <= sayi; i++) {
            uretilenSayi = r.nextInt(6250)+1250;
            System.out.println(i+". Rastgele Üretilen Sayı :"+ uretilenSayi );
            toplam+=uretilenSayi;
        }
        System.out.println("Üretilen Sayıların Ortalaması : "+toplam/sayi);
        //int uretilenSayi = r.nextInt(6250)+1250;
        
    }
    
}
