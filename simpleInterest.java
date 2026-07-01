import java.util.Scanner;

public class simpleInterest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();

       float simpleInterest  = (P*T*R)/100;
       System.out.println("The simple interest is "+ simpleInterest);
    }
}
