/*Örnek8.14:Klavyeden girilen NxN tipindeki A matrisinin yedek köşegeninin 
üstünde kalan elemanlarının toplamını hesaplayan program.
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
        Scanner input=new Scanner(System.in);
        System.out.print("NxN için değeri giriniz: ");
        int N = input.nextInt();
        
        int[][]A = new int[N][N];
        System.out.println("A matrisi: ");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(+i+"inci satır ve "+j+"inci sütun : ");
                A[i][j]=input.nextInt();
            }
        }
        int T=0;
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if((i+j)<(N+1)){
                T+=A[i][j];
                }
                else{
                }
            }
        }
        System.out.println("A matrisinin yedek köşegeninin üstünde kalan elemanlarının toplamı: "+T);
        
    }
    
}
