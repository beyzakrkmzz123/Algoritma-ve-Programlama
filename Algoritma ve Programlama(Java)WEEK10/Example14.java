/*Örnek7.40:Klavyeden girilen kelimeyi ortadan bölerek-sırasıyla-ikinci 
parçadan ileri ve birinci parçadan geri doğru birer karakter alarak yazdıran
program.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Lütfen bir ifade giriniz:");
       String txt = input.nextLine();
       int n = txt.length()/2;
       for(int i=0 ; i<txt.length()/2 ; i++){
           System.out.print(txt.charAt(n+i));
           System.out.print(txt.charAt(n+1-i));  
       }
    }
    
}
