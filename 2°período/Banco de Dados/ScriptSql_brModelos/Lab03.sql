CREATE DATABASE lab03;

USE lab03;

CREATE TABLE `departamento` (
`ID_depto` int NOT NULL AUTO_INCREMENT,
`sigla` varchar(5) NOT NULL,
`nome` varchar(50) NOT NULL,
PRIMARY KEY (`ID_depto`)
);

LOCK TABLES `departamento` WRITE;
INSERT INTO `departamento` VALUES (100,'RH','Recursos
Humanos'),(101,'CTB','Contabilidade'),(102,'VND','Vendas'),(103,'ETQ','Est
oque'),(104,'ATM','Atendimento'),(105,'CNG','Carteira de Negócios');
UNLOCK TABLES;

CREATE TABLE `empregado` (
`ID_emp` int NOT NULL AUTO_INCREMENT,
`nome` varchar(50) NOT NULL,
`dt_nascimento` date NOT NULL,
`ID_depto` int NOT NULL,
`Salario` float DEFAULT NULL,
PRIMARY KEY (`ID_emp`),
KEY `FK_Empregado_Departamento` (`ID_depto`),
CONSTRAINT `FK_Empregado_Departamento` FOREIGN KEY (`ID_depto`)
REFERENCES `departamento` (`ID_depto`)
);

LOCK TABLES `empregado` WRITE;
INSERT INTO `empregado` VALUES (1000,'José da Silva','2000-12-20',100,2000),(1001,'Maria das Flores',
'1995-05-14',101,2500),(1002,'Antônio Lopes','1998-04-18',101,1500),(1003,'Catarina
Santos','2002-08-05',102,1500),(1004,'Olívia Andrade','1993-07-19',102,2200),(1005,'Arthur Coimbra','1980-10-06',103,2900),(1006,'Jonas
Alves','1990-12-13',103,2080),(1007,'Amélia Silveira','1980-05-06',100,3005);
UNLOCK TABLES;

CREATE TABLE `skill` (
`ID_skill` int NOT NULL AUTO_INCREMENT,
`nome` varchar(50) NOT NULL,
`descricao` text NOT NULL,
PRIMARY KEY (`ID_skill`)
); 

LOCK TABLES `skill` WRITE;
INSERT INTO `skill` VALUES (1,'MS Word','Conhece o ambiente do editor de
texto e sabe criar, salvar e modificar documentos.'),(2,'MS
Excel','Conhece o ambiente da planilha eletrônica e sabe criar, salvar e
modificar documentos.'),(3,'MS Power Point','Conhece o ambiente do editor
de apresentações e sabe criar, salvar e modificar
documentos.'),(4,'Pytho','Conhece linguagem de programação Python e sabe
criar, salvar e modificar programas na linguagem.'),(5,'Java','Conhece
linguagem de programação Java e sabe criar, salvar e modificar programas
na linguagem.'),(6,'HTML','Conhece linguagem de marcação HTML e sabe
criar, salvar e modificar documentos HTML.');
UNLOCK TABLES;

CREATE TABLE `empskill` (
`ID_emp` int NOT NULL,
`ID_skill` int NOT NULL,
`nivel` varchar(20) NOT NULL,
PRIMARY KEY (`ID_emp`,`ID_skill`),
KEY `FK_EmpSkill_Skill` (`ID_skill`),
CONSTRAINT `FK_EmpSkill_Empregado` FOREIGN KEY (`ID_emp`) REFERENCES
`empregado` (`ID_emp`),
CONSTRAINT `FK_EmpSkill_Skill` FOREIGN KEY (`ID_skill`) REFERENCES
`skill` (`ID_skill`)
);

LOCK TABLES `empskill` WRITE;
INSERT INTO `empskill` VALUES
(1000,1,'Básico'),(1000,2,'Intermediário'),(1000,3,'Básico'),(1002,4,'Avan
çado'),(1002,5,'Básico'),(1004,4,'Intermediário'),(1004,5,'Básico');
UNLOCK TABLES;

SELECT
nome, 
dt_nascimento, 
DATE_FORMAT(dt_nascimento, '%d/%d/%Y') AS 'Aniversário', 
(
YEAR(NOW()) - YEAR(dt_nascimento) - 
CASE
WHEN (MONTH(NOW()) * 100 + DAY(NOW())) > (MONTH(dt_nascimento) * 100 + DAY(dt_nascimento))
THEN 0 
ELSE 1 
END
) AS Idade 
FROM Empregado;

SELECT *
FROM Empregado AS E, Departamento AS D -- PRODUTO CARTESIANO
WHERE E.ID_depto = D.ID_depto -- Condição para retorno
ORDER BY E.nome;
SELECT *
FROM Empregado AS E INNER JOIN Departamento AS D -- JOIN ou INNER JOIN
ON (E.ID_depto = D.ID_depto) -- Condição para retorno
ORDER BY E.nome;

SELECT E.nome AS Empregado, ES.nivel, S.nome
FROM Empregado AS E, EmpSkill AS ES, Skill AS S -- PRODUTO CARTESIANO
WHERE E.ID_emp = ES.ID_emp AND -- Condição para retorno
S.ID_skill = ES.ID_skill
ORDER BY S.nome, E.nome;

SELECT E.nome AS Empregado, ES.nivel, S.nome -- JOIN
FROM
( -- Primeiro, faz JOIN entre as tabelas Empregado e EmpSkill
Empregado AS E INNER JOIN EmpSkill AS ES ON (E.ID_emp = ES.ID_emp)
-- Depois, associa o resultado anterior com a tabela Skill
) INNER JOIN Skill AS S ON (S.ID_skill = ES.ID_skill)
ORDER BY S.nome, E.nome;

SELECT E.nome AS Empregado, ES.nivel, S.nome
FROM
( -- Primeiro, associa (LEFT OUTER JOIN) Empregado e EmpSkill
Empregado AS E LEFT OUTER JOIN EmpSkill AS ES ON (E.ID_emp = ES.ID_emp)
-- Depois, associa (LEFT OUTER JOIN) o resultado com Skill
) LEFT OUTER JOIN Skill AS S ON (S.ID_skill = ES.ID_skill)
ORDER BY S.nome, E.nome;

SELECT E.nome AS Empregado, ES.nivel, S.nome
FROM
( -- Primeiro, associa (RIGHT OUTER JOIN) Empregado e EmpSkill
Empregado AS E RIGHT OUTER JOIN EmpSkill AS ES ON (E.ID_emp = ES.ID_emp)
-- Depois, associa (RIGHT OUTER JOIN) o resultado com Skill
)RIGHT OUTER JOIN Skill AS S ON (S.ID_skill = ES.ID_skill)
ORDER BY S.nome, E.nome;

(
SELECT E.nome AS Empregado, ES.nivel, S.nome
FROM
( -- Primeiro, associa (LEFT OUTER JOIN) Empregado e EmpSkill
Empregado AS E LEFT OUTER JOIN EmpSkill AS ES ON (E.ID_emp = ES.ID_emp)
-- Depois, associa (LEFT OUTER JOIN) o resultado com Skill
) LEFT OUTER JOIN Skill AS S ON (S.ID_skill = ES.ID_skill)
)
UNION
(
SELECT E.nome AS Empregado, ES.nivel, S.nome
FROM
( -- Primeiro, associa (RIGHT OUTER JOIN) Empregado e EmpSkill
Empregado AS E RIGHT OUTER JOIN EmpSkill AS ES ON (E.ID_emp = ES.ID_emp)
-- Depois, associa (RIGHT OUTER JOIN) o resultado com Skill
)RIGHT OUTER JOIN Skill AS S ON (S.ID_skill = ES.ID_skill)
)
ORDER BY nivel;