/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.WireFormat$FieldType;

class MapEntryLite$1 {
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
            wireFormat$FieldType = WireFormat$FieldType.MESSAGE;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.ENUM;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$FieldType;
            wireFormat$FieldType = WireFormat$FieldType.GROUP;
            n4 = wireFormat$FieldType.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

