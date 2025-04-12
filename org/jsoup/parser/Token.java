/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.Token$1;
import org.jsoup.parser.Token$CData;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$Doctype;
import org.jsoup.parser.Token$EndTag;
import org.jsoup.parser.Token$StartTag;
import org.jsoup.parser.Token$TokenType;

abstract class Token {
    static final int Unset = 255;
    private int endPos = -1;
    private int startPos;
    Token$TokenType type;

    private Token() {
    }

    public /* synthetic */ Token(Token$1 token$1) {
        this();
    }

    public static void reset(StringBuilder stringBuilder) {
        if (stringBuilder != null) {
            int n3 = stringBuilder.length();
            stringBuilder.delete(0, n3);
        }
    }

    public final Token$Character asCharacter() {
        return (Token$Character)this;
    }

    public final Token$Comment asComment() {
        return (Token$Comment)this;
    }

    public final Token$Doctype asDoctype() {
        return (Token$Doctype)this;
    }

    public final Token$EndTag asEndTag() {
        return (Token$EndTag)this;
    }

    public final Token$StartTag asStartTag() {
        return (Token$StartTag)this;
    }

    public int endPos() {
        return this.endPos;
    }

    public void endPos(int n3) {
        this.endPos = n3;
    }

    public final boolean isCData() {
        return this instanceof CData;
    }

    public final boolean isCharacter() {
        boolean bl2;
        Token$TokenType token$TokenType = this.type;
        Token$TokenType token$TokenType2 = Token$TokenType.Character;
        if (token$TokenType == token$TokenType2) {
            bl2 = true;
        } else {
            bl2 = false;
            token$TokenType = null;
        }
        return bl2;
    }

    public final boolean isComment() {
        boolean bl2;
        Token$TokenType token$TokenType = this.type;
        Token$TokenType token$TokenType2 = Token$TokenType.Comment;
        if (token$TokenType == token$TokenType2) {
            bl2 = true;
        } else {
            bl2 = false;
            token$TokenType = null;
        }
        return bl2;
    }

    public final boolean isDoctype() {
        boolean bl2;
        Token$TokenType token$TokenType = this.type;
        Token$TokenType token$TokenType2 = Token$TokenType.Doctype;
        if (token$TokenType == token$TokenType2) {
            bl2 = true;
        } else {
            bl2 = false;
            token$TokenType = null;
        }
        return bl2;
    }

    public final boolean isEOF() {
        boolean bl2;
        Token$TokenType token$TokenType = this.type;
        Token$TokenType token$TokenType2 = Token$TokenType.EOF;
        if (token$TokenType == token$TokenType2) {
            bl2 = true;
        } else {
            bl2 = false;
            token$TokenType = null;
        }
        return bl2;
    }

    public final boolean isEndTag() {
        boolean bl2;
        Token$TokenType token$TokenType = this.type;
        Token$TokenType token$TokenType2 = Token$TokenType.EndTag;
        if (token$TokenType == token$TokenType2) {
            bl2 = true;
        } else {
            bl2 = false;
            token$TokenType = null;
        }
        return bl2;
    }

    public final boolean isStartTag() {
        boolean bl2;
        Token$TokenType token$TokenType = this.type;
        Token$TokenType token$TokenType2 = Token$TokenType.StartTag;
        if (token$TokenType == token$TokenType2) {
            bl2 = true;
        } else {
            bl2 = false;
            token$TokenType = null;
        }
        return bl2;
    }

    public Token reset() {
        int n3;
        this.startPos = n3 = -1;
        this.endPos = n3;
        return this;
    }

    public int startPos() {
        return this.startPos;
    }

    public void startPos(int n3) {
        this.startPos = n3;
    }

    public String tokenType() {
        return this.getClass().getSimpleName();
    }
}

