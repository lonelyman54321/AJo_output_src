/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.WireFormat$JavaType;

class GeneratedMessageLite$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        WireFormat$JavaType wireFormat$JavaType;
        int n7 = WireFormat$JavaType.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$protobuf$WireFormat$JavaType = nArray;
        try {
            wireFormat$JavaType = WireFormat$JavaType.MESSAGE;
            n4 = wireFormat$JavaType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$WireFormat$JavaType;
            wireFormat$JavaType = WireFormat$JavaType.ENUM;
            n4 = wireFormat$JavaType.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

