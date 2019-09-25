create table bbs03(
	num number primary key,
	sub varchar2(30),
	content varchar2(2000),
	id varchar2(20),
	nalja date default sysdate
);
create sequence bbs03_seq;
--dummy
insert into bbs03 values (bbs03_seq.nextval, 'sub1', 'content1', '글쓴이1', sysdate);
insert into bbs03 values (bbs03_seq.nextval, 'sub2', 'content2', '글쓴이2', sysdate);
insert into bbs03 values (bbs03_seq.nextval, 'sub3', 'content3', '글쓴이3', sysdate);
commit;