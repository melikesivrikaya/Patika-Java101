package Donguler;
import java.util.Scanner;

public class CiftSayiBulma{
    private static Scanner sca = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Sayı giriniz : ");
        int sayi=sca.nextInt();
        int toplam=0;
        int sayi_adet=0;
        for(int i = 1 ; i<= sayi ; i++){
           if(i % 3 == 0 && i % 4 == 0){
            toplam+=i;
            sayi_adet++;
           }

        }
        System.out.println(sayi+" sayısına kadar 3 ve 4 e tam bölünen sayıların ortalaması : "+(toplam/sayi_adet));
    }
}