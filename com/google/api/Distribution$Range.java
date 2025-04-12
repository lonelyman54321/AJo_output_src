/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$Range$Builder;
import com.google.api.Distribution$RangeOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Distribution$Range
extends GeneratedMessageLite
implements Distribution$RangeOrBuilder {
    private static final Distribution$Range DEFAULT_INSTANCE;
    public static final int MAX_FIELD_NUMBER = 2;
    public static final int MIN_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private double max_;
    private double min_;

    static {
        Distribution$Range distribution$Range;
        DEFAULT_INSTANCE = distribution$Range = new Distribution$Range();
        GeneratedMessageLite.registerDefaultInstance(Distribution$Range.class, distribution$Range);
    }

    private Distribution$Range() {
    }

    public static /* synthetic */ Distribution$Range access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Distribution$Range distribution$Range, double d2) {
        distribution$Range.setMin(d2);
    }

    public static /* synthetic */ void access$200(Distribution$Range distribution$Range) {
        distribution$Range.clearMin();
    }

    public static /* synthetic */ void access$300(Distribution$Range distribution$Range, double d2) {
        distribution$Range.setMax(d2);
    }

    public static /* synthetic */ void access$400(Distribution$Range distribution$Range) {
        distribution$Range.clearMax();
    }

    private void clearMax() {
        this.max_ = 0.0;
    }

    private void clearMin() {
        this.min_ = 0.0;
    }

    public static Distribution$Range getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Distribution$Range$Builder newBuilder() {
        return (Distribution$Range$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Distribution$Range$Builder newBuilder(Distribution$Range distribution$Range) {
        return (Distribution$Range$Builder)DEFAULT_INSTANCE.createBuilder(distribution$Range);
    }

    public static Distribution$Range parseDelimitedFrom(InputStream inputStream) {
        return (Distribution$Range)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$Range parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Range)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$Range parseFrom(ByteString byteString) {
        return (Distribution$Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Distribution$Range parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Distribution$Range parseFrom(CodedInputStream codedInputStream) {
        return (Distribution$Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Distribution$Range parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Distribution$Range parseFrom(InputStream inputStream) {
        return (Distribution$Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$Range parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$Range parseFrom(ByteBuffer byteBuffer) {
        return (Distribution$Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Distribution$Range parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Distribution$Range parseFrom(byte[] byArray) {
        return (Distribution$Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Distribution$Range parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMax(double d2) {
        this.max_ = d2;
    }

    private void setMin(double d2) {
        this.min_ = d2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Distribution$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = object.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                object = PARSER;
                if (object != null) return object;
                clazz = Distribution$Range.class;
                synchronized (clazz) {
                    try {
                        object = PARSER;
                        if (object != null) return object;
                        object2 = DEFAULT_INSTANCE;
                        PARSER = object = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                object = new Object[2];
                object[0] = "min_";
                object[by2] = "max_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", object);
            }
            case 2: {
                return new Distribution$Range$Builder(null);
            }
            case 1: 
        }
        return new Distribution$Range();
    }

    public double getMax() {
        return this.max_;
    }

    public double getMin() {
        return this.min_;
    }
}

