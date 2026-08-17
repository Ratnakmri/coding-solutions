# Reshape Data: Concatenate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

```
DataFrame df1
+-------------+--------+
| Column Name | Type   |
+-------------+--------+
| student_id  | int    |
| name        | object |
| age         | int    |
+-------------+--------+

DataFrame df2
+-------------+--------+
| Column Name | Type   |
+-------------+--------+
| student_id  | int    |
| name        | object |
| age         | int    |
+-------------+--------+

```

Write a solution to concatenate these two DataFrames  **vertically**  into one DataFrame.

The result format is in the following example.

 

 **Example 1:** 

```
Input:
df1
+------------+---------+-----+
| student_id | name    | age |
+------------+---------+-----+
| 1          | Mason   | 8   |
| 2          | Ava     | 6   |
| 3          | Taylor  | 15  |
| 4          | Georgia | 17  |
+------------+---------+-----+
df2
+------------+------+-----+
| student_id | name | age |
+------------+------+-----+
| 5          | Leo  | 7   |
| 6          | Alex | 7   |
+------------+------+-----+
Output:
+------------+---------+-----+
| student_id | name    | age |
+------------+---------+-----+
| 1          | Mason   | 8   |
| 2          | Ava     | 6   |
| 3          | Taylor  | 15  |
| 4          | Georgia | 17  |
| 5          | Leo     | 7   |
| 6          | Alex    | 7   |
+------------+---------+-----+
Explanation:
The two DataFramess are stacked vertically, and their rows are combined.
```

## Solution

**Language:** Python  
**Runtime:** 306 ms (beats 47.41%)  
**Memory:** 66.2 MB (beats 98.53%)  
**Submitted:** 2026-08-17T15:29:25.209Z  

```py
import pandas as pd

def concatenateTables(df1: pd.DataFrame, df2: pd.DataFrame) -> pd.DataFrame:
    return pd.concat([df1,df2])
```

---

[View on LeetCode](https://leetcode.com/problems/reshape-data-concatenate/)