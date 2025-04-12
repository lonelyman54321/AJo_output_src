/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.Token;
import org.jsoup.parser.Token$TokenType;

class Token$Character
extends Token
implements Cloneable {
    private String data;

    public Token$Character() {
        super(null);
        Token$TokenType token$TokenType;
        this.type = token$TokenType = Token$TokenType.Character;
    }

    public Token$Character clone() {
        Object object;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            RuntimeException runtimeException = new RuntimeException(cloneNotSupportedException);
            throw runtimeException;
        }
        return (Token$Character)object;
    }

    public Token$Character data(String string2) {
        this.data = string2;
        return this;
    }

    public String getData() {
        return this.data;
    }

    public Token reset() {
        super.reset();
        this.data = null;
        return this;
    }

    public String toString() {
        return this.getData();
    }
}

