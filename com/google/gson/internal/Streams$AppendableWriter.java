/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.Streams$AppendableWriter$CurrentWrite;
import java.io.Writer;
import java.util.Objects;

final class Streams$AppendableWriter
extends Writer {
    private final Appendable appendable;
    private final Streams$AppendableWriter$CurrentWrite currentWrite;

    public Streams$AppendableWriter(Appendable appendable) {
        Streams$AppendableWriter$CurrentWrite streams$AppendableWriter$CurrentWrite;
        this.currentWrite = streams$AppendableWriter$CurrentWrite = new Streams$AppendableWriter$CurrentWrite(null);
        this.appendable = appendable;
    }

    public Writer append(CharSequence charSequence) {
        this.appendable.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int n3, int n4) {
        this.appendable.append(charSequence, n3, n4);
        return this;
    }

    public void close() {
    }

    public void flush() {
    }

    public void write(int n3) {
        Appendable appendable = this.appendable;
        n3 = (char)n3;
        appendable.append((char)n3);
    }

    public void write(String string2, int n3, int n4) {
        Objects.requireNonNull(string2);
        Appendable appendable = this.appendable;
        appendable.append(string2, n3, n4 += n3);
    }

    public void write(char[] object, int n3, int n4) {
        this.currentWrite.setChars((char[])object);
        object = this.appendable;
        Streams$AppendableWriter$CurrentWrite streams$AppendableWriter$CurrentWrite = this.currentWrite;
        object.append(streams$AppendableWriter$CurrentWrite, n3, n4 += n3);
    }
}

