/*
 Adım 1: Başla 
 Adım 2: İletkein direncini ve akımını gir
 Adım 3: İletkenin gerilimini gir
 Adım 4: Bitir

 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Lütfen iletkenin direncini ve akımını giriniz:"); // Adım 2
    double R = input.nextDouble();
    double I = input.nextDouble();
    double gerilim = R*I; // Adım 3 
    System.out.println("Gerilim="+gerilim);
    
    
} }
