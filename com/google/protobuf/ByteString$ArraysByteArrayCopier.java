/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString$1;
import com.google.protobuf.ByteString$ByteArrayCopier;
import java.util.Arrays;

final class ByteString$ArraysByteArrayCopier
implements ByteString$ByteArrayCopier {
    private ByteString$ArraysByteArrayCopier() {
    }

    public /* synthetic */ ByteString$ArraysByteArrayCopier(ByteString$1 byteString$1) {
        this();
    }

    public byte[] copyFrom(byte[] byArray, int n3, int n4) {
        return Arrays.copyOfRange(byArray, n3, n4 += n3);
    }
}

