/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

class AppendableWriter
extends Writer {
    private boolean closed;
    private final Appendable target;

    public AppendableWriter(Appendable appendable) {
        this.target = appendable = (Appendable)Preconditions.checkNotNull(appendable);
    }

    private void checkNotClosed() {
        boolean bl2 = this.closed;
        if (!bl2) {
            return;
        }
        IOException iOException = new IOException("Cannot write to a closed writer.");
        throw iOException;
    }

    public Writer append(char c2) {
        this.checkNotClosed();
        this.target.append(c2);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        this.checkNotClosed();
        this.target.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int n3, int n4) {
        this.checkNotClosed();
        this.target.append(charSequence, n3, n4);
        return this;
    }

    public void close() {
        boolean bl2;
        this.closed = bl2 = true;
        Object object = this.target;
        boolean bl3 = object instanceof Closeable;
        if (bl3) {
            object = (Closeable)object;
            object.close();
        }
    }

    public void flush() {
        this.checkNotClosed();
        Object object = this.target;
        boolean bl2 = object instanceof Flushable;
        if (bl2) {
            object = (Flushable)object;
            object.flush();
        }
    }

    public void write(int n3) {
        this.checkNotClosed();
        Appendable appendable = this.target;
        n3 = (char)n3;
        appendable.append((char)n3);
    }

    public void write(String string2) {
        Preconditions.checkNotNull(string2);
        this.checkNotClosed();
        this.target.append(string2);
    }

    public void write(String string2, int n3, int n4) {
        Preconditions.checkNotNull(string2);
        this.checkNotClosed();
        Appendable appendable = this.target;
        appendable.append(string2, n3, n4 += n3);
    }

    public void write(char[] cArray, int n3, int n4) {
        this.checkNotClosed();
        Appendable appendable = this.target;
        String string2 = new String(cArray, n3, n4);
        appendable.append(string2);
    }
}

