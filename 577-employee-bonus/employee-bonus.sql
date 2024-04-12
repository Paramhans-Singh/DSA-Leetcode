# Write your MySQL query statement below
SELECT name, bonus FROM Employee AS e LEFT JOIN Bonus As b ON e.empId = b.empId
HAVING (bonus < 1000 OR bonus IS NULL)