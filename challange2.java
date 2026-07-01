import java.util.Scanner;

public class challange2 {
    static void main() {
        System.out.println("please enter all four sides of rectangle in cm");
     Scanner sc = new Scanner(System.in);
     double a = sc.nextDouble();
     double b = sc.nextDouble();
     double c = sc.nextDouble();
     double d = sc.nextDouble();

        System.out.println("perimeter of rectangle is:" + (a+b+c+b));

    }
}
