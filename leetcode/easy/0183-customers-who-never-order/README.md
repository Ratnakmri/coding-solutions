# Customers Who Never Order

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Customers`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
+-------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table indicates the ID and name of a customer.

```

 

Table: `Orders`

```
+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| customerId  | int  |
+-------------+------+
id is the primary key (column with unique values) for this table.
customerId is a foreign key (reference columns) of the ID from the Customers table.
Each row of this table indicates the ID of an order and the ID of the customer who ordered it.

```

 

Write a solution to find all customers who never order anything.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Customers table:
+----+-------+
| id | name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
Orders table:
+----+------------+
| id | customerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
Output: 
+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+

```

## Solution

**Language:** Python  
**Runtime:** 273 ms (beats 78.48%)  
**Memory:** 67.2 MB (beats 82.11%)  
**Submitted:** 2026-08-22T18:27:22.521Z  

```py
import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    never_ordered= customers[~customers["id"].isin(orders["customerId"])]
    result= never_ordered[["name"]].rename(columns={'name':'customers'})
    return result
```

---

[View on LeetCode](https://leetcode.com/problems/customers-who-never-order/)