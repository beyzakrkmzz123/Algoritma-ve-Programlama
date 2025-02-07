/*Örnek22
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
         int i; float t1=0,t2=0,t3=0;
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int n = input.nextInt();
       
        
        for(i=1;i<=n;i++){
            t1+=i;       
        }
        for(i=1;i<=n;i+=2){
            t2+=i;   
        }
        for(i=2;i<=n;i+=2){
            t3+=i;
        }    
          System.out.println("\n1 den "+n+"e kadar olan sayıların toplamı : "+t1);  
          System.out.println("1 den "+n+"e kadar tek sayıların toplamı: "+t2);
           System.out.println("1 `den "+n+"e kadar olan çift sayıların toplamı: "+t3); 
        
        // TODO code application logic here
    }
    
}
