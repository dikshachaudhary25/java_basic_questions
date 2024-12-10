import java.util.*;

public class advancepatterns{
    public static void main(String[] args) {
        System.out.println("Let's print advance patterns");
        System.out.print("Which pattern number do you want : ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch(op){
            case 1:
            System.out.println("This is a butterfly pattern");
            System.out.print("Enter number of rows : ");
            int rows = sc.nextInt();
            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int k=1;k<=2*(rows-i)+1;k++){
                    System.out.print(" ");
                }
                for(int l=1;l<=i;l++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=rows;i>0;i--){
                for(int j=i;j>0;j--){
                    System.out.print("*");
                }
                for(int k=i;k<=rows*2-i;k++){
                    System.out.print(" ");
                }
                for(int l=i;l>0;l--){
                    System.out.print("*");
                }
                System.out.println();
            }
            break;
            case 2:
            System.out.println("This is a diamond pattern");
            System.out.print("Enter the number of rows : ");
            int rows1 = sc.nextInt();
            for(int i=1;i<=rows1;i++){
                for(int j=rows1-i;j>0;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            for(int i=1;i<=rows1;i++){
                for(int j=2;j<=i;j++){
                    System.out.print(" ");
                }
                for(int k=rows1+1-i;k>0;k--){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
    }
}