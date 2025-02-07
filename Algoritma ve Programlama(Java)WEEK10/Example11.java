/*Örnek7.29:Klavyeden rastgele büyüklükte harfle girilen kelimenin harflerinin 
büyüklüklerinin tersini alarak (büyükse küçük,küçükse büyük yaparak) yeniden 
yazdıran program.
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
       Scanner input = new Scanner (System.in);
       System.out.println("Lütfen bir ifade giriniz:");
       String txt = input.nextLine();
       for(int i=0;i<txt.length();i++){
           if(txt.charAt(i)>=65 && txt.charAt(i)<=90){
               System.out.print((char) (txt.charAt(i)+32));
           }
           else{
               System.out.print((char)(txt.charAt(i)-32));
           }
       }
    }
    
}
