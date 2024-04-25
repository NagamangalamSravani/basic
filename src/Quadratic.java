import java.util.*;
class Quadratic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();
        System.out.println("Enter c value");
        int c = sc.nextInt();
        double r1, r2;
        r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("roots are" + r1);
        System.out.println("roots are" + r2);
    }
}
