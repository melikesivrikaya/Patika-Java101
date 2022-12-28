package Metotlar;

import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.print("Asallığını kontrol edeceğiniz sayı : ");
            if((asalMi(sca.nextInt())==true)){
                System.out.println("Asal Sayı");
            }
            else{
                System.out.println("Asal Sayı Değil...");
            }
        }
    }
    static boolean asalMi(int i){
        for(int j=2;j<i;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
