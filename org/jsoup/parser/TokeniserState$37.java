/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$37
extends TokeniserState {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void read(Tokeniser var1_1, CharacterReader var2_2) {
        block5: {
            block4: {
                block6: {
                    var3_3 = var2_2.consume();
                    if (var3_3 == 0) break block4;
                    var4_4 = 32;
                    if (var3_3 == var4_4) break block5;
                    var4_4 = 34;
                    if (var3_3 == var4_4) break block6;
                    var4_4 = 96;
                    if (var3_3 == var4_4) ** GOTO lbl-1000
                    var4_4 = (char)-1;
                    if (var3_3 == var4_4) ** GOTO lbl36
                    var4_4 = 9;
                    if (var3_3 == var4_4 || var3_3 == (var4_4 = 10) || var3_3 == (var4_4 = 12) || var3_3 == (var4_4 = 13)) break block5;
                    var4_4 = 38;
                    if (var3_3 == var4_4) ** GOTO lbl32
                    var4_4 = 39;
                    if (var3_3 == var4_4) ** GOTO lbl29
                    switch (var3_3) {
                        default: {
                            var2_2.unconsume();
                            var2_2 = TokeniserState.AttributeValue_unquoted;
                            var1_1.transition((TokeniserState)var2_2);
                            break;
                        }
                        case 62: {
                            var1_1.error(this);
                            var1_1.emitTagPending();
                            var2_2 = TokeniserState.Data;
                            var1_1.transition((TokeniserState)var2_2);
                            break;
                        }
lbl29:
                        // 1 sources

                        var2_2 = TokeniserState.AttributeValue_singleQuoted;
                        var1_1.transition((TokeniserState)var2_2);
                        break;
lbl32:
                        // 1 sources

                        var2_2.unconsume();
                        var2_2 = TokeniserState.AttributeValue_unquoted;
                        var1_1.transition((TokeniserState)var2_2);
                        break;
lbl36:
                        // 1 sources

                        var1_1.eofError(this);
                        var1_1.emitTagPending();
                        var2_2 = TokeniserState.Data;
                        var1_1.transition((TokeniserState)var2_2);
                        break;
                        case 60: 
                        case 61: lbl-1000:
                        // 2 sources

                        {
                            var1_1.error(this);
                            var5_6 = var1_1.tagPending;
                            var6_7 = var2_2.pos() + -1;
                            var7_9 = var2_2.pos();
                            var5_6.appendAttributeValue((char)var3_3, var6_7, var7_9);
                            var2_2 = TokeniserState.AttributeValue_unquoted;
                            var1_1.transition((TokeniserState)var2_2);
                            break;
                        }
                    }
                    break block5;
                }
                var2_2 = TokeniserState.AttributeValue_doubleQuoted;
                var1_1.transition((TokeniserState)var2_2);
                break block5;
            }
            var1_1.error(this);
            var8_11 = var1_1.tagPending;
            var4_5 = var2_2.pos() + -1;
            var7_10 = var2_2.pos();
            var6_8 = (char)-3;
            var8_11.appendAttributeValue(var6_8, var4_5, var7_10);
            var2_2 = TokeniserState.AttributeValue_unquoted;
            var1_1.transition((TokeniserState)var2_2);
        }
    }
}

