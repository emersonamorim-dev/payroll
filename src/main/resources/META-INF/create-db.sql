create table if not exists departament(codigo bigint not null auto_increment, nome varchar(100) not null, primary key (codigo));
create table if not exists employee(codigo bigint not null auto_increment, nome varchar(100) not null, departament_codigo bigint not null, primary key (codigo), constraint fk_func_dept foreign key (departament_codigo) references departament (codigo));
