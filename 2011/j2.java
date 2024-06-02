import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int t = 1;
        while (true){
            double a = -6 * Math.pow(t, 4) + h * Math.pow(t, 3) + 2 * Math.pow(t, 2) + t;
            if (t > m){
                System.out.println("The balloon does not touch ground in the given time.");
                break;
            }
            else if (a <= 0){
                System.out.println("The balloon first touches ground at hour:");
                System.out.println(t);
                break;
            }
            else {
                t++;
            }
        }
        scan.close();
    }
}
