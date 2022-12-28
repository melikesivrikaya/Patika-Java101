package Donguler;

import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            for(int i=2;i<100;i++){
            
                if (asalMi(i)==true) {
                    System.out.print(i+" ");
                }
            
        }
        }
    }
    public static boolean asalMi(int sayi){
        for(int i=2;i<sayi;i++){
            if (sayi%i==0) {
                return false;
            }
        }
        return true;
    }
}
