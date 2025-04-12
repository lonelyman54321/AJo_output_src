/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.DoubleValue$1;
import com.google.protobuf.DoubleValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class DoubleValue$Builder
extends GeneratedMessageLite$Builder
implements DoubleValueOrBuilder {
    private DoubleValue$Builder() {
        DoubleValue doubleValue = DoubleValue.access$000();
        super(doubleValue);
    }

    public /* synthetic */ DoubleValue$Builder(DoubleValue$1 doubleValue$1) {
        this();
    }

    public DoubleValue$Builder clearValue() {
        this.copyOnWrite();
        DoubleValue.access$200((DoubleValue)this.instance);
        return this;
    }

    public double getValue() {
        return ((DoubleValue)this.instance).getValue();
    }

    public DoubleValue$Builder setValue(double d2) {
        this.copyOnWrite();
        DoubleValue.access$100((DoubleValue)this.instance, d2);
        return this;
    }
}

