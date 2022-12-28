package Donguler;

import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.print("Sayınızı giriniz : ");
            int sayi=sca.nextInt();
            int basamak=0;
            int i=sayi;
            do{
                i/=10;
                basamak++;
            }while(i>0);
            System.out.println("basamak sayısı : "+basamak);
            int rakam;
            int gecici=sayi;
            int toplam=0;
            do{
                rakam=sayi%10;
                toplam+=Math.pow(rakam, basamak);
                sayi/=10;
                
            }while(sayi>0);
            if (gecici==toplam){
                System.out.println("armstrong sayi");
            }
            else {
                System.out.println("armstrong sayı değil");
            }
        }
        
    }
}
