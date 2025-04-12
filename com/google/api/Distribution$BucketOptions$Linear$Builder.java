/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$BucketOptions$Linear;
import com.google.api.Distribution$BucketOptions$LinearOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class Distribution$BucketOptions$Linear$Builder
extends GeneratedMessageLite$Builder
implements Distribution$BucketOptions$LinearOrBuilder {
    private Distribution$BucketOptions$Linear$Builder() {
        Distribution$BucketOptions$Linear distribution$BucketOptions$Linear = Distribution$BucketOptions$Linear.access$600();
        super(distribution$BucketOptions$Linear);
    }

    public /* synthetic */ Distribution$BucketOptions$Linear$Builder(Distribution$1 distribution$1) {
        this();
    }

    public Distribution$BucketOptions$Linear$Builder clearNumFiniteBuckets() {
        this.copyOnWrite();
        Distribution$BucketOptions$Linear.access$800((Distribution$BucketOptions$Linear)this.instance);
        return this;
    }

    public Distribution$BucketOptions$Linear$Builder clearOffset() {
        this.copyOnWrite();
        Distribution$BucketOptions$Linear.access$1200((Distribution$BucketOptions$Linear)this.instance);
        return this;
    }

    public Distribution$BucketOptions$Linear$Builder clearWidth() {
        this.copyOnWrite();
        Distribution$BucketOptions$Linear.access$1000((Distribution$BucketOptions$Linear)this.instance);
        return this;
    }

    public int getNumFiniteBuckets() {
        return ((Distribution$BucketOptions$Linear)this.instance).getNumFiniteBuckets();
    }

    public double getOffset() {
        return ((Distribution$BucketOptions$Linear)this.instance).getOffset();
    }

    public double getWidth() {
        return ((Distribution$BucketOptions$Linear)this.instance).getWidth();
    }

    public Distribution$BucketOptions$Linear$Builder setNumFiniteBuckets(int n3) {
        this.copyOnWrite();
        Distribution$BucketOptions$Linear.access$700((Distribution$BucketOptions$Linear)this.instance, n3);
        return this;
    }

    public Distribution$BucketOptions$Linear$Builder setOffset(double d2) {
        this.copyOnWrite();
        Distribution$BucketOptions$Linear.access$1100((Distribution$BucketOptions$Linear)this.instance, d2);
        return this;
    }

    public Distribution$BucketOptions$Linear$Builder setWidth(double d2) {
        this.copyOnWrite();
        Distribution$BucketOptions$Linear.access$900((Distribution$BucketOptions$Linear)this.instance, d2);
        return this;
    }
}

