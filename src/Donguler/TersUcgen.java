package Donguler;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        System.out.print("Sayı giriniz : ");
        int n=sca.nextInt();
        int a=n;
            for(int i=0;i<n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                }

                for(int k=1;k<=(a*2-1);k++){
                    System.out.print("*");
                }
                System.out.println(" ");
                a-=1;
            }
        for (int i=n; i >0 ; i--){

            for (int k=n-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
        }
        
    }
}
