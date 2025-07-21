\c bankdb
create type gendertype AS ENUM('MALE','FEMALE','OTHER');  
create table IF NOT EXISTS customer(account_no bigint primary key, name text not null, address text, email text unique, contact_no bigint,password varchar(10),dob date,gender gendertype);

