import java.util.Scanner;

public class ShorthandOperator {
    public static void main(String[] args) {
        int x = 10;
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        // x = x+a; --> u can write like this and
        x += a;      // --> this
        System.out.println(x);
        int b = input.nextInt();
        x = x+b;
        System.out.println(x);
        int c = input.nextInt();
        x = x+c;
        System.out.println(x);
        int d = input.nextInt();
        x = x+d;
        System.out.println(x);


    }
}
