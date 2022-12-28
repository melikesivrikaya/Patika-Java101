package Donguler;

import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        System.out.print("Kümeniz kaç elemanlı : ");
        int n=sca.nextInt();
        System.out.print("Oluşturulacak gruplar kaç elemanlı : ");
        int r=sca.nextInt();int sonuc = fakHes(n) / ((fakHes(r) * fakHes(n-r)) );
        System.out.println("Kombinasyon : "+sonuc);
        }
    }
    public static int fakHes(int sayi){
        int fak=1;
        for(int i=1;i<=sayi;i++){
            fak*=i;
        }
        return fak;
    }
}
