public class maxof {
    public static void max(int a, int b, int c){  // parameters
        if(a>=b && a>=c ) System.out.println("a is max " + a);
        else if (b>=a && b>=c)System.out.println("b is max " +b);
        else System.out.println("c is max " + c);
    }
    public static void main(String[] args){
        max(6,8,10);    // arguments
    }
}
