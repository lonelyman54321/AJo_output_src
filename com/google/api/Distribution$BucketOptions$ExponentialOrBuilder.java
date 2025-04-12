/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;

public interface Distribution$BucketOptions$ExponentialOrBuilder
extends MessageLiteOrBuilder {
    public double getGrowthFactor();

    public int getNumFiniteBuckets();

    public double getScale();
}

