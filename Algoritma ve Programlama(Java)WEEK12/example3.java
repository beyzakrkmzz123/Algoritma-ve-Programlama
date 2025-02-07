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
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen dersin numarasını giriniz");
        int M =input.nextInt();
        System.out.println("Lütfen öğrenciyi giriniz");
        int N=input.nextInt();
        int [][]notlar=randomnoturet(M,N);
        int[]maxnotlar=bul_maxdersnot(notlar);
    }
    
    
    
    public static int[][]randomnoturet(int a,int b){
        Scanner input=new Scanner(System.in);
        
    }
    public static int[]bul_maxdersnot(int[][]array){
        int row=array.length;
        int col=array[0].length;
        int [][]max_notlar=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               int max=array[0][j];
               int min=array[0][j];
               if(array[i][j]>max){
                   max=array[i][j];
               }
               if(array[i][j]<min){
                   min=array[i][j];
               }
            }
        }
        return null;
    }
    
    public static int yazdır_öğrencinot(int [][]array,int a){
        
    }
}
