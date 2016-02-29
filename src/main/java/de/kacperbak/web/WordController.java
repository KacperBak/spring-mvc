package de.kacperbak.web;

import de.kacperbak.data.WordRepository;
import de.kacperbak.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WordController {

    private WordRepository wordRepository;

    @Autowired
    public WordController(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @RequestMapping(value = "/word/{wordId}", method = RequestMethod.GET)
    public String word(@PathVariable("wordId") long wordId, Model model){
        wordRepository.save(new Word(wordId, "EN", "saved" + wordId));
        return "word";
    }

    @RequestMapping(value = "/words", method = RequestMethod.GET)
    public String words(Model model){
        model.addAttribute("wordsModel", wordRepository.findAllWords());
        return "words";
    }
}
