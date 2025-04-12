/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Tag;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$42
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        char c2;
        char c3 = ((CharacterReader)object).consume();
        if (c3 != (c2 = '>')) {
            c2 = (char)-1;
            if (c3 != c2) {
                ((CharacterReader)object).unconsume();
                tokeniser.error(this);
                object = TokeniserState.BeforeAttributeName;
                tokeniser.transition((TokeniserState)((Object)object));
            } else {
                tokeniser.eofError(this);
                object = TokeniserState.Data;
                tokeniser.transition((TokeniserState)((Object)object));
            }
        } else {
            object = tokeniser.tagPending;
            c3 = '\u0001';
            ((Token$Tag)object).selfClosing = c3;
            tokeniser.emitTagPending();
            object = TokeniserState.Data;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

