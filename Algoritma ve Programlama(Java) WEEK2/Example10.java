/*
 Adım 1: Başla
 Adım 2: Birinci sayıyı gir
 Adım 3: İkinci sayıyı gir
 Adım 4: Üçüncü sayıyı gir
 Adım 5: Dördüncü sayıyı gir
 Adım 6: Beşinci sayıyı gir 
 Adım 7: Girilen sayıların ortalamasını hesapla 
 Adım 8: Bitir
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
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Lütfen birinci sayı:"); // Adım 2
    int a = input.nextInt();
    System.out.println("Lütfen ikinci sayı:"); // Adım 3
    int b = input.nextInt();
    System.out.println("Lütfen üçüncü sayı:"); // Adım 4
    int c = input.nextInt();
    System.out.println("Lütfen dördüncü sayı:"); // Adım 5
    int d = input.nextInt();
    System.out.println("Lütfen beşinci sayı:"); // Adım 6
    int e = input.nextInt();
    double ortalama = a+b+c+d+e/5; // Adım 7
    System.out.println("Ortalama="+ortalama);
    
    
}}
