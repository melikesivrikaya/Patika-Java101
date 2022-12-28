package Metotlar;

import java.util.Scanner;

public class DeseneGoreMetot {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
          System.out.print("N sayısını girin : ");  
          int n=sca.nextInt();
          metot2(metot1(n), n);
         }
        
    }
    static int metot1(int sayi){
        if(sayi<=0){
            return sayi;
        }
        else{
            System.out.print(sayi+"  ");
            sayi-=5;
            return metot1(sayi);
        }
    }
    static int metot2(int a,int b){
        if(a==b){
            System.out.print(a+"  ");
            return b;
            
        }
        else{
            System.out.print(a+"  ");
            a+=5;
            return metot2(a, b);
        }
    }
}
