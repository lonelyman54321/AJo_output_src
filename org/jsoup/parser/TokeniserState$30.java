/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$30
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        char c2 = object.consume();
        if (c2 != '\u0000') {
            char c3 = '-';
            if (c2 != c3) {
                c3 = '<';
                if (c2 != c3) {
                    c3 = (char)-1;
                    if (c2 != c3) {
                        tokeniser.emit(c2);
                        object = TokeniserState.ScriptDataDoubleEscaped;
                        tokeniser.transition((TokeniserState)((Object)object));
                    } else {
                        tokeniser.eofError(this);
                        object = TokeniserState.Data;
                        tokeniser.transition((TokeniserState)((Object)object));
                    }
                } else {
                    tokeniser.emit(c2);
                    object = TokeniserState.ScriptDataDoubleEscapedLessthanSign;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            } else {
                tokeniser.emit(c2);
                object = TokeniserState.ScriptDataDoubleEscapedDashDash;
                tokeniser.transition((TokeniserState)((Object)object));
            }
        } else {
            tokeniser.error(this);
            c2 = (char)-3;
            tokeniser.emit(c2);
            object = TokeniserState.ScriptDataDoubleEscaped;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

