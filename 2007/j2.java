import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> words = new ArrayList<>();
        map.put("CU", "see you");
        map.put(":-)", "I'm happy");
        map.put(":-(", "I'm unhappy");
        map.put(";-)", "wink");
        map.put(":-P", "stick out my tongue");
        map.put("(~.~)", "sleepy");
        map.put("TA", "totally awesome");
        map.put("CCC", "Canadian Computing Competition");
        map.put("CUZ", "because");
        map.put("TY", "thank-you");
        map.put("YW", "you're welcome");
        map.put("TTYL", "talk to you later");

        String text;

        do {
            text = scan.nextLine();
            words.add(text);
        } while (text.equals("TTYL") == false);

        for (int i = 0; i < words.size(); i++){
            if (map.containsKey(words.get(i))){
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (words.get(i).equals(entry.getKey())){
                        System.out.println(entry.getValue());
                    }
                }
            }
            else {
                    System.out.println(words.get(i));
            }
        }
        scan.close();
    }
}