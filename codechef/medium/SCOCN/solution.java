import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N]
        for (int i= 0; i<N; i++{
            arr[i]=Integer.parseInt(st.nextTokenizer(br.readLine());
            
        }
        int x = Integer.parseInt(st.nextTokenizer(br.readLine());
        int count = 0;
        int index= -1;
        
        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                count++;
                if (count == 2) {
                    index = i;
                    break;
                }
            }
        }

        if (count == 0) {
            System.out.println(-1);
        } else if (count == 1) {
            System.out.println(-2);
        } else {
            System.out.println(index);
        }
        
	}
}
