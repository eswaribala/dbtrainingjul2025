\c bankdb
select  c.account_no,c.name,a.runing_total from customer c inner join account a on c.account_no=a.account_no_fk; 
