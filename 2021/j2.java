import java.util.Scanner;
public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        int n = scan.nextInt();
        scan.nextLine();
        String name;
        int bid;
        int maxBid = 0;
        String winner = "";

        for (int i = 0; i < n; i++){
            name = scan.nextLine();
            bid = scan.nextInt();
            scan.nextLine();
            if (bid > maxBid){
                maxBid = bid;
                winner = name;
            }
        }
        System.out.println(winner);
        scan.close();
    }
}
