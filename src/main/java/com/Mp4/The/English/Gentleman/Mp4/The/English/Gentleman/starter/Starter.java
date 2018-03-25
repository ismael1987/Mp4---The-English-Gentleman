package com.Mp4.The.English.Gentleman.Mp4.The.English.Gentleman.starter;

import com.Mp4.The.English.Gentleman.Mp4.The.English.Gentleman.Gentleman.EnglishGentleMan;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Starter {
    @Bean
    ApplicationRunner strter(EnglishGentleMan englishGentleMan){
        return  args -> {
            String hehadgoodday = englishGentleMan.hehadgoodday();
            System.out.println(hehadgoodday);
        };

    }

}
