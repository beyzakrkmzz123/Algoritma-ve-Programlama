/*Örnek33
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
        float a,b; int sec;
        Scanner klavye = new Scanner (System.in);
        System.out.print("Uzunluğu giriniz (m) : ");        
         a = klavye.nextFloat();
        System.out.printf("\nDönüştürme\n1- mm\n2- cm\n3- dm\n4- km\n");
        System.out.print("\nSeciminiz: ");
        sec=klavye.nextByte();
        switch (sec)
        {   case 1: { b = 1000*a; break;  }
            case 2: { b= 100*a; break; }
            case 3: { b= 10*a; break; }
            case 4: { b = a/1000; break; }
            default: { b = 0; break; }
        }    
        System.out.printf("Sonuc: %.5f/n",b);
            
            
                
        
        
        
        // TODO code application logic here
    }
    
}
