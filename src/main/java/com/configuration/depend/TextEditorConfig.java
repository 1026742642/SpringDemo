package com.configuration.depend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lenovo on 2017/9/20.
 */
@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }

    @Bean
    public TextEditor textEditor1(String s){
        return new TextEditor( spellChecker() );
    }
    @Bean
    public String test(){
        return "";
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
