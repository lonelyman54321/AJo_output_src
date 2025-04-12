/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Tag;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$12
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        boolean bl2 = object.matchesAsciiAlpha();
        if (bl2) {
            bl2 = false;
            tokeniser.createTagPending(false);
            Object object2 = tokeniser.tagPending;
            char c2 = object.current();
            ((Token$Tag)object2).appendTagName(c2);
            object2 = tokeniser.dataBuffer;
            char c3 = object.current();
            ((StringBuilder)object2).append(c3);
            object = TokeniserState.RCDATAEndTagName;
            tokeniser.advanceTransition((TokeniserState)((Object)object));
        } else {
            tokeniser.emit("</");
            object = TokeniserState.Rcdata;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

