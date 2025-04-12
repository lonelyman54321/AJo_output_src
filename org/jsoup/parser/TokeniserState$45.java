/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$45
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        char c2 = ((CharacterReader)object).consume();
        if (c2 != '\u0000') {
            char c3 = '-';
            if (c2 != c3) {
                c3 = '>';
                if (c2 != c3) {
                    c3 = (char)-1;
                    if (c2 != c3) {
                        ((CharacterReader)object).unconsume();
                        object = TokeniserState.Comment;
                        tokeniser.transition((TokeniserState)((Object)object));
                    } else {
                        tokeniser.eofError(this);
                        tokeniser.emitCommentPending();
                        object = TokeniserState.Data;
                        tokeniser.transition((TokeniserState)((Object)object));
                    }
                } else {
                    tokeniser.error(this);
                    tokeniser.emitCommentPending();
                    object = TokeniserState.Data;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            } else {
                object = TokeniserState.CommentStartDash;
                tokeniser.transition((TokeniserState)((Object)object));
            }
        } else {
            tokeniser.error(this);
            object = tokeniser.commentPending;
            c2 = (char)-3;
            ((Token$Comment)object).append(c2);
            object = TokeniserState.Comment;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

