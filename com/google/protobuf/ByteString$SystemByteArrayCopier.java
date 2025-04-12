/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString$1;
import com.google.protobuf.ByteString$ByteArrayCopier;

final class ByteString$SystemByteArrayCopier
implements ByteString$ByteArrayCopier {
    private ByteString$SystemByteArrayCopier() {
    }

    public /* synthetic */ ByteString$SystemByteArrayCopier(ByteString$1 byteString$1) {
        this();
    }

    public byte[] copyFrom(byte[] byArray, int n3, int n4) {
        byte[] byArray2 = new byte[n4];
        System.arraycopy(byArray, n3, byArray2, 0, n4);
        return byArray2;
    }
}

