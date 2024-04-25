import java.util.*;
class AreaOfTriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        double a=sc.nextDouble();
        System.out.println("Enter b value");
        double b=sc.nextDouble();
        System.out.println("Enter c value");
        double c=sc.nextDouble();
        float s;
        double area;
        s=(float)(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area of triangle"+ area);

    }
}
