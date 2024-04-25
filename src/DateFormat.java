import java.util.*;
class DateFormat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a value ");
        String str = "22/01/2002";
        System.out.println(str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}
