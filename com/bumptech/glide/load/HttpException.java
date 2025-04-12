/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load;

import java.io.IOException;

public final class HttpException
extends IOException {
    private static final long serialVersionUID = 1L;

    public HttpException(int n3, IOException iOException, String string2) {
        String string3 = LO1.a(n3, string2, ", status code: ");
        super(string3, iOException);
    }
}

