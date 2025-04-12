/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label;
import com.google.protobuf.Internal$EnumVerifier;

final class DescriptorProtos$FieldDescriptorProto$Label$LabelVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        DescriptorProtos$FieldDescriptorProto$Label$LabelVerifier descriptorProtos$FieldDescriptorProto$Label$LabelVerifier = new DescriptorProtos$FieldDescriptorProto$Label$LabelVerifier();
        INSTANCE = descriptorProtos$FieldDescriptorProto$Label$LabelVerifier;
    }

    private DescriptorProtos$FieldDescriptorProto$Label$LabelVerifier() {
    }

    public boolean isInRange(int n3) {
        DescriptorProtos$FieldDescriptorProto$Label descriptorProtos$FieldDescriptorProto$Label = DescriptorProtos$FieldDescriptorProto$Label.forNumber(n3);
        if (descriptorProtos$FieldDescriptorProto$Label != null) {
            n3 = 1;
        } else {
            n3 = 0;
            descriptorProtos$FieldDescriptorProto$Label = null;
        }
        return n3 != 0;
    }
}

