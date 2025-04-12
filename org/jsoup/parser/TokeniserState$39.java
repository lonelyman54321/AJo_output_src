/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Token$Tag;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$39
extends TokeniserState {
    public void read(Tokeniser object, CharacterReader object2) {
        int n3 = ((CharacterReader)object2).pos();
        char c3 = '\u0001';
        Object object3 = ((CharacterReader)object2).consumeAttributeQuoted(c3 != 0);
        int n4 = ((String)object3).length();
        if (n4 > 0) {
            Token$Tag token$Tag = ((Tokeniser)object).tagPending;
            int c2 = ((CharacterReader)object2).pos();
            token$Tag.appendAttributeValue((String)object3, n3, c2);
        } else {
            Token$Tag token$Tag = ((Tokeniser)object).tagPending;
            token$Tag.setEmptyAttributeValue();
        }
        n3 = ((CharacterReader)object2).pos();
        char c2 = ((CharacterReader)object2).consume();
        if (c2 != '\u0000') {
            n4 = (char)-1;
            if (c2 != n4) {
                n4 = 39;
                char c5 = '&';
                if (c2 != c5) {
                    if (c2 != n4) {
                        object = ((Tokeniser)object).tagPending;
                        int n8 = ((CharacterReader)object2).pos();
                        ((Token$Tag)object).appendAttributeValue(c2, n3, n8);
                    } else {
                        object2 = TokeniserState.AfterAttributeValue_quoted;
                        ((Tokeniser)object).transition((TokeniserState)((Object)object2));
                    }
                } else {
                    object3 = Character.valueOf((char)n4);
                    int[] nArray = ((Tokeniser)object).consumeCharacterReference((Character)object3, c3 != 0);
                    if (nArray != null) {
                        object = ((Tokeniser)object).tagPending;
                        int n10 = ((CharacterReader)object2).pos();
                        ((Token$Tag)object).appendAttributeValue(nArray, n3, n10);
                    } else {
                        object = ((Tokeniser)object).tagPending;
                        int n14 = ((CharacterReader)object2).pos();
                        ((Token$Tag)object).appendAttributeValue(c5, n3, n14);
                    }
                }
            } else {
                ((Tokeniser)object).eofError(this);
                object2 = TokeniserState.Data;
                ((Tokeniser)object).transition((TokeniserState)((Object)object2));
            }
        } else {
            ((Tokeniser)object).error(this);
            object = ((Tokeniser)object).tagPending;
            c3 = (char)-3;
            int n7 = ((CharacterReader)object2).pos();
            ((Token$Tag)object).appendAttributeValue(c3, n3, n7);
        }
    }
}

