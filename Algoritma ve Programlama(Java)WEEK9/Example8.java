/*Örnek7.20:Klavyeden girilen N elemanlı bir A dizisindeki pozitif elemanları 
B dizisine ve negatif elemanları da C dizisine yerleştiren program.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen eleman sayısını giriniz: ");
        int N = input.nextInt();
        int [] a = new int[N];
        int [] b = new int[N];
        int [] c = new int[N];
        int x =0;
        int y =0;
        
        for(int i=0;i<N;i++){
            System.out.println("A dizisinin "+(i+1)+"inci elemanı");
            a[i] = input.nextInt();
        }
        for(int i=0;i<N;i++){
            if(a[i]!=0){
            }
            if(a[i]>0){
                x=x+1;
                b[x]=a[i];
                System.out.println("B dizisi"+b[x]);
            }
            else{
                y=y+1;
                c[y]=a[i];
                System.out.println("C dizisi"+c[y]);
            }
        }
    }
    
}
