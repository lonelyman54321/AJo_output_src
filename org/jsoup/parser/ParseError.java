/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;

public class ParseError {
    private final String cursorPos;
    private final String errorMsg;
    private final int pos;

    public ParseError(int n3, String string2) {
        String string3;
        this.pos = n3;
        this.cursorPos = string3 = String.valueOf(n3);
        this.errorMsg = string2;
    }

    public ParseError(int n3, String string2, Object ... objectArray) {
        String string3;
        this.pos = n3;
        this.cursorPos = string3 = String.valueOf(n3);
        this.errorMsg = string3 = String.format(string2, objectArray);
    }

    public ParseError(CharacterReader object, String string2) {
        int n3;
        this.pos = n3 = ((CharacterReader)object).pos();
        this.cursorPos = object = ((CharacterReader)object).posLineCol();
        this.errorMsg = string2;
    }

    public ParseError(CharacterReader object, String string2, Object ... objectArray) {
        int n3;
        this.pos = n3 = ((CharacterReader)object).pos();
        this.cursorPos = object = ((CharacterReader)object).posLineCol();
        this.errorMsg = object = String.format(string2, objectArray);
    }

    public String getCursorPos() {
        return this.cursorPos;
    }

    public String getErrorMessage() {
        return this.errorMsg;
    }

    public int getPosition() {
        return this.pos;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = this.cursorPos;
        stringBuilder.append(string2);
        stringBuilder.append(">: ");
        string2 = this.errorMsg;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

