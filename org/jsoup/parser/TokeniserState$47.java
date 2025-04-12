/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$47
extends TokeniserState {
    public void read(Tokeniser object, CharacterReader object2) {
        int n3 = ((CharacterReader)object2).current();
        if (n3 != 0) {
            int n4 = 45;
            if (n3 != n4) {
                n4 = (char)-1;
                if (n3 != n4) {
                    object = ((Tokeniser)object).commentPending;
                    n3 = 2;
                    char[] cArray = new char[n3];
                    cArray[0] = 45;
                    cArray[1] = '\u0000';
                    object2 = ((CharacterReader)object2).consumeToAny(cArray);
                    ((Token$Comment)object).append((String)object2);
                } else {
                    ((Tokeniser)object).eofError(this);
                    ((Tokeniser)object).emitCommentPending();
                    object2 = TokeniserState.Data;
                    ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                }
            } else {
                object2 = TokeniserState.CommentEndDash;
                ((Tokeniser)object).advanceTransition((TokeniserState)((Object)object2));
            }
        } else {
            ((Tokeniser)object).error(this);
            ((CharacterReader)object2).advance();
            object = ((Tokeniser)object).commentPending;
            char c2 = (char)-3;
            ((Token$Comment)object).append(c2);
        }
    }
}

