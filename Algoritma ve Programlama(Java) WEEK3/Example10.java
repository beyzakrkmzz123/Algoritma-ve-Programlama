/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
public class Example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);   
    System.out.println("Lütfen bir n değeri giriniz");
    int n = input.nextInt();
   
   int toplam = 0;
   int S=1;
    while(S<=n)
    {   
        if (S%2==1) {
            toplam=toplam+S;
            S=S+1;
        }
        else{
         S=S+1;
        }
         
    }
        System.out.println("tek sayıların toplamı = "+toplam);
} } 
