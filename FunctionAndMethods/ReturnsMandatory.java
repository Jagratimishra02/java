public class ReturnsMandatory {
    public static void main(String[] args) {
        System.out.println(jagrati(3));
    }
    public static int jagrati(int a){
        if(a<5){
            return a;
        }
        else{
            return 9; // return ke case me hame else likhna madatory hota hai java me //nahi to error show hoga 
        }
    }
    
}
