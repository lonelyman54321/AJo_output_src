/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import java.io.Reader;

class BaseEncoding$3
extends Reader {
    final /* synthetic */ Reader val$delegate;
    final /* synthetic */ String val$toIgnore;

    public BaseEncoding$3(Reader reader, String string2) {
        this.val$delegate = reader;
        this.val$toIgnore = string2;
    }

    public void close() {
        this.val$delegate.close();
    }

    public int read() {
        char c2;
        String string2;
        int n3;
        Reader reader;
        int n4;
        while ((n4 = (reader = this.val$delegate).read()) != (n3 = -1) && (n3 = (string2 = this.val$toIgnore).indexOf(c2 = (char)n4)) >= 0) {
        }
        return n4;
    }

    public int read(char[] object, int n3, int n4) {
        object = new UnsupportedOperationException;
        object();
        throw object;
    }
}

