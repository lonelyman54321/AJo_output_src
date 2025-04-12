/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Int64Value$1;
import com.google.protobuf.Int64ValueOrBuilder;

public final class Int64Value$Builder
extends GeneratedMessageLite$Builder
implements Int64ValueOrBuilder {
    private Int64Value$Builder() {
        Int64Value int64Value = Int64Value.access$000();
        super(int64Value);
    }

    public /* synthetic */ Int64Value$Builder(Int64Value$1 int64Value$1) {
        this();
    }

    public Int64Value$Builder clearValue() {
        this.copyOnWrite();
        Int64Value.access$200((Int64Value)this.instance);
        return this;
    }

    public long getValue() {
        return ((Int64Value)this.instance).getValue();
    }

    public Int64Value$Builder setValue(long l2) {
        this.copyOnWrite();
        Int64Value.access$100((Int64Value)this.instance, l2);
        return this;
    }
}

