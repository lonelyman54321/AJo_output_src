/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldOptions$JSType$1;
import com.google.protobuf.DescriptorProtos$FieldOptions$JSType$JSTypeVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class DescriptorProtos$FieldOptions$JSType
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ DescriptorProtos$FieldOptions$JSType[] $VALUES;
    public static final /* enum */ DescriptorProtos$FieldOptions$JSType JS_NORMAL;
    public static final int JS_NORMAL_VALUE = 0;
    public static final /* enum */ DescriptorProtos$FieldOptions$JSType JS_NUMBER;
    public static final int JS_NUMBER_VALUE = 2;
    public static final /* enum */ DescriptorProtos$FieldOptions$JSType JS_STRING;
    public static final int JS_STRING_VALUE = 1;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        DescriptorProtos$FieldOptions$JSType descriptorProtos$FieldOptions$JSType;
        DescriptorProtos$FieldOptions$JSType descriptorProtos$FieldOptions$JSType2;
        Object object = new DescriptorProtos$FieldOptions$JSType("JS_NORMAL", 0, 0);
        JS_NORMAL = object;
        int n3 = 1;
        JS_STRING = descriptorProtos$FieldOptions$JSType2 = new DescriptorProtos$FieldOptions$JSType("JS_STRING", n3, n3);
        int n4 = 2;
        JS_NUMBER = descriptorProtos$FieldOptions$JSType = new DescriptorProtos$FieldOptions$JSType("JS_NUMBER", n4, n4);
        DescriptorProtos$FieldOptions$JSType[] descriptorProtos$FieldOptions$JSTypeArray = new DescriptorProtos$FieldOptions$JSType[3];
        descriptorProtos$FieldOptions$JSTypeArray[0] = object;
        descriptorProtos$FieldOptions$JSTypeArray[n3] = descriptorProtos$FieldOptions$JSType2;
        descriptorProtos$FieldOptions$JSTypeArray[n4] = descriptorProtos$FieldOptions$JSType;
        $VALUES = descriptorProtos$FieldOptions$JSTypeArray;
        internalValueMap = object = new DescriptorProtos$FieldOptions$JSType$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DescriptorProtos$FieldOptions$JSType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static DescriptorProtos$FieldOptions$JSType forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return JS_NUMBER;
            }
            return JS_STRING;
        }
        return JS_NORMAL;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return DescriptorProtos$FieldOptions$JSType$JSTypeVerifier.INSTANCE;
    }

    public static DescriptorProtos$FieldOptions$JSType valueOf(int n3) {
        return DescriptorProtos$FieldOptions$JSType.forNumber(n3);
    }

    public static DescriptorProtos$FieldOptions$JSType valueOf(String string2) {
        return Enum.valueOf(DescriptorProtos$FieldOptions$JSType.class, string2);
    }

    public static DescriptorProtos$FieldOptions$JSType[] values() {
        return (DescriptorProtos$FieldOptions$JSType[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

