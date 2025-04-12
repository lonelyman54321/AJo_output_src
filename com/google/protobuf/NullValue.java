/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.NullValue$1;
import com.google.protobuf.NullValue$NullValueVerifier;

public final class NullValue
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ NullValue[] $VALUES;
    public static final /* enum */ NullValue NULL_VALUE;
    public static final int NULL_VALUE_VALUE;
    public static final /* enum */ NullValue UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        NullValue nullValue;
        Object object = new NullValue("NULL_VALUE", 0, 0);
        NULL_VALUE = object;
        int n3 = 1;
        UNRECOGNIZED = nullValue = new NullValue("UNRECOGNIZED", n3, -1);
        NullValue[] nullValueArray = new NullValue[2];
        nullValueArray[0] = object;
        nullValueArray[n3] = nullValue;
        $VALUES = nullValueArray;
        internalValueMap = object = new NullValue$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NullValue() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static NullValue forNumber(int n3) {
        if (n3 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return NullValue$NullValueVerifier.INSTANCE;
    }

    public static NullValue valueOf(int n3) {
        return NullValue.forNumber(n3);
    }

    public static NullValue valueOf(String string2) {
        return Enum.valueOf(NullValue.class, string2);
    }

    public static NullValue[] values() {
        return (NullValue[])$VALUES.clone();
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

