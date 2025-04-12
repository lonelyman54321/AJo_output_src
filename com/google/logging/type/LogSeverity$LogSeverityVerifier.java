/*
 * Decompiled with CFR 0.152.
 */
package com.google.logging.type;

import com.google.logging.type.LogSeverity;
import com.google.protobuf.Internal$EnumVerifier;

final class LogSeverity$LogSeverityVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        LogSeverity$LogSeverityVerifier logSeverity$LogSeverityVerifier = new LogSeverity$LogSeverityVerifier();
        INSTANCE = logSeverity$LogSeverityVerifier;
    }

    private LogSeverity$LogSeverityVerifier() {
    }

    public boolean isInRange(int n3) {
        LogSeverity logSeverity = LogSeverity.forNumber(n3);
        if (logSeverity != null) {
            n3 = 1;
        } else {
            n3 = 0;
            logSeverity = null;
        }
        return n3 != 0;
    }
}

