/*
 Adım 1: Başla
 Adım 2: Karenin kenar uzunluğunu gir
 Adım 3: Karenin alanını hesapla
 Adım 4: Karenin çevresini hesapla 
 Adım 5: Bitir 
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
 
public class Example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System.in);
   System.out.println("Lütfen karenin kenar uzunluğunu giriniz:"); // Adım 2
   int a = input.nextInt();
   double alan = Math.pow(a,2); // Adım 3
   double çevre = 4*a; // Adım 4
   System.out.println("Alan="+alan+"  Çevre="+çevre );
   

} }
