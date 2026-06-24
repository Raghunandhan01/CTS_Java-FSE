DECLARE
    CURSOR c IS SELECT CustomerID, Age, LoanInterestRate FROM Customers;
BEGIN
    FOR rec IN c LOOP
        IF rec.Age > 60 THEN
            UPDATE Customers
            SET LoanInterestRate = LoanInterestRate - 1
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
END;
/

DECLARE
    CURSOR c IS SELECT CustomerID, Balance FROM Customers;
BEGIN
    FOR rec IN c LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
END;
/

DECLARE
    CURSOR c IS
    SELECT CustomerID, LoanID
    FROM Loans
    WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR rec IN c LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder sent to Customer ' || rec.CustomerID);
    END LOOP;
END;
/
