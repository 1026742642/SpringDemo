package com.dependencyInjection.constructorBased;

/**
 * Created by Administrator on 2017/9/10.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    public void spellChecker(){
        spellChecker.checkSpelling();
    }
}
