package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class VucutKitleIndexHesapla {
    private static Scanner sca = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Boyunuz : ");
        float boy=sca.nextFloat();
        System.out.print("Kilonuz : ");
        float kilo=sca.nextFloat();
        System.out.println("Vucut Kitle İndexiniz : "+(kilo/(boy*boy)));
    }

}
