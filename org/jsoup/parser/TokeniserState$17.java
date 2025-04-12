/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$17
extends TokeniserState {
    public void read(Tokeniser tokeniser, CharacterReader object) {
        int n3;
        int n4 = object.consume();
        if (n4 != (n3 = 33)) {
            n3 = 47;
            if (n4 != n3) {
                n3 = (char)-1;
                String string2 = "<";
                if (n4 != n3) {
                    tokeniser.emit(string2);
                    object.unconsume();
                    object = TokeniserState.ScriptData;
                    tokeniser.transition((TokeniserState)((Object)object));
                } else {
                    tokeniser.emit(string2);
                    tokeniser.eofError(this);
                    object = TokeniserState.Data;
                    tokeniser.transition((TokeniserState)((Object)object));
                }
            } else {
                tokeniser.createTempBuffer();
                object = TokeniserState.ScriptDataEndTagOpen;
                tokeniser.transition((TokeniserState)((Object)object));
            }
        } else {
            tokeniser.emit("<!");
            object = TokeniserState.ScriptDataEscapeStart;
            tokeniser.transition((TokeniserState)((Object)object));
        }
    }
}

