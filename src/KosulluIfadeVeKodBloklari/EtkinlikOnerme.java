package KosulluIfadeVeKodBloklari;
import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        System.out.print("Sıcaklık Giriniz : ");
        int derece=sca.nextInt();
        if(derece<5){
            System.out.println("Kayak yapmaya gidebilirsiniz");
        }
        else if(derece<15){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if(derece<25){
            System.out.println("Pikniğe gidebilirsiniz");
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz");
        }
        
        }
    }
}
