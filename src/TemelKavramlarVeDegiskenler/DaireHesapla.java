package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class DaireHesapla {
    private static Scanner sca = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Dairenin yarı çapı : ");
        double yaricap=sca.nextDouble();
        System.out.println("Dairenin Alanı : "+(Math.PI*yaricap*yaricap));
        System.out.println("Dairenin Çevresi : "+(2*Math.PI*yaricap));
        System.out.print("Merkez açısının ölçüsü : ");
        int acı=sca.nextInt();
        System.out.println("Daire diliminin alanı : "+(Math.PI*(yaricap*yaricap)*acı)/360);
    }
}
