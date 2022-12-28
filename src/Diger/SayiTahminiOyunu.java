package Diger;

import java.util.Scanner;

public class SayiTahminiOyunu {
  
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            boolean win=false;
            int heart=5;
            int random=(int) (Math.random()*100);
            int[] select=new int[5];
            int index=0;
            while(win == false && heart!=0){
                System.out.print("Tahmininiz : ");
                int selected=sca.nextInt();
                select[index]=selected;
                index++;
                if(selected>0 && selected<101){
                    if(selected>random){
                        System.out.println("Tahmininiz büyük...");
                        heart--;
                    }
                    else if(selected<random){
                        System.out.println("Tahmininiz küçük...");
                        heart--;
                    }
                    else{
                        win=true;
                        System.out.println("Tebrikler Kazandınız :)");
                    }
                }
                else{
                    System.out.println("0 ile 100 arasında bir sayı girmelisiniz ....");
                    heart-=1;
                    System.out.println("Kalan hakkınız : "+heart);
                }

            }
            System.out.println("**Tahminleriniz**");
            for(int i : select){
                System.out.print(i+"  ");
            }
            System.out.println(" ");
            System.out.println("Gizli Sayı "+random);


        }
    }
}
