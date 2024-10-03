CREATE DATABASE Trabalho;
USE Trabalho;

CREATE TABLE Colaborador (
id_emp INT NOT NULL PRIMARY KEY CONSTRAINT ID_val CHECK (id_emp BETWEEN 0 AND 1000),
nome VARCHAR(30) NOT NULL,
salario FLOAT NOT NULL CONSTRAINT SL_val CHECK (salario >= 1000));

INSERT INTO Colaborador VALUES
(900, 'Josué',1500.56);

INSERT INTO Colaborador (id_emp, nome, salario) VALUES
(300,"Maria", 3500.56);

INSERT INTO Colaborador VALUES
(400, 'Antônio', 1900.56);

SELECT * FROM Colaborador;