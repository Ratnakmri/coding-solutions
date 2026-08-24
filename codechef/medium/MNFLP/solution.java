import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sc.close();

        if (sum == 0) {
            System.out.println(0);
            return;
        }
        if (Math.abs(sum) % 2 == 1) {
            System.out.println(-1);
            return;
        }
        int target = Math.abs(sum) / 2;
        int INF = n + 1;
        int[] dp = new int[target + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int x : arr) {
            for (int j = target; j >= x; j--) {
                if (dp[j - x] != INF) {
                    dp[j] = Math.min(dp[j], dp[j - x] + 1);
                }
            }
        }
        if (dp[target] == INF) {
            System.out.println(-1);
        } else {
            System.out.println(dp[target]);
        }
    }
}
