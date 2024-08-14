CREATE DATABASE lab01;
USE lab01;


CREATE TABLE Carro (
    Cod_carro INT PRIMARY KEY,
    Marca VARCHAR(100),
    Modelo VARCHAR(100),
    AnoFabricacao INT,
    Kilometragem FLOAT,
    Cor VARCHAR(50)
);

INSERT INTO Carro(Cod_carro, Marca, Modelo, AnoFabricacao, Kilometragem, Cor)
VALUES(1, "Volkswagen", "Polo", 2022, 60000, "Branco"),
(2, "Hyundai", "HB20", 2020, 20000, "Azul"),
(3,"Volvo", "XC60", 2024, 0, "Cinza"),
(4,"Ford", "Ka", 2000, 40000, "Vermelho"),
(5,"Porsche", "Porsche 911", 2025, 0, "Verde Oliva");

SELECT * FROM Carro;

UPDATE Carro
SET Cor = "Rosa"
WHERE Cod_carro = 5;

UPDATE Carro
SET AnoFabricacao = 2010
WHERE Cod_carro = 4;

DELETE FROM Carro WHERE Cod_carro = 4;

