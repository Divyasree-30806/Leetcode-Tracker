-- Last updated: 7/9/2026, 3:10:37 PM
# Write your MySQL query statement below
# Write your MySQL query statement below

SELECT 
    c.name as Customers
FROM
    customers as c
LEFT JOIN
    orders as o
    ON o.customerId=c.id
WHERE
    o.id is NULL