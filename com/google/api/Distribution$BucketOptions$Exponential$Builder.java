/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$BucketOptions$Exponential;
import com.google.api.Distribution$BucketOptions$ExponentialOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class Distribution$BucketOptions$Exponential$Builder
extends GeneratedMessageLite$Builder
implements Distribution$BucketOptions$ExponentialOrBuilder {
    private Distribution$BucketOptions$Exponential$Builder() {
        Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential = Distribution$BucketOptions$Exponential.access$1400();
        super(distribution$BucketOptions$Exponential);
    }

    public /* synthetic */ Distribution$BucketOptions$Exponential$Builder(Distribution$1 distribution$1) {
        this();
    }

    public Distribution$BucketOptions$Exponential$Builder clearGrowthFactor() {
        this.copyOnWrite();
        Distribution$BucketOptions$Exponential.access$1800((Distribution$BucketOptions$Exponential)this.instance);
        return this;
    }

    public Distribution$BucketOptions$Exponential$Builder clearNumFiniteBuckets() {
        this.copyOnWrite();
        Distribution$BucketOptions$Exponential.access$1600((Distribution$BucketOptions$Exponential)this.instance);
        return this;
    }

    public Distribution$BucketOptions$Exponential$Builder clearScale() {
        this.copyOnWrite();
        Distribution$BucketOptions$Exponential.access$2000((Distribution$BucketOptions$Exponential)this.instance);
        return this;
    }

    public double getGrowthFactor() {
        return ((Distribution$BucketOptions$Exponential)this.instance).getGrowthFactor();
    }

    public int getNumFiniteBuckets() {
        return ((Distribution$BucketOptions$Exponential)this.instance).getNumFiniteBuckets();
    }

    public double getScale() {
        return ((Distribution$BucketOptions$Exponential)this.instance).getScale();
    }

    public Distribution$BucketOptions$Exponential$Builder setGrowthFactor(double d2) {
        this.copyOnWrite();
        Distribution$BucketOptions$Exponential.access$1700((Distribution$BucketOptions$Exponential)this.instance, d2);
        return this;
    }

    public Distribution$BucketOptions$Exponential$Builder setNumFiniteBuckets(int n3) {
        this.copyOnWrite();
        Distribution$BucketOptions$Exponential.access$1500((Distribution$BucketOptions$Exponential)this.instance, n3);
        return this;
    }

    public Distribution$BucketOptions$Exponential$Builder setScale(double d2) {
        this.copyOnWrite();
        Distribution$BucketOptions$Exponential.access$1900((Distribution$BucketOptions$Exponential)this.instance, d2);
        return this;
    }
}

