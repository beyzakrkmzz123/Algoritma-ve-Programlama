/*Örnek7.10:Klavyeden girilen n elemanlı A dizisinin aritmetik, geometrik, 
harmonik ve kontraharmonik ortalamasını hesaplayan program.
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
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir eleman sayısı giriniz: ");
        int n = input.nextInt();
        int []a = new int [n];
        for(int i=0;i<a.length;i++){
            System.out.println((i+1)+"inci eleman");
            a[i] = input.nextInt();
        }
        double t=0;
        double c=1;
        double HarmonikToplam=0;
        double KarelerToplamı=0;
        for(int i=0;i<a.length;i++){
            t+=a[i];
            c*=a[i];
            HarmonikToplam+=1/a[i];
            KarelerToplamı+=Math.pow(a[i], 2);
        }
        double AO=t/n;
        double GO=Math.pow(c,(1/n));
        double HO=n/HarmonikToplam;
        double KHO=KarelerToplamı/t;
        System.out.println("Aritmetik Ortalama:"+AO);
        System.out.println("Geometrik Ortalama:"+GO);
        System.out.println("Harmonik Ortalama:"+HO);
        System.out.println("Kontraharmonik Ortalama:"+KHO);
    }
    
}
