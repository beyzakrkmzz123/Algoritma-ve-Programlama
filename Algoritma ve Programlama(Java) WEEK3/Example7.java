/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
     System.out.println("Lütfen 1 ve 7 arasında bir sayı giriniz" );
     int sayi = input.nextInt();
     if (sayi==1) {
         System.out.println(sayi+" Pazartesi günüdür");
     }
     else if (sayi==2) {
         System.out.println(sayi+" Salı günüdür");
     }     
     else if (sayi==3) {
         System.out.println(sayi+" Çarşamba günüdür");
     }
     else if (sayi==4) {
         System.out.println(sayi+" Perşembe günüdür");
     }
     else if (sayi==5) {
         System.out.println(sayi+" Cuma günüdür");
     }
     else if (sayi==6) {
         System.out.println(sayi+" Cumartesi günüdür");
     }
     else if (sayi==7) {
        System.out.println(sayi+" Pazar günüdür");
     }
     else {
         System.out.println("Hangi gün olduğu bilinemez");
         
     }
     
    
} }
