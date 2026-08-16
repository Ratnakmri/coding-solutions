# Select Data

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

```
DataFrame students
+-------------+--------+
| Column Name | Type   |
+-------------+--------+
| student_id  | int    |
| name        | object |
| age         | int    |
+-------------+--------+

```

Write a solution to select the name and age of the student with `student_id = 101`.

The result format is in the following example.

 

```
Example 1:
Input:
+------------+---------+-----+
| student_id | name    | age |
+------------+---------+-----+
| 101        | Ulysses | 13  |
| 53         | William | 10  |
| 128        | Henry   | 6   |
| 3          | Henry   | 11  |
+------------+---------+-----+
Output:
+---------+-----+
| name    | age | 
+---------+-----+
| Ulysses | 13  |
+---------+-----+
Explanation:
Student Ulysses has student_id = 101, we select the name and age.
```

## Solution

**Language:** Python  
**Runtime:** 365 ms (beats 5.00%)  
**Memory:** 67.2 MB (beats 14.91%)  
**Submitted:** 2026-08-16T11:18:06.536Z  

```py
import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    return students.loc[students['student_id']==101,['name','age']]
    
```

---

[View on LeetCode](https://leetcode.com/problems/select-data/)