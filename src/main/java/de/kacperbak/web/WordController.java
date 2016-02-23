package de.kacperbak.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WordController {

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public String word(@PathVariable("wordId") long wordId, Model model){
        return "word";
    }

    @RequestMapping(value = "/words", method = RequestMethod.GET)
    public String words(Model model){
        return "words";
    }
}
