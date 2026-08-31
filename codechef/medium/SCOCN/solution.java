import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();

        int count = 0;
        int index = -1;

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
