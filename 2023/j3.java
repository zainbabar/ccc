import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] days = new String[N + 1];
        for (int i = 0; i < N + 1; i++){
            days[i] = scan.nextLine();
        }

        int[] points = {0, 0, 0, 0, 0};

        for (int i = 0; i < N; i++){
            for (int j = 0; j < days[i].length(); j++){
                if (days[i].charAt(j) == 'Y'){
                    points[j]++;
                }
            }
        }

        for (int i =0;i<points.length;i++){
            System.out.println(points[i]);
        }

        for (int i=0;i<points.length;i++){
            if(points[i] == N - 1){
                System.out.println(i + 1);
            }
        }
    }
}

// worked before doesnt work now ? gg 
