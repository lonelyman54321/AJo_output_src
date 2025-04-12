/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Doctype;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$53
extends TokeniserState {
    public void read(Tokeniser object, CharacterReader object2) {
        block5: {
            char c2;
            block1: {
                block2: {
                    block3: {
                        boolean bl2;
                        block4: {
                            char c3;
                            char c5;
                            char c6;
                            boolean c32 = ((CharacterReader)object2).matchesLetter();
                            if (c32) {
                                object2 = ((CharacterReader)object2).consumeLetterSequence();
                                ((Tokeniser)object).doctypePending.name.append((String)object2);
                                return;
                            }
                            c2 = ((CharacterReader)object2).consume();
                            if (c2 == '\u0000') break block1;
                            char c7 = ' ';
                            if (c2 == c7) break block2;
                            char c8 = '>';
                            if (c2 == c8) break block3;
                            char c10 = (char)-1;
                            if (c2 == c10) break block4;
                            char c11 = '\t';
                            if (c2 == c11 || c2 == (c6 = '\n') || c2 == (c5 = '\f') || c2 == (c3 = '\r')) break block2;
                            object = ((Tokeniser)object).doctypePending.name;
                            ((StringBuilder)object).append(c2);
                            break block5;
                        }
                        ((Tokeniser)object).eofError(this);
                        object2 = ((Tokeniser)object).doctypePending;
                        ((Token$Doctype)object2).forceQuirks = bl2 = true;
                        ((Tokeniser)object).emitDoctypePending();
                        object2 = TokeniserState.Data;
                        ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                        break block5;
                    }
                    ((Tokeniser)object).emitDoctypePending();
                    object2 = TokeniserState.Data;
                    ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                    break block5;
                }
                object2 = TokeniserState.AfterDoctypeName;
                ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                break block5;
            }
            ((Tokeniser)object).error(this);
            object = ((Tokeniser)object).doctypePending.name;
            c2 = (char)-3;
            ((StringBuilder)object).append(c2);
        }
    }
}

