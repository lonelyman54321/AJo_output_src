/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.NullValue;

final class NullValue$NullValueVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        NullValue$NullValueVerifier nullValue$NullValueVerifier = new NullValue$NullValueVerifier();
        INSTANCE = nullValue$NullValueVerifier;
    }

    private NullValue$NullValueVerifier() {
    }

    public boolean isInRange(int n3) {
        NullValue nullValue = NullValue.forNumber(n3);
        if (nullValue != null) {
            n3 = 1;
        } else {
            n3 = 0;
            nullValue = null;
        }
        return n3 != 0;
    }
}

