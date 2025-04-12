/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor$ValueType$1;
import com.google.api.LabelDescriptor$ValueType$ValueTypeVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class LabelDescriptor$ValueType
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ LabelDescriptor$ValueType[] $VALUES;
    public static final /* enum */ LabelDescriptor$ValueType BOOL;
    public static final int BOOL_VALUE = 1;
    public static final /* enum */ LabelDescriptor$ValueType INT64;
    public static final int INT64_VALUE = 2;
    public static final /* enum */ LabelDescriptor$ValueType STRING;
    public static final int STRING_VALUE;
    public static final /* enum */ LabelDescriptor$ValueType UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        LabelDescriptor$ValueType labelDescriptor$ValueType;
        LabelDescriptor$ValueType labelDescriptor$ValueType2;
        LabelDescriptor$ValueType labelDescriptor$ValueType3;
        Object object = new LabelDescriptor$ValueType("STRING", 0, 0);
        STRING = object;
        int n3 = 1;
        BOOL = labelDescriptor$ValueType3 = new LabelDescriptor$ValueType("BOOL", n3, n3);
        int n4 = 2;
        INT64 = labelDescriptor$ValueType2 = new LabelDescriptor$ValueType("INT64", n4, n4);
        int n7 = 3;
        UNRECOGNIZED = labelDescriptor$ValueType = new LabelDescriptor$ValueType("UNRECOGNIZED", n7, -1);
        LabelDescriptor$ValueType[] labelDescriptor$ValueTypeArray = new LabelDescriptor$ValueType[4];
        labelDescriptor$ValueTypeArray[0] = object;
        labelDescriptor$ValueTypeArray[n3] = labelDescriptor$ValueType3;
        labelDescriptor$ValueTypeArray[n4] = labelDescriptor$ValueType2;
        labelDescriptor$ValueTypeArray[n7] = labelDescriptor$ValueType;
        $VALUES = labelDescriptor$ValueTypeArray;
        internalValueMap = object = new LabelDescriptor$ValueType$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LabelDescriptor$ValueType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static LabelDescriptor$ValueType forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return INT64;
            }
            return BOOL;
        }
        return STRING;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return LabelDescriptor$ValueType$ValueTypeVerifier.INSTANCE;
    }

    public static LabelDescriptor$ValueType valueOf(int n3) {
        return LabelDescriptor$ValueType.forNumber(n3);
    }

    public static LabelDescriptor$ValueType valueOf(String string2) {
        return Enum.valueOf(LabelDescriptor$ValueType.class, string2);
    }

    public static LabelDescriptor$ValueType[] values() {
        return (LabelDescriptor$ValueType[])$VALUES.clone();
    }

    public final int getNumber() {
        Object object = UNRECOGNIZED;
        if (this != object) {
            return this.value;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

