/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$BucketOptions;
import com.google.api.Distribution$BucketOptions$Builder;
import com.google.api.Distribution$BucketOptionsOrBuilder;
import com.google.api.Distribution$Builder;
import com.google.api.Distribution$Exemplar;
import com.google.api.Distribution$ExemplarOrBuilder;
import com.google.api.Distribution$Range;
import com.google.api.Distribution$Range$Builder;
import com.google.api.Distribution$RangeOrBuilder;
import com.google.api.DistributionOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$LongList;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Distribution
extends GeneratedMessageLite
implements DistributionOrBuilder {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final Distribution DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private int bucketCountsMemoizedSerializedSize = -1;
    private Internal$LongList bucketCounts_;
    private Distribution$BucketOptions bucketOptions_;
    private long count_;
    private Internal$ProtobufList exemplars_;
    private double mean_;
    private Distribution$Range range_;
    private double sumOfSquaredDeviation_;

    static {
        Distribution distribution;
        DEFAULT_INSTANCE = distribution = new Distribution();
        GeneratedMessageLite.registerDefaultInstance(Distribution.class, distribution);
    }

    private Distribution() {
        Internal$ProtobufList internal$ProtobufList;
        this.bucketCounts_ = internal$ProtobufList = GeneratedMessageLite.emptyLongList();
        internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.exemplars_ = internal$ProtobufList;
    }

    public static /* synthetic */ Distribution access$5300() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$5400(Distribution distribution, long l2) {
        distribution.setCount(l2);
    }

    public static /* synthetic */ void access$5500(Distribution distribution) {
        distribution.clearCount();
    }

    public static /* synthetic */ void access$5600(Distribution distribution, double d2) {
        distribution.setMean(d2);
    }

    public static /* synthetic */ void access$5700(Distribution distribution) {
        distribution.clearMean();
    }

    public static /* synthetic */ void access$5800(Distribution distribution, double d2) {
        distribution.setSumOfSquaredDeviation(d2);
    }

    public static /* synthetic */ void access$5900(Distribution distribution) {
        distribution.clearSumOfSquaredDeviation();
    }

    public static /* synthetic */ void access$6000(Distribution distribution, Distribution$Range distribution$Range) {
        distribution.setRange(distribution$Range);
    }

    public static /* synthetic */ void access$6100(Distribution distribution, Distribution$Range distribution$Range) {
        distribution.mergeRange(distribution$Range);
    }

    public static /* synthetic */ void access$6200(Distribution distribution) {
        distribution.clearRange();
    }

    public static /* synthetic */ void access$6300(Distribution distribution, Distribution$BucketOptions distribution$BucketOptions) {
        distribution.setBucketOptions(distribution$BucketOptions);
    }

    public static /* synthetic */ void access$6400(Distribution distribution, Distribution$BucketOptions distribution$BucketOptions) {
        distribution.mergeBucketOptions(distribution$BucketOptions);
    }

    public static /* synthetic */ void access$6500(Distribution distribution) {
        distribution.clearBucketOptions();
    }

    public static /* synthetic */ void access$6600(Distribution distribution, int n3, long l2) {
        distribution.setBucketCounts(n3, l2);
    }

    public static /* synthetic */ void access$6700(Distribution distribution, long l2) {
        distribution.addBucketCounts(l2);
    }

    public static /* synthetic */ void access$6800(Distribution distribution, Iterable iterable) {
        distribution.addAllBucketCounts(iterable);
    }

    public static /* synthetic */ void access$6900(Distribution distribution) {
        distribution.clearBucketCounts();
    }

    public static /* synthetic */ void access$7000(Distribution distribution, int n3, Distribution$Exemplar distribution$Exemplar) {
        distribution.setExemplars(n3, distribution$Exemplar);
    }

    public static /* synthetic */ void access$7100(Distribution distribution, Distribution$Exemplar distribution$Exemplar) {
        distribution.addExemplars(distribution$Exemplar);
    }

    public static /* synthetic */ void access$7200(Distribution distribution, int n3, Distribution$Exemplar distribution$Exemplar) {
        distribution.addExemplars(n3, distribution$Exemplar);
    }

    public static /* synthetic */ void access$7300(Distribution distribution, Iterable iterable) {
        distribution.addAllExemplars(iterable);
    }

    public static /* synthetic */ void access$7400(Distribution distribution) {
        distribution.clearExemplars();
    }

    public static /* synthetic */ void access$7500(Distribution distribution, int n3) {
        distribution.removeExemplars(n3);
    }

    private void addAllBucketCounts(Iterable iterable) {
        this.ensureBucketCountsIsMutable();
        Internal$LongList internal$LongList = this.bucketCounts_;
        AbstractMessageLite.addAll(iterable, internal$LongList);
    }

    private void addAllExemplars(Iterable iterable) {
        this.ensureExemplarsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.exemplars_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addBucketCounts(long l2) {
        this.ensureBucketCountsIsMutable();
        this.bucketCounts_.addLong(l2);
    }

    private void addExemplars(int n3, Distribution$Exemplar distribution$Exemplar) {
        distribution$Exemplar.getClass();
        this.ensureExemplarsIsMutable();
        this.exemplars_.add(n3, distribution$Exemplar);
    }

    private void addExemplars(Distribution$Exemplar distribution$Exemplar) {
        distribution$Exemplar.getClass();
        this.ensureExemplarsIsMutable();
        this.exemplars_.add(distribution$Exemplar);
    }

    private void clearBucketCounts() {
        Internal$LongList internal$LongList;
        this.bucketCounts_ = internal$LongList = GeneratedMessageLite.emptyLongList();
    }

    private void clearBucketOptions() {
        this.bucketOptions_ = null;
    }

    private void clearCount() {
        this.count_ = 0L;
    }

    private void clearExemplars() {
        Internal$ProtobufList internal$ProtobufList;
        this.exemplars_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMean() {
        this.mean_ = 0.0;
    }

    private void clearRange() {
        this.range_ = null;
    }

    private void clearSumOfSquaredDeviation() {
        this.sumOfSquaredDeviation_ = 0.0;
    }

    private void ensureBucketCountsIsMutable() {
        Internal$LongList internal$LongList = this.bucketCounts_;
        boolean bl2 = internal$LongList.isModifiable();
        if (!bl2) {
            this.bucketCounts_ = internal$LongList = GeneratedMessageLite.mutableCopy(internal$LongList);
        }
    }

    private void ensureExemplarsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.exemplars_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.exemplars_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Distribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBucketOptions(Distribution$BucketOptions distribution$BucketOptions) {
        Distribution$BucketOptions distribution$BucketOptions2;
        distribution$BucketOptions.getClass();
        Distribution$BucketOptionsOrBuilder distribution$BucketOptionsOrBuilder = this.bucketOptions_;
        if (distribution$BucketOptionsOrBuilder != null && distribution$BucketOptionsOrBuilder != (distribution$BucketOptions2 = Distribution$BucketOptions.getDefaultInstance())) {
            distribution$BucketOptionsOrBuilder = Distribution$BucketOptions.newBuilder(this.bucketOptions_);
            this.bucketOptions_ = distribution$BucketOptions = (Distribution$BucketOptions)((Distribution$BucketOptions$Builder)((GeneratedMessageLite$Builder)((Object)distribution$BucketOptionsOrBuilder)).mergeFrom(distribution$BucketOptions)).buildPartial();
        } else {
            this.bucketOptions_ = distribution$BucketOptions;
        }
    }

    private void mergeRange(Distribution$Range distribution$Range) {
        Distribution$Range distribution$Range2;
        distribution$Range.getClass();
        Distribution$RangeOrBuilder distribution$RangeOrBuilder = this.range_;
        if (distribution$RangeOrBuilder != null && distribution$RangeOrBuilder != (distribution$Range2 = Distribution$Range.getDefaultInstance())) {
            distribution$RangeOrBuilder = Distribution$Range.newBuilder(this.range_);
            this.range_ = distribution$Range = (Distribution$Range)((Distribution$Range$Builder)((GeneratedMessageLite$Builder)((Object)distribution$RangeOrBuilder)).mergeFrom(distribution$Range)).buildPartial();
        } else {
            this.range_ = distribution$Range;
        }
    }

    public static Distribution$Builder newBuilder() {
        return (Distribution$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Distribution$Builder newBuilder(Distribution distribution) {
        return (Distribution$Builder)DEFAULT_INSTANCE.createBuilder(distribution);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream) {
        return (Distribution)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution parseFrom(ByteString byteString) {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Distribution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream) {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Distribution parseFrom(InputStream inputStream) {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer) {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Distribution parseFrom(byte[] byArray) {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Distribution parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeExemplars(int n3) {
        this.ensureExemplarsIsMutable();
        this.exemplars_.remove(n3);
    }

    private void setBucketCounts(int n3, long l2) {
        this.ensureBucketCountsIsMutable();
        this.bucketCounts_.setLong(n3, l2);
    }

    private void setBucketOptions(Distribution$BucketOptions distribution$BucketOptions) {
        distribution$BucketOptions.getClass();
        this.bucketOptions_ = distribution$BucketOptions;
    }

    private void setCount(long l2) {
        this.count_ = l2;
    }

    private void setExemplars(int n3, Distribution$Exemplar distribution$Exemplar) {
        distribution$Exemplar.getClass();
        this.ensureExemplarsIsMutable();
        this.exemplars_.set(n3, distribution$Exemplar);
    }

    private void setMean(double d2) {
        this.mean_ = d2;
    }

    private void setRange(Distribution$Range distribution$Range) {
        distribution$Range.getClass();
        this.range_ = distribution$Range;
    }

    private void setSumOfSquaredDeviation(double d2) {
        this.sumOfSquaredDeviation_ = d2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Distribution$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = Distribution.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[8];
                objectArray[0] = "count_";
                objectArray[by2] = "mean_";
                objectArray[2] = "sumOfSquaredDeviation_";
                objectArray[3] = "range_";
                objectArray[4] = "bucketOptions_";
                objectArray[5] = "bucketCounts_";
                objectArray[6] = "exemplars_";
                objectArray[7] = Distribution$Exemplar.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0002\u0000\u0001\u0002\u0002\u0000\u0003\u0000\u0004\t\u0006\t\u0007%\n\u001b", objectArray);
            }
            case 2: {
                return new Distribution$Builder(null);
            }
            case 1: 
        }
        return new Distribution();
    }

    public long getBucketCounts(int n3) {
        return this.bucketCounts_.getLong(n3);
    }

    public int getBucketCountsCount() {
        return this.bucketCounts_.size();
    }

    public List getBucketCountsList() {
        return this.bucketCounts_;
    }

    public Distribution$BucketOptions getBucketOptions() {
        Distribution$BucketOptions distribution$BucketOptions = this.bucketOptions_;
        if (distribution$BucketOptions == null) {
            distribution$BucketOptions = Distribution$BucketOptions.getDefaultInstance();
        }
        return distribution$BucketOptions;
    }

    public long getCount() {
        return this.count_;
    }

    public Distribution$Exemplar getExemplars(int n3) {
        return (Distribution$Exemplar)this.exemplars_.get(n3);
    }

    public int getExemplarsCount() {
        return this.exemplars_.size();
    }

    public List getExemplarsList() {
        return this.exemplars_;
    }

    public Distribution$ExemplarOrBuilder getExemplarsOrBuilder(int n3) {
        return (Distribution$ExemplarOrBuilder)this.exemplars_.get(n3);
    }

    public List getExemplarsOrBuilderList() {
        return this.exemplars_;
    }

    public double getMean() {
        return this.mean_;
    }

    public Distribution$Range getRange() {
        Distribution$Range distribution$Range = this.range_;
        if (distribution$Range == null) {
            distribution$Range = Distribution$Range.getDefaultInstance();
        }
        return distribution$Range;
    }

    public double getSumOfSquaredDeviation() {
        return this.sumOfSquaredDeviation_;
    }

    public boolean hasBucketOptions() {
        boolean bl2;
        Distribution$BucketOptions distribution$BucketOptions = this.bucketOptions_;
        if (distribution$BucketOptions != null) {
            bl2 = true;
        } else {
            bl2 = false;
            distribution$BucketOptions = null;
        }
        return bl2;
    }

    public boolean hasRange() {
        boolean bl2;
        Distribution$Range distribution$Range = this.range_;
        if (distribution$Range != null) {
            bl2 = true;
        } else {
            bl2 = false;
            distribution$Range = null;
        }
        return bl2;
    }
}

