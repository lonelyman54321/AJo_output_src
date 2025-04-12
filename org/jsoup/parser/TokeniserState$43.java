/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$43
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        Token$Comment token$Comment = tokeniser.commentPending;
        char c2 = '>';
        String string2 = object.consumeTo(c2);
        token$Comment.append(string2);
        char c3 = object.current();
        if (c3 == c2 || c3 == (c2 = (char)-1)) {
            object.consume();
            tokeniser.emitCommentPending();
            object = TokeniserState.Data;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

