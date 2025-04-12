/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$18
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        TokeniserState tokeniserState = TokeniserState.ScriptDataEndTagName;
        TokeniserState tokeniserState2 = TokeniserState.ScriptData;
        TokeniserState.access$400(tokeniser, characterReader, tokeniserState, tokeniserState2);
    }
}

