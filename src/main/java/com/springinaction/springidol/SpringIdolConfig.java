package com.springinaction.springidol;

import com.springinaction.springidol.instrument.Guitar;
import com.springinaction.springidol.performer.Instrumentalist;
import com.springinaction.springidol.performer.Juggler;
import com.springinaction.springidol.performer.Performer;
import com.springinaction.springidol.performer.PoeticJuggler;
import com.springinaction.springidol.poem.Poem;
import com.springinaction.springidol.poem.Sonnet29;
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