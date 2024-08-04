
--se crea el usuario para conectar a java - neatbeans 
CREATE USER C##GRUPO_G
IDENTIFIED BY grupog4
default tablespace system
temporary tablespace temp
quota 10M ON SYSTEM;
--privilegios para iniciar session, tabla eh insertar 
GRANT CREATE SESSION TO C##GRUPO_G
GRANT CREATE TABLE TO C##GRUPO_G;
GRANT INSERT ON C##GRUPO_G.INICIO TO C##GRUPO_G;

--Se crea la tabla inicio
create table INICIO(
USUARIO VARCHAR2(50) NOT NULL,
PASSWORD VARCHAR2(50) NOT NULL);


-- Se crea la tabla EVENTO_PRIVADO
create table EVENTO_PRIVADO
(
  id          NUMBER primary key,
  nombre      VARCHAR2(60),
  cedula      VARCHAR2(10) not null,
  telefono    VARCHAR2(10),
  correo      VARCHAR2(100),
  direccion   VARCHAR2(150),
  tipo_evento VARCHAR2(50),
  fecha       VARCHAR2(50),
  hora        VARCHAR2(50),
  paquete     VARCHAR2(50),
  tipo_pago   VARCHAR2(100)
);
-- Se crea la tabla EVENTO_PUBLICO
create table EVENTO_PUBLICO
(
  id          NUMBER primary key,
  nombre      VARCHAR2(60),
  cedula      VARCHAR2(10) not null,
  telefono    VARCHAR2(10),
  correo      VARCHAR2(100),
  direccion   VARCHAR2(150),
  tipo_evento VARCHAR2(50),
  fecha       VARCHAR2(50),
  hora        VARCHAR2(50),
  paquete     VARCHAR2(50),
  tipo_pago   VARCHAR2(100)
);
-- Se crea la tabla EVENTO_CASUAL
create table EVENTO_CASUAL
(
  id          NUMBER primary key,
  nombre      VARCHAR2(60),
  cedula      VARCHAR2(10) not null,
  telefono    VARCHAR2(10),
  correo      VARCHAR2(100),
  direccion   VARCHAR2(150),
  tipo_evento VARCHAR2(50),
  fecha       VARCHAR2(50),
  hora        VARCHAR2(50),
  paquete     VARCHAR2(50),
  tipo_pago   VARCHAR2(100)
);


-- Create table EVENTO_EMPRESARIAL
create table EVENTO_EMPRESARIAL
(
  id          NUMBER primary key,
  nombre      VARCHAR2(60),
  ruc         VARCHAR2(13) not null,
  telefono    VARCHAR2(10),
  correo      VARCHAR2(100),
  direccion   VARCHAR2(150),
  tipo_evento VARCHAR2(50),
  fecha       VARCHAR2(50),
  hora        VARCHAR2(50),
  paquete     VARCHAR2(50),
  tipo_pago   VARCHAR2(100)
);


--Se insertan los usuarios creados  
insert into INICIO values('Admin','12345');
insert into INICIO values('C##GRUPO_G','grupog4');
select * from INICIO;
select * from EVENTO_PRIVADO;
select * from EVENTO_PUBLICO;
select * from EVENTO_CASUAL;
select * from EVENTO_EMPRESARIAL;


