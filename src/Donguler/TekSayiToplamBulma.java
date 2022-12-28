package Donguler;

import java.util.Scanner;

public class TekSayiToplamBulma {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            int sayi;
            int toplam=0;
            do{
            System.out.print("Sayı Giriniz : ");
            sayi=sca.nextInt();
            if(sayi % 4 == 0){ toplam+=sayi; }
            }while(sayi % 2 == 0);
            System.out.println("Tek Sayı Girdiniz...");
            System.out.println("Son sayıya kadar girilmiş 4 ün katları toplamı : "+toplam);
        }
        
    }
}
