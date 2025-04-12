/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Tag;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$11
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        boolean bl2 = object.matches('/');
        if (bl2) {
            tokeniser.createTempBuffer();
            object = TokeniserState.RCDATAEndTagOpen;
            tokeniser.advanceTransition((TokeniserState)((Object)object));
        } else {
            boolean bl3;
            String string2;
            bl2 = object.readFully();
            if (bl2 && (bl2 = object.matchesAsciiAlpha()) && (string2 = tokeniser.appropriateEndTagName()) != null && !(bl3 = object.containsIgnoreCase(string2 = tokeniser.appropriateEndTagSeq()))) {
                bl3 = false;
                object = tokeniser.createTagPending(false);
                string2 = tokeniser.appropriateEndTagName();
                object = ((Token$Tag)object).name(string2);
                tokeniser.tagPending = object;
                tokeniser.emitTagPending();
                object = TokeniserState.TagOpen;
                tokeniser.transition((TokeniserState)((Object)object));
            } else {
                tokeniser.emit("<");
                object = TokeniserState.Rcdata;
                tokeniser.transition((TokeniserState)((Object)object));
            }
        }
    }
}

