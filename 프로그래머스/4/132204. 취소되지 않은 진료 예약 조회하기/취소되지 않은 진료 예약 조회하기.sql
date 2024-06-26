SELECT A.APNT_NO, P.PT_NAME, P.PT_NO, D.MCDP_CD, D.DR_NAME, A.APNT_YMD
FROM APPOINTMENT A
INNER JOIN PATIENT P
ON P.PT_NO = A.PT_NO
INNER JOIN DOCTOR D
ON D.DR_ID = A.MDDR_ID
WHERE A.APNT_CNCL_YN = 'N' 
        AND TO_CHAR(A.APNT_YMD, 'YYYYMMDD') = '20220413' 
        AND D.MCDP_CD = 'CS'
ORDER BY 6