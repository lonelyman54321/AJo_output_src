/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$5
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        TokeniserState tokeniserState = TokeniserState.RawtextLessthanSign;
        TokeniserState.access$200(tokeniser, characterReader, this, tokeniserState);
    }
}

