import java.util.Scanner;
public class Circle {
    public static void main(String []args){
        int radius;
        double circumference,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rasius of the Circle:");
        radius = sc.nextInt();
        circumference = Math.PI * 2 * radius;
        area = Math.PI * radius * radius;
        System.out.println("Circumference of the circle is:"+circumference);
        System.out.println("Area of the circle is:"+area);
    }
}
