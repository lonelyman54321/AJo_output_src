/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Doctype;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$52
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        int n3 = object.matchesAsciiAlpha();
        if (n3 != 0) {
            tokeniser.createDoctypePending();
            object = TokeniserState.DoctypeName;
            tokeniser.transition((TokeniserState)((Object)object));
            return;
        }
        int n4 = object.consume();
        if (n4 != 0) {
            n3 = 32;
            if (n4 != n3) {
                n3 = (char)-1;
                if (n4 != n3) {
                    n3 = 9;
                    if (n4 != n3 && n4 != (n3 = 10) && n4 != (n3 = 12) && n4 != (n3 = 13)) {
                        tokeniser.createDoctypePending();
                        StringBuilder stringBuilder = tokeniser.doctypePending.name;
                        stringBuilder.append((char)n4);
                        object = TokeniserState.DoctypeName;
                        tokeniser.transition((TokeniserState)((Object)object));
                    }
                } else {
                    tokeniser.eofError(this);
                    tokeniser.createDoctypePending();
                    object = tokeniser.doctypePending;
                    n3 = 1;
                    ((Token$Doctype)object).forceQuirks = n3;
                    tokeniser.emitDoctypePending();
                    object = TokeniserState.Data;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            }
        } else {
            tokeniser.error(this);
            tokeniser.createDoctypePending();
            object = tokeniser.doctypePending.name;
            n3 = (char)-3;
            ((StringBuilder)object).append((char)n3);
            object = TokeniserState.DoctypeName;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

