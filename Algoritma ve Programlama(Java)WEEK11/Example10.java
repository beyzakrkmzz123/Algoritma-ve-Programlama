/*Örnek8.21:Klavyeden girilen NxN tipindeki A matrisinin her bir sütun elemanları
çarpımından N elemanlı B dizisini oluşturan program.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("NxN için değeri giriniz: ");
        int N = input.nextInt();
        
        int[][]A = new int[N][N];
        System.out.println("A matrisi: ");
        for(int i=1;i<N;i++){
            for(int j=1;j<N;j++){
                System.out.print(+i+"inci satır ve "+j+"inci sütun : ");
                A[i][j]=input.nextInt();
            }
        }
        int[]B = new int[N];
        for(int i=1;i<N;i++){
            B[i]=0;
            for(int j=1;j<N;j++){
                B[i]=B[i]*A[j][i];
            }
            System.out.println("N elemanlı B dizisi: "+B);
        }
    }
    
}
