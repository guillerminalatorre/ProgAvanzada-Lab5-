use torneo_de_frescas;

create table winners(
	id_winner integer not null auto_increment,
	id_human integer not null,
	name varchar(50) not null,
	drink_in_body integer not null,
	constraint pk_id_winner primary key (id_winner)
);

SET GLOBAL time_zone = '-3:00';

select id_winner from winners;