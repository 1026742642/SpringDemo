package com.autoByName;

/**
 * Created by lenovo on 2017/9/14.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public void setspellChecker2( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
