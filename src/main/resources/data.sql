DROP TABLE IF EXISTS CUSTOMER;

CREATE TABLE CUSTOMER (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR NOT NULL,
    LAST_NAME VARCHAR NOT NULL,
    AGE INT NOT NULL,
    DATE_BIRTH DATE NOT NULL
);

-- INSERT INTO CUSTOMER VALUES (1, 'Gustavo', 'Martinez', 32, DATE '1989-01-09');
-- INSERT INTO CUSTOMER VALUES (2,    'Juan',    'Perez', 21, DATE '2000-01-19');
-- INSERT INTO CUSTOMER VALUES (3, 'Joaquin', 'Gonzalez', 49, DATE '1972-03-09');
-- INSERT INTO CUSTOMER VALUES (4,   'Maria',    'Gomez', 12, DATE '2009-02-21');
-- INSERT INTO CUSTOMER VALUES (5,    'Jose',    'Lopez', 70, DATE '1951-01-29');
