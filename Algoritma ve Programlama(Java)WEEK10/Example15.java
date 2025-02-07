/*Örnek7.41:Klavyeden büyük harflerle girilen kelimenin harflerini ve alfabedeki 
sıraları kadar "*" karakterini ayrı ayrı satırlara (dikey) yazdıran program. 
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Lütfen bir ifade giriniz:");
       String txt = input.nextLine();
       for(int i=0 ; i<txt.length() ; i++){
           System.out.print(txt.charAt(i)+"->");
           for(int j=1 ; j<txt.charAt(i)-64 ; j++){
               System.out.print("*");
           }
           System.out.println(" ");
       }
    }
    
}
