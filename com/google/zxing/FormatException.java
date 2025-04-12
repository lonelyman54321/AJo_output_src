/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.ReaderException;

public final class FormatException
extends ReaderException {
    private static final FormatException INSTANCE;

    static {
        FormatException formatException;
        INSTANCE = formatException = new FormatException();
        StackTraceElement[] stackTraceElementArray = ReaderException.NO_TRACE;
        formatException.setStackTrace(stackTraceElementArray);
    }

    private FormatException() {
    }

    private FormatException(Throwable throwable) {
        super(throwable);
    }

    public static FormatException getFormatInstance() {
        boolean bl2 = ReaderException.isStackTrace;
        if (bl2) {
            FormatException formatException = new FormatException();
            return formatException;
        }
        return INSTANCE;
    }

    public static FormatException getFormatInstance(Throwable throwable) {
        boolean bl2 = ReaderException.isStackTrace;
        if (bl2) {
            FormatException formatException = new FormatException(throwable);
            return formatException;
        }
        return INSTANCE;
    }
}

