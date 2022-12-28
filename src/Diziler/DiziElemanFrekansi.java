package Diziler;

public class DiziElemanFrekansi {
    public static void main(String[] args) {
        int[] array={3,10, 20, 20,3, 10, 10, 20,0, 5, 20,40,40};
        int min;
        int sayac=0;
        int index=0;
        //Dizideki elemanları sıralıyorum ilk önce : 
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

        //Elemanları saydırıp yazdırıyorum
            for(int i=0;i<array.length;i++){
                sayac=0;
                for(int j=(i+1);j<array.length;j++){
                    if(array[i]==array[j]){
                        sayac++;
                    }
                }
                System.out.println(array[i]+" elamandan dizide "+(sayac+1)+" adet var");
                i+=sayac;
            }
    }
}
