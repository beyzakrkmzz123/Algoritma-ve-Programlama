/*
Taş,kağıt,makas oyunu.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int  max= 3 ;
        int  min = 1 ;
        int bilgisayar = (int)(Math.random()*(max-min-1))+min ;
        System.out.println("Bilgisayar"+bilgisayar);
        System.out.println("1.taş");
        System.out.println("2.kağıt");
        System.out.println("3.makas");
        System.out.println("Lütfen bir seçim yapınız: ");
        int kullanıcı=input.nextInt();
        if(kullanıcı!=1 && kullanıcı!=2 && kullanıcı!=3){
            System.out.println("Yanlış seçim yaptınız");
        }
        else{      
        }
        if(kullanıcı==1 && bilgisayar==1){
            System.out.println("Oyun berabere kaldı");
        }
        if(kullanıcı==2 && bilgisayar==2){
	    System.out.println("Oyun berabere kaldı");
        }
        if(kullanıcı==3 && bilgisayar==3){
            System.out.println("Oyun berabere kaldı");
        }
        if(kullanıcı==1 && bilgisayar==2){
            System.out.println("Oyunu bilgisayar kazandı");
        }
        if(kullanıcı==1 && bilgisayar==3){
            System.out.println("Oyunu kullanıcı kazandı");
        }
        if(kullanıcı==2 && bilgisayar==1){
            System.out.println("Oyunu kullanıcı kazandı");
        }
        if(kullanıcı==2 && bilgisayar==3){
            System.out.println("Oyunu bilgisayar kazandı");
        }
        if(kullanıcı==3 && bilgisayar==1){
            System.out.println("Oyunu bilgisayar kazandı");
        }
        if(kullanıcı==3 && bilgisayar==2){
            System.out.println("Oyunu kullanıcı kazandı");
        }
    }
    
}
    

