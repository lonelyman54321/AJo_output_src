/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.Token$Character;

final class Token$CData
extends Token$Character {
    public Token$CData(String string2) {
        this.data(string2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("<![CDATA[");
        String string2 = this.getData();
        return h30_0.a(stringBuilder, string2, "]]>");
    }
}

