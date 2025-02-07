/*
 Adım 1: Başla
 Adım 2: Derece cinsinden açıyı gir
 Adım 3: Girilen açıyı radyan cinsinden hesapla
 Adım 4: Girilen açıyı gradyan cinsinden hesapla
 Adım 5: Bitir
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
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Lütfen derece cinsinden açıyı giriniz"); //Adım 2 
    double acı=input.nextDouble();
    double radyan= acı*Math.PI/180; // Adım 3 
    double gradyan = acı*Math.PI/200; // Adım 4
    System.out.println("Radyan = "+radyan+"   Gradyan ="+gradyan);
    }}
    
    
     

    

