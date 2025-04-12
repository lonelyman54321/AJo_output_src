/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ProtoSyntax;

class ManifestSchemaFactory$2 {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        ProtoSyntax protoSyntax;
        int n3 = ProtoSyntax.values().length;
        int[] nArray = new int[n3];
        $SwitchMap$com$google$protobuf$ProtoSyntax = nArray;
        try {
            protoSyntax = ProtoSyntax.PROTO3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
        int n4 = protoSyntax.ordinal();
        int n7 = 1;
        nArray[n4] = n7;
    }
}

