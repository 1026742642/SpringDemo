package com.annotationAutowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lenovo on 2017/9/14.
 */
public class TextEditor {
    @Autowired(required = false)
    private SpellChecker spellChecker;

//    public void setSpellChecker( SpellChecker spellChecker ){
//        this.spellChecker = spellChecker;
//    }
//    public SpellChecker getSpellChecker( ) {
//        return spellChecker;
//    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
