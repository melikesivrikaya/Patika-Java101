package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class ManavKasaProg {
    private static Scanner sca = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Kaç kilo Armut  : ");
        int armut=sca.nextInt();
        System.out.print("Kaç kilo Elma : ");
        int elma=sca.nextInt();
        System.out.print("Kaç kilo Domates  : ");
        int domates=sca.nextInt();
        System.out.print("Kaç kilo Muz  : ");
        int muz=sca.nextInt();
        System.out.print("Kaç kilo Patlıcan  : ");
        int patlican=sca.nextInt();
        double total=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00);
        System.out.println("Toplam Tutar : "+total);
        
    }
}
