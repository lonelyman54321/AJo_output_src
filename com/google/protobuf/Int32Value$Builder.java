/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int32Value$1;
import com.google.protobuf.Int32ValueOrBuilder;

public final class Int32Value$Builder
extends GeneratedMessageLite$Builder
implements Int32ValueOrBuilder {
    private Int32Value$Builder() {
        Int32Value int32Value = Int32Value.access$000();
        super(int32Value);
    }

    public /* synthetic */ Int32Value$Builder(Int32Value$1 int32Value$1) {
        this();
    }

    public Int32Value$Builder clearValue() {
        this.copyOnWrite();
        Int32Value.access$200((Int32Value)this.instance);
        return this;
    }

    public int getValue() {
        return ((Int32Value)this.instance).getValue();
    }

    public Int32Value$Builder setValue(int n3) {
        this.copyOnWrite();
        Int32Value.access$100((Int32Value)this.instance, n3);
        return this;
    }
}

