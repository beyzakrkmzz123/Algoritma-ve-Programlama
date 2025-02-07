/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Lütfen sayıyı giriniz");
    int sayi = input.nextInt();
    if(sayi<0) {
        System.out.println(sayi+" Sayı negatiftir");
    }
    else if(sayi>0) {
        System.out.println(sayi+" Sayı poziftir");
    }
    else if(sayi==0){
        System.out.println(sayi+" Sayı sıfıra eşittir");
    }    
    }
   
    
} 
