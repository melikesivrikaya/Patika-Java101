package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class KdvHesaplama {
    private static Scanner sca = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Tutar : ");
        double tutar = sca.nextDouble();
        double kdv;
        if(tutar>1000){
            kdv=(Double)tutar/100*8;
            System.out.println("KDV oranı %8");
        }
        else {
            kdv=(Double)tutar/100*18;
            System.out.println("KDV Oranı %18");
        }
        System.out.println("KDV'siz Tutar : "+tutar);
        System.out.println("KDV'li tutar : "+(tutar+kdv));
        System.out.println("KDV tutarı : "+kdv);
    }
}
