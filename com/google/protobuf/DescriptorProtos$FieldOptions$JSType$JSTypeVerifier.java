/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldOptions$JSType;
import com.google.protobuf.Internal$EnumVerifier;

final class DescriptorProtos$FieldOptions$JSType$JSTypeVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        DescriptorProtos$FieldOptions$JSType$JSTypeVerifier descriptorProtos$FieldOptions$JSType$JSTypeVerifier = new DescriptorProtos$FieldOptions$JSType$JSTypeVerifier();
        INSTANCE = descriptorProtos$FieldOptions$JSType$JSTypeVerifier;
    }

    private DescriptorProtos$FieldOptions$JSType$JSTypeVerifier() {
    }

    public boolean isInRange(int n3) {
        DescriptorProtos$FieldOptions$JSType descriptorProtos$FieldOptions$JSType = DescriptorProtos$FieldOptions$JSType.forNumber(n3);
        if (descriptorProtos$FieldOptions$JSType != null) {
            n3 = 1;
        } else {
            n3 = 0;
            descriptorProtos$FieldOptions$JSType = null;
        }
        return n3 != 0;
    }
}

