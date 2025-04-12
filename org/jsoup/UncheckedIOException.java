/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup;

import java.io.IOException;

public class UncheckedIOException
extends java.io.UncheckedIOException {
    public UncheckedIOException(IOException iOException) {
        super(iOException);
    }

    public UncheckedIOException(String string2) {
        IOException iOException = new IOException(string2);
        super(iOException);
    }

    public IOException ioException() {
        return kv3_0.a(this);
    }
}

