/*Örnek8.27:Klavyeden girilen NxN tipindeki A matrisinin her bir satır elemanlarını
kendi aralarında küçükten büyüğe doğru sıralayan program.
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
        int[][][]B = new int[N][N][N];
        for(int i=1;i<N;i++){
           for(int j=1;j<N;j++){
               B[i][i][j]=A[i][j];
           }
        }
        for(int i=1;i<N;i++){
           for(int j=1;j<N-1;j++){
               for(int k=j+1;k<N;k++){
                   if(B[i][i][k]<B[i][i][j]){
                       int F=B[i][i][j];
                       B[i][i][j]=B[i][i][k];
                       B[i][i][k]=F;
                    }
                   else{
                       
                   }
                }
            }
        }
        for(int i=1;i<N;i++){
           for(int j=1;j<N;j++){
               System.out.println("Sıralama: "+B[i][i][j]);
            }
        }   
    }
    
}
