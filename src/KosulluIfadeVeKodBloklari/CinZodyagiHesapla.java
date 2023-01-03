package KosulluIfadeVeKodBloklari;
import java.util.Scanner;
public class CinZodyagiHesapla {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.print("Doğum yılınız : ");
            int year = sca.nextInt();
            year = year % 12;
            if(year == 0){
                System.out.println("Çin zodyağı burcunuz : Maymun ");
            }
            else if(year == 1){
                System.out.println("Çin zodyağı burcunuz : Horoz ");
            }
            else if(year == 2){
                System.out.println("Çin zodyağı burcunuz : Köpek ");
            }
            else if(year == 3){
                System.out.println("Çin zodyağı burcunuz : Domuz ");
            }
            else if(year == 4){
                System.out.println("Çin zodyağı burcunuz : Fare ");
            }
            else if(year == 5){
                System.out.println("Çin zodyağı burcunuz : Öküz ");
            }
            else if(year == 6){
                System.out.println("Çin zodyağı burcunuz : Kaplan ");
            }
            else if(year == 7){
                System.out.println("Çin zodyağı burcunuz : Tavşan ");
            }
            else if(year == 8){
                System.out.println("Çin zodyağı burcunuz : Ejderha ");
            }
            else if(year == 9){
                System.out.println("Çin zodyağı burcunuz : Yılan ");
            }
            else if(year == 10){
                System.out.println("Çin zodyağı burcunuz : At ");
            }else if(year == 11){
                System.out.println("Çin zodyağı burcunuz : Koyun ");
            }

        }
    }
}
