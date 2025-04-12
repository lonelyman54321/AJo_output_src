/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Field$Cardinality;
import com.google.protobuf.Internal$EnumVerifier;

final class Field$Cardinality$CardinalityVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        Field$Cardinality$CardinalityVerifier field$Cardinality$CardinalityVerifier = new Field$Cardinality$CardinalityVerifier();
        INSTANCE = field$Cardinality$CardinalityVerifier;
    }

    private Field$Cardinality$CardinalityVerifier() {
    }

    public boolean isInRange(int n3) {
        Field$Cardinality field$Cardinality = Field$Cardinality.forNumber(n3);
        if (field$Cardinality != null) {
            n3 = 1;
        } else {
            n3 = 0;
            field$Cardinality = null;
        }
        return n3 != 0;
    }
}

