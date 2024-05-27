import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        HashMap<String, Integer> map = new HashMap<>();
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

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > winner){
                winner = entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == winner){
                System.out.println(entry.getKey());
            }
        }
    }
}