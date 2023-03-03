/*SELECT 
	LastName as emplyees_Lastname,
	FirstName as employees_Firstname
	FROM employees; */
/*
	SELECT is to scan and bring out the column that we are looking
	AS is to change the appearance of the name of the column that we had selected 
*/
SELECT * FROM customers
WHERE Country = 'Brazil' OR /*maybe AND*/ Country = 'USA'
ORDER by CustomerId DESC
LIMIT 4;
/*
	WHERE is a condition of any column that u wanted to be,
	OR and AND can be used to emphasize ur requirement too
	ORDER BY is to tell what column that u would want to sort it by. DESC would make it descending
	LIMIT is to pick how many data u wanted.
*/
	
	