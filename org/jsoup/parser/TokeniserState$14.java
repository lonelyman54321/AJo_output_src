/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$14
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        char c2 = '/';
        char c3 = object.matches(c2);
        if (c3 != '\u0000') {
            tokeniser.createTempBuffer();
            object = TokeniserState.RawtextEndTagOpen;
            tokeniser.advanceTransition((TokeniserState)((Object)object));
        } else {
            c3 = '<';
            tokeniser.emit(c3);
            object = TokeniserState.Rawtext;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

