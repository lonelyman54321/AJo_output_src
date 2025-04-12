/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$8
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        int n3;
        int n4 = object.current();
        if (n4 != (n3 = 33)) {
            n3 = 47;
            if (n4 != n3) {
                n3 = 63;
                if (n4 != n3) {
                    char c2 = object.matchesAsciiAlpha();
                    if (c2 != '\u0000') {
                        c2 = '\u0001';
                        tokeniser.createTagPending(c2 != 0);
                        object = TokeniserState.TagName;
                        tokeniser.transition((TokeniserState)((Object)object));
                    } else {
                        tokeniser.error(this);
                        c2 = '<';
                        tokeniser.emit(c2);
                        object = TokeniserState.Data;
                        tokeniser.transition((TokeniserState)((Object)object));
                    }
                } else {
                    tokeniser.createBogusCommentPending();
                    object = TokeniserState.BogusComment;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            } else {
                object = TokeniserState.EndTagOpen;
                tokeniser.advanceTransition((TokeniserState)((Object)object));
            }
        } else {
            object = TokeniserState.MarkupDeclarationOpen;
            tokeniser.advanceTransition((TokeniserState)((Object)object));
        }
    }
}

