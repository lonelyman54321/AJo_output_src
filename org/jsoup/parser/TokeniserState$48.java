/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$48
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        char c2 = object.consume();
        char c3 = '-';
        if (c2 != '\u0000') {
            if (c2 != c3) {
                char c5 = (char)-1;
                if (c2 != c5) {
                    Token$Comment token$Comment = tokeniser.commentPending;
                    Token$Comment token$Comment2 = token$Comment.append(c3);
                    token$Comment2.append(c2);
                    object = TokeniserState.Comment;
                    tokeniser.transition((TokeniserState)((Object)object));
                } else {
                    tokeniser.eofError(this);
                    tokeniser.emitCommentPending();
                    object = TokeniserState.Data;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            } else {
                object = TokeniserState.CommentEnd;
                tokeniser.transition((TokeniserState)((Object)object));
            }
        } else {
            tokeniser.error(this);
            object = tokeniser.commentPending.append(c3);
            c3 = (char)-3;
            ((Token$Comment)object).append(c3);
            object = TokeniserState.Comment;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

