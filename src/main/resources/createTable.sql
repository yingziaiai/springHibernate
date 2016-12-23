create table acct_user_role(
user_id varchar(36),
role_id varchar(36),
primary key(user_id, role_id)
);

create table acct_role_authority(
role_id varchar(36),
authority_id varchar(36),
primary key(role_id, authority_id)
);

create table acct_user(
id varchar(36),
nick_name varchar(36),
telephone varchar(36),
register_time datetime,
primary key(id)
);

create table acct_role(
id varchar(36),
name varchar(255),
primary key(id)
);

create table acct_authority(
id varchar(36),
name varchar(255),
primary key(id)
);