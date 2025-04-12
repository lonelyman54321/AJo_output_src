/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.Streams$1;

class Streams$AppendableWriter$CurrentWrite
implements CharSequence {
    private String cachedString;
    private char[] chars;

    private Streams$AppendableWriter$CurrentWrite() {
    }

    public /* synthetic */ Streams$AppendableWriter$CurrentWrite(Streams$1 streams$1) {
        this();
    }

    public char charAt(int n3) {
        return this.chars[n3];
    }

    public int length() {
        return this.chars.length;
    }

    public void setChars(char[] cArray) {
        this.chars = cArray;
        this.cachedString = null;
    }

    public CharSequence subSequence(int n3, int n4) {
        char[] cArray = this.chars;
        String string2 = new String(cArray, n3, n4 -= n3);
        return string2;
    }

    public String toString() {
        String string2 = this.cachedString;
        if (string2 == null) {
            char[] cArray = this.chars;
            this.cachedString = string2 = new String(cArray);
        }
        return this.cachedString;
    }
}

