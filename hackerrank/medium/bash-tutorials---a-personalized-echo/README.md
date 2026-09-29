# Looping and Skipping

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a Bash script which accepts $name$ as input and displays the greeting
"Welcome (name)"

**Input Format**

There is one line of text, $name$.  

**Constraints**

 

**Output Format**

One line: "Welcome (name)" (quotation marks excluded).  
The evaluation will be case-sensitive.

**Sample Input 0**  

    Dan  
    
**Sample Output 0**  

    Welcome Dan  
    
**Sample Input 1**  

    Prashant

**Sample Output 1**  

    Welcome Prashant

## Solution

**Language:** Bash  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T16:49:05.921Z  

```sh
for i in $(seq 1 2 100); do
  echo $i
done

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/bash-tutorials---a-personalized-echo/problem)