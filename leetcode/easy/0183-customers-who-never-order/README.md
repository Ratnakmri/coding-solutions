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

**Language:** SQL  
**Runtime:** 636 ms (beats 41.74%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-08-21T18:41:29.552Z  

```sql
# Write your MySQL query statement below
select c.name as Customers 
from customers as c
left join orders as o
on c.id=o.customerid
where o.id is null;
```

---

[View on LeetCode](https://leetcode.com/problems/customers-who-never-order/)