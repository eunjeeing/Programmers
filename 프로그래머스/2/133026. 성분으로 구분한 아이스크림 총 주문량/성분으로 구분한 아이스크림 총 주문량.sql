SELECT II.INGREDIENT_TYPE, SUM(FH.TOTAL_ORDER) TOTAL_ORDER
FROM FIRST_HALF FH
INNER JOIN ICECREAM_INFO II
ON II.FLAVOR = FH.FLAVOR
GROUP BY II.INGREDIENT_TYPE
ORDER BY 2