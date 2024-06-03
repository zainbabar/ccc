import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = Math.max(-a, -b);
        System.out.println((int) Math.abs(x));
    }
}