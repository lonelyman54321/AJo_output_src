/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$Range;
import com.google.api.Distribution$RangeOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class Distribution$Range$Builder
extends GeneratedMessageLite$Builder
implements Distribution$RangeOrBuilder {
    private Distribution$Range$Builder() {
        Distribution$Range distribution$Range = Distribution$Range.access$000();
        super(distribution$Range);
    }

    public /* synthetic */ Distribution$Range$Builder(Distribution$1 distribution$1) {
        this();
    }

    public Distribution$Range$Builder clearMax() {
        this.copyOnWrite();
        Distribution$Range.access$400((Distribution$Range)this.instance);
        return this;
    }

    public Distribution$Range$Builder clearMin() {
        this.copyOnWrite();
        Distribution$Range.access$200((Distribution$Range)this.instance);
        return this;
    }

    public double getMax() {
        return ((Distribution$Range)this.instance).getMax();
    }

    public double getMin() {
        return ((Distribution$Range)this.instance).getMin();
    }

    public Distribution$Range$Builder setMax(double d2) {
        this.copyOnWrite();
        Distribution$Range.access$300((Distribution$Range)this.instance, d2);
        return this;
    }

    public Distribution$Range$Builder setMin(double d2) {
        this.copyOnWrite();
        Distribution$Range.access$100((Distribution$Range)this.instance, d2);
        return this;
    }
}

