/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.ReaderException;

public final class NotFoundException
extends ReaderException {
    private static final NotFoundException INSTANCE;

    static {
        NotFoundException notFoundException;
        INSTANCE = notFoundException = new NotFoundException();
        StackTraceElement[] stackTraceElementArray = ReaderException.NO_TRACE;
        notFoundException.setStackTrace(stackTraceElementArray);
    }

    private NotFoundException() {
    }

    public static NotFoundException getNotFoundInstance() {
        return INSTANCE;
    }
}

