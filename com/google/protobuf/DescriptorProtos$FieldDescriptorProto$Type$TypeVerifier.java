/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type;
import com.google.protobuf.Internal$EnumVerifier;

final class DescriptorProtos$FieldDescriptorProto$Type$TypeVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        DescriptorProtos$FieldDescriptorProto$Type$TypeVerifier descriptorProtos$FieldDescriptorProto$Type$TypeVerifier = new DescriptorProtos$FieldDescriptorProto$Type$TypeVerifier();
        INSTANCE = descriptorProtos$FieldDescriptorProto$Type$TypeVerifier;
    }

    private DescriptorProtos$FieldDescriptorProto$Type$TypeVerifier() {
    }

    public boolean isInRange(int n3) {
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type = DescriptorProtos$FieldDescriptorProto$Type.forNumber(n3);
        if (descriptorProtos$FieldDescriptorProto$Type != null) {
            n3 = 1;
        } else {
            n3 = 0;
            descriptorProtos$FieldDescriptorProto$Type = null;
        }
        return n3 != 0;
    }
}

