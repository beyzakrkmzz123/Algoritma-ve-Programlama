/*
 Adım 1: Başla
 Adım 2: Kürenin yarıçapını gir
 Adım 3: Kürenin hacmini hesapla
 Adım 4: Kürenin alanını hesapla
 Adım 5: Bitir
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
 
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Lütfen kürenin yarıçapını giriniz:"); // Adım 2 
    double r = input.nextDouble();
    double hacim = 4/3*Math.PI*Math.pow(r,3); // Adım 3
    double alan = 4*Math.PI*Math.pow(r,2); // Adım 4
    System.out.println("Hacim = "+hacim+"  Alan ="+alan );
    } }
    
    
            
    

