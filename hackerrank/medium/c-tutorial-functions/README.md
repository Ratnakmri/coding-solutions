# For Loop

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Functions are a bunch of statements glued together. A function is provided with zero or more arguments, and it executes the statements on it. Based on the return type, it either returns nothing (void) or something.  
<br>
The syntax for a function is

	return_type function_name(arg_type_1 arg_1, arg_type_2 arg_2, ...) {
    	...
        ...
        ...
        [if return_type is non void]
        	return something of type `return_type`;
    }
    
For example, a function to return the sum of four parameters can be written as

	int sum_of_four(int a, int b, int c, int d) {
    	int sum = 0;
        sum += a;
        sum += b;
        sum += c;
        sum += d;
        return sum;
    }

---
Write a function _int max\_of\_four(int a, int b, int c, int d)_ which returns the maximum of the four arguments it receives.  

	+= : Add and assignment operator. It adds the right operand to the left operand and assigns the result to the left operand.
    a += b is equivalent to a = a + b;


**Input Format**

Input will contain four integers - $a, b, c, d$ , one per line.

**Constraints**

 

**Output Format**

Return the greatest of the four integers.
<br>
*PS:* I/O will be automatically handled.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T17:08:55.473Z  

```cpp
#include <iostream>
#include <string>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;

    string words[] = {"one","two","three","four","five","six","seven","eight","nine"};

    for (int i = a; i <= b; i++) {
        if (i >= 1 && i <= 9) {
            cout << words[i-1] << endl;
        } else {
            if (i % 2 == 0) {
                cout << "even" << endl;
            } else {
                cout << "odd" << endl;
            }
        }
    }
    return 0;
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/c-tutorial-functions/problem)