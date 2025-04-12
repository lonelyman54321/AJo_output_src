/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$BucketOptions$Explicit$Builder;
import com.google.api.Distribution$BucketOptions$ExplicitOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$DoubleList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Distribution$BucketOptions$Explicit
extends GeneratedMessageLite
implements Distribution$BucketOptions$ExplicitOrBuilder {
    public static final int BOUNDS_FIELD_NUMBER = 1;
    private static final Distribution$BucketOptions$Explicit DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    private int boundsMemoizedSerializedSize = -1;
    private Internal$DoubleList bounds_;

    static {
        Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit;
        DEFAULT_INSTANCE = distribution$BucketOptions$Explicit = new Distribution$BucketOptions$Explicit();
        GeneratedMessageLite.registerDefaultInstance(Distribution$BucketOptions$Explicit.class, distribution$BucketOptions$Explicit);
    }

    private Distribution$BucketOptions$Explicit() {
        Internal$DoubleList doubleList;
        this.bounds_ = doubleList = GeneratedMessageLite.emptyDoubleList();
    }

    public static /* synthetic */ Distribution$BucketOptions$Explicit access$2200() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$2300(Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit, int n3, double d2) {
        distribution$BucketOptions$Explicit.setBounds(n3, d2);
    }

    public static /* synthetic */ void access$2400(Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit, double d2) {
        distribution$BucketOptions$Explicit.addBounds(d2);
    }

    public static /* synthetic */ void access$2500(Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit, Iterable iterable) {
        distribution$BucketOptions$Explicit.addAllBounds(iterable);
    }

    public static /* synthetic */ void access$2600(Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit) {
        distribution$BucketOptions$Explicit.clearBounds();
    }

    private void addAllBounds(Iterable iterable) {
        this.ensureBoundsIsMutable();
        Internal$DoubleList internal$DoubleList = this.bounds_;
        AbstractMessageLite.addAll(iterable, internal$DoubleList);
    }

    private void addBounds(double d2) {
        this.ensureBoundsIsMutable();
        this.bounds_.addDouble(d2);
    }

    private void clearBounds() {
        Internal$DoubleList internal$DoubleList;
        this.bounds_ = internal$DoubleList = GeneratedMessageLite.emptyDoubleList();
    }

    private void ensureBoundsIsMutable() {
        Internal$DoubleList internal$DoubleList = this.bounds_;
        boolean bl2 = internal$DoubleList.isModifiable();
        if (!bl2) {
            this.bounds_ = internal$DoubleList = GeneratedMessageLite.mutableCopy(internal$DoubleList);
        }
    }

    public static Distribution$BucketOptions$Explicit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Distribution$BucketOptions$Explicit$Builder newBuilder() {
        return (Distribution$BucketOptions$Explicit$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Distribution$BucketOptions$Explicit$Builder newBuilder(Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit) {
        return (Distribution$BucketOptions$Explicit$Builder)DEFAULT_INSTANCE.createBuilder(distribution$BucketOptions$Explicit);
    }

    public static Distribution$BucketOptions$Explicit parseDelimitedFrom(InputStream inputStream) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$BucketOptions$Explicit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Explicit parseFrom(ByteString byteString) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Distribution$BucketOptions$Explicit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Explicit parseFrom(CodedInputStream codedInputStream) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Distribution$BucketOptions$Explicit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Explicit parseFrom(InputStream inputStream) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$BucketOptions$Explicit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Explicit parseFrom(ByteBuffer byteBuffer) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Distribution$BucketOptions$Explicit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Distribution$BucketOptions$Explicit parseFrom(byte[] byArray) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Distribution$BucketOptions$Explicit parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$BucketOptions$Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBounds(int n3, double d2) {
        this.ensureBoundsIsMutable();
        this.bounds_.setDouble(n3, d2);
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
                clazz = Distribution$BucketOptions$Explicit.class;
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
                object[0] = "bounds_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", object);
            }
            case 2: {
                return new Distribution$BucketOptions$Explicit$Builder(null);
            }
            case 1: 
        }
        return new Distribution$BucketOptions$Explicit();
    }

    public double getBounds(int n3) {
        return this.bounds_.getDouble(n3);
    }

    public int getBoundsCount() {
        return this.bounds_.size();
    }

    public List getBoundsList() {
        return this.bounds_;
    }
}

