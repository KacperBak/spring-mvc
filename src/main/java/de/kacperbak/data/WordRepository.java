package de.kacperbak.data;

import de.kacperbak.domain.Word;

import java.util.List;

public interface WordRepository {

    List<Word> findAllWords();

    Word save(Word word);
}
