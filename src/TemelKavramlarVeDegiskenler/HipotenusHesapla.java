package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class HipotenusHesapla {
    private static Scanner sca = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Üçkenin 1. kenar uzunluğu : ");
        double k1=sca.nextDouble();
        System.out.print("Üçkenin 2. kenar uzunluğu : ");
        double k2=sca.nextDouble();
        System.out.println("Hipotenüs : "+(Math.sqrt((k1*k1)+(k2*k2))));
    }
}
