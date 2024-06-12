import java.util.Scanner;

public class HatCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of people
        int N = scanner.nextInt();
        
        // Read the hat numbers
        int[] hats = new int[N];
        for (int i = 0; i < N; i++) {
            hats[i] = scanner.nextInt();
        }
        
        // Count the number of people who see their hat number on the person directly across from them
        int count = 0;
        for (int i = 0; i < N; i++) {
            // the person on the opposite side is n / 2 spaces, half way around the circle away
            // the mod N responsible for looping around if it goes over
            // very easy s1
            int oppositeIndex = (i + N / 2) % N;
            if (hats[i] == hats[oppositeIndex]) {
                count++;
            }
        }
        
        // Output the result
        System.out.println(count);
        
        scanner.close();
    }
}
