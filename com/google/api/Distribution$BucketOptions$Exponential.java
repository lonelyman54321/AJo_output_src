/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$BucketOptions$Exponential$Builder;
import com.google.api.Distribution$BucketOptions$ExponentialOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Distribution$BucketOptions$Exponential
extends GeneratedMessageLite
implements Distribution$BucketOptions$ExponentialOrBuilder {
    private static final Distribution$BucketOptions$Exponential DEFAULT_INSTANCE;
    public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
    public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int SCALE_FIELD_NUMBER = 3;
    private double growthFactor_;
    private int numFiniteBuckets_;
    private double scale_;

    static {
        Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential;
        DEFAULT_INSTANCE = distribution$BucketOptions$Exponential = new Distribution$BucketOptions$Exponential();
        GeneratedMessageLite.registerDefaultInstance(Distribution$BucketOptions$Exponential.class, distribution$BucketOptions$Exponential);
    }

    private Distribution$BucketOptions$Exponential() {
    }

    public static /* synthetic */ Distribution$BucketOptions$Exponential access$1400() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$1500(Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential, int n3) {
        distribution$BucketOptions$Exponential.setNumFiniteBuckets(n3);
    }

    public static /* synthetic */ void access$1600(Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential) {
        distribution$BucketOptions$Exponential.clearNumFiniteBuckets();
    }

    public static /* synthetic */ void access$1700(Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential, double d2) {
        distribution$BucketOptions$Exponential.setGrowthFactor(d2);
    }

    public static /* synthetic */ void access$1800(Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential) {
        distribution$BucketOptions$Exponential.clearGrowthFactor();
    }

    public static /* synthetic */ void access$1900(Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential, double d2) {
        distribution$BucketOptions$Exponential.setScale(d2);
    }

    public static /* synthetic */ void access$2000(Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential) {
        distribution$BucketOptions$Exponential.clearScale();
    }

    private void clearGrowthFactor() {
        this.growthFactor_ = 0.0;
    }

    private void clearNumFiniteBuckets() {
        this.numFiniteBuckets_ = 0;
    }

    private void clearScale() {
        this.scale_ = 0.0;
    }

    public static Distribution$BucketOptions$Exponential getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Distribution$BucketOptions$Exponential$Builder newBuilder() {
        return (Distribution$BucketOptions$Exponential$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Distribution$BucketOptions$Exponential$Builder newBuilder(Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential) {
        return (Distribution$BucketOptions$Exponential$Builder)DEFAULT_INSTANCE.createBuilder(distribution$BucketOptions$Exponential);
    }

    public static Distribution$BucketOptions$Exponential parseDelimitedFrom(InputStream inputStream) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$BucketOptions$Exponential parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Exponential parseFrom(ByteString byteString) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Distribution$BucketOptions$Exponential parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Exponential parseFrom(CodedInputStream codedInputStream) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Distribution$BucketOptions$Exponential parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Exponential parseFrom(InputStream inputStream) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$BucketOptions$Exponential parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Exponential parseFrom(ByteBuffer byteBuffer) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Distribution$BucketOptions$Exponential parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Exponential parseFrom(byte[] byArray) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Distribution$BucketOptions$Exponential parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setGrowthFactor(double d2) {
        this.growthFactor_ = d2;
    }

    private void setNumFiniteBuckets(int n3) {
        this.numFiniteBuckets_ = n3;
    }

    private void setScale(double d2) {
        this.scale_ = d2;
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
                clazz = Distribution$BucketOptions$Exponential.class;
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
                objectArray = new Object[3];
                objectArray[0] = "numFiniteBuckets_";
                objectArray[by2] = "growthFactor_";
                objectArray[2] = "scale_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", objectArray);
            }
            case 2: {
                return new Distribution$BucketOptions$Exponential$Builder(null);
            }
            case 1: 
        }
        return new Distribution$BucketOptions$Exponential();
    }

    public double getGrowthFactor() {
        return this.growthFactor_;
    }

    public int getNumFiniteBuckets() {
        return this.numFiniteBuckets_;
    }

    public double getScale() {
        return this.scale_;
    }
}

