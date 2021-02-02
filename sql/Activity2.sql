REM   Script: SQLActivity2
REM   SQL activity 2

create table salesman (  
SALESMAN_ID int not null,   
salesman_name varchar2(20),  
salesman_city varchar2(20),  
commission int);

desc salesman


insert into salesman (salesman_id, salesman_name, salesman_city, commission) values (5001,'James Hoog','New York', 15 );

insert into salesman (salesman_id, salesman_name, salesman_city, commission) values (5001,'James Hoog','New York', 15 );

insert into salesman (salesman_id, salesman_name, salesman_city, commission) values (5002,'Nail Knite','Paris',13);

insert into salesman (salesman_id, salesman_name, salesman_city, commission) values (5005,'Pit Alex','London',11);

insert into salesman (salesman_id, salesman_name, salesman_city, commission) values (5006,'McLyon','Paris',14);

insert into salesman (salesman_id, salesman_name, salesman_city, commission) values (5007,'Paul Adam','Rome',13);

insert into salesman (salesman_id, salesman_name, salesman_city, commission) values (5003,'Lauson Hen','San Jose',12);

desc salesman


select * from salesman;

