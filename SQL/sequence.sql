SELECT AlbumId, sum(Milliseconds)/60000 as SUM_Minutes
FROM tracks
GROUP BY AlbumId
HAVING SUM_Minutes <= 40
ORDER BY SUM_Minutes DESC
LIMIT 10
