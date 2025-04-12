/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label$1;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label$LabelVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class DescriptorProtos$FieldDescriptorProto$Label
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ DescriptorProtos$FieldDescriptorProto$Label[] $VALUES;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Label LABEL_OPTIONAL;
    public static final int LABEL_OPTIONAL_VALUE = 1;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Label LABEL_REPEATED;
    public static final int LABEL_REPEATED_VALUE = 3;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Label LABEL_REQUIRED;
    public static final int LABEL_REQUIRED_VALUE = 2;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        DescriptorProtos$FieldDescriptorProto$Label descriptorProtos$FieldDescriptorProto$Label;
        DescriptorProtos$FieldDescriptorProto$Label descriptorProtos$FieldDescriptorProto$Label2;
        int n3 = 1;
        Object object = new DescriptorProtos$FieldDescriptorProto$Label("LABEL_OPTIONAL", 0, n3);
        LABEL_OPTIONAL = object;
        int n4 = 2;
        LABEL_REQUIRED = descriptorProtos$FieldDescriptorProto$Label2 = new DescriptorProtos$FieldDescriptorProto$Label("LABEL_REQUIRED", n3, n4);
        int n7 = 3;
        LABEL_REPEATED = descriptorProtos$FieldDescriptorProto$Label = new DescriptorProtos$FieldDescriptorProto$Label("LABEL_REPEATED", n4, n7);
        DescriptorProtos$FieldDescriptorProto$Label[] descriptorProtos$FieldDescriptorProto$LabelArray = new DescriptorProtos$FieldDescriptorProto$Label[n7];
        descriptorProtos$FieldDescriptorProto$LabelArray[0] = object;
        descriptorProtos$FieldDescriptorProto$LabelArray[n3] = descriptorProtos$FieldDescriptorProto$Label2;
        descriptorProtos$FieldDescriptorProto$LabelArray[n4] = descriptorProtos$FieldDescriptorProto$Label;
        $VALUES = descriptorProtos$FieldDescriptorProto$LabelArray;
        internalValueMap = object = new DescriptorProtos$FieldDescriptorProto$Label$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DescriptorProtos$FieldDescriptorProto$Label() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static DescriptorProtos$FieldDescriptorProto$Label forNumber(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    return null;
                }
                return LABEL_REPEATED;
            }
            return LABEL_REQUIRED;
        }
        return LABEL_OPTIONAL;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return DescriptorProtos$FieldDescriptorProto$Label$LabelVerifier.INSTANCE;
    }

    public static DescriptorProtos$FieldDescriptorProto$Label valueOf(int n3) {
        return DescriptorProtos$FieldDescriptorProto$Label.forNumber(n3);
    }

    public static DescriptorProtos$FieldDescriptorProto$Label valueOf(String string2) {
        return Enum.valueOf(DescriptorProtos$FieldDescriptorProto$Label.class, string2);
    }

    public static DescriptorProtos$FieldDescriptorProto$Label[] values() {
        return (DescriptorProtos$FieldDescriptorProto$Label[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

