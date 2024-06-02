import java.util.Arrays;
import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] nums = new int[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                nums[i][j] = scan.nextInt();
            }
            scan.nextLine();
        }

        int[] rows = new int[4];
        int[] columns = new int[4];
            
        for (int i = 0; i < 4; i++){
            int sum = 0;
            for (int j = 0; j < 4; j++){
                sum += nums[i][j];
            }
            rows[i] = sum;
        }
        for (int i = 0; i < 4; i++){
            int sum = 0;
            for (int j = 0; j < 4; j++){
                sum += nums[j][i];
            }
            columns[i] = sum;
        }

        boolean end = false;

        for (int i = 0; i < 4; i++){
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
