/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.Internal$EnumVerifier;
import com.google.rpc.Code;

final class Code$CodeVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        Code$CodeVerifier code$CodeVerifier = new Code$CodeVerifier();
        INSTANCE = code$CodeVerifier;
    }

    private Code$CodeVerifier() {
    }

    public boolean isInRange(int n3) {
        Code code = Code.forNumber(n3);
        if (code != null) {
            n3 = 1;
        } else {
            n3 = 0;
            code = null;
        }
        return n3 != 0;
    }
}

