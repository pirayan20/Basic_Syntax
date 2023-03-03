/*  COUNT to determine a quantity of the field
	AVG to average the field
	SUM to sum all the data in the field
	MAX is to find the max values in the field
	MIN "              min                   "
*/

SELECT count(CustomerId) as "QRT", Country
FROM customers
GROUP BY Country
HAVING QRT > 5
ORDER BY QRT DESC

/* GROUP BY is to group any data within a condtion next to  group by*/

/* WHERE cannot use with aggregat function**
   use HAVING instead, after GROUP BY**  */



