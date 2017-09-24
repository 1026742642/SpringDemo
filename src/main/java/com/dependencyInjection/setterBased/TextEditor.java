package com.dependencyInjection.setterBased;

/**
 * Created by Administrator on 2017/9/10.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public void setSpellChecker(SpellChecker spellChecker){
        System.out.println("里面的setSpellChecker(设置拼写)");
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
