# Comparing Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers, $X$ and $Y$, identify whether $X \lt Y$ or $X \gt Y$ or $X = Y$.   


Exactly one of the following lines:   
- _X is less than Y_   
- _X is greater than Y_   
- _X is equal to Y_ 

**Input Format**

Two lines containing one integer each ($X$ and $Y$, respectively).  


**Constraints**

-

**Output Format**

Exactly one of the following lines:   
- _X is less than Y_   
- _X is greater than Y_   
- _X is equal to Y_

## Solution

**Language:** Bash  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T17:08:55.263Z  

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

[View on HackerRank](https://www.hackerrank.com/challenges/bash-tutorials---comparing-numbers/problem)