/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt32Value$1;
import com.google.protobuf.UInt32ValueOrBuilder;

public final class UInt32Value$Builder
extends GeneratedMessageLite$Builder
implements UInt32ValueOrBuilder {
    private UInt32Value$Builder() {
        UInt32Value uInt32Value = UInt32Value.access$000();
        super(uInt32Value);
    }

    public /* synthetic */ UInt32Value$Builder(UInt32Value$1 uInt32Value$1) {
        this();
    }

    public UInt32Value$Builder clearValue() {
        this.copyOnWrite();
        UInt32Value.access$200((UInt32Value)this.instance);
        return this;
    }

    public int getValue() {
        return ((UInt32Value)this.instance).getValue();
    }

    public UInt32Value$Builder setValue(int n3) {
        this.copyOnWrite();
        UInt32Value.access$100((UInt32Value)this.instance, n3);
        return this;
    }
}

