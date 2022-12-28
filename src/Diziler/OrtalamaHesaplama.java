package Diziler;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for(double j=1;j<=numbers[i];j++){
                System.out.println(numbers[i]);
                sum+=(1/j);
                System.out.println(sum);
        }
        }

        System.out.println(sum / numbers.length);
    }
}
