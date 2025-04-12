/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

public final class Token$TokenType
extends Enum {
    private static final /* synthetic */ Token$TokenType[] $VALUES;
    public static final /* enum */ Token$TokenType Character;
    public static final /* enum */ Token$TokenType Comment;
    public static final /* enum */ Token$TokenType Doctype;
    public static final /* enum */ Token$TokenType EOF;
    public static final /* enum */ Token$TokenType EndTag;
    public static final /* enum */ Token$TokenType StartTag;

    private static /* synthetic */ Token$TokenType[] $values() {
        Token$TokenType token$TokenType = Doctype;
        token$TokenType = StartTag;
        token$TokenType = EndTag;
        token$TokenType = Comment;
        token$TokenType = Character;
        token$TokenType = EOF;
        Token$TokenType[] token$TokenTypeArray = new Token$TokenType[]{token$TokenType, token$TokenType, token$TokenType, token$TokenType, token$TokenType, token$TokenType};
        return token$TokenTypeArray;
    }

    static {
        Token$TokenType token$TokenType;
        Doctype = token$TokenType = new Token$TokenType("Doctype", 0);
        StartTag = token$TokenType = new Token$TokenType("StartTag", 1);
        EndTag = token$TokenType = new Token$TokenType("EndTag", 2);
        Comment = token$TokenType = new Token$TokenType("Comment", 3);
        Character = token$TokenType = new Token$TokenType("Character", 4);
        EOF = token$TokenType = new Token$TokenType("EOF", 5);
        $VALUES = Token$TokenType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Token$TokenType() {
        void var2_-1;
        void var1_-1;
    }

    public static Token$TokenType valueOf(String string2) {
        return Enum.valueOf(Token$TokenType.class, string2);
    }

    public static Token$TokenType[] values() {
        return (Token$TokenType[])$VALUES.clone();
    }
}

