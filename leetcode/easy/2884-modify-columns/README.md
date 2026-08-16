# Modify Columns

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

```
DataFrame employees
+-------------+--------+
| Column Name | Type   |
+-------------+--------+
| name        | object |
| salary      | int    |
+-------------+--------+

```

A company intends to give its employees a pay rise.

Write a solution to  **modify**  the `salary` column by multiplying each salary by 2.

The result format is in the following example.

 

 **Example 1:** 

```
Input:
DataFrame employees
+---------+--------+
| name    | salary |
+---------+--------+
| Jack    | 19666  |
| Piper   | 74754  |
| Mia     | 62509  |
| Ulysses | 54866  |
+---------+--------+
Output:
+---------+--------+
| name    | salary |
+---------+--------+
| Jack    | 39332  |
| Piper   | 149508 |
| Mia     | 125018 |
| Ulysses | 109732 |
+---------+--------+
Explanation:
Every salary has been doubled.
```

## Solution

**Language:** Python  
**Runtime:** 280 ms (beats 46.19%)  
**Memory:** 66.4 MB (beats 10.82%)  
**Submitted:** 2026-08-16T11:16:29.186Z  

```py
import pandas as pd

def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees['salary']=employees['salary']*2
    return employees
```

---

[View on LeetCode](https://leetcode.com/problems/modify-columns/)