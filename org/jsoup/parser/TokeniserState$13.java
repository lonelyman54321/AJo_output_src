/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$13
extends TokeniserState {
    private void anythingElse(Tokeniser tokeniser, CharacterReader object) {
        tokeniser.emit("</");
        StringBuilder stringBuilder = tokeniser.dataBuffer;
        tokeniser.emit(stringBuilder);
        object.unconsume();
        object = TokeniserState.Rcdata;
        tokeniser.transition((TokeniserState)((Object)object));
    }

    public void read(Tokeniser tokeniser, CharacterReader object) {
        int n3;
        boolean n4 = ((CharacterReader)object).matchesAsciiAlpha();
        if (n4) {
            object = ((CharacterReader)object).consumeLetterSequence();
            tokeniser.tagPending.appendTagName((String)object);
            tokeniser.dataBuffer.append((String)object);
            return;
        }
        int n7 = ((CharacterReader)object).consume();
        if (n7 != (n3 = 9) && n7 != (n3 = 10) && n7 != (n3 = 12) && n7 != (n3 = 13) && n7 != (n3 = 32)) {
            n3 = 47;
            if (n7 != n3) {
                n3 = 62;
                if (n7 != n3) {
                    this.anythingElse(tokeniser, (CharacterReader)object);
                } else {
                    boolean bl2 = tokeniser.isAppropriateEndTagToken();
                    if (bl2) {
                        tokeniser.emitTagPending();
                        object = TokeniserState.Data;
                        tokeniser.transition((TokeniserState)((Object)object));
                    } else {
                        this.anythingElse(tokeniser, (CharacterReader)object);
                    }
                }
            } else {
                boolean bl3 = tokeniser.isAppropriateEndTagToken();
                if (bl3) {
                    object = TokeniserState.SelfClosingStartTag;
                    tokeniser.transition((TokeniserState)((Object)object));
                } else {
                    this.anythingElse(tokeniser, (CharacterReader)object);
                }
            }
        } else {
            boolean bl4 = tokeniser.isAppropriateEndTagToken();
            if (bl4) {
                object = TokeniserState.BeforeAttributeName;
                tokeniser.transition((TokeniserState)((Object)object));
            } else {
                this.anythingElse(tokeniser, (CharacterReader)object);
            }
        }
    }
}

