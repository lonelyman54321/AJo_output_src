/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Field$Kind$1;
import com.google.protobuf.Field$Kind$KindVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class Field$Kind
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ Field$Kind[] $VALUES;
    public static final /* enum */ Field$Kind TYPE_BOOL;
    public static final int TYPE_BOOL_VALUE = 8;
    public static final /* enum */ Field$Kind TYPE_BYTES;
    public static final int TYPE_BYTES_VALUE = 12;
    public static final /* enum */ Field$Kind TYPE_DOUBLE;
    public static final int TYPE_DOUBLE_VALUE = 1;
    public static final /* enum */ Field$Kind TYPE_ENUM;
    public static final int TYPE_ENUM_VALUE = 14;
    public static final /* enum */ Field$Kind TYPE_FIXED32;
    public static final int TYPE_FIXED32_VALUE = 7;
    public static final /* enum */ Field$Kind TYPE_FIXED64;
    public static final int TYPE_FIXED64_VALUE = 6;
    public static final /* enum */ Field$Kind TYPE_FLOAT;
    public static final int TYPE_FLOAT_VALUE = 2;
    public static final /* enum */ Field$Kind TYPE_GROUP;
    public static final int TYPE_GROUP_VALUE = 10;
    public static final /* enum */ Field$Kind TYPE_INT32;
    public static final int TYPE_INT32_VALUE = 5;
    public static final /* enum */ Field$Kind TYPE_INT64;
    public static final int TYPE_INT64_VALUE = 3;
    public static final /* enum */ Field$Kind TYPE_MESSAGE;
    public static final int TYPE_MESSAGE_VALUE = 11;
    public static final /* enum */ Field$Kind TYPE_SFIXED32;
    public static final int TYPE_SFIXED32_VALUE = 15;
    public static final /* enum */ Field$Kind TYPE_SFIXED64;
    public static final int TYPE_SFIXED64_VALUE = 16;
    public static final /* enum */ Field$Kind TYPE_SINT32;
    public static final int TYPE_SINT32_VALUE = 17;
    public static final /* enum */ Field$Kind TYPE_SINT64;
    public static final int TYPE_SINT64_VALUE = 18;
    public static final /* enum */ Field$Kind TYPE_STRING;
    public static final int TYPE_STRING_VALUE = 9;
    public static final /* enum */ Field$Kind TYPE_UINT32;
    public static final int TYPE_UINT32_VALUE = 13;
    public static final /* enum */ Field$Kind TYPE_UINT64;
    public static final int TYPE_UINT64_VALUE = 4;
    public static final /* enum */ Field$Kind TYPE_UNKNOWN;
    public static final int TYPE_UNKNOWN_VALUE;
    public static final /* enum */ Field$Kind UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        Field$Kind field$Kind;
        Field$Kind field$Kind2;
        Field$Kind field$Kind3;
        Field$Kind field$Kind4;
        Field$Kind field$Kind5;
        Field$Kind field$Kind6;
        Field$Kind field$Kind7;
        Field$Kind field$Kind8;
        Field$Kind field$Kind9;
        Field$Kind field$Kind10;
        Field$Kind field$Kind11;
        Field$Kind field$Kind12;
        Field$Kind field$Kind13;
        Field$Kind field$Kind14;
        Object object = new Field$Kind("TYPE_UNKNOWN", 0, 0);
        TYPE_UNKNOWN = object;
        int n3 = 1;
        TYPE_DOUBLE = field$Kind14 = new Field$Kind("TYPE_DOUBLE", n3, n3);
        int n4 = 2;
        TYPE_FLOAT = field$Kind13 = new Field$Kind("TYPE_FLOAT", n4, n4);
        int n7 = 3;
        TYPE_INT64 = field$Kind12 = new Field$Kind("TYPE_INT64", n7, n7);
        int n8 = 4;
        TYPE_UINT64 = field$Kind11 = new Field$Kind("TYPE_UINT64", n8, n8);
        int n10 = 5;
        TYPE_INT32 = field$Kind10 = new Field$Kind("TYPE_INT32", n10, n10);
        int n14 = 6;
        TYPE_FIXED64 = field$Kind9 = new Field$Kind("TYPE_FIXED64", n14, n14);
        n14 = 7;
        TYPE_FIXED32 = field$Kind8 = new Field$Kind("TYPE_FIXED32", n14, n14);
        n10 = 8;
        TYPE_BOOL = field$Kind7 = new Field$Kind("TYPE_BOOL", n10, n10);
        n8 = 9;
        TYPE_STRING = field$Kind6 = new Field$Kind("TYPE_STRING", n8, n8);
        n7 = 10;
        TYPE_GROUP = field$Kind5 = new Field$Kind("TYPE_GROUP", n7, n7);
        n4 = 11;
        TYPE_MESSAGE = field$Kind4 = new Field$Kind("TYPE_MESSAGE", n4, n4);
        n3 = 12;
        TYPE_BYTES = field$Kind3 = new Field$Kind("TYPE_BYTES", n3, n3);
        int n15 = 13;
        TYPE_UINT32 = field$Kind2 = new Field$Kind("TYPE_UINT32", n15, n15);
        Field$Kind field$Kind15 = field$Kind2;
        n4 = 14;
        TYPE_ENUM = field$Kind = new Field$Kind("TYPE_ENUM", n4, n4);
        Field$Kind field$Kind16 = field$Kind;
        n3 = 15;
        Field$Kind[] field$KindArray = new Field$Kind("TYPE_SFIXED32", n3, n3);
        TYPE_SFIXED32 = field$KindArray;
        Field$Kind[] field$KindArray2 = field$KindArray;
        n15 = 16;
        TYPE_SFIXED64 = field$Kind2 = new Field$Kind("TYPE_SFIXED64", n15, n15);
        Field$Kind field$Kind17 = field$Kind2;
        n4 = 17;
        TYPE_SINT32 = field$Kind = new Field$Kind("TYPE_SINT32", n4, n4);
        n3 = 18;
        field$KindArray = new Field$Kind("TYPE_SINT64", n3, n3);
        TYPE_SINT64 = field$KindArray;
        n3 = 19;
        Field$Kind[] field$KindArray3 = field$KindArray;
        UNRECOGNIZED = field$Kind2 = new Field$Kind("UNRECOGNIZED", n3, -1);
        field$KindArray = new Field$Kind[20];
        field$KindArray[0] = object;
        field$KindArray[1] = field$Kind14;
        field$KindArray[2] = field$Kind13;
        field$KindArray[3] = field$Kind12;
        field$KindArray[4] = field$Kind11;
        field$KindArray[5] = field$Kind10;
        field$KindArray[6] = field$Kind9;
        field$KindArray[7] = field$Kind8;
        field$KindArray[8] = field$Kind7;
        field$KindArray[9] = field$Kind6;
        field$KindArray[10] = field$Kind5;
        field$KindArray[11] = field$Kind4;
        field$KindArray[12] = field$Kind3;
        field$KindArray[13] = field$Kind15;
        field$KindArray[14] = field$Kind16;
        field$KindArray[15] = field$KindArray2;
        field$KindArray[16] = field$Kind17;
        field$KindArray[17] = field$Kind;
        field$KindArray[18] = field$KindArray3;
        field$KindArray[n3] = field$Kind2;
        $VALUES = field$KindArray;
        internalValueMap = object = new Field$Kind$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Field$Kind() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static Field$Kind forNumber(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 18: {
                return TYPE_SINT64;
            }
            case 17: {
                return TYPE_SINT32;
            }
            case 16: {
                return TYPE_SFIXED64;
            }
            case 15: {
                return TYPE_SFIXED32;
            }
            case 14: {
                return TYPE_ENUM;
            }
            case 13: {
                return TYPE_UINT32;
            }
            case 12: {
                return TYPE_BYTES;
            }
            case 11: {
                return TYPE_MESSAGE;
            }
            case 10: {
                return TYPE_GROUP;
            }
            case 9: {
                return TYPE_STRING;
            }
            case 8: {
                return TYPE_BOOL;
            }
            case 7: {
                return TYPE_FIXED32;
            }
            case 6: {
                return TYPE_FIXED64;
            }
            case 5: {
                return TYPE_INT32;
            }
            case 4: {
                return TYPE_UINT64;
            }
            case 3: {
                return TYPE_INT64;
            }
            case 2: {
                return TYPE_FLOAT;
            }
            case 1: {
                return TYPE_DOUBLE;
            }
            case 0: 
        }
        return TYPE_UNKNOWN;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return Field$Kind$KindVerifier.INSTANCE;
    }

    public static Field$Kind valueOf(int n3) {
        return Field$Kind.forNumber(n3);
    }

    public static Field$Kind valueOf(String string2) {
        return Enum.valueOf(Field$Kind.class, string2);
    }

    public static Field$Kind[] values() {
        return (Field$Kind[])$VALUES.clone();
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

