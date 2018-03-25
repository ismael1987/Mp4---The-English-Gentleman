package com.Mp4.The.English.Gentleman.Mp4.The.English.Gentleman.Gentleman;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class EnglishGentleManTest {

    @Autowired EnglishGentleMan englishGentleMan;
    @Test
    void hehadgoodday() {
        String hehadgoodday = englishGentleMan.hehadgoodday();
        assertThat(hehadgoodday,is("he had good day"));



    }

}