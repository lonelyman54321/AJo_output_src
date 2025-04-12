/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$40
extends TokeniserState {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void read(Tokeniser var1_1, CharacterReader var2_2) {
        block9: {
            block7: {
                block8: {
                    var3_3 = var2_2.pos();
                    var4_4 /* !! */  = TokeniserState.attributeValueUnquoted;
                    var5_5 = (var4_4 /* !! */  = (char[])var2_2.consumeToAnySorted(var4_4 /* !! */ )).length();
                    if (var5_5 > 0) {
                        var6_6 = var1_1.tagPending;
                        var7_7 = var2_2.pos();
                        var6_6.appendAttributeValue((String)var4_4 /* !! */ , var3_3, (int)var7_7);
                    }
                    var3_3 = var2_2.pos();
                    var8_8 = var2_2.consume();
                    if (var8_8 == 0) break block7;
                    var5_5 = 32;
                    if (var8_8 == var5_5) break block8;
                    var5_5 = 34;
                    if (var8_8 == var5_5 || var8_8 == (var5_5 = 96)) ** GOTO lbl-1000
                    var5_5 = (char)-1;
                    if (var8_8 == var5_5) ** GOTO lbl47
                    var5_5 = 9;
                    if (var8_8 == var5_5 || var8_8 == (var5_5 = 10) || var8_8 == (var5_5 = 12) || var8_8 == (var5_5 = 13)) break block8;
                    var5_5 = 38;
                    if (var8_8 == var5_5) ** GOTO lbl-1000
                    var5_5 = 39;
                    if (var8_8 != var5_5) {
                        switch (var8_8) {
                            default: {
                                var1_1 = var1_1.tagPending;
                                var9_9 = var2_2.pos();
                                var1_1.appendAttributeValue((char)var8_8, var3_3, var9_9);
                                break;
                            }
                            case 62: {
                                var1_1.emitTagPending();
                                var2_2 = TokeniserState.Data;
                                var1_1.transition((TokeniserState)var2_2);
                                break;
                            }
                        }
                    }
                    ** GOTO lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        var8_8 = 62;
                        var4_4 /* !! */  = Character.valueOf((char)var8_8);
                        var7_7 = true;
                        if ((var4_4 /* !! */  = (char[])var1_1.consumeCharacterReference((Character)var4_4 /* !! */ , var7_7)) != null) {
                            var1_1 = var1_1.tagPending;
                            var9_10 = var2_2.pos();
                            var1_1.appendAttributeValue(var4_4 /* !! */ , var3_3, var9_10);
                            break;
                        }
                        var1_1 = var1_1.tagPending;
                        var9_11 = var2_2.pos();
                        var1_1.appendAttributeValue((char)var5_5, var3_3, var9_11);
                        break;
lbl47:
                        // 1 sources

                        var1_1.eofError(this);
                        var2_2 = TokeniserState.Data;
                        var1_1.transition((TokeniserState)var2_2);
                        break;
                        case 60: 
                        case 61: lbl-1000:
                        // 3 sources

                        {
                            var1_1.error(this);
                            var1_1 = var1_1.tagPending;
                            var9_12 = var2_2.pos();
                            var1_1.appendAttributeValue((char)var8_8, var3_3, var9_12);
                            break;
                        }
                    }
                    break block9;
                }
                var2_2 = TokeniserState.BeforeAttributeName;
                var1_1.transition((TokeniserState)var2_2);
                break block9;
            }
            var1_1.error(this);
            var1_1 = var1_1.tagPending;
            var8_8 = (char)-3;
            var9_13 = var2_2.pos();
            var1_1.appendAttributeValue((char)var8_8, var3_3, var9_13);
        }
    }
}

