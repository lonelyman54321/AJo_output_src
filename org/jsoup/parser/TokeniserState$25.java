/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$25
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        char c2 = object.matchesAsciiAlpha();
        if (c2 != '\u0000') {
            tokeniser.createTempBuffer();
            CharSequence charSequence = tokeniser.dataBuffer;
            char c3 = object.current();
            charSequence.append(c3);
            charSequence = "<";
            tokeniser.emit((String)charSequence);
            char c5 = object.current();
            tokeniser.emit(c5);
            object = TokeniserState.ScriptDataDoubleEscapeStart;
            tokeniser.advanceTransition((TokeniserState)((Object)object));
        } else {
            c2 = '/';
            char c6 = object.matches(c2);
            if (c6 != '\u0000') {
                tokeniser.createTempBuffer();
                object = TokeniserState.ScriptDataEscapedEndTagOpen;
                tokeniser.advanceTransition((TokeniserState)((Object)object));
            } else {
                c6 = '<';
                tokeniser.emit(c6);
                object = TokeniserState.ScriptDataEscaped;
                tokeniser.transition((TokeniserState)((Object)object));
            }
        }
    }
}

