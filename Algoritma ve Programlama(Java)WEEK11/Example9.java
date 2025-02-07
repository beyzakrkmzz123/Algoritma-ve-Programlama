/*Örnek8.18:Klavyeden girilen nxn tipindeki a matrisinden alt üçgen b matrisini
oluşturan program.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nxn için değeri giriniz: ");
        int n = input.nextInt();
        
        int[][]a = new int[n][n];
        int[][]b = new int[n][n];
        System.out.println("A matrisi: ");
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                System.out.print(+i+"inci satır ve "+j+"inci sütun : ");
                a[i][j]=input.nextInt();
                if(i<j){
                     b[i][j]=0;
                }
                else{
                   b[i][j] = a[i][j];
                }
            }
        }    
    }
    
}
