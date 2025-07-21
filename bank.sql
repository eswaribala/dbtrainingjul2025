\c bankdb
create type gendertype AS ENUM('MALE','FEMALE','OTHER');  
create table IF NOT EXISTS customer(account_no bigint primary key, name text not null, address text, email text unique, contact_no bigint,password varchar(10),dob date,gender gendertype);
create table IF NOT EXISTS account(account_no_fk bigint, runing_total bigint, opening_date date, constraint account_fk_constraint foreign key(account_no_fk) references customer(account_no) on delete set null on update cascade);
create table IF NOT EXISTS transaction(account_no_fk bigint, amount bigint, time_stamp timestamp, sender text, receiver text, constraint transaction_fk_constraint foreign key(account_no_fk) references customer(account_no) on delete set null on update cascade);
