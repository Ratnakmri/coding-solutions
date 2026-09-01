select p.product_id, avg(p.price) 
from prices p
left join unitssold u
on p.product_id = u.product_id
;