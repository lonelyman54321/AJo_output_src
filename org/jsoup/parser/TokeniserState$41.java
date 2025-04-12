/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$41
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        int n3;
        int n4 = object.consume();
        if (n4 != (n3 = 9) && n4 != (n3 = 10) && n4 != (n3 = 12) && n4 != (n3 = 13) && n4 != (n3 = 32)) {
            n3 = 47;
            if (n4 != n3) {
                n3 = 62;
                if (n4 != n3) {
                    n3 = (char)-1;
                    if (n4 != n3) {
                        object.unconsume();
                        tokeniser.error(this);
                        object = TokeniserState.BeforeAttributeName;
                        tokeniser.transition((TokeniserState)((Object)object));
                    } else {
                        tokeniser.eofError(this);
                        object = TokeniserState.Data;
                        tokeniser.transition((TokeniserState)((Object)object));
                    }
                } else {
                    tokeniser.emitTagPending();
                    object = TokeniserState.Data;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            } else {
                object = TokeniserState.SelfClosingStartTag;
                tokeniser.transition((TokeniserState)((Object)object));
            }
        } else {
            object = TokeniserState.BeforeAttributeName;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

