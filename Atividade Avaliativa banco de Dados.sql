create database banco;
use banco;
drop database banco;

create table animal(
id int not null,
nome varchar(45) not null,
especie varchar(45) not null,
raca varchar(45) not null,
data_nascimento varchar(10) not null,
sexo varchar(1) not null,
altura double not null,
peso double not null,
primary key(id));

create table usuario(
cpf char(14) not null,
nome varchar(45) not null,
email varchar(45) not null,
sexo varchar(1) not null,
tel varchar(45) not null,
estado varchar(45) not null,
municipio varchar(45) not null,
senha varchar(45) not null,
tipo_usu varchar(45) not null,
primary key(cpf));

create table historicosaude(
id int not null,
nome_responsavel varchar(45) not null,
data_registro varchar(10) not null,
descricao text not null,
tratamento text not null,
primary key(id),
foreign key (id) references animal(id));


create table registrovacinacao(
id int not null,
vacina varchar(45) not null,
data_aplicacao varchar(45) not null,
aplicador varchar(45) not null,
reacao text not null,
motivo text not null,
primary key(id),
foreign key (id) references animal(id));

create table registropeso(
id int not null,
nome_animal varchar(45) not null,
data_pessagem varchar(10) not null,
peso_anterior double not null,
peso_atual double not null,
primary key(id),
foreign key(id) references animal(id));

create table avaliacaovendaeabate(
id int not null,
nome_animal varchar(45) not null,
idade int not null,
peso double not null,
especie varchar(45) not null,
raca varchar(45) not null,
finalidade varchar(45) not null,
primary key(id),
foreign key (id) references animal(id));

create table vacina(
id int not null,
nome_vacina varchar(45) not null,
modelo_vacina varchar(50),
descricao text,
fabricante varchar(45),
data_validade varchar(10),
primary key(id),
foreign key (id) references animal(id));

select * from animal;
select * from usuario;
select * from historicosaude;
select * from registrovacinacao;
select * from registropeso;
select * from avaliacaovendaeabate;
select * from vacina;
