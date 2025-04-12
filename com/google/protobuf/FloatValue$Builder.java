/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValue$1;
import com.google.protobuf.FloatValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class FloatValue$Builder
extends GeneratedMessageLite$Builder
implements FloatValueOrBuilder {
    private FloatValue$Builder() {
        FloatValue floatValue = FloatValue.access$000();
        super(floatValue);
    }

    public /* synthetic */ FloatValue$Builder(FloatValue$1 floatValue$1) {
        this();
    }

    public FloatValue$Builder clearValue() {
        this.copyOnWrite();
        FloatValue.access$200((FloatValue)this.instance);
        return this;
    }

    public float getValue() {
        return ((FloatValue)this.instance).getValue();
    }

    public FloatValue$Builder setValue(float f5) {
        this.copyOnWrite();
        FloatValue.access$100((FloatValue)this.instance, f5);
        return this;
    }
}

