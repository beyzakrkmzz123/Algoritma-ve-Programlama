/*Örnek48
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example14 {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen pay kısmındaki sayıyı giriniz");
        int a = input.nextInt();
        System.out.println("Lütfen payda kısmındaki sayıyı giriniz");
        int b = input.nextInt();
        System.out.println("Hnagi basamak istediğinizi girin");
        int n = input.nextInt();
        int c = 0;
        
        for(int i=1;i<=n;i++){
            a= b*10;
            c = a/b;
            a =a%b;
        }
        
        System.out.println("Basamak değeri "+c);
        
        
        
       
            
            
           
                
            
            
        
        // TODO code application logic here
    }
    
}
