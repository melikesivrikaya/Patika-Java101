package Metotlar;



public class FibonacciBulma {
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13
        System.out.println(fib(7));
    }
    static int fib(int n){
       if(n==1 || n==2){
        return 1;
       }
       else{
        return fib(n-1)+fib(n-2);
       }

    }
}
