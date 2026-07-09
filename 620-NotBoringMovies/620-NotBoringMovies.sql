-- Last updated: 7/9/2026, 3:09:05 PM
# Write your MySQL query statement below

select * from Cinema
 where id % 2 = 1 and description != 'boring'
 order by rating desc