import java.util.Scanner;
public class ProgrammingC9 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("Welcome to Our Calculator !!!");
        System.out.println("Please enter first number : ");
        int firstNum = input.nextInt();
        System.out.println("Now, Please enter second number : ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("The sum of Given Number is : " + sum);

    }
}
