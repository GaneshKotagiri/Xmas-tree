import java.util.Scanner;

public class XmasTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int height=sc.nextInt();
        int height=10;
        for(int i=0;i<height;i++){
            for(int j=height-i;j>0;j--){
                System.out.print(" ");
            }for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print(" ");

        for(int i=height;i>0;i--){
            for(int j=0;j<height-i;j++){
                System.out.print(" ");
            }for(int k=2*i-1;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
