package Diziler;

import java.util.Scanner;

public class MaxMinBulma {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        int[] array={15,12,788,1,-1,-778,2,0};
        System.out.print("Sayı giriniz : ");
        int number=sca.nextInt();
        int min = 0;
        int max = 0;
        for(int i : array){
            if(i>number){
            max=i;    
            }
            if(i<number){
            min=i;
            break;    
            }
        }
        for(int i : array){
            if(i>number&& max>i){
                max=i;
            }
            if(i<number && min<i){
                min=i;
            }
        }
        System.out.println(number+" den büyük en küçük değer :" +max);
        System.out.println(number+" den küçük en büyük değer :" +min);
        
        }
    }
}
