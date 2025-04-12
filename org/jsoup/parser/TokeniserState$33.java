/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$33
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        TokeniserState tokeniserState = TokeniserState.ScriptDataEscaped;
        TokeniserState tokeniserState2 = TokeniserState.ScriptDataDoubleEscaped;
        TokeniserState.access$600(tokeniser, characterReader, tokeniserState, tokeniserState2);
    }
}

