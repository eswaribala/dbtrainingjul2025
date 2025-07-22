\c bankdb
create function get_customer_count() returns int
language plpgsql
as
$$
declare
   v_count integer;
begin
   select count(*) 
   into v_count
   from customer;  
   
   return v_count;
end;
$$;

select get_customer_count();
