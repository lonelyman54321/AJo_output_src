/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp$1;
import com.google.protobuf.Timestamp$Builder;
import com.google.protobuf.TimestampOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Timestamp
extends GeneratedMessageLite
implements TimestampOrBuilder {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Timestamp timestamp;
        DEFAULT_INSTANCE = timestamp = new Timestamp();
        GeneratedMessageLite.registerDefaultInstance(Timestamp.class, timestamp);
    }

    private Timestamp() {
    }

    public static /* synthetic */ Timestamp access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Timestamp timestamp, long l2) {
        timestamp.setSeconds(l2);
    }

    public static /* synthetic */ void access$200(Timestamp timestamp) {
        timestamp.clearSeconds();
    }

    public static /* synthetic */ void access$300(Timestamp timestamp, int n3) {
        timestamp.setNanos(n3);
    }

    public static /* synthetic */ void access$400(Timestamp timestamp) {
        timestamp.clearNanos();
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    private void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Timestamp$Builder newBuilder() {
        return (Timestamp$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Timestamp$Builder newBuilder(Timestamp timestamp) {
        return (Timestamp$Builder)DEFAULT_INSTANCE.createBuilder(timestamp);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) {
        return (Timestamp)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Timestamp)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Timestamp parseFrom(ByteString byteString) {
        return (Timestamp)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Timestamp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Timestamp)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Timestamp parseFrom(CodedInputStream codedInputStream) {
        return (Timestamp)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Timestamp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Timestamp)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Timestamp parseFrom(InputStream inputStream) {
        return (Timestamp)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Timestamp)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) {
        return (Timestamp)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Timestamp)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Timestamp parseFrom(byte[] byArray) {
        return (Timestamp)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Timestamp parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Timestamp)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setNanos(int n3) {
        this.nanos_ = n3;
    }

    private void setSeconds(long l2) {
        this.seconds_ = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Timestamp$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Timestamp.class;
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
                object[0] = "seconds_";
                object[by2] = "nanos_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", object);
            }
            case 2: {
                return new Timestamp$Builder(null);
            }
            case 1: 
        }
        return new Timestamp();
    }

    public int getNanos() {
        return this.nanos_;
    }

    public long getSeconds() {
        return this.seconds_;
    }
}

