/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$BucketOptions;
import com.google.api.Distribution$Exemplar;
import com.google.api.Distribution$Range;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DistributionOrBuilder
extends MessageLiteOrBuilder {
    public long getBucketCounts(int var1);

    public int getBucketCountsCount();

    public List getBucketCountsList();

    public Distribution.BucketOptions getBucketOptions();

    public long getCount();

    public Distribution.Exemplar getExemplars(int var1);

    public int getExemplarsCount();

    public List getExemplarsList();

    public double getMean();

    public Distribution.Range getRange();

    public double getSumOfSquaredDeviation();

    public boolean hasBucketOptions();

    public boolean hasRange();
}

