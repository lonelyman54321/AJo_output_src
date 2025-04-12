/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ChangeType;
import com.google.protobuf.Internal$EnumVerifier;

final class ChangeType$ChangeTypeVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        ChangeType$ChangeTypeVerifier changeType$ChangeTypeVerifier = new ChangeType$ChangeTypeVerifier();
        INSTANCE = changeType$ChangeTypeVerifier;
    }

    private ChangeType$ChangeTypeVerifier() {
    }

    public boolean isInRange(int n3) {
        ChangeType changeType = ChangeType.forNumber(n3);
        if (changeType != null) {
            n3 = 1;
        } else {
            n3 = 0;
            changeType = null;
        }
        return n3 != 0;
    }
}

