package com.example.springidol;

import com.example.demo.instrument.Guitar;
import com.example.demo.performer.*;
import com.example.demo.poem.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {
    @Bean
    public Performer duke() {
        return new Juggler();
    }

    @Bean
    public Poem sonnet29() {
        return new Sonnet29();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet29());
    }

    @Bean
    public Performer instrumentalist() {
        return new Instrumentalist("Jingle Mingle", new Guitar());
    }
}