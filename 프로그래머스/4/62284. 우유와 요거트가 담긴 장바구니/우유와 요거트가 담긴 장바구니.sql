-- 코드를 입력하세요
-- SELECT CART_ID
-- FROM CART_PRODUCTS
-- WHERE CART_ID IN (SELECT CART_ID FROM CART_PRODUCTS GRO)
-- GROUP BY CART_ID
-- ORDER BY 1

WITH TEMP AS(SELECT CART_ID,
     LISTAGG(NAME, ',') WITHIN GROUP (ORDER BY NAME) NAME
FROM CART_PRODUCTS
WHERE NAME IN ('Milk', 'Yogurt')
GROUP BY CART_ID)

SELECT DISTINCT T1.CART_ID 
FROM CART_PRODUCTS T1
INNER JOIN TEMP T2
ON T2.CART_ID = T1.CART_ID
WHERE T2.NAME LIKE '%Milk,Yogurt%'
ORDER BY 1