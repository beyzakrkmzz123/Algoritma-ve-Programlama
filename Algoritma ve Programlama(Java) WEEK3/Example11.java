/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen birinci sayıyı giriniz");
        int sayi1 = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int sayi2 = input.nextInt();
        int S =0;
        int toplam=0;
        while(S<sayi2){
            S =S+1;
            toplam=toplam+sayi1;
            
            
        }
        System.out.println("İki sayının çarpımı"+toplam);
    }
    
}
