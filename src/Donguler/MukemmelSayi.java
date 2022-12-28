package Donguler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        System.out.print("Bir Sayı Giriniz : ");
        int sayi=sca.nextInt();
        int toplam=0;
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(toplam==sayi){
            System.out.println("Mükemmel Sayı");
        }
        else{
            System.out.println("Mükemmel Sayı Değil");
        }
        }
    }
}
