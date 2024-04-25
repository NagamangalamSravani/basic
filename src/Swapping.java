import java.util.*;
class Swapping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value before swapping");
        int a = sc.nextInt();
        System.out.println("Enter b value before swapping");
        int b = sc.nextInt();
        a = a ^ b;// a=a+b; //a=a*b;
        b = a ^ b;//b=a-b; //b=a/b;
        a = a ^ b;//a=a-b;//a=a/b;
        System.out.println("after swapping" + a);
        System.out.println("after swapping" + b);
    }
}
