# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table challenge (
  id                        bigint not null,
  objective                 varchar(255),
  constraint pk_challenge primary key (id))
;

create sequence challenge_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists challenge;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists challenge_seq;

