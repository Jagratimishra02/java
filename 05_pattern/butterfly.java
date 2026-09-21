import java.util.Scanner;

public class butterfly {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter n");
     int n = sc.nextInt();

     for(int i = 1 ; i <= n ; i++){
        for (int j = 1 ; j <= i ; j++){
            System.out.print("* ");
        }
        for(int j=1; j <= 2 * (n-i); j++){
            System.out.print("  ");
        }
        for(int j = 1 ; j<=i ; j++){
            System.out.print("* ");
        }
        System.out.println();
     }

     //for downword
     int a =n ;
 for(int i = 1 ; i <= n ; i++){
        for (int j = 1 ; j <= a ; j++){
            System.out.print("* ");
        }
        for(int j=1; j <= 2 * (i-1); j++){
            System.out.print("  ");
        }
        for(int j = 1 ; j<=a ; j++){
            System.out.print("* ");
        }
        a--;
        System.out.println();
     }
     
 }
    
}
