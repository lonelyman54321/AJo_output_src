/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$BucketOptions;
import com.google.api.Distribution$BucketOptions$Explicit;
import com.google.api.Distribution$BucketOptions$Explicit$Builder;
import com.google.api.Distribution$BucketOptions$Exponential;
import com.google.api.Distribution$BucketOptions$Exponential$Builder;
import com.google.api.Distribution$BucketOptions$Linear;
import com.google.api.Distribution$BucketOptions$Linear$Builder;
import com.google.api.Distribution$BucketOptions$OptionsCase;
import com.google.api.Distribution$BucketOptionsOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class Distribution$BucketOptions$Builder
extends GeneratedMessageLite$Builder
implements Distribution$BucketOptionsOrBuilder {
    private Distribution$BucketOptions$Builder() {
        Distribution$BucketOptions distribution$BucketOptions = Distribution$BucketOptions.access$2800();
        super(distribution$BucketOptions);
    }

    public /* synthetic */ Distribution$BucketOptions$Builder(Distribution$1 distribution$1) {
        this();
    }

    public Distribution$BucketOptions$Builder clearExplicitBuckets() {
        this.copyOnWrite();
        Distribution$BucketOptions.access$3800((Distribution$BucketOptions)this.instance);
        return this;
    }

    public Distribution$BucketOptions$Builder clearExponentialBuckets() {
        this.copyOnWrite();
        Distribution$BucketOptions.access$3500((Distribution$BucketOptions)this.instance);
        return this;
    }

    public Distribution$BucketOptions$Builder clearLinearBuckets() {
        this.copyOnWrite();
        Distribution$BucketOptions.access$3200((Distribution$BucketOptions)this.instance);
        return this;
    }

    public Distribution$BucketOptions$Builder clearOptions() {
        this.copyOnWrite();
        Distribution$BucketOptions.access$2900((Distribution$BucketOptions)this.instance);
        return this;
    }

    public Distribution$BucketOptions$Explicit getExplicitBuckets() {
        return ((Distribution$BucketOptions)this.instance).getExplicitBuckets();
    }

    public Distribution$BucketOptions$Exponential getExponentialBuckets() {
        return ((Distribution$BucketOptions)this.instance).getExponentialBuckets();
    }

    public Distribution$BucketOptions$Linear getLinearBuckets() {
        return ((Distribution$BucketOptions)this.instance).getLinearBuckets();
    }

    public Distribution$BucketOptions$OptionsCase getOptionsCase() {
        return ((Distribution$BucketOptions)this.instance).getOptionsCase();
    }

    public boolean hasExplicitBuckets() {
        return ((Distribution$BucketOptions)this.instance).hasExplicitBuckets();
    }

    public boolean hasExponentialBuckets() {
        return ((Distribution$BucketOptions)this.instance).hasExponentialBuckets();
    }

    public boolean hasLinearBuckets() {
        return ((Distribution$BucketOptions)this.instance).hasLinearBuckets();
    }

    public Distribution$BucketOptions$Builder mergeExplicitBuckets(Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit) {
        this.copyOnWrite();
        Distribution$BucketOptions.access$3700((Distribution$BucketOptions)this.instance, distribution$BucketOptions$Explicit);
        return this;
    }

    public Distribution$BucketOptions$Builder mergeExponentialBuckets(Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential) {
        this.copyOnWrite();
        Distribution$BucketOptions.access$3400((Distribution$BucketOptions)this.instance, distribution$BucketOptions$Exponential);
        return this;
    }

    public Distribution$BucketOptions$Builder mergeLinearBuckets(Distribution$BucketOptions$Linear distribution$BucketOptions$Linear) {
        this.copyOnWrite();
        Distribution$BucketOptions.access$3100((Distribution$BucketOptions)this.instance, distribution$BucketOptions$Linear);
        return this;
    }

    public Distribution$BucketOptions$Builder setExplicitBuckets(Distribution$BucketOptions$Explicit$Builder distribution$BucketOptions$ExplicitOrBuilder) {
        this.copyOnWrite();
        Distribution$BucketOptions distribution$BucketOptions = (Distribution$BucketOptions)this.instance;
        distribution$BucketOptions$ExplicitOrBuilder = (Distribution$BucketOptions$Explicit)distribution$BucketOptions$ExplicitOrBuilder.build();
        Distribution$BucketOptions.access$3600(distribution$BucketOptions, (Distribution$BucketOptions$Explicit)distribution$BucketOptions$ExplicitOrBuilder);
        return this;
    }

    public Distribution$BucketOptions$Builder setExplicitBuckets(Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit) {
        this.copyOnWrite();
        Distribution$BucketOptions.access$3600((Distribution$BucketOptions)this.instance, distribution$BucketOptions$Explicit);
        return this;
    }

    public Distribution$BucketOptions$Builder setExponentialBuckets(Distribution$BucketOptions$Exponential$Builder distribution$BucketOptions$ExponentialOrBuilder) {
        this.copyOnWrite();
        Distribution$BucketOptions distribution$BucketOptions = (Distribution$BucketOptions)this.instance;
        distribution$BucketOptions$ExponentialOrBuilder = (Distribution$BucketOptions$Exponential)distribution$BucketOptions$ExponentialOrBuilder.build();
        Distribution$BucketOptions.access$3300(distribution$BucketOptions, (Distribution$BucketOptions$Exponential)distribution$BucketOptions$ExponentialOrBuilder);
        return this;
    }

    public Distribution$BucketOptions$Builder setExponentialBuckets(Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential) {
        this.copyOnWrite();
        Distribution$BucketOptions.access$3300((Distribution$BucketOptions)this.instance, distribution$BucketOptions$Exponential);
        return this;
    }

    public Distribution$BucketOptions$Builder setLinearBuckets(Distribution$BucketOptions$Linear$Builder distribution$BucketOptions$LinearOrBuilder) {
        this.copyOnWrite();
        Distribution$BucketOptions distribution$BucketOptions = (Distribution$BucketOptions)this.instance;
        distribution$BucketOptions$LinearOrBuilder = (Distribution$BucketOptions$Linear)distribution$BucketOptions$LinearOrBuilder.build();
        Distribution$BucketOptions.access$3000(distribution$BucketOptions, (Distribution$BucketOptions$Linear)distribution$BucketOptions$LinearOrBuilder);
        return this;
    }

    public Distribution$BucketOptions$Builder setLinearBuckets(Distribution$BucketOptions$Linear distribution$BucketOptions$Linear) {
        this.copyOnWrite();
        Distribution$BucketOptions.access$3000((Distribution$BucketOptions)this.instance, distribution$BucketOptions$Linear);
        return this;
    }
}

