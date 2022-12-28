package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class NotOrtalamasi{
    /**
     * @param args
     */
    public static void main(String[] args) {
            try (Scanner sca = new Scanner(System.in)) {
                System.out.println("Not Ortalama Hesaplama");
                System.out.print("Matematik Notunuz : ");
                int mat=sca.nextInt();
                System.out.print("Fizik Notunuz : ");
                int fizik=sca.nextInt();
                System.out.print("Kimya Notunuz : ");
                int kimya=sca.nextInt();
                System.out.print("Türkçe Notunuz : ");
                int turkce=sca.nextInt();
                System.out.print("Tarih Notunuz : ");
                int tarih=sca.nextInt();
                System.out.print("Müzik Notunuz : ");
                int muzik=sca.nextInt();

                int toplam =mat+fizik+kimya+turkce+tarih+muzik;
                double ort=toplam/6.0;
                System.out.println("Not ortalaması : "+ort);
                String sonuc = (ort>60) ? "Geçti" : "Kaldı" ;
                System.out.println("Geçme durumu : "+sonuc);
            }
        
    }
}