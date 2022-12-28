package Metotlar;

import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.print("Taban değeri giriniz : ");
            int x=sca.nextInt();
            System.out.print("Üs değeri giriniz : ");
            int y=sca.nextInt();
            System.out.println("Sonuc : "+(int)usAlma(x, y));
        }

    }
    static double usAlma(int i,int j){
        return Math.pow(i, j);
    }
}
