/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$35
extends TokeniserState {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void read(Tokeniser var1_1, CharacterReader var2_2) {
        block6: {
            block5: {
                var3_3 = var2_2.pos();
                var4_4 /* !! */  = TokeniserState.attributeNameCharsSorted;
                var4_4 /* !! */  = (char[])var2_2.consumeToAnySorted(var4_4 /* !! */ );
                var5_5 = var1_1.tagPending;
                var6_6 = var2_2.pos();
                var5_5.appendAttributeName((String)var4_4 /* !! */ , var3_3, var6_6);
                var3_3 = var2_2.pos();
                var7_7 = var2_2.consume();
                var8_8 = '\t';
                if (var7_7 == var8_8 || var7_7 == (var8_8 = '\n') || var7_7 == (var8_8 = '\f') || var7_7 == (var8_8 = '\r') || var7_7 == (var8_8 = ' ')) break block5;
                var8_8 = '\"';
                if (var7_7 == var8_8 || var7_7 == (var8_8 = '\'')) ** GOTO lbl-1000
                var8_8 = '/';
                if (var7_7 == var8_8) ** GOTO lbl36
                var8_8 = (char)-1;
                if (var7_7 == var8_8) ** GOTO lbl32
                switch (var7_7) {
                    default: {
                        var1_1 = var1_1.tagPending;
                        var9_9 = var2_2.pos();
                        var1_1.appendAttributeName(var7_7, var3_3, var9_9);
                        break;
                    }
                    case '>': {
                        var1_1.emitTagPending();
                        var2_2 = TokeniserState.Data;
                        var1_1.transition((TokeniserState)var2_2);
                        break;
                    }
                    case '=': {
                        var2_2 = TokeniserState.BeforeAttributeValue;
                        var1_1.transition((TokeniserState)var2_2);
                        break;
                    }
lbl32:
                    // 1 sources

                    var1_1.eofError(this);
                    var2_2 = TokeniserState.Data;
                    var1_1.transition((TokeniserState)var2_2);
                    break;
lbl36:
                    // 1 sources

                    var2_2 = TokeniserState.SelfClosingStartTag;
                    var1_1.transition((TokeniserState)var2_2);
                    break;
                    case '<': lbl-1000:
                    // 2 sources

                    {
                        var1_1.error(this);
                        var1_1 = var1_1.tagPending;
                        var9_10 = var2_2.pos();
                        var1_1.appendAttributeName(var7_7, var3_3, var9_10);
                        break;
                    }
                }
                break block6;
            }
            var2_2 = TokeniserState.AfterAttributeName;
            var1_1.transition((TokeniserState)var2_2);
        }
    }
}

