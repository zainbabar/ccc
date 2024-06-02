import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        String y = scan.next();
        String t = scan.next();
        for (int i = 0; i < n; i++){
            if (y.charAt(i) == t.charAt(i) && y.charAt(i) == 'C'){
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}
