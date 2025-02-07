/*Örnek8.16:Klavyeden girilen NxN tipindeki A matrisinin sondan bir önceki satır
ve sütunundaki elemanlarının toplamını hesaplayan program.

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
        int toplam=0;
        for(int i=1 ; i<N-1 ; i++){
            toplam+=A[i][N-1]+A[N-1][i];
        }
        int T = toplam-A[N-1][N-1];
        System.out.println("A matrisinin sondan bir önceki satır ve sütunundaki elemanlarının toplamı: "+T);
    }
    
}
