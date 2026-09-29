# The World of Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers, $X$ and $Y$, find their sum, difference, product, and quotient.

**Input Format**

 Two lines containing one integer each ($X$ and $Y$, respectively).  


**Constraints**

$-100 \le X,Y \le 100$  
$Y \ne 0$


**Output Format**

 Four lines containing the sum ($X+Y$), difference ($X-Y$), product ($X \times Y$), and quotient ($X \div Y$), respectively.  
(While computing the quotient, print only the integer part.)

## Solution

**Language:** Bash  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T17:01:01.539Z  

```sh
read x 
read y 
echo $((x+y))
echo $((x-y))
echo $((x*y))
echo $((x/y))

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/bash-tutorials---the-world-of-numbers/problem)