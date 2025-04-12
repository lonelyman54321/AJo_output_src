/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldOptions$CType$1;
import com.google.protobuf.DescriptorProtos$FieldOptions$CType$CTypeVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class DescriptorProtos$FieldOptions$CType
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ DescriptorProtos$FieldOptions$CType[] $VALUES;
    public static final /* enum */ DescriptorProtos$FieldOptions$CType CORD;
    public static final int CORD_VALUE = 1;
    public static final /* enum */ DescriptorProtos$FieldOptions$CType STRING;
    public static final /* enum */ DescriptorProtos$FieldOptions$CType STRING_PIECE;
    public static final int STRING_PIECE_VALUE = 2;
    public static final int STRING_VALUE;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        DescriptorProtos$FieldOptions$CType descriptorProtos$FieldOptions$CType;
        DescriptorProtos$FieldOptions$CType descriptorProtos$FieldOptions$CType2;
        Object object = new DescriptorProtos$FieldOptions$CType("STRING", 0, 0);
        STRING = object;
        int n3 = 1;
        CORD = descriptorProtos$FieldOptions$CType2 = new DescriptorProtos$FieldOptions$CType("CORD", n3, n3);
        int n4 = 2;
        STRING_PIECE = descriptorProtos$FieldOptions$CType = new DescriptorProtos$FieldOptions$CType("STRING_PIECE", n4, n4);
        DescriptorProtos$FieldOptions$CType[] descriptorProtos$FieldOptions$CTypeArray = new DescriptorProtos$FieldOptions$CType[3];
        descriptorProtos$FieldOptions$CTypeArray[0] = object;
        descriptorProtos$FieldOptions$CTypeArray[n3] = descriptorProtos$FieldOptions$CType2;
        descriptorProtos$FieldOptions$CTypeArray[n4] = descriptorProtos$FieldOptions$CType;
        $VALUES = descriptorProtos$FieldOptions$CTypeArray;
        internalValueMap = object = new DescriptorProtos$FieldOptions$CType$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DescriptorProtos$FieldOptions$CType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static DescriptorProtos$FieldOptions$CType forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return STRING_PIECE;
            }
            return CORD;
        }
        return STRING;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return DescriptorProtos$FieldOptions$CType$CTypeVerifier.INSTANCE;
    }

    public static DescriptorProtos$FieldOptions$CType valueOf(int n3) {
        return DescriptorProtos$FieldOptions$CType.forNumber(n3);
    }

    public static DescriptorProtos$FieldOptions$CType valueOf(String string2) {
        return Enum.valueOf(DescriptorProtos$FieldOptions$CType.class, string2);
    }

    public static DescriptorProtos$FieldOptions$CType[] values() {
        return (DescriptorProtos$FieldOptions$CType[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

