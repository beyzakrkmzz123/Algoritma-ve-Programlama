/*Örnek8.28:N tane şirketin bir yıla ait aylık kar oranları, bilgisayara girilmektedir.
Buna göre;
i.Herbir şirketin yıllık ortalama kar miktarlarını,
ii.Herbir şirketin en az ve en fazla kar elde etiiği ayları ve miktarlarını,
iii.Herbir aya ait en az ve en fazla kar miktarları ve şirketleri veren program. 
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example13 {

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
            for(int j=1;j<12;j++){
                System.out.print(+i+"inci satır ve "+j+"inci sütun : ");
                A[i][j]=input.nextInt();
            }
        }
        for(int i=1;i<N;i++){
           int YK=0;
           for(int j=1;j<12;j++){
               YK=YK+A[i][j];
            }
               YK=YK/12;
               System.out.println(i+"inci şirketin yıllık karı: "+YK);
        }
        for(int i=1;i<N;i++){
            int Fzkar=A[i][1],Fzkaray=1;
            int Azkar=A[i][1],Azkaray=1;
            for(int j=2;j<12;j++){
                if(A[i][j]<Azkar){
                    Azkar=A[i][j];
                    Azkaray=j;
                }
                else{
                    
                }
                if(A[i][j]>Fzkar){
                    Fzkar=A[i][j];
                    Fzkar=j;
                }
                else{
                    
                }
            }
            System.out.println(i+"inci şirket için en az kar miktarı: "+Azkar);
            System.out.println(i+"inci şirket için en fazla kar miktarı: "+Fzkar);
            System.out.println(i+"inci şirketin en az kar yaptığı ay: "+Azkaray);
            System.out.println(i+"inci şirketin en fazla kar yaptığı ay: "+Fzkaray);
        }
        for(int j=1;j<12;j++){
            int Az=A[1][j],Azs=1;
            int Fz=A[1][j],Fzs=1;
             for(int i=2;i<N;i++){
                 if(A[i][j]<Az){
                     Az=A[i][j];
                     Azs=i;
                 }
                 else{
                     
                 }
                 if(A[i][j]>Fz){
                     Fz=A[i][j];
                     Fzs=i;
                 }
            }
            System.out.println(j+"inci ay için en az kar miktarı: "+Az);
            System.out.println(j+"inci ay için en fazla kar miktarı: "+Fz);
            System.out.println(j+"inci aya ait en az karı elde eden şirket: "+Azs);
            System.out.println(j+"inci aya ait en fazla karı elde eden şirket: "+Fzs);
        }
        
    }
    
}
