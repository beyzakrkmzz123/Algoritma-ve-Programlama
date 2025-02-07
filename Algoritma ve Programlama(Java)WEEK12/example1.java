/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Scanner;
 import java.util.Random;

/**
 *
 * @author Asus
 */
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Ders sayısı: ");
        int M=input.nextInt();
        System.out.println("Öğrenci sayısı: ");
        int N=input.nextInt();
        
        
        
        int [][]notlar=generate_notes(notlar);
        double [] ortalama=avg_notes(notlar);
        int []ogrencino=generatearray(N,10000,20000);
        int [][]rapor=new int [M][4];   
        int[][]report =minmax_array(notlar,ogrencino);
        arr_print(report);
        
    }
    public static void arr_print(int []array){
        for(int i=0;i<array.length;i++){
            System.out.println((i+1)+" inci eleman "+array[i]);
        }
    }
    public static void arr_print(int[][]array){
        int row=array.length;
        int col=array[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println((i+1)+" , "+(j+1)+" inci eleman "+array[i][j]);
            }
        }
    }
    
    
    // N boyutlu lb-ub arasında rastgele sayılardan oluşan diziyi oluşturan method
    public static int[]generatearray(int N,int lb,int ub){
        int [] array=new int[N];
        Random r=new Random();
        for(int i=0;i<array.length;i++){
            array[i]=(int)(lb+(ub-lb)*r.nextDouble());
        }
        return array;
        
        
    }
    
    //İki boyutlu bir diziye 0-100 arasında rastgele atamalar yapan method
    public static int [][] generate_notes(int [][]array){
     int row=array.length;
     int col=array[0].length;
     Random r=new Random();
     for(int i=0;i<row;i++){
       for(int j=0;j<col;j++){
           array[i][j]=r.nextInt(100);
       }
     }
     return array;
    
}
  // notlar dizisine ait her bir derse ait ortalamayı dizi olarak döndüren method
    public static double[]avg_notes(int [][]array){
      int row=array.length;
      int col=array[0].length;
      double [] avg=new double[row];
      for(int i=0;i<row;i++){
        int toplam=0;
        for(int j=0;j<col;j++){
            toplam+=array[i][j];
            
        }
        avg[i]=(double)toplam/col;
      }
      return avg;
      
    }
    // her derse ait maksimum ve minimum yerleri bulduran method
     public static int[][] minmax_array(int[][]array,int[]ogrencino){
        int row=array.length;
        int col=array[0].length;
        int [][]rapor=new int [row][4];
        for(int i=0;i<row;i++){
           int max=array[i][0];
           int min=array[i][0];
           int maxid=0;
           int minid=0;
           for(int j=0;j<col;j++){
               if(array[i][j]>max){
                   max=array[i][j];
                   maxid=ogrencino[j];
               }
               if(array[i][j]<min){
                   min=array[i][j];
                   minid=ogrencino[j];
               }
          }
           rapor[i][0]=max;rapor[i][1]=maxid;rapor[i][2]=min;rapor[i][3]=minid;
    }
        return rapor;
           
        }
        
               
        
        
}
