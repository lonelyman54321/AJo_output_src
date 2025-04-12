/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$EOF;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$7
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        char c2 = ((CharacterReader)object).current();
        if (c2 != '\u0000') {
            char c3 = (char)-1;
            if (c2 != c3) {
                c2 = '\u0000';
                object = ((CharacterReader)object).consumeTo('\u0000');
                tokeniser.emit((String)object);
            } else {
                object = new Token$EOF();
                tokeniser.emit((Token)object);
            }
        } else {
            tokeniser.error(this);
            ((CharacterReader)object).advance();
            char c5 = (char)-3;
            tokeniser.emit(c5);
        }
    }
}

