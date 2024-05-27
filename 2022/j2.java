import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int n = scan.nextInt();
        scan.nextLine();
        String name;
        int bid;

        for (int i = 0; i < n; i++){
            name = scan.nextLine();
            bid = scan.nextInt();
            scan.nextLine();
            map.put(name, bid);
        }

        int winner = 0;
        String winnerName = " ";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > winner){
                winner = entry.getValue();
                winnerName = entry.getKey();
            }
        }
        System.out.println(winnerName);
    }
}
