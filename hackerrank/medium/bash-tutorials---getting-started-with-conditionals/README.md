# Comparing Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Read in one character from STDIN.  
If the character is 'Y' or 'y' display "YES".  
If the character is 'N' or 'n' display "NO".  
No other character will be provided as input.    



    

**Input Format**

One character 


**Constraints**

The character will be from the set $\{yYnN\}$.

**Output Format**

echo `YES` or `NO` to STDOUT.

## Solution

**Language:** Bash  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T17:08:58.558Z  

```sh
read X
read Y

if [ "$X" -lt "$Y" ]
then
    echo "X is less than Y"
elif [ "$X" -gt "$Y" ]
then
    echo "X is greater than Y"
else
    echo "X is equal to Y"
fi

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/bash-tutorials---getting-started-with-conditionals/problem)