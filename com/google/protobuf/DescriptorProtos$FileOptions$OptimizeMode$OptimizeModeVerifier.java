/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode;
import com.google.protobuf.Internal$EnumVerifier;

final class DescriptorProtos$FileOptions$OptimizeMode$OptimizeModeVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        DescriptorProtos$FileOptions$OptimizeMode$OptimizeModeVerifier descriptorProtos$FileOptions$OptimizeMode$OptimizeModeVerifier = new DescriptorProtos$FileOptions$OptimizeMode$OptimizeModeVerifier();
        INSTANCE = descriptorProtos$FileOptions$OptimizeMode$OptimizeModeVerifier;
    }

    private DescriptorProtos$FileOptions$OptimizeMode$OptimizeModeVerifier() {
    }

    public boolean isInRange(int n3) {
        DescriptorProtos$FileOptions$OptimizeMode descriptorProtos$FileOptions$OptimizeMode = DescriptorProtos$FileOptions$OptimizeMode.forNumber(n3);
        if (descriptorProtos$FileOptions$OptimizeMode != null) {
            n3 = 1;
        } else {
            n3 = 0;
            descriptorProtos$FileOptions$OptimizeMode = null;
        }
        return n3 != 0;
    }
}

