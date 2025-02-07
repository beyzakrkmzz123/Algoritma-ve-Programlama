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
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int s = input.nextInt();
        
        for(int a=0;a<=s/3;a++){
            for(int b =0;b<=s/5;b++){
                if(3*a+5*b==s){
                    System.out.println(a+" ,"+b);
                }
            }
        }
    }
    
}
