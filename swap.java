import java.util.Scanner;

class Swap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Value of A:");
        int a=sc.nextInt();

        System.out.print("Enter Value of B:");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        temp=a;

        System.out.println("Value of A is:" + a);
        System.out.println("Value of B is:" + b);


    }
}
