/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.WireFormat$JavaType;

class FieldSet$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        int n3;
        int n4;
        Enum enum_;
        int n7;
        Object object2;
        int n8;
        Object object3;
        int n10;
        Object object4;
        int n14;
        Object object5;
        int n15;
        Object object6;
        int n16;
        Object object7;
        int n17;
        Object object8;
        int n18;
        Object object9;
        int n19 = WireFormat$FieldType.values().length;
        int[] nArray = new int[n19];
        $SwitchMap$com$google$protobuf$WireFormat$FieldType = nArray;
        int n20 = 1;
        try {
            object9 = WireFormat$FieldType.DOUBLE;
            n18 = object9.ordinal();
            nArray[n18] = n20;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n19 = 2;
        try {
            object9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            object8 = WireFormat$FieldType.FLOAT;
            n17 = object8.ordinal();
            object9[n17] = (WireFormat$FieldType)n19;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n18 = 3;
        try {
            object8 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            object7 = WireFormat$FieldType.INT64;
            n16 = object7.ordinal();
            object8[n16] = (WireFormat$FieldType)n18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n17 = 4;
        try {
            object7 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            object6 = WireFormat$FieldType.UINT64;
            n15 = object6.ordinal();
            object7[n15] = (WireFormat$FieldType)n17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n16 = 5;
        try {
            object6 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            object5 = WireFormat$FieldType.INT32;
            n14 = object5.ordinal();
            object6[n14] = (WireFormat$FieldType)n16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n15 = 6;
        try {
            object5 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            object4 = WireFormat$FieldType.FIXED64;
            n10 = object4.ordinal();
            object5[n10] = (WireFormat$FieldType)n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n14 = 7;
        try {
            object4 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            object3 = WireFormat$FieldType.FIXED32;
            n8 = object3.ordinal();
            object4[n8] = (WireFormat$FieldType)n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n10 = 8;
        try {
            object3 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            object2 = WireFormat$FieldType.BOOL;
            n7 = ((Enum)object2).ordinal();
            object3[n7] = (WireFormat$FieldType)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 9;
        try {
            object2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            enum_ = WireFormat$FieldType.GROUP;
            n4 = enum_.ordinal();
            object2[n4] = (WireFormat$FieldType)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            enum_ = WireFormat$FieldType.MESSAGE;
            n4 = enum_.ordinal();
            n3 = 10;
            object2[n4] = (WireFormat$FieldType)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            enum_ = WireFormat$FieldType.STRING;
            n4 = enum_.ordinal();
            n3 = 11;
            object2[n4] = (WireFormat$FieldType)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            enum_ = WireFormat$FieldType.BYTES;
            n4 = enum_.ordinal();
            n3 = 12;
            object2[n4] = (WireFormat$FieldType)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            enum_ = WireFormat$FieldType.UINT32;
            n4 = enum_.ordinal();
            n3 = 13;
            object2[n4] = (WireFormat$FieldType)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            enum_ = WireFormat$FieldType.SFIXED32;
            n4 = enum_.ordinal();
            n3 = 14;
            object2[n4] = (WireFormat$FieldType)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            enum_ = WireFormat$FieldType.SFIXED64;
            n4 = enum_.ordinal();
            n3 = 15;
            object2[n4] = (WireFormat$FieldType)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            enum_ = WireFormat$FieldType.SINT32;
            n4 = enum_.ordinal();
            n3 = 16;
            object2[n4] = (WireFormat$FieldType)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            enum_ = WireFormat$FieldType.SINT64;
            n4 = enum_.ordinal();
            n3 = 17;
            object2[n4] = (WireFormat$FieldType)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            enum_ = WireFormat$FieldType.ENUM;
            n4 = enum_.ordinal();
            n3 = 18;
            object2[n4] = (WireFormat$FieldType)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = WireFormat$JavaType.values().length;
        object2 = new int[n7];
        $SwitchMap$com$google$protobuf$WireFormat$JavaType = (int[])object2;
        try {
            enum_ = WireFormat$JavaType.INT;
            n4 = enum_.ordinal();
            object2[n4] = (WireFormat$FieldType)n20;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = $SwitchMap$com$google$protobuf$WireFormat$JavaType;
            object2 = WireFormat$JavaType.LONG;
            n7 = ((Enum)object2).ordinal();
            object[n7] = n19;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$JavaType;
            object = (Object)WireFormat$JavaType.FLOAT;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$JavaType;
            object = WireFormat$JavaType.DOUBLE;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$JavaType;
            object = WireFormat$JavaType.BOOLEAN;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$JavaType;
            object = WireFormat$JavaType.STRING;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$JavaType;
            object = WireFormat$JavaType.BYTE_STRING;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$JavaType;
            object = WireFormat$JavaType.ENUM;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$JavaType;
            object = WireFormat$JavaType.MESSAGE;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n8;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

