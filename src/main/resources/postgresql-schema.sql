DELETE FROM Word WHERE id > 1;
DROP TABLE Word;

CREATE TABLE Word (
    id SERIAL PRIMARY KEY,
    language varchar(255) not null,
	  characters varchar(255) not null
);

INSERT INTO Word(id, language, characters) VALUES (101, 'EN', 'BUS');