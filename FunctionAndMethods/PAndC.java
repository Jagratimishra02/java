import java.util.Scanner;

public class PAndC {

       public static int fact(int a){
            int f =1;
            for(int i =1; i<=a; i++){
                f *=i;
            }
            return f ;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        System.out.println("enter r : ");
        int r = sc.nextInt();
        
        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(n-r);

        System.out.println(ncr + " " + npr);
     
    }
    
}
