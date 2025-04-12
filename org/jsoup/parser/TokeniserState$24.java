/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$24
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        char c2 = object.isEmpty();
        if (c2 != '\u0000') {
            tokeniser.eofError(this);
            object = TokeniserState.Data;
            tokeniser.transition((TokeniserState)((Object)object));
            return;
        }
        char c3 = object.consume();
        if (c3 != '\u0000') {
            c2 = '-';
            if (c3 != c2) {
                c2 = '<';
                if (c3 != c2) {
                    c2 = '>';
                    if (c3 != c2) {
                        tokeniser.emit(c3);
                        object = TokeniserState.ScriptDataEscaped;
                        tokeniser.transition((TokeniserState)((Object)object));
                    } else {
                        tokeniser.emit(c3);
                        object = TokeniserState.ScriptData;
                        tokeniser.transition((TokeniserState)((Object)object));
                    }
                } else {
                    object = TokeniserState.ScriptDataEscapedLessthanSign;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            } else {
                tokeniser.emit(c3);
            }
        } else {
            tokeniser.error(this);
            c3 = (char)-3;
            tokeniser.emit(c3);
            object = TokeniserState.ScriptDataEscaped;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

