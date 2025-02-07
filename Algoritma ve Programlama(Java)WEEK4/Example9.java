/*Örnek23
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float f1=1,f2=1,f3=1,k = 0;
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir n sayısı giriniz");
        int n = input.nextInt();
        System.out.println("Lütfen bir r sayısı giriniz");
        int r = input.nextInt();
        
        for(int i=1;i<=n;i++){
            f1*=i;
          if(i<=r){
              f2*=i;
          }  
          if(i<=n-r){
              f3*=i;
          }
          k=f1/(f2*f3);
        }
        System.out.println("\nSonuc= "+k);
        // TODO code application logic here
    }
    
}
