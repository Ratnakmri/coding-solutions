import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		if(Math.abs(X-Y)<=K){
		    System.out.print("YES");
		}else{
		    System.out.println("NO")
		}
	}
}
