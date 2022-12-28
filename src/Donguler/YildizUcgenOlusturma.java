package Donguler;

import java.util.Scanner;

public class YildizUcgenOlusturma {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.print("Bir Sayı Giriniz :");
            int n = sca.nextInt();
            int a=1;
            for (int i = 0; i <= n ; i++) {
                for (int j = 0; j < (n - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for(int i = 1 ; i < n ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(" ");
                }
                for(int k = 1 ; k <= (n - 1) * 2 - a ; k++){
                    System.out.print("*");
                }
                System.out.println(" ");
                a+=2;
            }
        
        
        
        
        
        }
    }
}
