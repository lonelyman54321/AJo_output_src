/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.Token$Tag;
import org.jsoup.parser.Token$TokenType;

final class Token$EndTag
extends Token$Tag {
    public Token$EndTag() {
        super(false);
        Token$TokenType token$TokenType;
        this.type = token$TokenType = Token$TokenType.EndTag;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("</");
        String string2 = this.toStringName();
        return h30_0.a(stringBuilder, string2, ">");
    }
}

