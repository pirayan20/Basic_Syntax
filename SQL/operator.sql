/*  NOT has to be after WHERE 
	IN is to talk about more than one object in the fields ("like a set")
*/
	
/* LIKE is to search for an alphabet in the fields that you had SELECT, % stands for any alphabet */
	
SELECT * FROM customers
WHERE 
	CustomerId BETWEEN 1 AND 30
	AND NOT Country in ("Czech Republic","Brazil")
	AND State IS NULL



 