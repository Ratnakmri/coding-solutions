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

        // Example: reading integers
        int X = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        long total = (long)X * A + (long)Y * B;

        if (total >= D) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
	}
}

