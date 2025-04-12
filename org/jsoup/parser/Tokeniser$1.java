/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.TokeniserState;

class Tokeniser$1 {
    static final /* synthetic */ int[] $SwitchMap$org$jsoup$parser$TokeniserState;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        TokeniserState tokeniserState;
        int n7 = TokeniserState.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$org$jsoup$parser$TokeniserState = nArray;
        try {
            tokeniserState = TokeniserState.TagOpen;
            n4 = tokeniserState.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$org$jsoup$parser$TokeniserState;
            tokeniserState = TokeniserState.Data;
            n4 = tokeniserState.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

