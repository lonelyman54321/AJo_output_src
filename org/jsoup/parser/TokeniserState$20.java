/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$20
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        char c2 = '-';
        boolean bl2 = object.matches(c2);
        if (bl2) {
            tokeniser.emit(c2);
            object = TokeniserState.ScriptDataEscapeStartDash;
            tokeniser.advanceTransition((TokeniserState)((Object)object));
        } else {
            object = TokeniserState.ScriptData;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

