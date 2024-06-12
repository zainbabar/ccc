import java.util.Arrays;
import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 4;
        int[][] nums = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                nums[i][j] = scan.nextInt();
            }
            scan.nextLine();
        }

        int[] rows = new int[n];
        int[] columns = new int[n];
            
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = 0; j < n; j++){
                sum += nums[i][j];
            }
            rows[i] = sum;
        }

        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = 0; j < n; j++){
                sum += nums[j][i];
            }
            columns[i] = sum;
        }

        boolean end = false;

        for (int i = 0; i < n; i++){
            if (rows[i] != rows[0] || columns[i] != columns[0]){
                System.out.println("not magic");
                end = true;
                break;
            }
        }

        if (end == false){
            if (Arrays.equals(columns, rows)){
                System.out.println("magic");
            }
        }

    scan.close();
    }    
}
