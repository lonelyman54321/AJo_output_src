/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$4
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        object = TokeniserState.Rcdata;
        TokeniserState.access$100(tokeniser, (TokeniserState)((Object)object));
    }
}

