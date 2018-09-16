#Apostila FJ21

##Unidade 2.7

###Tabela CONTATO:

-MySql

```
create schema fj21;
use fj21;
create table contatos (
id BIGINT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
email VARCHAR(255),
endereco VARCHAR(255),
dataNascimento DATE,
primary key (id)
);
```