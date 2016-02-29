package de.kacperbak.domain;

public class Word {

    private long id;

    private String language;

    private String characters;

    public Word(long id, String language, String characters) {
        this.id = id;
        this.language = language;
        this.characters = characters;
    }

    public long getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }

    public String getCharacters() {
        return characters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        if (!language.equals(word.language)) return false;
        return characters.equals(word.characters);

    }

    @Override
    public int hashCode() {
        int result = language.hashCode();
        result = 31 * result + characters.hashCode();
        return result;
    }
}
