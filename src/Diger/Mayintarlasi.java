package Diger;
import java.util.Random;
import java.util.Scanner;

public class Mayintarlasi {
    public static int x;
    public static int y;
    public static String sumsum="#";
    public static void main(String[] args) {

        try (Scanner sca = new Scanner(System.in)) {
            Random r=new Random();
            System.out.print("Satır Sayısı : ");
            x=sca.nextInt();
            System.out.print("Sütun Sayısı : ");
            y=sca.nextInt();
            int[][] tahta=new int[x][y];
            String[][] kapaliTahta=new String[x][y];

            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    kapaliTahta[i][j]="#";
                }
            }

            System.out.println("*****************************");
            show(kapaliTahta,0,0);
            int mayinAdet=(x*y)/4;
            for(int i=0;i<mayinAdet;i++){
                int x1=r.nextInt(x);
                int y1=r.nextInt(y);
                if(tahta[x1][y1]!=10)
                    tahta[x1][y1]=10;
                else
                    i-=1;
            }
            
            int mayinsiz=(x*y)-mayinAdet;
            
            while(mayinsiz>mayinAdet){
                System.out.print("Satır indeksi giriniz : ");
                int satir=sca.nextInt()-1;
                System.out.print("Sütun indeksi giriniz : ");
                int sütun=sca.nextInt()-1;
                if(satir<0 || satir>=x|| sütun<0 || sütun>=y ){
                    System.out.println("Satır veya Sütun sayısının dışında giriş yaptınız...");
                    continue;
                }
                if(tahta[satir][sütun]==10){
                    System.out.println("Patladın ..!");
                    break;
                }
                else{
                    hesapla(tahta, satir, sütun);
                    show(kapaliTahta, satir, sütun);
                    mayinsiz=isWin(kapaliTahta);
                }
                if(mayinsiz==mayinAdet)
                System.out.println("KAZANDINIZ ..!");
            }

        }
    }

   public static void show(String[][] array,int satir,int sütun){
    array[satir][sütun] = sumsum;
    for(String[] i:array){
        for(String j:i)
        System.out.print(j+" ");
        System.out.println(" ");
    }
    System.out.println("*****************************");
   }

   public static void hesapla(int[][] array,int satir,int sütun){
    int sum=0;
    for(int i=(satir-1);i<(satir+2);i++){
        if(i==-1)
            i++;
        if(i==x)
            break;
        for(int j=(sütun-1);j<(sütun+2);j++){
            if(j==-1)
                j++;
            if(j==y)
                break;
            if(array[i][j]==10){
                sum+=1;
            }            
        }
    }
    array[satir][sütun]=sum;
    sumsum=String.valueOf(sum);
   }
   

   public static int isWin(String[][] array){
    int sayac=0;
    for(String[] m : array){
        for(String k : m){
            if(k =="#")
                sayac++;
        }
    }
    return sayac;
   }
    
}
