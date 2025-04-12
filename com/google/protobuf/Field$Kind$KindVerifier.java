/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Field$Kind;
import com.google.protobuf.Internal$EnumVerifier;

final class Field$Kind$KindVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        Field$Kind$KindVerifier field$Kind$KindVerifier = new Field$Kind$KindVerifier();
        INSTANCE = field$Kind$KindVerifier;
    }

    private Field$Kind$KindVerifier() {
    }

    public boolean isInRange(int n3) {
        Field$Kind field$Kind = Field$Kind.forNumber(n3);
        if (field$Kind != null) {
            n3 = 1;
        } else {
            n3 = 0;
            field$Kind = null;
        }
        return n3 != 0;
    }
}

