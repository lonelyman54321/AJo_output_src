/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$BucketOptions$Explicit;
import com.google.api.Distribution$BucketOptions$Exponential;
import com.google.api.Distribution$BucketOptions$Linear;
import com.google.api.Distribution$BucketOptions$OptionsCase;
import com.google.protobuf.MessageLiteOrBuilder;

public interface Distribution$BucketOptionsOrBuilder
extends MessageLiteOrBuilder {
    public Distribution.BucketOptions.Explicit getExplicitBuckets();

    public Distribution.BucketOptions.Exponential getExponentialBuckets();

    public Distribution.BucketOptions.Linear getLinearBuckets();

    public Distribution$BucketOptions$OptionsCase getOptionsCase();

    public boolean hasExplicitBuckets();

    public boolean hasExponentialBuckets();

    public boolean hasLinearBuckets();
}

