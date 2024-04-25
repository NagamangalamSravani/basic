import java.util.*;
class Binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a value ");
        int b = 10110001;
        String str = b + "";
        System.out.println(str.matches("[01]*"));
    }
}

