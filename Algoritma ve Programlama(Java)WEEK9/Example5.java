/*Örnek7.9:Klavyeden girilen N elemanlı A ve B dizilerinin skaler çarpımını
hesaplayan program.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
   import java.util.Random;
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         int N; 

         do{ 
         System.out.print("Lütfen bir N değeri giriniz: ");
         N = input.nextInt();
         }
         while(N<0);
         int [] a = new int [N];
         int [] b = new int [N];
         for(int i=0;i<a.length;i++){
             System.out.println("A dizisi için "+(i+1)+"inci sayı");
             a[i] = input.nextInt();
         }
         for(int i=0;i<b.length;i++){
             System.out.println("B dizisi için "+(i+1)+"inci sayı");
             b[i] = input.nextInt();
         }
         int SC=0;
         for(int i=0;i<N;i++){
             SC=SC+a[i]*b[i]; 
         }
         System.out.println(SC);
    }
    
}
