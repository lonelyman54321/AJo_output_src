/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

final class TokeniserState$34
extends TokeniserState {
    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void read(Tokeniser var1_1, CharacterReader var2_2) {
        block5: {
            var3_3 = var2_2 /* !! */ .consume();
            if (var3_3 == 0) break block5;
            var4_4 = 32;
            if (var3_3 == var4_4) return;
            var4_4 = 34;
            if (var3_3 == var4_4 || var3_3 == (var4_4 = 39)) ** GOTO lbl-1000
            var4_4 = 47;
            if (var3_3 == var4_4) ** GOTO lbl33
            var4_4 = (char)-1;
            if (var3_3 == var4_4) ** GOTO lbl29
            var4_4 = 9;
            if (var3_3 == var4_4 || var3_3 == (var4_4 = 10) || var3_3 == (var4_4 = 12) || var3_3 == (var4_4 = 13)) return;
            switch (var3_3) {
                default: {
                    var5_5 = var1_1.tagPending;
                    var5_5.newAttribute();
                    var2_2 /* !! */ .unconsume();
                    var2_2 /* !! */  = TokeniserState.AttributeName;
                    var1_1.transition((TokeniserState)var2_2 /* !! */ );
                    return;
                }
                case 60: {
                    var2_2 /* !! */ .unconsume();
                    var1_1.error(this);
                }
                case 62: {
                    var1_1.emitTagPending();
                    var2_2 /* !! */  = TokeniserState.Data;
                    var1_1.transition((TokeniserState)var2_2 /* !! */ );
                    return;
                }
lbl29:
                // 1 sources

                var1_1.eofError(this);
                var2_2 /* !! */  = TokeniserState.Data;
                var1_1.transition((TokeniserState)var2_2 /* !! */ );
                return;
lbl33:
                // 1 sources

                var2_2 /* !! */  = TokeniserState.SelfClosingStartTag;
                var1_1.transition((TokeniserState)var2_2 /* !! */ );
                return;
                case 61: lbl-1000:
                // 2 sources

                {
                    var1_1.error(this);
                    var1_1.tagPending.newAttribute();
                    var6_6 = var1_1.tagPending;
                    var7_7 = var2_2 /* !! */ .pos() + -1;
                    var8_8 = var2_2 /* !! */ .pos();
                    var6_6.appendAttributeName((char)var3_3, var7_7, var8_8);
                    var2_2 /* !! */  = TokeniserState.AttributeName;
                    var1_1.transition((TokeniserState)var2_2 /* !! */ );
                    return;
                }
            }
        }
        var2_2 /* !! */ .unconsume();
        var1_1.error(this);
        var1_1.tagPending.newAttribute();
        var2_2 /* !! */  = TokeniserState.AttributeName;
        var1_1.transition((TokeniserState)var2_2 /* !! */ );
    }
}

