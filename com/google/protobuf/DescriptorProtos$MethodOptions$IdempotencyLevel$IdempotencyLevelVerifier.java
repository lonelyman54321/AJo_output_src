/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel;
import com.google.protobuf.Internal$EnumVerifier;

final class DescriptorProtos$MethodOptions$IdempotencyLevel$IdempotencyLevelVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        DescriptorProtos$MethodOptions$IdempotencyLevel$IdempotencyLevelVerifier descriptorProtos$MethodOptions$IdempotencyLevel$IdempotencyLevelVerifier = new DescriptorProtos$MethodOptions$IdempotencyLevel$IdempotencyLevelVerifier();
        INSTANCE = descriptorProtos$MethodOptions$IdempotencyLevel$IdempotencyLevelVerifier;
    }

    private DescriptorProtos$MethodOptions$IdempotencyLevel$IdempotencyLevelVerifier() {
    }

    public boolean isInRange(int n3) {
        DescriptorProtos$MethodOptions$IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevel = DescriptorProtos$MethodOptions$IdempotencyLevel.forNumber(n3);
        if (descriptorProtos$MethodOptions$IdempotencyLevel != null) {
            n3 = 1;
        } else {
            n3 = 0;
            descriptorProtos$MethodOptions$IdempotencyLevel = null;
        }
        return n3 != 0;
    }
}

