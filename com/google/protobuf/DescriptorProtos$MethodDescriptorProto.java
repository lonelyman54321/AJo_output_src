/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$MethodDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions$Builder;
import com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DescriptorProtos$MethodDescriptorProto
extends GeneratedMessageLite
implements DescriptorProtos$MethodDescriptorProtoOrBuilder {
    public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
    private static final DescriptorProtos$MethodDescriptorProto DEFAULT_INSTANCE;
    public static final int INPUT_TYPE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean clientStreaming_;
    private String inputType_;
    private byte memoizedIsInitialized = (byte)2;
    private String name_;
    private DescriptorProtos$MethodOptions options_;
    private String outputType_;
    private boolean serverStreaming_;

    static {
        DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto;
        DEFAULT_INSTANCE = descriptorProtos$MethodDescriptorProto = new DescriptorProtos$MethodDescriptorProto();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$MethodDescriptorProto.class, descriptorProtos$MethodDescriptorProto);
    }

    private DescriptorProtos$MethodDescriptorProto() {
        String string2;
        this.name_ = string2 = "";
        this.inputType_ = string2;
        this.outputType_ = string2;
    }

    public static /* synthetic */ DescriptorProtos$MethodDescriptorProto access$23300() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$23400(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto, String string2) {
        descriptorProtos$MethodDescriptorProto.setName(string2);
    }

    public static /* synthetic */ void access$23500(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.clearName();
    }

    public static /* synthetic */ void access$23600(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto, ByteString byteString) {
        descriptorProtos$MethodDescriptorProto.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$23700(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto, String string2) {
        descriptorProtos$MethodDescriptorProto.setInputType(string2);
    }

    public static /* synthetic */ void access$23800(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.clearInputType();
    }

    public static /* synthetic */ void access$23900(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto, ByteString byteString) {
        descriptorProtos$MethodDescriptorProto.setInputTypeBytes(byteString);
    }

    public static /* synthetic */ void access$24000(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto, String string2) {
        descriptorProtos$MethodDescriptorProto.setOutputType(string2);
    }

    public static /* synthetic */ void access$24100(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.clearOutputType();
    }

    public static /* synthetic */ void access$24200(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto, ByteString byteString) {
        descriptorProtos$MethodDescriptorProto.setOutputTypeBytes(byteString);
    }

    public static /* synthetic */ void access$24300(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto, DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        descriptorProtos$MethodDescriptorProto.setOptions(descriptorProtos$MethodOptions);
    }

    public static /* synthetic */ void access$24400(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto, DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        descriptorProtos$MethodDescriptorProto.mergeOptions(descriptorProtos$MethodOptions);
    }

    public static /* synthetic */ void access$24500(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.clearOptions();
    }

    public static /* synthetic */ void access$24600(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto, boolean bl2) {
        descriptorProtos$MethodDescriptorProto.setClientStreaming(bl2);
    }

    public static /* synthetic */ void access$24700(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.clearClientStreaming();
    }

    public static /* synthetic */ void access$24800(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto, boolean bl2) {
        descriptorProtos$MethodDescriptorProto.setServerStreaming(bl2);
    }

    public static /* synthetic */ void access$24900(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.clearServerStreaming();
    }

    private void clearClientStreaming() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFEF;
        this.clientStreaming_ = false;
    }

    private void clearInputType() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.inputType_ = string2 = DescriptorProtos$MethodDescriptorProto.getDefaultInstance().getInputType();
    }

    private void clearName() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.name_ = string2 = DescriptorProtos$MethodDescriptorProto.getDefaultInstance().getName();
    }

    private void clearOptions() {
        int n3;
        this.options_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFF7;
    }

    private void clearOutputType() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
        this.outputType_ = string2 = DescriptorProtos$MethodDescriptorProto.getDefaultInstance().getOutputType();
    }

    private void clearServerStreaming() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFDF;
        this.serverStreaming_ = false;
    }

    public static DescriptorProtos$MethodDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        int n3;
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions2;
        descriptorProtos$MethodOptions.getClass();
        DescriptorProtos$MethodOptionsOrBuilder descriptorProtos$MethodOptionsOrBuilder = this.options_;
        if (descriptorProtos$MethodOptionsOrBuilder != null && descriptorProtos$MethodOptionsOrBuilder != (descriptorProtos$MethodOptions2 = DescriptorProtos$MethodOptions.getDefaultInstance())) {
            descriptorProtos$MethodOptionsOrBuilder = DescriptorProtos$MethodOptions.newBuilder(this.options_);
            this.options_ = descriptorProtos$MethodOptions = (DescriptorProtos$MethodOptions)((DescriptorProtos$MethodOptions$Builder)((GeneratedMessageLite$Builder)((Object)descriptorProtos$MethodOptionsOrBuilder)).mergeFrom(descriptorProtos$MethodOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$MethodOptions;
        }
        this.bitField0_ = n3 = this.bitField0_ | 8;
    }

    public static DescriptorProtos$MethodDescriptorProto$Builder newBuilder() {
        return (DescriptorProtos$MethodDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MethodDescriptorProto$Builder newBuilder(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        return (DescriptorProtos$MethodDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$MethodDescriptorProto);
    }

    public static DescriptorProtos$MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(byte[] byArray) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setClientStreaming(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x10;
        this.clientStreaming_ = bl2;
    }

    private void setInputType(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 2;
        this.inputType_ = string2;
    }

    private void setInputTypeBytes(ByteString object) {
        int n3;
        this.inputType_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 2;
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

    private void setOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        int n3;
        descriptorProtos$MethodOptions.getClass();
        this.options_ = descriptorProtos$MethodOptions;
        this.bitField0_ = n3 = this.bitField0_ | 8;
    }

    private void setOutputType(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 4;
        this.outputType_ = string2;
    }

    private void setOutputTypeBytes(ByteString object) {
        int n3;
        this.outputType_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 4;
    }

    private void setServerStreaming(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x20;
        this.serverStreaming_ = bl2;
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
                clazz = DescriptorProtos$MethodDescriptorProto.class;
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
                objectArray = new Object[7];
                objectArray[0] = "bitField0_";
                objectArray[n3] = "name_";
                objectArray[2] = "inputType_";
                objectArray[3] = "outputType_";
                objectArray[4] = "options_";
                objectArray[5] = "clientStreaming_";
                objectArray[6] = "serverStreaming_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1409\u0003\u0005\u1007\u0004\u0006\u1007\u0005", objectArray);
            }
            case 2: {
                return new DescriptorProtos$MethodDescriptorProto$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$MethodDescriptorProto();
    }

    public boolean getClientStreaming() {
        return this.clientStreaming_;
    }

    public String getInputType() {
        return this.inputType_;
    }

    public ByteString getInputTypeBytes() {
        return ByteString.copyFromUtf8(this.inputType_);
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public DescriptorProtos$MethodOptions getOptions() {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = this.options_;
        if (descriptorProtos$MethodOptions == null) {
            descriptorProtos$MethodOptions = DescriptorProtos$MethodOptions.getDefaultInstance();
        }
        return descriptorProtos$MethodOptions;
    }

    public String getOutputType() {
        return this.outputType_;
    }

    public ByteString getOutputTypeBytes() {
        return ByteString.copyFromUtf8(this.outputType_);
    }

    public boolean getServerStreaming() {
        return this.serverStreaming_;
    }

    public boolean hasClientStreaming() {
        int n3 = this.bitField0_ & 0x10;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasInputType() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
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
        int n3 = this.bitField0_ & 8;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasOutputType() {
        int n3 = this.bitField0_ & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasServerStreaming() {
        int n3 = this.bitField0_ & 0x20;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

