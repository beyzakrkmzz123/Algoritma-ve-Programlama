/*
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
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir pozitif tam sayı giriniz");
        int s = input.nextInt();
        System.out.println("/na - b");
        System.out.println("=====");
        for(int a =0; a<=s; a++){
            for(int b =0; b<=s;b++){
                if(a*a+b*b==s){
                    System.out.println(a+"-"+b);
                }
            } 
        }
     
    }
    
}
