create database Person;
use Person;

create table Persons
(
	id int,
    firstName varchar(20),
    lastName varchar(20),
    
    primary key (id)
);

insert into Persons values (1, 'Jim', 'dwada');
insert into Persons values (2, 'Jim', 'fewgfw');
insert into Persons values (3, 'Bill', 'ddwqpdoq');

select * from Persons;