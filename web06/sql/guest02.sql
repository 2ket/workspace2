create table guest02(
	num number primary key,
	id varchar2(20),
	content varchar2(1024)
);
--dummy
insert into guest02 values (1, 'gest', 'test1');
insert into guest02 values (2, 'gest', 'test111');
insert into guest02 values (3, 'gest', 'test12222');
insert into guest02 values (4, 'gest', 'test133333');
commit;