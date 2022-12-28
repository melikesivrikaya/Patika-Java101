package KosulluIfadeVeKodBloklari;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        System.out.print("1.Sayıyı giriniz : ");
        int s1=sca.nextInt();
        System.out.print("2.Sayıyı giriniz : ");
        int s2=sca.nextInt();
        System.out.print("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\nYapmak istediğiniz işlem : ");
        int islem=sca.nextInt();
        sca.nextLine();
        switch(islem){
            case 1:System.out.println("Toplamları : "+(s1+s2));break;
            case 2:System.out.println("Farkleri : "+(s1-s2));break;
            case 3:System.out.println("Çarpımları : "+(s1*s2));break;
            case 4:System.out.println("Bölümleri : "+(s1/s2));break;
        }
        }
    }
}
