/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$OneofDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$OneofOptions;
import com.google.protobuf.DescriptorProtos$OneofOptions$Builder;
import com.google.protobuf.DescriptorProtos$OneofOptionsOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DescriptorProtos$OneofDescriptorProto
extends GeneratedMessageLite
implements DescriptorProtos$OneofDescriptorProtoOrBuilder {
    private static final DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = (byte)2;
    private String name_ = "";
    private DescriptorProtos$OneofOptions options_;

    static {
        DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto;
        DEFAULT_INSTANCE = descriptorProtos$OneofDescriptorProto = new DescriptorProtos$OneofDescriptorProto();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$OneofDescriptorProto.class, descriptorProtos$OneofDescriptorProto);
    }

    private DescriptorProtos$OneofDescriptorProto() {
    }

    public static /* synthetic */ DescriptorProtos$OneofDescriptorProto access$17000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$17100(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto, String string2) {
        descriptorProtos$OneofDescriptorProto.setName(string2);
    }

    public static /* synthetic */ void access$17200(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.clearName();
    }

    public static /* synthetic */ void access$17300(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto, ByteString byteString) {
        descriptorProtos$OneofDescriptorProto.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$17400(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto, DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        descriptorProtos$OneofDescriptorProto.setOptions(descriptorProtos$OneofOptions);
    }

    public static /* synthetic */ void access$17500(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto, DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        descriptorProtos$OneofDescriptorProto.mergeOptions(descriptorProtos$OneofOptions);
    }

    public static /* synthetic */ void access$17600(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.clearOptions();
    }

    private void clearName() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.name_ = string2 = DescriptorProtos$OneofDescriptorProto.getDefaultInstance().getName();
    }

    private void clearOptions() {
        int n3;
        this.options_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
    }

    public static DescriptorProtos$OneofDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        int n3;
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions2;
        descriptorProtos$OneofOptions.getClass();
        DescriptorProtos$OneofOptionsOrBuilder descriptorProtos$OneofOptionsOrBuilder = this.options_;
        if (descriptorProtos$OneofOptionsOrBuilder != null && descriptorProtos$OneofOptionsOrBuilder != (descriptorProtos$OneofOptions2 = DescriptorProtos$OneofOptions.getDefaultInstance())) {
            descriptorProtos$OneofOptionsOrBuilder = DescriptorProtos$OneofOptions.newBuilder(this.options_);
            this.options_ = descriptorProtos$OneofOptions = (DescriptorProtos$OneofOptions)((DescriptorProtos$OneofOptions$Builder)((GeneratedMessageLite$Builder)((Object)descriptorProtos$OneofOptionsOrBuilder)).mergeFrom(descriptorProtos$OneofOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$OneofOptions;
        }
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    public static DescriptorProtos$OneofDescriptorProto$Builder newBuilder() {
        return (DescriptorProtos$OneofDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$OneofDescriptorProto$Builder newBuilder(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        return (DescriptorProtos$OneofDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$OneofDescriptorProto);
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] byArray) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        int n3;
        this.name_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    private void setOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        int n3;
        descriptorProtos$OneofOptions.getClass();
        this.options_ = descriptorProtos$OneofOptions;
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        int n3 = 1;
        int[] nArray = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        int n4 = objectArray.ordinal();
        n4 = nArray[n4];
        nArray = null;
        switch (n4) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                if (clazz == null) {
                    n3 = 0;
                    object = null;
                }
                n4 = (byte)n3;
                this.memoizedIsInitialized = (byte)n4;
                return null;
            }
            case 6: {
                return this.memoizedIsInitialized;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = DescriptorProtos$OneofDescriptorProto.class;
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
                objectArray[0] = "bitField0_";
                objectArray[n3] = "name_";
                objectArray[2] = "options_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", objectArray);
            }
            case 2: {
                return new DescriptorProtos$OneofDescriptorProto$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$OneofDescriptorProto();
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public DescriptorProtos$OneofOptions getOptions() {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
        if (descriptorProtos$OneofOptions == null) {
            descriptorProtos$OneofOptions = DescriptorProtos$OneofOptions.getDefaultInstance();
        }
        return descriptorProtos$OneofOptions;
    }

    public boolean hasName() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasOptions() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

