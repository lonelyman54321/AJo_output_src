/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$CData;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$67
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        boolean bl2;
        String string2 = "]]>";
        String string3 = ((CharacterReader)object).consumeTo(string2);
        StringBuilder stringBuilder = tokeniser.dataBuffer;
        stringBuilder.append(string3);
        boolean bl3 = ((CharacterReader)object).matchConsume(string2);
        if (bl3 || (bl2 = ((CharacterReader)object).isEmpty())) {
            string2 = tokeniser.dataBuffer.toString();
            object = new Token$CData(string2);
            tokeniser.emit((Token)object);
            object = TokeniserState.Data;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

