/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Property$PropertyType$1;
import com.google.api.Property$PropertyType$PropertyTypeVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class Property$PropertyType
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ Property$PropertyType[] $VALUES;
    public static final /* enum */ Property$PropertyType BOOL;
    public static final int BOOL_VALUE = 2;
    public static final /* enum */ Property$PropertyType DOUBLE;
    public static final int DOUBLE_VALUE = 4;
    public static final /* enum */ Property$PropertyType INT64;
    public static final int INT64_VALUE = 1;
    public static final /* enum */ Property$PropertyType STRING;
    public static final int STRING_VALUE = 3;
    public static final /* enum */ Property$PropertyType UNRECOGNIZED;
    public static final /* enum */ Property$PropertyType UNSPECIFIED;
    public static final int UNSPECIFIED_VALUE;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        Property$PropertyType property$PropertyType;
        Property$PropertyType property$PropertyType2;
        Property$PropertyType property$PropertyType3;
        Property$PropertyType property$PropertyType4;
        Property$PropertyType property$PropertyType5;
        Object object = new Property$PropertyType("UNSPECIFIED", 0, 0);
        UNSPECIFIED = object;
        int n3 = 1;
        INT64 = property$PropertyType5 = new Property$PropertyType("INT64", n3, n3);
        int n4 = 2;
        BOOL = property$PropertyType4 = new Property$PropertyType("BOOL", n4, n4);
        int n7 = 3;
        STRING = property$PropertyType3 = new Property$PropertyType("STRING", n7, n7);
        int n8 = 4;
        DOUBLE = property$PropertyType2 = new Property$PropertyType("DOUBLE", n8, n8);
        int n10 = 5;
        UNRECOGNIZED = property$PropertyType = new Property$PropertyType("UNRECOGNIZED", n10, -1);
        Property$PropertyType[] property$PropertyTypeArray = new Property$PropertyType[6];
        property$PropertyTypeArray[0] = object;
        property$PropertyTypeArray[n3] = property$PropertyType5;
        property$PropertyTypeArray[n4] = property$PropertyType4;
        property$PropertyTypeArray[n7] = property$PropertyType3;
        property$PropertyTypeArray[n8] = property$PropertyType2;
        property$PropertyTypeArray[n10] = property$PropertyType;
        $VALUES = property$PropertyTypeArray;
        internalValueMap = object = new Property$PropertyType$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Property$PropertyType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static Property$PropertyType forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            return null;
                        }
                        return DOUBLE;
                    }
                    return STRING;
                }
                return BOOL;
            }
            return INT64;
        }
        return UNSPECIFIED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return Property$PropertyType$PropertyTypeVerifier.INSTANCE;
    }

    public static Property$PropertyType valueOf(int n3) {
        return Property$PropertyType.forNumber(n3);
    }

    public static Property$PropertyType valueOf(String string2) {
        return Enum.valueOf(Property$PropertyType.class, string2);
    }

    public static Property$PropertyType[] values() {
        return (Property$PropertyType[])$VALUES.clone();
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

