import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] depths = new int[4];
        for (int i = 0; i < 4; i++){
            depths[i] = scan.nextInt();
        }

        int rising = 0;
        int diving = 0;
        int equal = 0;

        for (int i = 0; i < 3; i++){
            if (depths[i] < depths[i + 1]){
                rising++;
            }
            else if (depths[i] > depths[i + 1]){
                diving++;
            }
            else if (depths[i] == depths[i + 1]){
                equal++;
            }
        }

        if (rising == 3){
            System.out.println("Fish Rising");
        }
        else if (diving == 3){
            System.out.println("Fish Diving");
        }
        else if (equal == 3){
            System.out.println("Fish At Constant Depth");
        }
        else {
            System.out.println("No Fish");
        }
        scan.close();
    }
}
