/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$44
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        String string2 = "--";
        boolean bl2 = object.matchConsume(string2);
        if (bl2) {
            tokeniser.createCommentPending();
            object = TokeniserState.CommentStart;
            tokeniser.transition((TokeniserState)((Object)object));
        } else {
            string2 = "DOCTYPE";
            bl2 = object.matchConsumeIgnoreCase(string2);
            if (bl2) {
                object = TokeniserState.Doctype;
                tokeniser.transition((TokeniserState)((Object)object));
            } else {
                string2 = "[CDATA[";
                boolean bl3 = object.matchConsume(string2);
                if (bl3) {
                    tokeniser.createTempBuffer();
                    object = TokeniserState.CdataSection;
                    tokeniser.transition((TokeniserState)((Object)object));
                } else {
                    tokeniser.error(this);
                    tokeniser.createBogusCommentPending();
                    object = TokeniserState.BogusComment;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            }
        }
    }
}

