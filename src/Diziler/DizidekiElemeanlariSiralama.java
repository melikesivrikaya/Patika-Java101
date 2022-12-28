package Diziler;

import java.util.Scanner;

public class DizidekiElemeanlariSiralama {
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.print("Dizinin elaman sayısı : ");
            int n=sca.nextInt();
            int[] array=new int[n];

            for(int i=0;i<array.length;i++){
                System.out.print((i+1+".Elaman : "));
                array[i]=sca.nextInt();
            }

            int min;
            int index=0;

            for(int i=0;i<array.length;i++){
                min=array[i];
                for(int j=(i+1);j<array.length;j++){
                    if(array[i]>array[j] && min>array[j]){
                        min=array[j];
                        index=j;
                    }
                }
                if(min!=array[i]){
                array[index]=array[i];
                array[i]=min;
                }
             }
            for(int k:array){
                System.out.print(k+"  ");
            }
        }

    }
}
