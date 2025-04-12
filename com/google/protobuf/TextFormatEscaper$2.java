/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.TextFormatEscaper$ByteSequence;

class TextFormatEscaper$2
implements TextFormatEscaper$ByteSequence {
    final /* synthetic */ byte[] val$input;

    public TextFormatEscaper$2(byte[] byArray) {
        this.val$input = byArray;
    }

    public byte byteAt(int n3) {
        return this.val$input[n3];
    }

    public int size() {
        return this.val$input.length;
    }
}

