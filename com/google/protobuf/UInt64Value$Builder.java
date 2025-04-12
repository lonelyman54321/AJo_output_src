/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.UInt64Value;
import com.google.protobuf.UInt64Value$1;
import com.google.protobuf.UInt64ValueOrBuilder;

public final class UInt64Value$Builder
extends GeneratedMessageLite$Builder
implements UInt64ValueOrBuilder {
    private UInt64Value$Builder() {
        UInt64Value uInt64Value = UInt64Value.access$000();
        super(uInt64Value);
    }

    public /* synthetic */ UInt64Value$Builder(UInt64Value$1 uInt64Value$1) {
        this();
    }

    public UInt64Value$Builder clearValue() {
        this.copyOnWrite();
        UInt64Value.access$200((UInt64Value)this.instance);
        return this;
    }

    public long getValue() {
        return ((UInt64Value)this.instance).getValue();
    }

    public UInt64Value$Builder setValue(long l2) {
        this.copyOnWrite();
        UInt64Value.access$100((UInt64Value)this.instance, l2);
        return this;
    }
}

