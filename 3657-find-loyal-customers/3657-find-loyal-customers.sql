# Write your MySQL query statement below
select customer_id
from customer_transactions
group by customer_id
having 
sum(transaction_type ='purchase')>= 3 
and datediff(max(transaction_date),
min(transaction_date)) >=30
and sum(transaction_type =
'refund') / count(*) < 0.20
order by customer_id;
