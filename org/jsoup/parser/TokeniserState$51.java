/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Doctype;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$51
extends TokeniserState {
    /*
     * Enabled aggressive block sorting
     */
    public void read(Tokeniser tokeniser, CharacterReader object) {
        int n3;
        int n4 = ((CharacterReader)object).consume();
        if (n4 != (n3 = 9) && n4 != (n3 = 10) && n4 != (n3 = 12) && n4 != (n3 = 13) && n4 != (n3 = 32)) {
            n3 = 62;
            if (n4 != n3) {
                n3 = (char)-1;
                if (n4 != n3) {
                    tokeniser.error(this);
                    TokeniserState tokeniserState = TokeniserState.BeforeDoctypeName;
                    tokeniser.transition(tokeniserState);
                    return;
                }
                tokeniser.eofError(this);
            }
            tokeniser.error(this);
            tokeniser.createDoctypePending();
            Token$Doctype token$Doctype = tokeniser.doctypePending;
            n3 = 1;
            token$Doctype.forceQuirks = n3;
            tokeniser.emitDoctypePending();
            TokeniserState tokeniserState = TokeniserState.Data;
            tokeniser.transition(tokeniserState);
            return;
        }
        TokeniserState tokeniserState = TokeniserState.BeforeDoctypeName;
        tokeniser.transition(tokeniserState);
    }
}

