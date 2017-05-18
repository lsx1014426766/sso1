--(id,name,pwd,age,email,birthday)
drop table user_myc;

create table user_myc(
 id number primary key,
 name varchar2(20),
 pwd varchar2(30),
 age number,
 email varchar2(40),
 birthday date
);

drop sequence seq_myc;
select seq_myc.nextval from dual;
create sequence seq_myc  start with 1 increment by 1;
insert into user_myc values(seq_myc.nextval,'张三丰','1234',23,'zsf@163.com',sysdate);
insert into user_myc values(seq_myc.nextval,'张无忌','2345',13,'zwj@163.com',to_date('2012-12-12','yyyy-MM-dd'));
select * from user_myc;

