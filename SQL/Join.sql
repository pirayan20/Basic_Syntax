SELECT employees.EmployeeId,employees.FirstName,employees.LastName,employees.Title,
employees2.FirstName AS "Supervisor FirstName" , employees2.LastName AS "Supervisor LastName"
FROM employees
LEFT JOIN employees as employees2
ON employees.ReportsTo = employees2.EmployeeId;

/*  
INNER JOIN = intersect data of two table 
LEFT JOIN = all of the information of the first table will be included with the INTERSECTs
RIGHT JOIN = all of the information of the seconde table (that we join) will be included with the INTERSECT
OUTER JOIN = all of the information will be joined
/*
