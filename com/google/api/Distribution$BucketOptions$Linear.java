/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$BucketOptions$Linear$Builder;
import com.google.api.Distribution$BucketOptions$LinearOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Distribution$BucketOptions$Linear
extends GeneratedMessageLite
implements Distribution$BucketOptions$LinearOrBuilder {
    private static final Distribution$BucketOptions$Linear DEFAULT_INSTANCE;
    public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
    public static final int OFFSET_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int numFiniteBuckets_;
    private double offset_;
    private double width_;

    static {
        Distribution$BucketOptions$Linear distribution$BucketOptions$Linear;
        DEFAULT_INSTANCE = distribution$BucketOptions$Linear = new Distribution$BucketOptions$Linear();
        GeneratedMessageLite.registerDefaultInstance(Distribution$BucketOptions$Linear.class, distribution$BucketOptions$Linear);
    }

    private Distribution$BucketOptions$Linear() {
    }

    public static /* synthetic */ void access$1000(Distribution$BucketOptions$Linear distribution$BucketOptions$Linear) {
        distribution$BucketOptions$Linear.clearWidth();
    }

    public static /* synthetic */ void access$1100(Distribution$BucketOptions$Linear distribution$BucketOptions$Linear, double d2) {
        distribution$BucketOptions$Linear.setOffset(d2);
    }

    public static /* synthetic */ void access$1200(Distribution$BucketOptions$Linear distribution$BucketOptions$Linear) {
        distribution$BucketOptions$Linear.clearOffset();
    }

    public static /* synthetic */ Distribution$BucketOptions$Linear access$600() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$700(Distribution$BucketOptions$Linear distribution$BucketOptions$Linear, int n3) {
        distribution$BucketOptions$Linear.setNumFiniteBuckets(n3);
    }

    public static /* synthetic */ void access$800(Distribution$BucketOptions$Linear distribution$BucketOptions$Linear) {
        distribution$BucketOptions$Linear.clearNumFiniteBuckets();
    }

    public static /* synthetic */ void access$900(Distribution$BucketOptions$Linear distribution$BucketOptions$Linear, double d2) {
        distribution$BucketOptions$Linear.setWidth(d2);
    }

    private void clearNumFiniteBuckets() {
        this.numFiniteBuckets_ = 0;
    }

    private void clearOffset() {
        this.offset_ = 0.0;
    }

    private void clearWidth() {
        this.width_ = 0.0;
    }

    public static Distribution$BucketOptions$Linear getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Distribution$BucketOptions$Linear$Builder newBuilder() {
        return (Distribution$BucketOptions$Linear$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Distribution$BucketOptions$Linear$Builder newBuilder(Distribution$BucketOptions$Linear distribution$BucketOptions$Linear) {
        return (Distribution$BucketOptions$Linear$Builder)DEFAULT_INSTANCE.createBuilder(distribution$BucketOptions$Linear);
    }

    public static Distribution$BucketOptions$Linear parseDelimitedFrom(InputStream inputStream) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$BucketOptions$Linear parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Linear parseFrom(ByteString byteString) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Distribution$BucketOptions$Linear parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Linear parseFrom(CodedInputStream codedInputStream) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Distribution$BucketOptions$Linear parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Linear parseFrom(InputStream inputStream) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$BucketOptions$Linear parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Linear parseFrom(ByteBuffer byteBuffer) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Distribution$BucketOptions$Linear parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Linear parseFrom(byte[] byArray) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Distribution$BucketOptions$Linear parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setNumFiniteBuckets(int n3) {
        this.numFiniteBuckets_ = n3;
    }

    private void setOffset(double d2) {
        this.offset_ = d2;
    }

    private void setWidth(double d2) {
        this.width_ = d2;
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
                clazz = Distribution$BucketOptions$Linear.class;
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
                objectArray[by2] = "width_";
                objectArray[2] = "offset_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", objectArray);
            }
            case 2: {
                return new Distribution$BucketOptions$Linear$Builder(null);
            }
            case 1: 
        }
        return new Distribution$BucketOptions$Linear();
    }

    public int getNumFiniteBuckets() {
        return this.numFiniteBuckets_;
    }

    public double getOffset() {
        return this.offset_;
    }

    public double getWidth() {
        return this.width_;
    }
}

