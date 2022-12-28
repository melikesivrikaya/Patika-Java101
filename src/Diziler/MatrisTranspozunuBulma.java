package Diziler;

public class MatrisTranspozunuBulma {
    public static void main(String[] args) {
        String[][] a={{"a","b","c"},{"d","e","f"}};
        String[][] b=new String[3][2];
        System.out.println("*Matris*");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                b[j][i]=a[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("*Transpoze*");
        for(String[] x : b){
            for(String y : x){
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }
    }
}
