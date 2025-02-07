
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        Scanner input = new Scanner (System.in);
        System.out.println("Satır sayısı:");
        int row = input.nextInt();
        
        for (int i=1;i<=row;i++){
            for (int j=row;j>=i;j--){
                System.out.print("*");
            }
          
            System.out.println();
    }
    
    }
}
