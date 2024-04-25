import java.util.*;
class cuboid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter breadth");
        int breadth = sc.nextInt();
        System.out.println("Enter height");
        int height = sc.nextInt();
        int totalArea = 2 * (length * breadth + length * height + breadth * height);
        int volume = length * breadth * height;
        System.out.println("area of" + totalArea);
        System.out.println("volume of cuboid is" + volume);
    }
}