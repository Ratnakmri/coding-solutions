# Create a DataFrame from List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a solution to  **create**  a DataFrame from a 2D list called `student_data`. This 2D list contains the IDs and ages of some students.

The DataFrame should have two columns, `student_id` and `age`, and be in the same order as the original 2D list.

The result format is in the following example.

 

 **Example 1:** 

```
Input:
student_data:
[
  [1, 15],
  [2, 11],
  [3, 11],
  [4, 20]
]
Output:
+------------+-----+
| student_id | age |
+------------+-----+
| 1          | 15  |
| 2          | 11  |
| 3          | 11  |
| 4          | 20  |
+------------+-----+
Explanation:
A DataFrame was created on top of student_data, with two columns named student_id and age.

```

## Solution

**Language:** Python  
**Runtime:** 318 ms (beats 5.15%)  
**Memory:** 65.9 MB (beats 33.74%)  
**Submitted:** 2026-08-16T07:15:18.983Z  

```py
import pandas as pd

def createDataframe(student_data: list) -> pd.DataFrame:
    # Create DataFrame with required columns
    df = pd.DataFrame(student_data, columns=['student_id', 'age'])
    return df

```

---

[View on LeetCode](https://leetcode.com/problems/create-a-dataframe-from-list/)