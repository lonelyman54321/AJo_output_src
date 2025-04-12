/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.Duration$Builder;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.rpc.RetryInfo$1;
import com.google.rpc.RetryInfo$Builder;
import com.google.rpc.RetryInfoOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RetryInfo
extends GeneratedMessageLite
implements RetryInfoOrBuilder {
    private static final RetryInfo DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int RETRY_DELAY_FIELD_NUMBER = 1;
    private Duration retryDelay_;

    static {
        RetryInfo retryInfo;
        DEFAULT_INSTANCE = retryInfo = new RetryInfo();
        GeneratedMessageLite.registerDefaultInstance(RetryInfo.class, retryInfo);
    }

    private RetryInfo() {
    }

    public static /* synthetic */ RetryInfo access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(RetryInfo retryInfo, Duration duration) {
        retryInfo.setRetryDelay(duration);
    }

    public static /* synthetic */ void access$200(RetryInfo retryInfo, Duration duration) {
        retryInfo.mergeRetryDelay(duration);
    }

    public static /* synthetic */ void access$300(RetryInfo retryInfo) {
        retryInfo.clearRetryDelay();
    }

    private void clearRetryDelay() {
        this.retryDelay_ = null;
    }

    public static RetryInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeRetryDelay(Duration duration) {
        Duration duration2;
        duration.getClass();
        DurationOrBuilder durationOrBuilder = this.retryDelay_;
        if (durationOrBuilder != null && durationOrBuilder != (duration2 = Duration.getDefaultInstance())) {
            durationOrBuilder = Duration.newBuilder(this.retryDelay_);
            this.retryDelay_ = duration = (Duration)((Duration$Builder)((GeneratedMessageLite$Builder)((Object)durationOrBuilder)).mergeFrom(duration)).buildPartial();
        } else {
            this.retryDelay_ = duration;
        }
    }

    public static RetryInfo$Builder newBuilder() {
        return (RetryInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static RetryInfo$Builder newBuilder(RetryInfo retryInfo) {
        return (RetryInfo$Builder)DEFAULT_INSTANCE.createBuilder(retryInfo);
    }

    public static RetryInfo parseDelimitedFrom(InputStream inputStream) {
        return (RetryInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RetryInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RetryInfo parseFrom(ByteString byteString) {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static RetryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RetryInfo parseFrom(CodedInputStream codedInputStream) {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static RetryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static RetryInfo parseFrom(InputStream inputStream) {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static RetryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RetryInfo parseFrom(ByteBuffer byteBuffer) {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static RetryInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RetryInfo parseFrom(byte[] byArray) {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static RetryInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRetryDelay(Duration duration) {
        duration.getClass();
        this.retryDelay_ = duration;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = RetryInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = RetryInfo.class;
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
                object = new Object[by2];
                object[0] = "retryDelay_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", object);
            }
            case 2: {
                return new RetryInfo$Builder(null);
            }
            case 1: 
        }
        return new RetryInfo();
    }

    public Duration getRetryDelay() {
        Duration duration = this.retryDelay_;
        if (duration == null) {
            duration = Duration.getDefaultInstance();
        }
        return duration;
    }

    public boolean hasRetryDelay() {
        boolean bl2;
        Duration duration = this.retryDelay_;
        if (duration != null) {
            bl2 = true;
        } else {
            bl2 = false;
            duration = null;
        }
        return bl2;
    }
}

