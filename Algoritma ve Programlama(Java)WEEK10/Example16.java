/*Örnek7.43:Klavyeden girilen kelimeyi ortadan bölerek herbir parçasını tersten
yazdıran program.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Lütfen bir ifade giriniz:");
       String txt = input.nextLine();
       int n = txt.length();
       for(int i=n/2 ; i<1 ; i--){
           System.out.print(txt.charAt(i));
       }
       for(int i=n ; i<n/2+1 ; i--){
           System.out.print(txt.charAt(i));
       }
    }
    
}
