import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int happy = 0;
        int sad = 0;

        for (int i = 0; i < s. length() - 2; i++){
            if (s.substring(i, i + 3).equals(":-)")){
                happy++;
            }
            if (s.substring(i, i + 3).equals(":-(")){
                sad++;
            }
        }

        if (happy > sad){
            System.out.println("happy");
        }
        else if (sad > happy){
            System.out.println("sad");
        }
        else if (sad == happy && sad > 0) {
            System.out.println("unsure");
        }
        else {
            System.out.println("none");
        }
        scan.close();
    }    
}
