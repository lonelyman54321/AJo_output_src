/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;

public final class UnsafeByteOperations {
    private UnsafeByteOperations() {
    }

    public static ByteString unsafeWrap(ByteBuffer byteBuffer) {
        return ByteString.wrap(byteBuffer);
    }

    public static ByteString unsafeWrap(byte[] byArray) {
        return ByteString.wrap(byArray);
    }

    public static ByteString unsafeWrap(byte[] byArray, int n3, int n4) {
        return ByteString.wrap(byArray, n3, n4);
    }

    public static void unsafeWriteTo(ByteString byteString, ByteOutput byteOutput) {
        byteString.writeTo(byteOutput);
    }
}

