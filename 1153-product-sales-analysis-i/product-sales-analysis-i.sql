# Write your MySQL query statement below
SELECT product_name, year, price FROM Sales AS s LEFT JOIN Product AS p ON s.product_id = p.product_id;
