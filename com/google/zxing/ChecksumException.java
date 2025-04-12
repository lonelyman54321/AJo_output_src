/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.ReaderException;

public final class ChecksumException
extends ReaderException {
    private static final ChecksumException INSTANCE;

    static {
        ChecksumException checksumException;
        INSTANCE = checksumException = new ChecksumException();
        StackTraceElement[] stackTraceElementArray = ReaderException.NO_TRACE;
        checksumException.setStackTrace(stackTraceElementArray);
    }

    private ChecksumException() {
    }

    private ChecksumException(Throwable throwable) {
        super(throwable);
    }

    public static ChecksumException getChecksumInstance() {
        boolean bl2 = ReaderException.isStackTrace;
        if (bl2) {
            ChecksumException checksumException = new ChecksumException();
            return checksumException;
        }
        return INSTANCE;
    }

    public static ChecksumException getChecksumInstance(Throwable throwable) {
        boolean bl2 = ReaderException.isStackTrace;
        if (bl2) {
            ChecksumException checksumException = new ChecksumException(throwable);
            return checksumException;
        }
        return INSTANCE;
    }
}

