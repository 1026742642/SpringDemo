package com.dependencyInjection.constructorBased;

/**
 * Created by Administrator on 2017/9/10.
 */
public class SpellChecker {
    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor.");
    }
    public void checkSpelling(){
        System.out.println("Inside checkSpelling");
    }
}
