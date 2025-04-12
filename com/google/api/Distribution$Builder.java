/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution;
import com.google.api.Distribution$1;
import com.google.api.Distribution$BucketOptions;
import com.google.api.Distribution$BucketOptions$Builder;
import com.google.api.Distribution$Exemplar;
import com.google.api.Distribution$Exemplar$Builder;
import com.google.api.Distribution$Range;
import com.google.api.Distribution$Range$Builder;
import com.google.api.DistributionOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Distribution$Builder
extends GeneratedMessageLite$Builder
implements DistributionOrBuilder {
    private Distribution$Builder() {
        Distribution distribution = Distribution.access$5300();
        super(distribution);
    }

    public /* synthetic */ Distribution$Builder(Distribution$1 distribution$1) {
        this();
    }

    public Distribution$Builder addAllBucketCounts(Iterable iterable) {
        this.copyOnWrite();
        Distribution.access$6800((Distribution)this.instance, iterable);
        return this;
    }

    public Distribution$Builder addAllExemplars(Iterable iterable) {
        this.copyOnWrite();
        Distribution.access$7300((Distribution)this.instance, iterable);
        return this;
    }

    public Distribution$Builder addBucketCounts(long l2) {
        this.copyOnWrite();
        Distribution.access$6700((Distribution)this.instance, l2);
        return this;
    }

    public Distribution$Builder addExemplars(int n3, Distribution$Exemplar$Builder distribution$ExemplarOrBuilder) {
        this.copyOnWrite();
        Distribution distribution = (Distribution)this.instance;
        distribution$ExemplarOrBuilder = (Distribution$Exemplar)distribution$ExemplarOrBuilder.build();
        Distribution.access$7200(distribution, n3, (Distribution$Exemplar)distribution$ExemplarOrBuilder);
        return this;
    }

    public Distribution$Builder addExemplars(int n3, Distribution$Exemplar distribution$Exemplar) {
        this.copyOnWrite();
        Distribution.access$7200((Distribution)this.instance, n3, distribution$Exemplar);
        return this;
    }

    public Distribution$Builder addExemplars(Distribution$Exemplar$Builder distribution$ExemplarOrBuilder) {
        this.copyOnWrite();
        Distribution distribution = (Distribution)this.instance;
        distribution$ExemplarOrBuilder = (Distribution$Exemplar)distribution$ExemplarOrBuilder.build();
        Distribution.access$7100(distribution, (Distribution$Exemplar)distribution$ExemplarOrBuilder);
        return this;
    }

    public Distribution$Builder addExemplars(Distribution$Exemplar distribution$Exemplar) {
        this.copyOnWrite();
        Distribution.access$7100((Distribution)this.instance, distribution$Exemplar);
        return this;
    }

    public Distribution$Builder clearBucketCounts() {
        this.copyOnWrite();
        Distribution.access$6900((Distribution)this.instance);
        return this;
    }

    public Distribution$Builder clearBucketOptions() {
        this.copyOnWrite();
        Distribution.access$6500((Distribution)this.instance);
        return this;
    }

    public Distribution$Builder clearCount() {
        this.copyOnWrite();
        Distribution.access$5500((Distribution)this.instance);
        return this;
    }

    public Distribution$Builder clearExemplars() {
        this.copyOnWrite();
        Distribution.access$7400((Distribution)this.instance);
        return this;
    }

    public Distribution$Builder clearMean() {
        this.copyOnWrite();
        Distribution.access$5700((Distribution)this.instance);
        return this;
    }

    public Distribution$Builder clearRange() {
        this.copyOnWrite();
        Distribution.access$6200((Distribution)this.instance);
        return this;
    }

    public Distribution$Builder clearSumOfSquaredDeviation() {
        this.copyOnWrite();
        Distribution.access$5900((Distribution)this.instance);
        return this;
    }

    public long getBucketCounts(int n3) {
        return ((Distribution)this.instance).getBucketCounts(n3);
    }

    public int getBucketCountsCount() {
        return ((Distribution)this.instance).getBucketCountsCount();
    }

    public List getBucketCountsList() {
        return Collections.unmodifiableList(((Distribution)this.instance).getBucketCountsList());
    }

    public Distribution$BucketOptions getBucketOptions() {
        return ((Distribution)this.instance).getBucketOptions();
    }

    public long getCount() {
        return ((Distribution)this.instance).getCount();
    }

    public Distribution$Exemplar getExemplars(int n3) {
        return ((Distribution)this.instance).getExemplars(n3);
    }

    public int getExemplarsCount() {
        return ((Distribution)this.instance).getExemplarsCount();
    }

    public List getExemplarsList() {
        return Collections.unmodifiableList(((Distribution)this.instance).getExemplarsList());
    }

    public double getMean() {
        return ((Distribution)this.instance).getMean();
    }

    public Distribution$Range getRange() {
        return ((Distribution)this.instance).getRange();
    }

    public double getSumOfSquaredDeviation() {
        return ((Distribution)this.instance).getSumOfSquaredDeviation();
    }

    public boolean hasBucketOptions() {
        return ((Distribution)this.instance).hasBucketOptions();
    }

    public boolean hasRange() {
        return ((Distribution)this.instance).hasRange();
    }

    public Distribution$Builder mergeBucketOptions(Distribution$BucketOptions distribution$BucketOptions) {
        this.copyOnWrite();
        Distribution.access$6400((Distribution)this.instance, distribution$BucketOptions);
        return this;
    }

    public Distribution$Builder mergeRange(Distribution$Range distribution$Range) {
        this.copyOnWrite();
        Distribution.access$6100((Distribution)this.instance, distribution$Range);
        return this;
    }

    public Distribution$Builder removeExemplars(int n3) {
        this.copyOnWrite();
        Distribution.access$7500((Distribution)this.instance, n3);
        return this;
    }

    public Distribution$Builder setBucketCounts(int n3, long l2) {
        this.copyOnWrite();
        Distribution.access$6600((Distribution)this.instance, n3, l2);
        return this;
    }

    public Distribution$Builder setBucketOptions(Distribution$BucketOptions$Builder distribution$BucketOptionsOrBuilder) {
        this.copyOnWrite();
        Distribution distribution = (Distribution)this.instance;
        distribution$BucketOptionsOrBuilder = (Distribution$BucketOptions)distribution$BucketOptionsOrBuilder.build();
        Distribution.access$6300(distribution, (Distribution$BucketOptions)distribution$BucketOptionsOrBuilder);
        return this;
    }

    public Distribution$Builder setBucketOptions(Distribution$BucketOptions distribution$BucketOptions) {
        this.copyOnWrite();
        Distribution.access$6300((Distribution)this.instance, distribution$BucketOptions);
        return this;
    }

    public Distribution$Builder setCount(long l2) {
        this.copyOnWrite();
        Distribution.access$5400((Distribution)this.instance, l2);
        return this;
    }

    public Distribution$Builder setExemplars(int n3, Distribution$Exemplar$Builder distribution$ExemplarOrBuilder) {
        this.copyOnWrite();
        Distribution distribution = (Distribution)this.instance;
        distribution$ExemplarOrBuilder = (Distribution$Exemplar)distribution$ExemplarOrBuilder.build();
        Distribution.access$7000(distribution, n3, (Distribution$Exemplar)distribution$ExemplarOrBuilder);
        return this;
    }

    public Distribution$Builder setExemplars(int n3, Distribution$Exemplar distribution$Exemplar) {
        this.copyOnWrite();
        Distribution.access$7000((Distribution)this.instance, n3, distribution$Exemplar);
        return this;
    }

    public Distribution$Builder setMean(double d2) {
        this.copyOnWrite();
        Distribution.access$5600((Distribution)this.instance, d2);
        return this;
    }

    public Distribution$Builder setRange(Distribution$Range$Builder distribution$RangeOrBuilder) {
        this.copyOnWrite();
        Distribution distribution = (Distribution)this.instance;
        distribution$RangeOrBuilder = (Distribution$Range)distribution$RangeOrBuilder.build();
        Distribution.access$6000(distribution, (Distribution$Range)distribution$RangeOrBuilder);
        return this;
    }

    public Distribution$Builder setRange(Distribution$Range distribution$Range) {
        this.copyOnWrite();
        Distribution.access$6000((Distribution)this.instance, distribution$Range);
        return this;
    }

    public Distribution$Builder setSumOfSquaredDeviation(double d2) {
        this.copyOnWrite();
        Distribution.access$5800((Distribution)this.instance, d2);
        return this;
    }
}

