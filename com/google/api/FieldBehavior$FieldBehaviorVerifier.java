/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.FieldBehavior;
import com.google.protobuf.Internal$EnumVerifier;

final class FieldBehavior$FieldBehaviorVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        FieldBehavior$FieldBehaviorVerifier fieldBehavior$FieldBehaviorVerifier = new FieldBehavior$FieldBehaviorVerifier();
        INSTANCE = fieldBehavior$FieldBehaviorVerifier;
    }

    private FieldBehavior$FieldBehaviorVerifier() {
    }

    public boolean isInRange(int n3) {
        FieldBehavior fieldBehavior = FieldBehavior.forNumber(n3);
        if (fieldBehavior != null) {
            n3 = 1;
        } else {
            n3 = 0;
            fieldBehavior = null;
        }
        return n3 != 0;
    }
}

