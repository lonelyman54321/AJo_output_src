/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$EOF;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$3
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        int n3 = ((CharacterReader)object).current();
        if (n3 != 0) {
            int n4 = 38;
            if (n3 != n4) {
                n4 = 60;
                if (n3 != n4) {
                    n4 = (char)-1;
                    if (n3 != n4) {
                        object = ((CharacterReader)object).consumeData();
                        tokeniser.emit((String)object);
                    } else {
                        object = new Token$EOF();
                        tokeniser.emit((Token)object);
                    }
                } else {
                    object = TokeniserState.RcdataLessthanSign;
                    tokeniser.advanceTransition((TokeniserState)((Object)object));
                }
            } else {
                object = TokeniserState.CharacterReferenceInRcdata;
                tokeniser.advanceTransition((TokeniserState)((Object)object));
            }
        } else {
            tokeniser.error(this);
            ((CharacterReader)object).advance();
            char c2 = (char)-3;
            tokeniser.emit(c2);
        }
    }
}

