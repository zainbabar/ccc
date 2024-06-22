import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int len=5;
        scan.nextLine();
        String[] days= new String[n];
        int[] ans=new int[len];
        for(int i=0;i<n;i++){
            days[i]=scan.nextLine();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<len;j++){
                if(days[i].charAt(j)=='Y'){
                    ans[j]++;
                }
            }
        }
        int max=0;
        for(int i=0;i<len;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        boolean f=true;
        for(int i=0;i<len;i++){
            if(ans[i]==max){
                if(f){
                    f=false;
                    System.out.print(i+1);
                }
                else{
                    System.out.print("," + (i+1));
                }
            }
        }
    }
}

