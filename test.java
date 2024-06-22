import java.util.Scanner;
public class test {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.nextLine();
    String[] words = new String[n];
    for (int i = 0; i < n; i++){
      words[i] = scan.nextLine();
    }
    for (int i = 0; i < n; i++){
      if (words[i].length() > 10){
        System.out.print(words[i].charAt(0));
        System.out.print(words[i].length() - 2);
        System.out.println(words[i].charAt(words[i].length() - 1));
      }
      else {
        System.out.println(words[i]);
      }
    }
  }
}