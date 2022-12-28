package Donguler;

import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.print("Birinci sayı : ");
            int x=sca.nextInt();
            System.out.print("İkinci sayı : ");
            int y=sca.nextInt();
            int ebob=1;
            for(int i=1;i<=x & i<=y;i++){
            if((x % i == 0 ) & ( y % i == 0 )){
             ebob=i;
            }
            }
            System.out.println("Ekok : "+((x*y)/ebob)+" Ebob : "+ebob);    
        }
        
        }

    }

