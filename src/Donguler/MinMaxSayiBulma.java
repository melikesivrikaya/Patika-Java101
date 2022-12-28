package Donguler;

import java.util.Scanner;

public class MinMaxSayiBulma {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        System.out.print("Kaç sayı giriceksiniz : ");
        int adet=sca.nextInt();
        int max=0;
        int min=0;
        for(int i=0;i<adet;i++){
            System.out.print((i+1)+".Sayıyı Giriniz : ");
            int s=sca.nextInt();
            if(i == 0){ min = s; max = s; }
            if(s > max) { max = s; }
            if(s < min) { min = s; }
        }
        System.out.println("Min : "+min+" Max : "+max);
        }
    }
}
