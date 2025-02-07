/*Örnek30
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
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir x değeri giriniz");
        int x = input.nextInt();
        int  fx = x^2-5*x+3;
        if(fx<0){
            System.out.println("Yaz -1");
        }  
        else if (fx==0){
            System.out.println("Yaz 0");
        }
        else if (fx>0){
            System.out.println("Yaz 1");
            
        }
            
            
        
        // TODO code application logic here
    }
    
}
