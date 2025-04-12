/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$BucketOptions$Builder;
import com.google.api.Distribution$BucketOptions$Explicit;
import com.google.api.Distribution$BucketOptions$Explicit$Builder;
import com.google.api.Distribution$BucketOptions$Exponential;
import com.google.api.Distribution$BucketOptions$Exponential$Builder;
import com.google.api.Distribution$BucketOptions$Linear;
import com.google.api.Distribution$BucketOptions$Linear$Builder;
import com.google.api.Distribution$BucketOptions$OptionsCase;
import com.google.api.Distribution$BucketOptionsOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Distribution$BucketOptions
extends GeneratedMessageLite
implements Distribution$BucketOptionsOrBuilder {
    private static final Distribution$BucketOptions DEFAULT_INSTANCE;
    public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
    public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
    public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private int optionsCase_ = 0;
    private Object options_;

    static {
        Distribution$BucketOptions distribution$BucketOptions;
        DEFAULT_INSTANCE = distribution$BucketOptions = new Distribution$BucketOptions();
        GeneratedMessageLite.registerDefaultInstance(Distribution$BucketOptions.class, distribution$BucketOptions);
    }

    private Distribution$BucketOptions() {
    }

    public static /* synthetic */ Distribution$BucketOptions access$2800() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$2900(Distribution$BucketOptions distribution$BucketOptions) {
        distribution$BucketOptions.clearOptions();
    }

    public static /* synthetic */ void access$3000(Distribution$BucketOptions distribution$BucketOptions, Distribution$BucketOptions$Linear distribution$BucketOptions$Linear) {
        distribution$BucketOptions.setLinearBuckets(distribution$BucketOptions$Linear);
    }

    public static /* synthetic */ void access$3100(Distribution$BucketOptions distribution$BucketOptions, Distribution$BucketOptions$Linear distribution$BucketOptions$Linear) {
        distribution$BucketOptions.mergeLinearBuckets(distribution$BucketOptions$Linear);
    }

    public static /* synthetic */ void access$3200(Distribution$BucketOptions distribution$BucketOptions) {
        distribution$BucketOptions.clearLinearBuckets();
    }

    public static /* synthetic */ void access$3300(Distribution$BucketOptions distribution$BucketOptions, Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential) {
        distribution$BucketOptions.setExponentialBuckets(distribution$BucketOptions$Exponential);
    }

    public static /* synthetic */ void access$3400(Distribution$BucketOptions distribution$BucketOptions, Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential) {
        distribution$BucketOptions.mergeExponentialBuckets(distribution$BucketOptions$Exponential);
    }

    public static /* synthetic */ void access$3500(Distribution$BucketOptions distribution$BucketOptions) {
        distribution$BucketOptions.clearExponentialBuckets();
    }

    public static /* synthetic */ void access$3600(Distribution$BucketOptions distribution$BucketOptions, Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit) {
        distribution$BucketOptions.setExplicitBuckets(distribution$BucketOptions$Explicit);
    }

    public static /* synthetic */ void access$3700(Distribution$BucketOptions distribution$BucketOptions, Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit) {
        distribution$BucketOptions.mergeExplicitBuckets(distribution$BucketOptions$Explicit);
    }

    public static /* synthetic */ void access$3800(Distribution$BucketOptions distribution$BucketOptions) {
        distribution$BucketOptions.clearExplicitBuckets();
    }

    private void clearExplicitBuckets() {
        int n3 = this.optionsCase_;
        int n4 = 3;
        if (n3 == n4) {
            this.optionsCase_ = 0;
            n3 = 0;
            this.options_ = null;
        }
    }

    private void clearExponentialBuckets() {
        int n3 = this.optionsCase_;
        int n4 = 2;
        if (n3 == n4) {
            this.optionsCase_ = 0;
            n3 = 0;
            this.options_ = null;
        }
    }

    private void clearLinearBuckets() {
        int n3 = this.optionsCase_;
        int n4 = 1;
        if (n3 == n4) {
            this.optionsCase_ = 0;
            n3 = 0;
            this.options_ = null;
        }
    }

    private void clearOptions() {
        this.optionsCase_ = 0;
        this.options_ = null;
    }

    public static Distribution$BucketOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeExplicitBuckets(Distribution$BucketOptions$Explicit generatedMessageLite) {
        Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit;
        Object object;
        generatedMessageLite.getClass();
        int n3 = this.optionsCase_;
        int n4 = 3;
        if (n3 == n4 && (object = this.options_) != (distribution$BucketOptions$Explicit = Distribution$BucketOptions$Explicit.getDefaultInstance())) {
            object = Distribution$BucketOptions$Explicit.newBuilder((Distribution$BucketOptions$Explicit)this.options_);
            generatedMessageLite = ((Distribution$BucketOptions$Explicit$Builder)((GeneratedMessageLite$Builder)object).mergeFrom(generatedMessageLite)).buildPartial();
            this.options_ = generatedMessageLite;
        } else {
            this.options_ = generatedMessageLite;
        }
        this.optionsCase_ = n4;
    }

    private void mergeExponentialBuckets(Distribution$BucketOptions$Exponential generatedMessageLite) {
        Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential;
        Object object;
        generatedMessageLite.getClass();
        int n3 = this.optionsCase_;
        int n4 = 2;
        if (n3 == n4 && (object = this.options_) != (distribution$BucketOptions$Exponential = Distribution$BucketOptions$Exponential.getDefaultInstance())) {
            object = Distribution$BucketOptions$Exponential.newBuilder((Distribution$BucketOptions$Exponential)this.options_);
            generatedMessageLite = ((Distribution$BucketOptions$Exponential$Builder)((GeneratedMessageLite$Builder)object).mergeFrom(generatedMessageLite)).buildPartial();
            this.options_ = generatedMessageLite;
        } else {
            this.options_ = generatedMessageLite;
        }
        this.optionsCase_ = n4;
    }

    private void mergeLinearBuckets(Distribution$BucketOptions$Linear generatedMessageLite) {
        Distribution$BucketOptions$Linear distribution$BucketOptions$Linear;
        Object object;
        generatedMessageLite.getClass();
        int n3 = this.optionsCase_;
        int n4 = 1;
        if (n3 == n4 && (object = this.options_) != (distribution$BucketOptions$Linear = Distribution$BucketOptions$Linear.getDefaultInstance())) {
            object = Distribution$BucketOptions$Linear.newBuilder((Distribution$BucketOptions$Linear)this.options_);
            generatedMessageLite = ((Distribution$BucketOptions$Linear$Builder)((GeneratedMessageLite$Builder)object).mergeFrom(generatedMessageLite)).buildPartial();
            this.options_ = generatedMessageLite;
        } else {
            this.options_ = generatedMessageLite;
        }
        this.optionsCase_ = n4;
    }

    public static Distribution$BucketOptions$Builder newBuilder() {
        return (Distribution$BucketOptions$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Distribution$BucketOptions$Builder newBuilder(Distribution$BucketOptions distribution$BucketOptions) {
        return (Distribution$BucketOptions$Builder)DEFAULT_INSTANCE.createBuilder(distribution$BucketOptions);
    }

    public static Distribution$BucketOptions parseDelimitedFrom(InputStream inputStream) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$BucketOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions parseFrom(ByteString byteString) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Distribution$BucketOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Distribution$BucketOptions parseFrom(CodedInputStream codedInputStream) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Distribution$BucketOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions parseFrom(InputStream inputStream) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$BucketOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions parseFrom(ByteBuffer byteBuffer) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Distribution$BucketOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Distribution$BucketOptions parseFrom(byte[] byArray) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Distribution$BucketOptions parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setExplicitBuckets(Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit) {
        distribution$BucketOptions$Explicit.getClass();
        this.options_ = distribution$BucketOptions$Explicit;
        this.optionsCase_ = 3;
    }

    private void setExponentialBuckets(Distribution$BucketOptions$Exponential distribution$BucketOptions$Exponential) {
        distribution$BucketOptions$Exponential.getClass();
        this.options_ = distribution$BucketOptions$Exponential;
        this.optionsCase_ = 2;
    }

    private void setLinearBuckets(Distribution$BucketOptions$Linear distribution$BucketOptions$Linear) {
        distribution$BucketOptions$Linear.getClass();
        this.options_ = distribution$BucketOptions$Linear;
        this.optionsCase_ = 1;
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
                clazz = Distribution$BucketOptions.class;
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
                objectArray = new Object[5];
                objectArray[0] = "options_";
                objectArray[by2] = "optionsCase_";
                objectArray[2] = Distribution$BucketOptions$Linear.class;
                objectArray[3] = Distribution$BucketOptions$Exponential.class;
                objectArray[4] = Distribution$BucketOptions$Explicit.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", objectArray);
            }
            case 2: {
                return new Distribution$BucketOptions$Builder(null);
            }
            case 1: 
        }
        return new Distribution$BucketOptions();
    }

    public Distribution$BucketOptions$Explicit getExplicitBuckets() {
        int n3 = this.optionsCase_;
        int n4 = 3;
        if (n3 == n4) {
            return (Distribution$BucketOptions$Explicit)this.options_;
        }
        return Distribution$BucketOptions$Explicit.getDefaultInstance();
    }

    public Distribution$BucketOptions$Exponential getExponentialBuckets() {
        int n3 = this.optionsCase_;
        int n4 = 2;
        if (n3 == n4) {
            return (Distribution$BucketOptions$Exponential)this.options_;
        }
        return Distribution$BucketOptions$Exponential.getDefaultInstance();
    }

    public Distribution$BucketOptions$Linear getLinearBuckets() {
        int n3 = this.optionsCase_;
        int n4 = 1;
        if (n3 == n4) {
            return (Distribution$BucketOptions$Linear)this.options_;
        }
        return Distribution$BucketOptions$Linear.getDefaultInstance();
    }

    public Distribution$BucketOptions$OptionsCase getOptionsCase() {
        return Distribution$BucketOptions$OptionsCase.forNumber(this.optionsCase_);
    }

    public boolean hasExplicitBuckets() {
        int n3 = this.optionsCase_;
        int n4 = 3;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasExponentialBuckets() {
        int n3 = this.optionsCase_;
        int n4 = 2;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasLinearBuckets() {
        int n3 = this.optionsCase_;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

