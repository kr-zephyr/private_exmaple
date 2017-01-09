create table test (
  i int unsigned not null auto_increment ,
  j int unsigned not null ,
  s varchar(64) not null ,
  d datetime not null ,
  primary key (i)
);

alter table test add key(j), add key(s), add key(d);

insert into test (j, s, d)
    values
      (
          crc32(rand()),
          crc32(rand())*12345,
          date_add(now(), interval -crc32(rand())/5 second )
      );

-- 17회 반복
insert into test (j, s, d)
    select
      crc32(rand()),
      crc32(rand()) * 12345,
      date_add(now(), interval -crc32(rand()) / 5 second )
from test;


commit;


select count(*) from test;

select * from test order by rand() limit 1;

explain
select * from test
where j = '4041145571';

explain
select * from test
where s = 31823251748340;
