import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] valid = {'I', 'O', 'S', 'H', 'Z', 'X', 'N'};
        j2 obj = new j2();
        if (obj.check(s, valid)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        scan.close();
    }
    public boolean check(String s, char[] valid){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < valid.length; j++){
                if (s.charAt(i) == valid[j]){
                    count++;
                }
            }
        }
        if (count == s.length()){
            return true;
        }
        else {
            return false;
        }
    }
}
