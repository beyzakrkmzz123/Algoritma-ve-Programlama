/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Lütfen üçgenin birinci kenarını giriniz");
    int a = input.nextInt();
    System.out.println("Lütfen üçgenin ikinci kenarını giriniz");
    int b = input.nextInt();
    System.out.println("Lütfen üçgenin üçüncü kenarını giriniz");
    int c = input.nextInt();
    
    
    if (a==b && b==c && a==c ) {
        System.out.println("Üçgen eşkenar üçgendir");
    }    
    else if(a==b && b!=c && a!=c)  {
        System.out.println("Üçgen ikizkenar üçgendir");
    }
    else if (a!=b && b!=c && a!=c) {
        System.out.println("Üçgen çeşitkenar üçgendir");
    }    
    else {    
       System.out.println("Üçgen çizilemez");
    }  
        
    } }
    
