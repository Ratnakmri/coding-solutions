import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		for ( int i= 0 ; i<N ; i++){
		    arr[i] = sc.nextInt();
		}
		long sum = 0;
        for (int i = 0; i < N; i += 2) { 
            if (arr[i] > 2 * K) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
        sc.close();
}
