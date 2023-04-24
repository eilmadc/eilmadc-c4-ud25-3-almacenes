
DROP TABLE IF EXISTS almacenes;
CREATE TABLE almacenes (
  CODIGO int NOT NULL AUTO_INCREMENT,
  LUGAR varchar(255) DEFAULT NULL,
  CAPACIDAD int DEFAULT NULL,
  PRIMARY KEY (CODIGO)
);

DROP TABLE IF EXISTS cajas;
CREATE TABLE cajas (
  NUMREFERENCIA varchar(5) NOT NULL,
  CONTENIDO varchar(255) DEFAULT NULL,
  VALOR double DEFAULT NULL,
  ALMACEN int DEFAULT NULL,
  PRIMARY KEY (NUMREFERENCIA),
  CONSTRAINT cajas_ibfk_1 FOREIGN KEY (ALMACEN) REFERENCES almacenes (CODIGO)  ON UPDATE CASCADE ON DELETE CASCADE
);


INSERT INTO almacenes VALUES (1,'Valencia',3),(2,'Barcelona',4),(3,'Bilbao',7),(4,'Los Angeles',2),(5,'San Francisco',8);
INSERT INTO cajas VALUES ('0MN7','Rocks',180,3),('4H8P','Rocks',250,1),('4RT3','Scissors',190,4),('7G3H','Rocks',200,1),('8JN6','Papers',75,1),('8Y6U','Papers',50,3),('9J6F','Papers',175,2),('LL08','Rocks',140,4),('P0H6','Scissors',125,1),('P2T6','Scissors',150,2),('TU55','Papers',90,5);

