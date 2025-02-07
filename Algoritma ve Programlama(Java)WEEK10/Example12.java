/*Örnek7.30:Klaavyeden küçük harflerle girilen bir kelimenin harflerini iki 
büyük-iki küçük harf şeklinde yaparak tekrar yazdıran program.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Lütfen bir ifade giriniz:");
       String txt = input.nextLine();
       int s=0;
       for(int i=1;i<txt.length();i++){
          int r=s%4;
          if(r<2){
              System.out.print(Character.toUpperCase(txt.charAt(i)));
          }
          else{
              System.out.print(txt.charAt(i));
          }
          s=s+1;
       }
    }
    
}
