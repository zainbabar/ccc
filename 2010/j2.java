import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int s = scan.nextInt();
        int nikky = 0;
        int byron = 0;
        int nikkyTotal = 0;
        int byronTotal = 0;

        while (nikkyTotal <= s){
            nikky += a - b;
            nikkyTotal += a + b;
        }

        while (byronTotal <= s){
            byron += c - d;
            byronTotal += c + d;
        }

        if (s < a || s < c){
            byron = nikky;
        }
        
        if (byron > nikky){
            System.out.println("Byron");
        } 
        else if (byron < nikky){
            System.out.println("Nikky");
        }
        else {
            System.out.println("Tied");
        }
        scan.close();
    }
}
