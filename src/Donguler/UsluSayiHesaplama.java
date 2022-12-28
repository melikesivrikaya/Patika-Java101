package Donguler;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        System.out.print("Üssü alınacak sayı : ");
        int alt=sca.nextInt();
        System.out.print("ÜS olacak sayı : ");
        int üs=sca.nextInt();
        int total=1;
        for(int i=0;i<üs;i++){
            total*=alt;
        }
        System.out.println("Sonuç : "+total);
        }

    }
}
