/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.BoolValue;
import com.google.protobuf.BoolValue$1;
import com.google.protobuf.BoolValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class BoolValue$Builder
extends GeneratedMessageLite$Builder
implements BoolValueOrBuilder {
    private BoolValue$Builder() {
        BoolValue boolValue = BoolValue.access$000();
        super(boolValue);
    }

    public /* synthetic */ BoolValue$Builder(BoolValue$1 boolValue$1) {
        this();
    }

    public BoolValue$Builder clearValue() {
        this.copyOnWrite();
        BoolValue.access$200((BoolValue)this.instance);
        return this;
    }

    public boolean getValue() {
        return ((BoolValue)this.instance).getValue();
    }

    public BoolValue$Builder setValue(boolean bl2) {
        this.copyOnWrite();
        BoolValue.access$100((BoolValue)this.instance, bl2);
        return this;
    }
}

