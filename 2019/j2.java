import java.util.ArrayList;
import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = 0;
        ArrayList<Integer> times = new ArrayList<Integer>();
        ArrayList<String> print = new ArrayList<String>();
        for (int i = 0; i < n; i++){
            times.add(scan.nextInt());
            print.add(scan.next());
            scan.nextLine();
            l++;
        }

        for (int i = 0; i < l; i++){
            for (int j = 0; j < times.get(i); j++){
                System.out.print(print.get(i));
            }
            System.out.println();
        }
        scan.close();
    }
}
