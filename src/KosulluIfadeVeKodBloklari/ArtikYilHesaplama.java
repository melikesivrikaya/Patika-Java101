package KosulluIfadeVeKodBloklari;
import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.print("Yıl giriniz : ");
            int year=sca.nextInt();
            if(year % 100 == 0 ){
                if(year%400==0){
                    System.out.println(year+" Artık Yıl");
                }
                else{
                    System.out.println(year+" Artık Yıl Değil");
                }
            }
            else{
                if(year%4==0){
                    System.out.println(year+" Artık Yıl");
                }
                else {
                    System.out.println(year +" Artık Yıl Değil.");
                }

            }

            
        }
    }
}
