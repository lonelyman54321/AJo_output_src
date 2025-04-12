/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$15
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        TokeniserState tokeniserState = TokeniserState.RawtextEndTagName;
        TokeniserState tokeniserState2 = TokeniserState.Rawtext;
        TokeniserState.access$400(tokeniser, characterReader, tokeniserState, tokeniserState2);
    }
}

