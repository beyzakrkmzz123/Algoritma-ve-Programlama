/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir n değeri giriniz");
        int n = input.nextInt();
        int S =1;
        int sonuc=0;
        int toplam=0;
        while(S<=n){
            sonuc= S*S;
            System.out.println(S+".Sayının karesi: "+sonuc);
            toplam=toplam+sonuc;
            S=S+1;
       
     
        }
        System.out.println("Toplam: "+toplam);
        
    }
    
}
