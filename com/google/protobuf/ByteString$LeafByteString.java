/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;

abstract class ByteString$LeafByteString
extends ByteString {
    private static final long serialVersionUID = 1L;

    public abstract boolean equalsRange(ByteString var1, int var2, int var3);

    public final int getTreeDepth() {
        return 0;
    }

    public final boolean isBalanced() {
        return true;
    }

    public void writeToReverse(ByteOutput byteOutput) {
        this.writeTo(byteOutput);
    }
}

