/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$64
extends TokeniserState {
    public void read(Tokeniser object, CharacterReader object2) {
        char c2 = object2.consume();
        if (c2 != '\u0000') {
            char c3 = '\'';
            if (c2 != c3) {
                c3 = '>';
                boolean bl2 = true;
                if (c2 != c3) {
                    c3 = (char)-1;
                    if (c2 != c3) {
                        object = ((Tokeniser)object).doctypePending.systemIdentifier;
                        ((StringBuilder)object).append(c2);
                    } else {
                        ((Tokeniser)object).eofError(this);
                        ((Tokeniser)object).doctypePending.forceQuirks = bl2;
                        ((Tokeniser)object).emitDoctypePending();
                        object2 = TokeniserState.Data;
                        ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                    }
                } else {
                    ((Tokeniser)object).error(this);
                    ((Tokeniser)object).doctypePending.forceQuirks = bl2;
                    ((Tokeniser)object).emitDoctypePending();
                    object2 = TokeniserState.Data;
                    ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                }
            } else {
                object2 = TokeniserState.AfterDoctypeSystemIdentifier;
                ((Tokeniser)object).transition((TokeniserState)((Object)object2));
            }
        } else {
            ((Tokeniser)object).error(this);
            object = ((Tokeniser)object).doctypePending.systemIdentifier;
            c2 = (char)-3;
            ((StringBuilder)object).append(c2);
        }
    }
}

