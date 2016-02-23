package de.kacperbak.data;

import de.kacperbak.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JdbcWordRepository implements WordRepository {

    private JdbcOperations jdbc;

    @Autowired
    public JdbcWordRepository(JdbcOperations jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Word> findAllWords() {
        return jdbc.query(
                "SELECT id, characters, language " +
                "FROM Word",
                new WordRowMapper()
        );
    }

    @Override
    public Word save(Word word) {
        jdbc.update("INSERT INTO Word(id, characters, language) VALUES (?,?,?)", word.getId(), word.getCharacters(), word.getLanguage());
        return word;
    }

    private static class WordRowMapper implements RowMapper<Word>{
        @Override
        public Word mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Word(
                rs.getLong("id"),
                rs.getString("language"),
                rs.getString("characters"));
        }
    }
}
