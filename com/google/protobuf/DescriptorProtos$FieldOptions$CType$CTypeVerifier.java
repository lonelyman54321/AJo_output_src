/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldOptions$CType;
import com.google.protobuf.Internal$EnumVerifier;

final class DescriptorProtos$FieldOptions$CType$CTypeVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        DescriptorProtos$FieldOptions$CType$CTypeVerifier descriptorProtos$FieldOptions$CType$CTypeVerifier = new DescriptorProtos$FieldOptions$CType$CTypeVerifier();
        INSTANCE = descriptorProtos$FieldOptions$CType$CTypeVerifier;
    }

    private DescriptorProtos$FieldOptions$CType$CTypeVerifier() {
    }

    public boolean isInRange(int n3) {
        DescriptorProtos$FieldOptions$CType descriptorProtos$FieldOptions$CType = DescriptorProtos$FieldOptions$CType.forNumber(n3);
        if (descriptorProtos$FieldOptions$CType != null) {
            n3 = 1;
        } else {
            n3 = 0;
            descriptorProtos$FieldOptions$CType = null;
        }
        return n3 != 0;
    }
}

