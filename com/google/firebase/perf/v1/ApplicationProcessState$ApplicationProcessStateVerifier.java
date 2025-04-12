/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.protobuf.Internal$EnumVerifier;

final class ApplicationProcessState$ApplicationProcessStateVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        ApplicationProcessState$ApplicationProcessStateVerifier applicationProcessState$ApplicationProcessStateVerifier = new ApplicationProcessState$ApplicationProcessStateVerifier();
        INSTANCE = applicationProcessState$ApplicationProcessStateVerifier;
    }

    private ApplicationProcessState$ApplicationProcessStateVerifier() {
    }

    public boolean isInRange(int n3) {
        ApplicationProcessState applicationProcessState = ApplicationProcessState.forNumber(n3);
        if (applicationProcessState != null) {
            n3 = 1;
        } else {
            n3 = 0;
            applicationProcessState = null;
        }
        return n3 != 0;
    }
}

