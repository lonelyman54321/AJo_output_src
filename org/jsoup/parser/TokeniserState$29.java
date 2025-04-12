/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$29
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        int n3 = ((CharacterReader)object).current();
        if (n3 != 0) {
            int n4 = 45;
            if (n3 != n4) {
                n4 = 60;
                if (n3 != n4) {
                    n4 = (char)-1;
                    if (n3 != n4) {
                        char[] cArray;
                        n3 = 3;
                        char[] cArray2 = cArray = new char[n3];
                        cArray[0] = 45;
                        cArray2[1] = 60;
                        cArray2[2] = '\u0000';
                        object = ((CharacterReader)object).consumeToAny(cArray);
                        tokeniser.emit((String)object);
                    } else {
                        tokeniser.eofError(this);
                        object = TokeniserState.Data;
                        tokeniser.transition((TokeniserState)((Object)object));
                    }
                } else {
                    tokeniser.emit((char)n3);
                    object = TokeniserState.ScriptDataDoubleEscapedLessthanSign;
                    tokeniser.advanceTransition((TokeniserState)((Object)object));
                }
            } else {
                tokeniser.emit((char)n3);
                object = TokeniserState.ScriptDataDoubleEscapedDash;
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

