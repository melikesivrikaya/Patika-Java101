package KosulluIfadeVeKodBloklari;
import java.util.Scanner;
public class BurcBulmaProg {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        System.out.print("Doğdunuz ay : ");
        int month = sca.nextInt();
        System.out.print("Doğduğunuz gün : ");
        int day = sca.nextInt();
        String burc = "bulunamadı";
        if (month == 1) {
            if (day > 0 && day <= 21) {
                burc= "Oğlak";
            } else if (day > 0 && day <= 31) {
                burc = "Kova";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");

        } else if (month == 2) {
            if (day > 0 && day <= 19) {
                burc= "Kova";
            } else if (day > 0 && day <= 29) {
                burc= "Balık";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");
        } else if (month == 3) {
            if (day > 0 && day <= 20) {
                burc = "Balık";
            } else if (day > 0 && day <= 31) {
                burc = "Koç";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");
        } else if (month == 4) {
            if (day > 0 && day <= 20) {
                burc = "Koç";
            } else if (day > 0 && day <= 30) {
                burc = "Boğa";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");
        } else if (month == 5) {
            if (day > 0 && day <= 21) {
                burc = "Boğa";
            } else if (day > 0 && day <= 31) {
                burc = "İkizler";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");

        } else if (month == 6) {
            if (day > 0 && day <= 22) {
                burc = "İkizler";
            } else if (day > 0 && day <= 30) {
                burc = "Yengeç";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");

        } else if (month == 7) {
            if (day > 0 && day <= 22) {
                burc = "Yengeç";
            } else if (day > 0 && day <= 31) {
                burc = "Aslan";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");

        } else if (month == 8) {
            if (day > 0 && day <= 22) {
                burc = "Aslan";
            } else if (day > 0 && day <= 31) {
                burc = "Başak";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");

        } else if (month == 9) {
            if (day > 0 && day <= 22) {
                burc = "Başak";
            } else if (day > 0 && day <= 30) {
                burc = "Terazi";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");

        } else if (month == 10) {
            if (day > 0 && day <= 22) {
                burc = "Terazi";
            } else if (day > 0 && day <= 31) {
                burc = "Akrep";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");

        } else if (month == 11) {
            if (day > 0 && day <= 21) {
                burc = "Akrep";
            } else if (day > 0 && day <= 30) {
                burc = "Yay";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");

        } else if (month == 12) {
            if (day > 0 && day <= 21) {
                burc = "Yay";
            } else if (day > 0 && day <= 31) {
                burc = "Oğlak";
            } else
                 System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");
        }
        else{
            System.out.println( "Yalnış giriş yaptınız");
        }
        
        System.out.println("Burcunuz : " + burc);
        
        }

    }
}
