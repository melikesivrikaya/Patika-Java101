package KosulluIfadeVeKodBloklari;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        System.out.print("Adınız : ");
        String ad = sca.nextLine();
        System.out.print("Şifreniz  : ");
        String sifre = sca.nextLine();
        if(ad.equals("melike")&&sifre.equals("melike123")){
            System.out.println("Giriş yapıldı. Hoşgeldiniz...");
        }
        else{
            System.out.println("Kullanıcı adı veya şifre hatalı...");
            System.out.print("Yeni şifre oluşturmak istermisiniz ");
            String sifreOlusturma=sca.nextLine();
            if(sifreOlusturma.equals("evet")){
                while(true){
                System.out.print("Yeni şifreyi giriniz : ");
                sifreOlusturma = sca.nextLine();
                if(sifreOlusturma.equals(sifre) || sifreOlusturma.equals("melike123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }
                else{
                    System.out.println("Şifre oluşturuldu."); break;
                }
            }
            }
            else{
                System.out.println("Şifre oluşturulmadı...");
            }
        }
        }
    }
}
