public class returntype {

public static int prasun(){
    System.out.println("banu");
    System.err.println("nanda");
    return 5;  // do meaning hote hai is statement ke ek to return me jo likha vo function ki value //dusra hota hai khatam
}
    public static void main(String[] args) {
        System.out.println(3+ prasun());   //prasun ko call krne pr return ki value tab print hogi jab function ka use hoga ya to store krke ya  print ke through
        prasun();  //stand alone call lagai bas
    }
}
