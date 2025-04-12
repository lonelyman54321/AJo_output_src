/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$9
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        char c2 = object.isEmpty();
        if (c2 != '\u0000') {
            tokeniser.eofError(this);
            tokeniser.emit("</");
            object = TokeniserState.Data;
            tokeniser.transition((TokeniserState)((Object)object));
        } else {
            c2 = object.matchesAsciiAlpha();
            if (c2 != '\u0000') {
                boolean bl2 = false;
                tokeniser.createTagPending(false);
                object = TokeniserState.TagName;
                tokeniser.transition((TokeniserState)((Object)object));
            } else {
                c2 = '>';
                boolean bl3 = object.matches(c2);
                if (bl3) {
                    tokeniser.error(this);
                    object = TokeniserState.Data;
                    tokeniser.advanceTransition((TokeniserState)((Object)object));
                } else {
                    tokeniser.error(this);
                    tokeniser.createBogusCommentPending();
                    object = tokeniser.commentPending;
                    c2 = '/';
                    ((Token$Comment)object).append(c2);
                    object = TokeniserState.BogusComment;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            }
        }
    }
}

