package KosulluIfadeVeKodBloklari;
import java.util.Scanner;
public class SayiSiralama {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        System.out.print("1.Sayıyı Giriniz : ");
        int s1=sca.nextInt();
        System.out.print("2.Sayıyı Giriniz : ");
        int s2=sca.nextInt();
        System.out.print("3.Sayıyı Giriniz : ");
        int s3=sca.nextInt();
        if(s1 > s2 && s1 > s3){
            if(s2>s3){
                System.out.println("1.sayı > 2.Sayı > 3.Sayı");
                
            }
            else{
                System.out.println("1.sayı > 3.Sayı > 2.Sayı");
               
            }
        }
        else if(s2 > s1 && s2 > s3){
            if(s1>s3){
                System.out.println("2.sayı > 1.Sayı > 3.Sayı");
                
            }
            else{
                System.out.println("2.sayı > 3.Sayı > 1.Sayı");
               
            }
        }
        else {
            if(s1>s2){
                System.out.println("3.sayı > 1.Sayı > 2.Sayı");
                
            }
            else{
                System.out.println("3.sayı > 2.Sayı > 1.Sayı");
              
            }
        } 
    }
    }
}
