/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf$IntEncoding;

class ProtobufDataEncoderContext$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Protobuf$IntEncoding protobuf$IntEncoding;
        int n7 = Protobuf$IntEncoding.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding = nArray;
        try {
            protobuf$IntEncoding = Protobuf$IntEncoding.DEFAULT;
            n4 = protobuf$IntEncoding.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding;
            protobuf$IntEncoding = Protobuf$IntEncoding.SIGNED;
            n4 = protobuf$IntEncoding.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding;
            protobuf$IntEncoding = Protobuf$IntEncoding.FIXED;
            n4 = protobuf$IntEncoding.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

