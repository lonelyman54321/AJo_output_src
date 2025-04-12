/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.Token;
import org.jsoup.parser.Token$TokenType;

final class Token$Comment
extends Token {
    boolean bogus;
    private final StringBuilder data;
    private String dataS;

    public Token$Comment() {
        super(null);
        Object object;
        this.data = object = new StringBuilder();
        this.bogus = false;
        object = Token$TokenType.Comment;
        this.type = object;
    }

    private void ensureData() {
        String string2 = this.dataS;
        if (string2 != null) {
            StringBuilder stringBuilder = this.data;
            stringBuilder.append(string2);
            string2 = null;
            this.dataS = null;
        }
    }

    public Token$Comment append(char c2) {
        this.ensureData();
        this.data.append(c2);
        return this;
    }

    public Token$Comment append(String string2) {
        this.ensureData();
        StringBuilder stringBuilder = this.data;
        int n3 = stringBuilder.length();
        if (n3 == 0) {
            this.dataS = string2;
        } else {
            stringBuilder = this.data;
            stringBuilder.append(string2);
        }
        return this;
    }

    public String getData() {
        String string2 = this.dataS;
        if (string2 == null) {
            string2 = this.data.toString();
        }
        return string2;
    }

    public Token reset() {
        super.reset();
        Token.reset(this.data);
        this.dataS = null;
        this.bogus = false;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("<!--");
        String string2 = this.getData();
        return h30_0.a(stringBuilder, string2, "-->");
    }
}

