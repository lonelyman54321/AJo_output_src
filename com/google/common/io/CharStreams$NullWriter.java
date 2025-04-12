/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.Writer;

final class CharStreams$NullWriter
extends Writer {
    private static final CharStreams$NullWriter INSTANCE;

    static {
        CharStreams$NullWriter charStreams$NullWriter;
        INSTANCE = charStreams$NullWriter = new CharStreams$NullWriter();
    }

    private CharStreams$NullWriter() {
    }

    public static /* synthetic */ CharStreams$NullWriter access$000() {
        return INSTANCE;
    }

    public Writer append(char c2) {
        return this;
    }

    public Writer append(CharSequence charSequence) {
        return this;
    }

    public Writer append(CharSequence charSequence, int n3, int n4) {
        int n7 = charSequence == null ? 4 : charSequence.length();
        Preconditions.checkPositionIndexes(n3, n4, n7);
        return this;
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        return "CharStreams.nullWriter()";
    }

    public void write(int n3) {
    }

    public void write(String string2) {
        Preconditions.checkNotNull(string2);
    }

    public void write(String string2, int n3, int n4) {
        int n7 = string2.length();
        Preconditions.checkPositionIndexes(n3, n4 += n3, n7);
    }

    public void write(char[] cArray) {
        Preconditions.checkNotNull(cArray);
    }

    public void write(char[] cArray, int n3, int n4) {
        int n7 = cArray.length;
        Preconditions.checkPositionIndexes(n3, n4 += n3, n7);
    }
}

