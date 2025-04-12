/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.WireFormat$FieldType;

class WireFormat$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        WireFormat$FieldType wireFormat$FieldType;
        int n7 = WireFormat$FieldType.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$protobuf$WireFormat$FieldType = nArray;
        try {
            wireFormat$FieldType = WireFormat$FieldType.DOUBLE;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.FLOAT;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.INT64;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.UINT64;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.INT32;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.FIXED64;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.FIXED32;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.BOOL;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.BYTES;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.UINT32;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.SFIXED32;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.SFIXED64;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.SINT32;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.SINT64;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.STRING;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.GROUP;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.MESSAGE;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.ENUM;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 18;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

