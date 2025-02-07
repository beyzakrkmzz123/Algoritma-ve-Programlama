/*
Adım 1: Başla
Adım 2: Üçgenin kenar uzunluğunu ve yüksekliğini gir
Adım 3: Üçgenin alanını hesapla
Adım 4: Bitir

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
 
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Lütfen üçgene ait kenar uzunlığunu ve yüksekliğini giriniz:"); // Adım 2 
    int a = input.nextInt();
    int b = input.nextInt();
    int alan = a * b / 2; // Adım 3 
    System.out.println("Alan : "+alan);
    
            
    
    

    
}}
