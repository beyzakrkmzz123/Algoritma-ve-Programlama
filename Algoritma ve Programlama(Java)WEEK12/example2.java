/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        yildiz_yazdir(5);
    }
    public static int yildiz_yazdir(int a){
        System.out.println("Lütfen satır sayısını giriniz");
        int s=0;
        for(int i=0;i<a;i++){
         if(s%2==0){
             System.out.println("* * *");
         } 
         else{
             System.out.println(" * *");
         }
         s++;
       }
        return 0;
    }
    
}
