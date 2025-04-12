/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$66
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        char c2;
        char c3 = object.consume();
        if (c3 != (c2 = '>')) {
            c2 = (char)-1;
            if (c3 == c2) {
                tokeniser.emitDoctypePending();
                object = TokeniserState.Data;
                tokeniser.transition((TokeniserState)((Object)object));
            }
        } else {
            tokeniser.emitDoctypePending();
            object = TokeniserState.Data;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

