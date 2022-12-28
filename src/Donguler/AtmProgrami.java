package Donguler;

import java.util.Scanner;

public class AtmProgrami {
    private static Scanner sca = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {
        String kullanici;
        String parola;
        int hak=3;
        while(hak>0){
        System.out.print("Kullanıcı Adınız  : ");
        kullanici=sca.nextLine();
        System.out.print("Parolanız  : ");
        parola=sca.nextLine();
        int bakiye=1500;
        int yat;
        boolean cikis=false;
        if(kullanici.equals("melike")&&parola.equals("12345")) {
            System.out.println("1.Bakiye sorgulama\n2.Yatırma\n3.Çekme\n4.Para transferi\n5.Çıkış");
             while(!cikis){
                System.out.print("İşlemininz :");
                int islem=sca.nextInt();
                sca.nextLine();
            switch(islem){
                case 1:
                System.out.println("bakiyeiyeniz : "+bakiye);
                break;
                case 2:
                    System.out.print("Yatırmak istediğiniz tutar : ");
                    yat=sca.nextInt();
                    bakiye+=yat;
                    System.out.println("Güncel tutar : "+ bakiye);
                    break;
                case 3:
                System.out.print("Çekmek istediğiniz tutar : ");
                    yat=sca.nextInt();
                    bakiye-=yat;
                    if (bakiye<0){System.out.println("Yeterli tutara sahip değilsiniz."); 
                    bakiye+=yat;}
                    System.out.println("Güncel tutar : "+ bakiye);
                    break;
                case 4:
                System.out.print("Transfer etmek istediğiniz tutar : ");
                    yat=sca.nextInt();
                    bakiye-=yat;
                    if (bakiye<0){System.out.println("Yeterli tutara sahip değilsiniz."); 
                    bakiye+=yat;}
                    System.out.println("Güncel tutar : "+ bakiye);
                    break;
                case 5:
                    cikis=true;
                    break;
            }  
            }
        }   
        else
        {
            hak--;
            System.out.println("Yalnış giriş yaptınız ...");
            System.out.println("Kalan hakkınız : "+hak);
        }
        System.out.println("Program Sonlandı.");
        hak=0;
        }
    
    }
}
