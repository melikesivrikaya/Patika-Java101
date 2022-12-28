package Donguler;

import java.util.Scanner;

public class HarmonikSayi{
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.print("Sayıyı Giriniz : ");
            int sayi=sca.nextInt();
            double total=0;
                for(double i=1;i<=sayi;i++){
                    total+=(1/i);
            }
            System.out.println("Sonuc : "+total);
        }
    }
}