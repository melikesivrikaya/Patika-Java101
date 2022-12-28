package KosulluIfadeVeKodBloklari;
import java.util.Scanner;
public class UcakBiletiHesapla {
    
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.print("Yaşınız : ");
            int age=sca.nextInt();
            System.out.print("Gidilecek km cinsinden mesafe : ");
            float km=sca.nextFloat();
            System.out.print("1.Tek Yön\n2.Gidiş Dönüş\nYolculuk tipiniz : ");
            int tip=sca.nextInt();
            if(age<0 || km<0 || !(tip==1 ||tip==2)){
                System.out.println("Yalnış Giriş Yaptınız....");
            }
            else{
                
                km*=0.10;
                if(age<12){
                    km-=km/100*50;
                }
                else if(age<24){
                    km-=km/100*10;
                }
                else if(age>64){
                    km-=km/100*30;
                }
                if(tip==2){
                    km-=km/100*20;
                    
                }
                System.out.println("Ödenecek tutar : "+km*2);
            }
        }

    }
}
