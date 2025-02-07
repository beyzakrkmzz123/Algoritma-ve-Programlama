/*
 Adım 1: Başla
 Adım 2: Maddenin kütlesini,hızını ve yerden yüksekliğini gir
 Adım 3: Maddenin yerçekim ivmesini giriniz
 Adım 4: Maddenin potansiyel enerjisini hesapla
 Adım 5: Maddenin kinetik enerjisini hesapla
 Adım 6: Bitir
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
 
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Lütfen maddenin kütlesini,hızını ve yerden yüksekliği giriniz:"); // Adım 2
    double m = input.nextDouble();
    double V = input.nextDouble();
    double h = input.nextDouble();
    System.out.println("Lütfen maddenin yerçekim ivmesini giriniz:"); // Adım 3
    double g = input.nextDouble();
    double potansiyelenerji = m*g*h; // Adım 4 
    double kinetikenerji = 1/2*m*V*V; // Adım 5
    System.out.println("Kinetikenerji="+kinetikenerji+"   Potansiyel="+potansiyelenerji);
    
    
    
} }
