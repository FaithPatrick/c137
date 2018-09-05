create table job (
    id int not null auto_increment primary key,
    `name` varchar(100) not null default '' comment 'job name',
    `description` varchar(255) not null default '' comment 'job description',
    create_time timestamp not null default current_timestamp  comment 'create time',
    update_time timestamp not null default current_timestamp  on update current_timestamp  comment 'update time'
);