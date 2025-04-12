/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type$1;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type$TypeVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class DescriptorProtos$FieldDescriptorProto$Type
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ DescriptorProtos$FieldDescriptorProto$Type[] $VALUES;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_BOOL;
    public static final int TYPE_BOOL_VALUE = 8;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_BYTES;
    public static final int TYPE_BYTES_VALUE = 12;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_DOUBLE;
    public static final int TYPE_DOUBLE_VALUE = 1;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_ENUM;
    public static final int TYPE_ENUM_VALUE = 14;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED32;
    public static final int TYPE_FIXED32_VALUE = 7;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED64;
    public static final int TYPE_FIXED64_VALUE = 6;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_FLOAT;
    public static final int TYPE_FLOAT_VALUE = 2;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_GROUP;
    public static final int TYPE_GROUP_VALUE = 10;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_INT32;
    public static final int TYPE_INT32_VALUE = 5;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_INT64;
    public static final int TYPE_INT64_VALUE = 3;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_MESSAGE;
    public static final int TYPE_MESSAGE_VALUE = 11;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED32;
    public static final int TYPE_SFIXED32_VALUE = 15;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED64;
    public static final int TYPE_SFIXED64_VALUE = 16;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT32;
    public static final int TYPE_SINT32_VALUE = 17;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT64;
    public static final int TYPE_SINT64_VALUE = 18;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_STRING;
    public static final int TYPE_STRING_VALUE = 9;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT32;
    public static final int TYPE_UINT32_VALUE = 13;
    public static final /* enum */ DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT64;
    public static final int TYPE_UINT64_VALUE = 4;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type2;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type3;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type4;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type5;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type6;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type7;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type8;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type9;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type10;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type11;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type12;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type13;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type14;
        int n3 = 1;
        Object object = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_DOUBLE", 0, n3);
        TYPE_DOUBLE = object;
        int n4 = 2;
        TYPE_FLOAT = descriptorProtos$FieldDescriptorProto$Type14 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_FLOAT", n3, n4);
        int n7 = 3;
        TYPE_INT64 = descriptorProtos$FieldDescriptorProto$Type13 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_INT64", n4, n7);
        int n8 = 4;
        TYPE_UINT64 = descriptorProtos$FieldDescriptorProto$Type12 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_UINT64", n7, n8);
        int n10 = 5;
        TYPE_INT32 = descriptorProtos$FieldDescriptorProto$Type11 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_INT32", n8, n10);
        int n14 = 6;
        TYPE_FIXED64 = descriptorProtos$FieldDescriptorProto$Type10 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_FIXED64", n10, n14);
        int n15 = 7;
        TYPE_FIXED32 = descriptorProtos$FieldDescriptorProto$Type9 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_FIXED32", n14, n15);
        n10 = 8;
        TYPE_BOOL = descriptorProtos$FieldDescriptorProto$Type8 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_BOOL", n15, n10);
        n8 = 9;
        TYPE_STRING = descriptorProtos$FieldDescriptorProto$Type7 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_STRING", n10, n8);
        n7 = 10;
        TYPE_GROUP = descriptorProtos$FieldDescriptorProto$Type6 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_GROUP", n8, n7);
        n4 = 11;
        TYPE_MESSAGE = descriptorProtos$FieldDescriptorProto$Type5 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_MESSAGE", n7, n4);
        n3 = 12;
        TYPE_BYTES = descriptorProtos$FieldDescriptorProto$Type4 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_BYTES", n4, n3);
        int n16 = 13;
        TYPE_UINT32 = descriptorProtos$FieldDescriptorProto$Type3 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_UINT32", n3, n16);
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type15 = descriptorProtos$FieldDescriptorProto$Type3;
        n7 = 14;
        TYPE_ENUM = descriptorProtos$FieldDescriptorProto$Type2 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_ENUM", n16, n7);
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type16 = descriptorProtos$FieldDescriptorProto$Type2;
        n4 = 15;
        DescriptorProtos$FieldDescriptorProto$Type[] descriptorProtos$FieldDescriptorProto$TypeArray = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_SFIXED32", n7, n4);
        TYPE_SFIXED32 = descriptorProtos$FieldDescriptorProto$TypeArray;
        DescriptorProtos$FieldDescriptorProto$Type[] descriptorProtos$FieldDescriptorProto$TypeArray2 = descriptorProtos$FieldDescriptorProto$TypeArray;
        n3 = 16;
        TYPE_SFIXED64 = descriptorProtos$FieldDescriptorProto$Type = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_SFIXED64", n4, n3);
        n16 = 17;
        TYPE_SINT32 = descriptorProtos$FieldDescriptorProto$Type3 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_SINT32", n3, n16);
        n7 = 18;
        TYPE_SINT64 = descriptorProtos$FieldDescriptorProto$Type2 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_SINT64", n16, n7);
        descriptorProtos$FieldDescriptorProto$TypeArray = new DescriptorProtos$FieldDescriptorProto$Type[n7];
        descriptorProtos$FieldDescriptorProto$TypeArray[0] = object;
        descriptorProtos$FieldDescriptorProto$TypeArray[1] = descriptorProtos$FieldDescriptorProto$Type14;
        descriptorProtos$FieldDescriptorProto$TypeArray[2] = descriptorProtos$FieldDescriptorProto$Type13;
        descriptorProtos$FieldDescriptorProto$TypeArray[3] = descriptorProtos$FieldDescriptorProto$Type12;
        descriptorProtos$FieldDescriptorProto$TypeArray[4] = descriptorProtos$FieldDescriptorProto$Type11;
        descriptorProtos$FieldDescriptorProto$TypeArray[5] = descriptorProtos$FieldDescriptorProto$Type10;
        descriptorProtos$FieldDescriptorProto$TypeArray[6] = descriptorProtos$FieldDescriptorProto$Type9;
        descriptorProtos$FieldDescriptorProto$TypeArray[7] = descriptorProtos$FieldDescriptorProto$Type8;
        descriptorProtos$FieldDescriptorProto$TypeArray[8] = descriptorProtos$FieldDescriptorProto$Type7;
        descriptorProtos$FieldDescriptorProto$TypeArray[9] = descriptorProtos$FieldDescriptorProto$Type6;
        descriptorProtos$FieldDescriptorProto$TypeArray[10] = descriptorProtos$FieldDescriptorProto$Type5;
        descriptorProtos$FieldDescriptorProto$TypeArray[11] = descriptorProtos$FieldDescriptorProto$Type4;
        descriptorProtos$FieldDescriptorProto$TypeArray[12] = descriptorProtos$FieldDescriptorProto$Type15;
        descriptorProtos$FieldDescriptorProto$TypeArray[13] = descriptorProtos$FieldDescriptorProto$Type16;
        descriptorProtos$FieldDescriptorProto$TypeArray[14] = descriptorProtos$FieldDescriptorProto$TypeArray2;
        descriptorProtos$FieldDescriptorProto$TypeArray[15] = descriptorProtos$FieldDescriptorProto$Type;
        descriptorProtos$FieldDescriptorProto$TypeArray[16] = descriptorProtos$FieldDescriptorProto$Type3;
        descriptorProtos$FieldDescriptorProto$TypeArray[n16] = descriptorProtos$FieldDescriptorProto$Type2;
        $VALUES = descriptorProtos$FieldDescriptorProto$TypeArray;
        internalValueMap = object = new DescriptorProtos$FieldDescriptorProto$Type$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DescriptorProtos$FieldDescriptorProto$Type() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static DescriptorProtos$FieldDescriptorProto$Type forNumber(int n3) {
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
            case 1: 
        }
        return TYPE_DOUBLE;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return DescriptorProtos$FieldDescriptorProto$Type$TypeVerifier.INSTANCE;
    }

    public static DescriptorProtos$FieldDescriptorProto$Type valueOf(int n3) {
        return DescriptorProtos$FieldDescriptorProto$Type.forNumber(n3);
    }

    public static DescriptorProtos$FieldDescriptorProto$Type valueOf(String string2) {
        return Enum.valueOf(DescriptorProtos$FieldDescriptorProto$Type.class, string2);
    }

    public static DescriptorProtos$FieldDescriptorProto$Type[] values() {
        return (DescriptorProtos$FieldDescriptorProto$Type[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

