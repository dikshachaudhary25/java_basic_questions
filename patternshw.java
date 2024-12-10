import java.util.*;
public class patternshw{
    public static void main(String[] args) {
        System.out.println("Let's print some advance patterns");
        System.out.println("We have 3 patterns");
        System.out.print("Which pattern number do you want : ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch(op){
            case 1:
            System.out.println("This is a solid rhombus");
            System.out.print("Enter the length : ");
            int len = sc.nextInt();
            System.out.print("Enter the breadth : ");
            int bd = sc.nextInt();
            System.out.print("Enter the pattern : ");
            String pattern = sc.next();
            for(int i=1;i<=len;i++){
                for(int j=bd-i;j>0;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=bd;k++){
                    System.out.print(pattern);
                }
                System.out.println();
            }
            break;
            case 2:
            System.out.println("This is a number pyramid");
            System.out.print("Enter number of rows : ");
            int rows = sc.nextInt();
            for(int i = 1;i<=rows;i++){
                for(int j=rows-i;j>=0;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            break;
            case 3:
            System.out.println("This is palindromic number pyramid");
            System.out.print("Enter number of rows : ");
            int rows1 = sc.nextInt();
            for(int i = 1;i<=rows1;i++){
                for(int j=rows1-i;j>=0;j--){
                    System.out.print(" ");
                }
                for(int k=i;k>0;k--){
                    System.out.print(k);
                }
                for(int l = 2;l<=i;l++){
                    System.out.print(l);
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("There is no pattern");
        }
    }
}