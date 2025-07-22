\c bankdb
select  c.account_no,c.name,a.runing_total from customer c inner join account a on c.account_no=a.account_no_fk; 
select  c.account_no,c.name,a.runing_total from customer c left join account a on c.account_no=a.account_no_fk; 
select  c.account_no,c.name,a.runing_total from customer c right join account a on c.account_no=a.account_no_fk; 
select  c.account_no,c.name,a.runing_total from customer c full outer join account a on c.account_no=a.account_no_fk; 
select  sum(t.amount)  from customer c inner join transaction t on c.account_no=t.account_no_fk group by c.gender;
select  sum(t.amount)  from customer c inner join transaction t on c.account_no=t.account_no_fk group by c.gender having sum(t.amount) > 500;
select  sum(t.amount)  from customer c inner join transaction t on c.account_no=t.account_no_fk group by c.address having c.address like 'pune';
select max(runing_total) from account where runing_total <(select max(runing_total) from account);
