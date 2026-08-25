# Arrays - DS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

An *array* is a data structure that stores elements of the same type in a contiguous block of memory. In an array, $A$, of size $N$, each memory location has some unique index, $i$ (where $0 \le i \lt N$), that can be referenced as $A[i]$ or $A_i$.
    
Your task is to reverse an array of integers.   

**Note:** If you've already solved our C++ domain's *Arrays Introduction* challenge, you may want to skip this.

**Example**  
$A = [1, 2, 3]$  

Return $[3, 2, 1]$.  

**Function Description**  

Complete the function $reverseArray$ with the following parameter(s):  

- $int\ A[n]$: the array to reverse  

**Returns**  

- $int[n]$: the reversed array

**Input Format**

The first line contains an integer, $N$, the number of integers in $A$. 	
The second line contains $N$ space-separated integers that make up $A$.

**Constraints**

- $1 \le N \le 10^3$
- $1 \le A[i] \le 10^4 \text{, where } A[i] \text{ is the } i^{th} \text{ integer in } A$



**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T18:22:26.610Z  

```java
import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n ; i++){
            arr[i] =sc.nextInt();
        }
        sc.close();
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/arrays-ds/problem)