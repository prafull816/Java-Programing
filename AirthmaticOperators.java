import java.util.Scanner;

public class AirthmaticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Take input from user 

        System.out.println("Enter First No. : ");
        int a = input.nextInt();
        System.out.println("Enter Second No. : ");
        int b = input.nextInt();
        
        // input given in program

        // int a = 10;
        // int b = 3;

        int Add = a+b;
        int Sub = a-b;
        int Mul = a*b;
        int Div = a/b;
        int Mod= a%b;
        System.out.println("Addition : " + Add);
        System.out.println("Subtraction : " + Sub);
        System.out.println("Multiplication : " + Mul);
        System.out.println("Division : " + Div);
        System.out.println("Modulus : " + Mod);
    }
}
