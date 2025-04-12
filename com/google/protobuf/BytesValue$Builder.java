/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue;
import com.google.protobuf.BytesValue$1;
import com.google.protobuf.BytesValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class BytesValue$Builder
extends GeneratedMessageLite$Builder
implements BytesValueOrBuilder {
    private BytesValue$Builder() {
        BytesValue bytesValue = BytesValue.access$000();
        super(bytesValue);
    }

    public /* synthetic */ BytesValue$Builder(BytesValue$1 bytesValue$1) {
        this();
    }

    public BytesValue$Builder clearValue() {
        this.copyOnWrite();
        BytesValue.access$200((BytesValue)this.instance);
        return this;
    }

    public ByteString getValue() {
        return ((BytesValue)this.instance).getValue();
    }

    public BytesValue$Builder setValue(ByteString byteString) {
        this.copyOnWrite();
        BytesValue.access$100((BytesValue)this.instance, byteString);
        return this;
    }
}

