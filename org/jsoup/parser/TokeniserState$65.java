/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Doctype;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$65
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        int n3;
        int n4 = object.consume();
        if (n4 != (n3 = 9) && n4 != (n3 = 10) && n4 != (n3 = 12) && n4 != (n3 = 13) && n4 != (n3 = 32)) {
            n3 = 62;
            if (n4 != n3) {
                n3 = (char)-1;
                if (n4 != n3) {
                    tokeniser.error(this);
                    object = TokeniserState.BogusDoctype;
                    tokeniser.transition((TokeniserState)((Object)object));
                } else {
                    tokeniser.eofError(this);
                    object = tokeniser.doctypePending;
                    n3 = 1;
                    ((Token$Doctype)object).forceQuirks = n3;
                    tokeniser.emitDoctypePending();
                    object = TokeniserState.Data;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            } else {
                tokeniser.emitDoctypePending();
                object = TokeniserState.Data;
                tokeniser.transition((TokeniserState)((Object)object));
            }
        }
    }
}

