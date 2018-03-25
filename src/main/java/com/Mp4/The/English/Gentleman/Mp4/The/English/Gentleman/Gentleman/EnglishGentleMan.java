package com.Mp4.The.English.Gentleman.Mp4.The.English.Gentleman.Gentleman;

import org.springframework.stereotype.Component;

@Component
public class EnglishGentleMan {

    private Monocle monocle;
    private Lighter lighter;
    private NewsPaper newsPaper;
    private Cigare cigare;

    public EnglishGentleMan(Monocle monocle, Lighter lighter) {
        this.monocle = monocle;
        this.lighter = lighter;
    }

    public String hehadgoodday(){
        String heread = monocle.read(newsPaper);
        String hesomke = lighter.lighte(cigare);
        if(heread.equalsIgnoreCase("I read the Newspaper") && hesomke.equalsIgnoreCase("I have lighter"))
        {
            return "he had good day" ;
        }

        else return "he had bad day";

    }
}
