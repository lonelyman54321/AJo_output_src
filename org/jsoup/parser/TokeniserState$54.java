/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$54
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        Object object2;
        boolean bl2 = object.isEmpty();
        boolean bl3 = true;
        if (bl2) {
            tokeniser.eofError(this);
            tokeniser.doctypePending.forceQuirks = bl3;
            tokeniser.emitDoctypePending();
            object = TokeniserState.Data;
            tokeniser.transition((TokeniserState)((Object)object));
            return;
        }
        char[] cArray = object2 = new char[5];
        char[] cArray2 = object2;
        cArray[0] = 9;
        cArray2[1] = 10;
        cArray[2] = 13;
        cArray2[3] = 12;
        cArray2[4] = 32;
        bl2 = object.matchesAny((char)object2);
        if (bl2) {
            object.advance();
        } else {
            bl2 = object.matches('>');
            if (bl2) {
                tokeniser.emitDoctypePending();
                object = TokeniserState.Data;
                tokeniser.advanceTransition((TokeniserState)((Object)object));
            } else {
                object2 = "PUBLIC";
                boolean bl4 = object.matchConsumeIgnoreCase((String)object2);
                if (bl4) {
                    tokeniser.doctypePending.pubSysKey = object2;
                    object = TokeniserState.AfterDoctypePublicKeyword;
                    tokeniser.transition((TokeniserState)((Object)object));
                } else {
                    object2 = "SYSTEM";
                    boolean bl5 = object.matchConsumeIgnoreCase((String)object2);
                    if (bl5) {
                        tokeniser.doctypePending.pubSysKey = object2;
                        object = TokeniserState.AfterDoctypeSystemKeyword;
                        tokeniser.transition((TokeniserState)((Object)object));
                    } else {
                        tokeniser.error(this);
                        tokeniser.doctypePending.forceQuirks = bl3;
                        object = TokeniserState.BogusDoctype;
                        tokeniser.advanceTransition((TokeniserState)((Object)object));
                    }
                }
            }
        }
    }
}

