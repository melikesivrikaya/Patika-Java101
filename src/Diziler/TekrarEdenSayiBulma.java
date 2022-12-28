package Diziler;
public class TekrarEdenSayiBulma {
    
    public static void main(String[] args) {
            int[] array={4,4,5,4,8,2,4,6,5,3,3,6};
            int min;
            int sayac=0;
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
                System.out.println("*** Tekrar Eden Çift Sayılar ***");
                for(int i=0;i<array.length;i++){
                    sayac=0;
                    for(int j=(i+1);j<array.length;j++){
                        if(array[i]==array[j]){
                            sayac++;
                        }
                    }
                    if(array[i]%2==0)
                    System.out.print(array[i]+" ");
                    i+=sayac;
                }
    }
}
