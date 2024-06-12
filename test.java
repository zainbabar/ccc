import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); // -5
        int b = scan.nextInt(); // -2

        int x = Math.max(-a, -b); // = 5
        int y = Math.abs(x); // eq 5

        System.out.println(y);

    }
}