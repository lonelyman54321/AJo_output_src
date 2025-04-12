/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.Token;
import org.jsoup.parser.Token$TokenType;

final class Token$Doctype
extends Token {
    boolean forceQuirks;
    final StringBuilder name;
    String pubSysKey;
    final StringBuilder publicIdentifier;
    final StringBuilder systemIdentifier;

    public Token$Doctype() {
        super(null);
        Object object;
        StringBuilder stringBuilder;
        this.name = stringBuilder = new StringBuilder();
        this.pubSysKey = null;
        this.publicIdentifier = object = new StringBuilder();
        this.systemIdentifier = object = new StringBuilder();
        this.forceQuirks = false;
        object = Token$TokenType.Doctype;
        this.type = object;
    }

    public String getName() {
        return this.name.toString();
    }

    public String getPubSysKey() {
        return this.pubSysKey;
    }

    public String getPublicIdentifier() {
        return this.publicIdentifier.toString();
    }

    public String getSystemIdentifier() {
        return this.systemIdentifier.toString();
    }

    public boolean isForceQuirks() {
        return this.forceQuirks;
    }

    public Token reset() {
        super.reset();
        Token.reset(this.name);
        this.pubSysKey = null;
        Token.reset(this.publicIdentifier);
        Token.reset(this.systemIdentifier);
        this.forceQuirks = false;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("<!doctype ");
        String string2 = this.getName();
        return h30_0.a(stringBuilder, string2, ">");
    }
}

