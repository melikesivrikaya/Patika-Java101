package Donguler;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int i=0;
        int j=1;
        int k=0;
        int s1=0,s2=1,s3;
        for(int a = 0 ; a < 4 ; a++){
            System.out.print(i+" ");
            System.out.print(j+" ");
            k=i+j;
            System.out.print(k+" ");
            i=k+j; 
            j=i+k; 
        }
        
        for (int b = 2;b<=10;b++){
            s3=s1+s2;
            System.out.print(s1 + " + " +s2 + " = "+s3);
            s1=s2;
            s2=s3;
            System.out.println();
        }
    }
}
