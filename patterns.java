import java.util.*;
public class patterns{
    public static void main(String[] args) {
        System.out.println("Let's print some patterns");
        System.out.println("We have 9 patterns");
        System.out.print("Which one do you want : ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        int number =1;
        switch(option){
            case 1:
            System.out.println("This is a solid rectangle");
            System.out.print("Enter the length : ");
            int len = sc.nextInt();
            System.out.print("Enter the breadth : ");
            int bd = sc.nextInt();
            System.out.print("Enter the design : ");
            String pattern = sc.next();
            for(int i = 1; i<=len;i++){
                for(int j=1;j<=bd;j++){
                    System.out.print(pattern);
                }
                System.out.println();
            }
            break;
            case 2:
            System.out.println("This is a hollow rectangle");
            System.out.print("Enter the length : ");
            int len1 = sc.nextInt();
            System.out.print("Enter the breadth : ");
            int bd1 = sc.nextInt();
            System.out.print("Enter the design : ");
            String pattern1 = sc.next();
            for(int i = 1; i<=len1;i++){
                for(int j=1;j<=bd1;j++){
                    if(i==1 || i==len1){
                        System.out.print(pattern1);
                    }
                    else if(i>=1 && i<=len1-1){
                        System.out.print(pattern1);
                        for(int k = 1; k < bd1-1; k++){
                            System.out.print(" ");
                        }
                        System.out.print(pattern1);
                        break;
                    }
                }
                System.out.println();
            }
            break;
            case 3:
            System.out.println("This is a half pyramid");
            System.out.print("Enter the number of rows : ");
            int rows = sc.nextInt();
            System.out.print("Enter the pattern : ");
            String pattern2 = sc.next();
            for(int i = 1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(pattern2);
                }
                System.out.println();
            }
            break;
            case 4:
            System.out.println("This is a inverted half pyramid");
            System.out.print("Enter the number of rows : ");
            int rows1 = sc.nextInt();
            System.out.print("Enter the pattern : ");
            String pattern3 = sc.next();
            for(int i = rows1;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(pattern3);
                }
                System.out.println();
            }
            break;
            case 5:
            System.out.println("This is a inverted and rotated half pyramid");
            System.out.print("Enter the number of rows : ");
            int rows2 = sc.nextInt();
            System.out.print("Enter the pattern : ");
            String pattern4 = sc.next();
            for(int i = 1;i<=rows2;i++){
                for(int j=rows2;j>i;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print(pattern4);
                }
                System.out.println();
            }
            break;
            case 6:
            System.out.println("This is a half pyramid with numbers");
            System.out.print("Enter the number of rows : ");
            int rows3 = sc.nextInt();
            for(int i = 1;i<=rows3;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            break;
            case 7:
            System.out.println("This is a inverted half pyramid with numbers");
            System.out.print("Enter the number of rows : ");
            int rows4 = sc.nextInt();
            for(int i = rows4;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            break;
            case 8:
            System.out.println("This is a floyd's triangle");
            System.out.print("Enter the number of rows : ");
            int rows5 = sc.nextInt();
            for(int i = 1;i<=rows5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(number);
                    number++;
                }
                System.out.println();
            }
            break;
            case 9:
            System.out.println("This is a floyd's triangle");
            System.out.print("Enter the number of rows : ");
            int rows6 = sc.nextInt();
            for(int i = 1;i<=rows6;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("There is no pattern");
        }
    }
}