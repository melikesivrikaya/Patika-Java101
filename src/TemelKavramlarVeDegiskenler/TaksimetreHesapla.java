package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class TaksimetreHesapla {
    private static Scanner sca = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("KM cinsinden gidilen mesafe : ");
        int mesafe = sca.nextInt();
        mesafe *= 2.20;
        int total = ((mesafe + 10) < 20) ? 20 : mesafe + 10 ;
        System.out.println("Toplam ücret : " + total);
    }
}
