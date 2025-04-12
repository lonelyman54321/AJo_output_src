/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Token$Tag;
import org.jsoup.parser.Token$TokenType;

final class Token$StartTag
extends Token$Tag {
    final CharacterReader reader;

    public Token$StartTag(boolean bl2, CharacterReader characterReader) {
        super(bl2);
        Token$TokenType token$TokenType;
        this.type = token$TokenType = Token$TokenType.StartTag;
        this.reader = characterReader;
    }

    public Token$StartTag nameAttr(String string2, Attributes attributes) {
        this.tagName = string2;
        this.attributes = attributes;
        this.normalName = string2 = ParseSettings.normalName(string2);
        return this;
    }

    public Token$Tag reset() {
        super.reset();
        this.attributes = null;
        return this;
    }

    public String toString() {
        Object object;
        boolean bl2 = this.isSelfClosing();
        String string2 = bl2 ? "/>" : ">";
        int n3 = this.hasAttributes();
        String string3 = "<";
        if (n3 != 0 && (n3 = ((Attributes)(object = this.attributes)).size()) > 0) {
            object = new StringBuilder(string3);
            string3 = this.toStringName();
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append(" ");
            string3 = this.attributes.toString();
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append(string2);
            return ((StringBuilder)object).toString();
        }
        object = new StringBuilder(string3);
        string3 = this.toStringName();
        return h30_0.a((StringBuilder)object, string3, string2);
    }
}

