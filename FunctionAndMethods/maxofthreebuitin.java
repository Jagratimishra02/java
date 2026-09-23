import java.util.Scanner;  
public class maxofthreebuitin {
  public static void main(String[] args) {
       
        // max for 3 input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        double a = sc.nextDouble();
        System.out.println("enter b :");
        double b = sc.nextDouble();
        System.out.println("enter c :");
        double c = sc.nextDouble();

        System.out.println(Math.max(a, Math.max(b, c)));

    }

}
