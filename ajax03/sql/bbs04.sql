drop table bbs04;
drop seqeunce bbs04_seq;
create table bbs04(
	num number primary key,
	sub varchar2(30),
	content varchar2(2000),
	nalja varchar2(10)
);
create sequence bbs04_seq;
insert into bbs04 values (bbs04_seq.nextval, 'test01', 'test', to_char(sysdate, 'yy/mm/dd'));
insert into bbs04 values (bbs04_seq.nextval, 'test02', 'test', to_char(sysdate, 'yy/mm/dd'));
insert into bbs04 values (bbs04_seq.nextval, 'test03', 'test', to_char(sysdate, 'yy/mm/dd'));