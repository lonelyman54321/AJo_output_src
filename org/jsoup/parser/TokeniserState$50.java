/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$50
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        int n3 = ((CharacterReader)object).consume();
        Object object2 = "--!";
        if (n3 != 0) {
            int n4 = 45;
            if (n3 != n4) {
                n4 = 62;
                if (n3 != n4) {
                    n4 = (char)-1;
                    if (n3 != n4) {
                        Token$Comment token$Comment = tokeniser.commentPending;
                        object2 = token$Comment.append((String)object2);
                        ((Token$Comment)object2).append((char)n3);
                        object = TokeniserState.Comment;
                        tokeniser.transition((TokeniserState)((Object)object));
                    } else {
                        tokeniser.eofError(this);
                        tokeniser.emitCommentPending();
                        object = TokeniserState.Data;
                        tokeniser.transition((TokeniserState)((Object)object));
                    }
                } else {
                    tokeniser.emitCommentPending();
                    object = TokeniserState.Data;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            } else {
                tokeniser.commentPending.append((String)object2);
                object = TokeniserState.CommentEndDash;
                tokeniser.transition((TokeniserState)((Object)object));
            }
        } else {
            tokeniser.error(this);
            object = tokeniser.commentPending.append((String)object2);
            char c2 = (char)-3;
            ((Token$Comment)object).append(c2);
            object = TokeniserState.Comment;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

