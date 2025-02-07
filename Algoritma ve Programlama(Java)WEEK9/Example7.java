/*Örnek7.13:Katsayıları klavyeden girilen n. dereceden y(x)=an^(x^n)+... 
polinomunun x=b için değerini (y(b)) hesaplayan program.

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
         Scanner input = new Scanner(System.in);
         double b;
         System.out.println("Lütfen fonksiyonun kaçıncı dereceden olduğunu yazınız: ");
         int n = input.nextInt();
         double a[] = new double[n+1];
         for(int i=0;i<=n;i++){
             System.out.println("x^"+i+"nin katsayısı: ");
             a[i] = input.nextDouble();
         }
         System.out.println("Hesaplanacak x değeri: ");
         b=input.nextDouble();
         double t=a[0];
         for(int i=1;i<=n;i++){
             t+=a[i]*Math.pow(b, i);
         }
         System.out.println("Toplam: "+t);
    }
    
}
