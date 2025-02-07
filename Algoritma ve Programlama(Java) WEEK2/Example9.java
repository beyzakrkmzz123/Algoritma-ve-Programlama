/*
 Adım 1: Başla
 Adım 2: Dairenin yarıçapını gir
 Adım 3: Dairenin çevresini hesapla
 Adım 4: Dairenin alanını hesapla
 Adım 5: Bitir

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Lütfen dairenin yarıçapını giriniz;"); // Adım 2 
    double r = input.nextDouble(); 
    double çevre = 2*Math.PI*r; // Adım 3 
    double alan = Math.PI*Math.pow(r, 2); // Adım 4
    System.out.println("Çevre="+çevre+"  Alan="+alan);
    
    
} }
