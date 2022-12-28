package Metotlar;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static Scanner sca = new Scanner(System.in);
    public static void main(String[] args) {
        
            int select;
            String menu = "1- Toplama İşlemi\n"
            + "2- Çıkarma İşlemi\n"
            + "3- Çarpma İşlemi\n"
            + "4- Bölme işlemi\n"
            + "5- Üslü Sayı Hesaplama\n"
            + "6- Faktoriyel Hesaplama\n"
            + "7- Mod Alma\n"
            + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
            + "0- Çıkış Yap";
            System.out.println(menu);
            do {
            
            System.out.print("Lütfen bir işlem seçiniz :");
            select = sca.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cıkarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    üssüBulma();
                    break;
                case 6:
                    faktoriel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
            } while (select != 0);





        
    }
    static void toplama(){
        System.out.print("1.Sayıyı Giriniz : ");
        int x=sca.nextInt();
        System.out.print("2.Sayıyı Giriniz : ");
        int y=sca.nextInt();
        System.out.println("Toplamları : "+(x+y));
    }
    static void cıkarma(){
        System.out.print("1.Sayıyı Giriniz : ");
        int x=sca.nextInt();
        System.out.print("2.Sayıyı Giriniz : ");
        int y=sca.nextInt();
        System.out.println("Farkları : "+(x-y));
    }
    static void bolme(){
        System.out.print("1.Sayıyı Giriniz : ");
        int x=sca.nextInt();
        System.out.print("2.Sayıyı Giriniz : ");
        int y=sca.nextInt();
        System.out.println("Bölümleri : "+(x/y));
                
    }
    static void carpma(){
        System.out.print("1.Sayıyı Giriniz : ");
        int x=sca.nextInt();
        System.out.print("2.Sayıyı Giriniz : ");
        int y=sca.nextInt();
        System.out.println("Çarpımları : "+(x*y));
    }
    static void faktoriel(){
        System.out.print("Faktoriyeli Alınacak Sayıyı Giriniz : ");
        int x=sca.nextInt();
        int fak=1;
        for(int i=1;i<=x;i++){
            fak*=i;
        }
        System.out.println("Faktoriyel : "+(int)fak);
    }
    static void üssüBulma(){
        System.out.print("Üssü Bulunacak Sayıyı Giriniz : ");
        int x=sca.nextInt(); 
        System.out.print("Üssü Olacak Sayıyı Giriniz : ");
        int y=sca.nextInt(); 
          System.out.println("Sonuç : "+(Math.pow(x, y)));
    }
    static void modAlma(){
        System.out.print("Mod Alınacak Sayıyı Giriniz : ");
        int x=sca.nextInt(); 
        System.out.print("Mod Olacak Sayıyı Giriniz : ");
        int y=sca.nextInt(); 
        System.out.println("Mod : "+x%y);     
    }
    static void dikdortgen(){
        System.out.print("Dikdörtgenin kısa kenarını giriniz : ");
        int x=sca.nextInt(); 
        System.out.print("Dikdörtgenin uzun kenarını Giriniz : ");
        int y=sca.nextInt();   
        System.out.println("Dikdörtgen Çevresi : "+(( x * 2 ) + (y * 2) ));    
        System.out.println("Dikdörtgen Alanı : "+(x*y));
    }
    
    

}
