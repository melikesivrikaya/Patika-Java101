package KosulluIfadeVeKodBloklari;
import java.util.Scanner;

public class NotOrtalama {
    public static int toplam;
    public static int ders_sayi;
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        System.out.print("Matematik ders notunuz : ");
        uygunmu(sca.nextInt());
        System.out.print("Fizik ders notunuz : ");
        uygunmu(sca.nextInt());
        System.out.print("Türkçe ders notunuz : ");
        uygunmu(sca.nextInt());
        System.out.print("Kimya ders notunuz : ");
        uygunmu(sca.nextInt());
        System.out.print("Müzik ders notunuz : ");
        uygunmu(sca.nextInt());
            if((toplam/ders_sayi)>55){
                System.out.println("Geçtiniz");
            }
            else{
                System.out.println("Kaldınız");
            }
        }
    }
    public static void uygunmu(int not){
        if(not>=0 && not<=100){
            ders_sayi++;
            toplam+=not;
        }
        
    }
}
