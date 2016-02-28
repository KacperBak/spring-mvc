create table Word (
	id identity,
  language varchar(255) not null,
	characters varchar(255) not null
);

INSERT INTO Word(id, language, characters) VALUES (101, 'EN', 'BUS');