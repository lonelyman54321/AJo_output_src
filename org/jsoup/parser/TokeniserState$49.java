/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$49
extends TokeniserState {
    public void read(Tokeniser object, CharacterReader object2) {
        char c2 = object2.consume();
        Object object3 = "--";
        if (c2 != '\u0000') {
            char c3 = '!';
            if (c2 != c3) {
                c3 = '-';
                if (c2 != c3) {
                    c3 = '>';
                    if (c2 != c3) {
                        c3 = (char)-1;
                        if (c2 != c3) {
                            Token$Comment token$Comment = ((Tokeniser)object).commentPending;
                            object3 = token$Comment.append((String)object3);
                            ((Token$Comment)object3).append(c2);
                            object2 = TokeniserState.Comment;
                            ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                        } else {
                            ((Tokeniser)object).eofError(this);
                            ((Tokeniser)object).emitCommentPending();
                            object2 = TokeniserState.Data;
                            ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                        }
                    } else {
                        ((Tokeniser)object).emitCommentPending();
                        object2 = TokeniserState.Data;
                        ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                    }
                } else {
                    object = ((Tokeniser)object).commentPending;
                    ((Token$Comment)object).append(c3);
                }
            } else {
                object2 = TokeniserState.CommentEndBang;
                ((Tokeniser)object).transition((TokeniserState)((Object)object2));
            }
        } else {
            ((Tokeniser)object).error(this);
            object2 = ((Tokeniser)object).commentPending.append((String)object3);
            char c5 = (char)-3;
            ((Token$Comment)object2).append(c5);
            object2 = TokeniserState.Comment;
            ((Tokeniser)object).transition((TokeniserState)((Object)object2));
        }
    }
}

