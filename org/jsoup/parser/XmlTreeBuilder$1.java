/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.Token$TokenType;

class XmlTreeBuilder$1 {
    static final /* synthetic */ int[] $SwitchMap$org$jsoup$parser$Token$TokenType;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Token$TokenType token$TokenType;
        int n7 = Token$TokenType.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$org$jsoup$parser$Token$TokenType = nArray;
        try {
            token$TokenType = Token$TokenType.StartTag;
            n4 = token$TokenType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$org$jsoup$parser$Token$TokenType;
            token$TokenType = Token$TokenType.EndTag;
            n4 = token$TokenType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$org$jsoup$parser$Token$TokenType;
            token$TokenType = Token$TokenType.Comment;
            n4 = token$TokenType.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$org$jsoup$parser$Token$TokenType;
            token$TokenType = Token$TokenType.Character;
            n4 = token$TokenType.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$org$jsoup$parser$Token$TokenType;
            token$TokenType = Token$TokenType.Doctype;
            n4 = token$TokenType.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$org$jsoup$parser$Token$TokenType;
            token$TokenType = Token$TokenType.EOF;
            n4 = token$TokenType.ordinal();
            nArray[n4] = n3 = 6;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

