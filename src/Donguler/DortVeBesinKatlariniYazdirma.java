package Donguler;

import java.util.Scanner;

public class DortVeBesinKatlariniYazdirma {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.print("Bir Sayı Giriniz : ");
            int sayi=sca.nextInt();
            System.out.println("Girilen sayıya kadar 4ün katı olan sayılar;");
            for(int i=3;i<=sayi;i++){
                if(i%4==0){System.out.print(i+" ");}
            }
            System.out.println();
            System.out.println("Girilen sayıya kadar 5ün katı olan sayılar;");
            for(int i=4;i<=sayi;i++){
                if(i%5==0){System.out.print(i+" ");}
            }
        }
    }
}
