# Write your MySQL query statement below
select v.customer_id,count(v.visit_id) as count_no_trans
from visits as v
LEFT JOIN Transactions t
  ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;