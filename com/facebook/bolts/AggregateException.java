/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;

public final class AggregateException
extends Exception {
    private static final long serialVersionUID = 1L;

    public final void printStackTrace(PrintStream printStream) {
        Intrinsics.checkNotNullParameter(printStream, "err");
        super.printStackTrace(printStream);
        throw null;
    }

    public final void printStackTrace(PrintWriter printWriter) {
        Intrinsics.checkNotNullParameter(printWriter, "err");
        super.printStackTrace(printWriter);
        throw null;
    }
}

