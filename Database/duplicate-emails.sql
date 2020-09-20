# Write your MySQL query statement below

select Email from (
select count(1) as count, Email from Person group by Email) as x where count > 1