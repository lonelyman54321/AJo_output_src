/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$22
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        boolean n3 = ((CharacterReader)object).isEmpty();
        if (n3) {
            tokeniser.eofError(this);
            object = TokeniserState.Data;
            tokeniser.transition((TokeniserState)((Object)object));
            return;
        }
        char c2 = ((CharacterReader)object).current();
        if (c2 != '\u0000') {
            char c3 = '-';
            if (c2 != c3) {
                c3 = '<';
                if (c2 != c3) {
                    char[] cArray;
                    int n4 = 3;
                    char[] cArray2 = cArray = new char[n4];
                    cArray[0] = 45;
                    cArray2[1] = 60;
                    cArray2[2] = '\u0000';
                    object = ((CharacterReader)object).consumeToAny(cArray);
                    tokeniser.emit((String)object);
                } else {
                    object = TokeniserState.ScriptDataEscapedLessthanSign;
                    tokeniser.advanceTransition((TokeniserState)((Object)object));
                }
            } else {
                tokeniser.emit(c3);
                object = TokeniserState.ScriptDataEscapedDash;
                tokeniser.advanceTransition((TokeniserState)((Object)object));
            }
        } else {
            tokeniser.error(this);
            ((CharacterReader)object).advance();
            char c5 = (char)-3;
            tokeniser.emit(c5);
        }
    }
}

