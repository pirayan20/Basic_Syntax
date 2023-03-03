SELECT InvoiceId,total,
CASE
	WHEN total >10 THEN "Legendary"
	WHEN total BETWEEN 5 AND 10 THEN "Epic"
	ELSE "Common"
END AS RANK
FROM invoices
ORDER BY total DESC;