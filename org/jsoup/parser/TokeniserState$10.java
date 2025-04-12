/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Tag;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$10
extends TokeniserState {
    public void read(Tokeniser object, CharacterReader object2) {
        block6: {
            block0: {
                block1: {
                    block2: {
                        block4: {
                            block3: {
                                block5: {
                                    String string2 = ((CharacterReader)object2).consumeTagName();
                                    Token$Tag token$Tag = ((Tokeniser)object).tagPending;
                                    token$Tag.appendTagName(string2);
                                    int n3 = ((CharacterReader)object2).consume();
                                    if (n3 == 0) break block0;
                                    int n4 = 32;
                                    if (n3 == n4) break block1;
                                    n4 = 47;
                                    if (n3 == n4) break block2;
                                    n4 = 60;
                                    if (n3 == n4) break block3;
                                    int n7 = 62;
                                    if (n3 == n7) break block4;
                                    n7 = (char)-1;
                                    if (n3 == n7) break block5;
                                    n7 = 9;
                                    if (n3 == n7 || n3 == (n7 = 10) || n3 == (n7 = 12) || n3 == (n7 = 13)) break block1;
                                    object = ((Tokeniser)object).tagPending;
                                    ((Token$Tag)object).appendTagName((char)n3);
                                    break block6;
                                }
                                ((Tokeniser)object).eofError(this);
                                object2 = TokeniserState.Data;
                                ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                                break block6;
                            }
                            ((CharacterReader)object2).unconsume();
                            ((Tokeniser)object).error(this);
                        }
                        ((Tokeniser)object).emitTagPending();
                        object2 = TokeniserState.Data;
                        ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                        break block6;
                    }
                    object2 = TokeniserState.SelfClosingStartTag;
                    ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                    break block6;
                }
                object2 = TokeniserState.BeforeAttributeName;
                ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                break block6;
            }
            object = ((Tokeniser)object).tagPending;
            object2 = TokeniserState.access$300();
            ((Token$Tag)object).appendTagName((String)object2);
        }
    }
}

