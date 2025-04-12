/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.SessionVerbosity;
import com.google.protobuf.Internal$EnumVerifier;

final class SessionVerbosity$SessionVerbosityVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        SessionVerbosity$SessionVerbosityVerifier sessionVerbosity$SessionVerbosityVerifier = new SessionVerbosity$SessionVerbosityVerifier();
        INSTANCE = sessionVerbosity$SessionVerbosityVerifier;
    }

    private SessionVerbosity$SessionVerbosityVerifier() {
    }

    public boolean isInRange(int n3) {
        SessionVerbosity sessionVerbosity = SessionVerbosity.forNumber(n3);
        if (sessionVerbosity != null) {
            n3 = 1;
        } else {
            n3 = 0;
            sessionVerbosity = null;
        }
        return n3 != 0;
    }
}

