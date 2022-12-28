package Metotlar;

import java.util.Scanner;

public class PalindromikSayi {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
        boolean sonuc=palidromik(363);
        if(sonuc==true){
            System.out.println("Palidromik Sayı");
        }
        else{
            System.out.println("Palidromik Sayı Değil");
        }
        }

    }
    static boolean palidromik(int sayi){
        int yeni=0;
        int yedek=sayi;
        while(sayi!=0){
        yeni=(yeni*10)+sayi%10;
        sayi/=10;
        }
        if(yeni == yedek){
            return true;
        }
        else{
            return false;
        }
    }
}
