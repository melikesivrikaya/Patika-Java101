package Diziler;

public class YildizlarlaHarf {
    public static void main(String[] args) {
        String[][] harf=new String[7][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                if(i==0 || i==3){
                    harf[j][i] ="* ";
                }
                else if((i==1 || i==2)&& (j==0 || j==3 || j==6)){
                    harf[j][i]="* ";
                }
                else{
                    harf[j][i]="  ";
                }
            }
        }
        for(String[] a : harf){
            for(String b : a){
                System.out.print(b);
            }
            System.out.println(" ");
        }
    }
}
