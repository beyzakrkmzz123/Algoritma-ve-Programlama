/*Örnek8.23:Klavyeden girilen NxN tipindeki A matrisinin simetrik olup olmadığını
kontrol eden program.
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
        for(int i=1;i<N;i++){
            for(int j=1;j<N;j++){
                 if(A[i][j]==A[j][i]){
                     
                 } 
                 else{
                     System.out.println("Simetrik değildir");
                 }
            }
            System.out.println("Simetriktir");
        }   
    }
    
}
