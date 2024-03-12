SELECT HD.DEPT_ID, DEPT_NAME_EN, ROUND(AVG(HE.SAL), 0) AVG_SAL
FROM HR_DEPARTMENT HD
INNER JOIN HR_EMPLOYEES HE
ON HE.DEPT_ID = HD.DEPT_ID
GROUP BY HD.DEPT_ID
ORDER BY 3 DESC