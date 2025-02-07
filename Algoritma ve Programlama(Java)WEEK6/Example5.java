/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int a = input.nextInt();
        int b = 2;
        
        while(a>1){
           if(a%b==0){
           System.out.println(b);
           a = a/b;
        }
           else { 
           b = b+1;
           }
            
        }
    }
    
}
