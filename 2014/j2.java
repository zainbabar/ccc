import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int a = 0;
        int b = 0;
        String votes = scan.next();
        for (int i = 0; i < v; i++){
            if (votes.charAt(i) == 'A'){
                a++;
            } 
            else {
                b++;
            }
        }
        if (a > b){
            System.out.println("A");
        }
        else if (a < b){
            System.out.println("B");
        }
        else {
            System.out.println("Tie");
        }
        scan.close();
    }
}    
