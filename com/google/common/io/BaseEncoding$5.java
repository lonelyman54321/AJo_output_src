/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import java.io.Writer;

class BaseEncoding$5
extends Writer {
    final /* synthetic */ Writer val$delegate;
    final /* synthetic */ Appendable val$separatingAppendable;

    public BaseEncoding$5(Appendable appendable, Writer writer) {
        this.val$separatingAppendable = appendable;
        this.val$delegate = writer;
    }

    public void close() {
        this.val$delegate.close();
    }

    public void flush() {
        this.val$delegate.flush();
    }

    public void write(int n3) {
        Appendable appendable = this.val$separatingAppendable;
        n3 = (char)n3;
        appendable.append((char)n3);
    }

    public void write(char[] object, int n3, int n4) {
        object = new UnsupportedOperationException;
        object();
        throw object;
    }
}

