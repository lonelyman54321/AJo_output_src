/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.TextFormatEscaper$ByteSequence;

class TextFormatEscaper$1
implements TextFormatEscaper$ByteSequence {
    final /* synthetic */ ByteString val$input;

    public TextFormatEscaper$1(ByteString byteString) {
        this.val$input = byteString;
    }

    public byte byteAt(int n3) {
        return this.val$input.byteAt(n3);
    }

    public int size() {
        return this.val$input.size();
    }
}

