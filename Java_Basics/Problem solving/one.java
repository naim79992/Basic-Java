import java.util.Scanner;

public class one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[2 * n]; 
            int even = 0, odd = 0;

            for (int i = 0; i < 2 * n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) even++;
                else odd++;
            }
            if (even == n && odd == n) {
                System.out.println("Yes");
            } 
            else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
