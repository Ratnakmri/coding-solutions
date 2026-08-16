# Drop Missing Data

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

There are some rows having missing values in the `name` column.

Write a solution to remove the rows with missing values.

The result format is in the following example.

 

 **Example 1:** 

```
Input:
+------------+---------+-----+
| student_id | name    | age |
+------------+---------+-----+
| 32         | Piper   | 5   |
| 217        | None    | 19  |
| 779        | Georgia | 20  |
| 849        | Willow  | 14  |
+------------+---------+-----+
Output:
+------------+---------+-----+
| student_id | name    | age |
+------------+---------+-----+
| 32         | Piper   | 5   |
| 779        | Georgia | 20  | 
| 849        | Willow  | 14  | 
+------------+---------+-----+
Explanation: 
Student with id 217 havs empty value in the name column, so it will be removed.
```

## Solution

**Language:** Python  
**Runtime:** 238 ms  
**Memory:** 66.1 MB  
**Submitted:** 2026-08-16T11:12:51.657Z  

```py
import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    students=students.replace("null",pd.NA)
    return students.dropna(subset=["student_id","name"])
```

---

[View on LeetCode](https://leetcode.com/problems/drop-missing-data/)