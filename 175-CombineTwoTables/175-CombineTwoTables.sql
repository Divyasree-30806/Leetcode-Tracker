-- Last updated: 7/9/2026, 3:10:49 PM
# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT Person.firstName, Person.lastName, Address.city, Address.state
FROM Person
LEFT JOIN Address ON Person.personId=Address.personId;