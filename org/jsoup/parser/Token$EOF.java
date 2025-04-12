/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.Token;
import org.jsoup.parser.Token$TokenType;

final class Token$EOF
extends Token {
    public Token$EOF() {
        super(null);
        Token$TokenType token$TokenType;
        this.type = token$TokenType = Token$TokenType.EOF;
    }

    public Token reset() {
        super.reset();
        return this;
    }

    public String toString() {
        return "";
    }
}

