import java.util.*;
import java.lang.*;
import java.io.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next().toLowerCase();  

        int[] freq = new int[26];
        for (char c : S.toCharArray()) {
            if (c >= 'a' && c <= 'z') {      
                freq[c - 'a']++;
            }
        }

        int maxFreq = -1;
        char answer = 'a';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                answer = (char) ('a' + i);
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
