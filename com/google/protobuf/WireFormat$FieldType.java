/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.WireFormat$1;
import com.google.protobuf.WireFormat$FieldType$1;
import com.google.protobuf.WireFormat$FieldType$2;
import com.google.protobuf.WireFormat$FieldType$3;
import com.google.protobuf.WireFormat$FieldType$4;
import com.google.protobuf.WireFormat$JavaType;

public class WireFormat$FieldType
extends Enum {
    private static final /* synthetic */ WireFormat$FieldType[] $VALUES;
    public static final /* enum */ WireFormat$FieldType BOOL;
    public static final /* enum */ WireFormat$FieldType BYTES;
    public static final /* enum */ WireFormat$FieldType DOUBLE;
    public static final /* enum */ WireFormat$FieldType ENUM;
    public static final /* enum */ WireFormat$FieldType FIXED32;
    public static final /* enum */ WireFormat$FieldType FIXED64;
    public static final /* enum */ WireFormat$FieldType FLOAT;
    public static final /* enum */ WireFormat$FieldType GROUP;
    public static final /* enum */ WireFormat$FieldType INT32;
    public static final /* enum */ WireFormat$FieldType INT64;
    public static final /* enum */ WireFormat$FieldType MESSAGE;
    public static final /* enum */ WireFormat$FieldType SFIXED32;
    public static final /* enum */ WireFormat$FieldType SFIXED64;
    public static final /* enum */ WireFormat$FieldType SINT32;
    public static final /* enum */ WireFormat$FieldType SINT64;
    public static final /* enum */ WireFormat$FieldType STRING;
    public static final /* enum */ WireFormat$FieldType UINT32;
    public static final /* enum */ WireFormat$FieldType UINT64;
    private final WireFormat$JavaType javaType;
    private final int wireType;

    static {
        WireFormat$FieldType wireFormat$FieldType;
        WireFormat$FieldType wireFormat$FieldType2;
        WireFormat$FieldType wireFormat$FieldType3;
        WireFormat$FieldType wireFormat$FieldType4;
        WireFormat$FieldType wireFormat$FieldType5;
        WireFormat$FieldType wireFormat$FieldType6;
        Enum enum_ = WireFormat$JavaType.DOUBLE;
        int n3 = 1;
        DOUBLE = wireFormat$FieldType6 = new WireFormat$FieldType("DOUBLE", 0, (WireFormat$JavaType)enum_, n3);
        Enum enum_2 = WireFormat$JavaType.FLOAT;
        int n4 = 5;
        FLOAT = enum_ = new WireFormat$FieldType("FLOAT", n3, (WireFormat$JavaType)enum_2, n4);
        WireFormat$FieldType[] wireFormat$FieldTypeArray = WireFormat$JavaType.LONG;
        int n7 = 2;
        INT64 = enum_2 = new WireFormat$FieldType("INT64", n7, (WireFormat$JavaType)wireFormat$FieldTypeArray, 0);
        int n8 = 3;
        UINT64 = wireFormat$FieldType5 = new WireFormat$FieldType("UINT64", n8, (WireFormat$JavaType)wireFormat$FieldTypeArray, 0);
        WireFormat$JavaType wireFormat$JavaType = WireFormat$JavaType.INT;
        INT32 = wireFormat$FieldType4 = new WireFormat$FieldType("INT32", 4, wireFormat$JavaType, 0);
        FIXED64 = wireFormat$FieldType3 = new WireFormat$FieldType("FIXED64", n4, (WireFormat$JavaType)wireFormat$FieldTypeArray, n3);
        FIXED32 = wireFormat$FieldType2 = new WireFormat$FieldType("FIXED32", 6, wireFormat$JavaType, n4);
        Enum enum_3 = WireFormat$JavaType.BOOLEAN;
        BOOL = wireFormat$FieldType = new WireFormat$FieldType("BOOL", 7, (WireFormat$JavaType)enum_3, 0);
        WireFormat$JavaType wireFormat$JavaType2 = WireFormat$JavaType.STRING;
        STRING = enum_3 = new WireFormat$FieldType$1(wireFormat$JavaType2, n7);
        wireFormat$JavaType2 = WireFormat$JavaType.MESSAGE;
        Enum enum_4 = new WireFormat$FieldType$2(wireFormat$JavaType2, n8);
        GROUP = enum_4;
        WireFormat$FieldType$2 wireFormat$FieldType$2 = enum_4;
        int n10 = 2;
        WireFormat$FieldType wireFormat$FieldType7 = new WireFormat$FieldType$3(wireFormat$JavaType2, n10);
        MESSAGE = wireFormat$FieldType7;
        Enum enum_5 = WireFormat$JavaType.BYTE_STRING;
        WireFormat$FieldType$3 wireFormat$FieldType$3 = wireFormat$FieldType7;
        WireFormat$FieldType wireFormat$FieldType8 = new WireFormat$FieldType$4((WireFormat$JavaType)enum_5, n10);
        BYTES = wireFormat$FieldType8;
        enum_4 = new WireFormat$FieldType("UINT32", 12, wireFormat$JavaType, 0);
        UINT32 = enum_4;
        WireFormat$FieldType wireFormat$FieldType9 = enum_4;
        enum_4 = WireFormat$JavaType.ENUM;
        WireFormat$FieldType$4 wireFormat$FieldType$4 = wireFormat$FieldType8;
        wireFormat$FieldType7 = new WireFormat$FieldType("ENUM", 13, (WireFormat$JavaType)enum_4, 0);
        ENUM = wireFormat$FieldType7;
        SFIXED32 = enum_4 = new WireFormat$FieldType("SFIXED32", 14, wireFormat$JavaType, 5);
        Enum enum_6 = enum_4;
        wireFormat$FieldType8 = new WireFormat$FieldType("SFIXED64", 15, (WireFormat$JavaType)wireFormat$FieldTypeArray, 1);
        SFIXED64 = wireFormat$FieldType8;
        SINT32 = enum_4 = new WireFormat$FieldType("SINT32", 16, wireFormat$JavaType, 0);
        int n14 = 17;
        SINT64 = enum_5 = new WireFormat$FieldType("SINT64", n14, (WireFormat$JavaType)wireFormat$FieldTypeArray, 0);
        wireFormat$FieldTypeArray = new WireFormat$FieldType[18];
        wireFormat$FieldTypeArray[0] = wireFormat$FieldType6;
        wireFormat$FieldTypeArray[1] = enum_;
        wireFormat$FieldTypeArray[2] = enum_2;
        wireFormat$FieldTypeArray[3] = wireFormat$FieldType5;
        wireFormat$FieldTypeArray[4] = wireFormat$FieldType4;
        wireFormat$FieldTypeArray[5] = wireFormat$FieldType3;
        wireFormat$FieldTypeArray[6] = wireFormat$FieldType2;
        wireFormat$FieldTypeArray[7] = wireFormat$FieldType;
        wireFormat$FieldTypeArray[8] = enum_3;
        wireFormat$FieldTypeArray[9] = wireFormat$FieldType$2;
        wireFormat$FieldTypeArray[10] = wireFormat$FieldType$3;
        wireFormat$FieldTypeArray[11] = wireFormat$FieldType$4;
        wireFormat$FieldTypeArray[12] = wireFormat$FieldType9;
        wireFormat$FieldTypeArray[13] = wireFormat$FieldType7;
        wireFormat$FieldTypeArray[14] = enum_6;
        wireFormat$FieldTypeArray[15] = wireFormat$FieldType8;
        wireFormat$FieldTypeArray[16] = enum_4;
        wireFormat$FieldTypeArray[n14] = enum_5;
        $VALUES = wireFormat$FieldTypeArray;
    }

    /*
     * WARNING - void declaration
     */
    private WireFormat$FieldType() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.javaType = var3_2;
        this.wireType = var4_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ WireFormat$FieldType(WireFormat$JavaType wireFormat$JavaType, int n3, WireFormat$1 wireFormat$1) {
        this((String)var1_-1, n3, (WireFormat$JavaType)((Object)wireFormat$1), (int)var4_3);
        void var4_3;
        void var1_-1;
    }

    public static WireFormat$FieldType valueOf(String string2) {
        return Enum.valueOf(WireFormat$FieldType.class, string2);
    }

    public static WireFormat$FieldType[] values() {
        return (WireFormat$FieldType[])$VALUES.clone();
    }

    public WireFormat$JavaType getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }
}

