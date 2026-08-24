import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		string S = sc.next();
		sc.close();
		int[] freq = new int[26];
		for (char c : S.toCharArray()){
		    freq[c-'a']++;
		    
		}
		int maxFreq = -1;
		char answer = 'a';
		for (int i =0 ; i <26 ; i++){
		    if (freq[i]>maxFreq){
		        maxFreq= freq[i];
		        answer = (char)('a'+ i);
		    }
		}
		System.out.println(answer);

	}
}
