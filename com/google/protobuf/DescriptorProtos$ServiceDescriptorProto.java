/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$MethodDescriptorProto;
import com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$ServiceDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$ServiceOptions;
import com.google.protobuf.DescriptorProtos$ServiceOptions$Builder;
import com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos$ServiceDescriptorProto
extends GeneratedMessageLite
implements DescriptorProtos$ServiceDescriptorProtoOrBuilder {
    private static final DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE;
    public static final int METHOD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = (byte)2;
    private Internal$ProtobufList method_;
    private String name_ = "";
    private DescriptorProtos$ServiceOptions options_;

    static {
        DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto;
        DEFAULT_INSTANCE = descriptorProtos$ServiceDescriptorProto = new DescriptorProtos$ServiceDescriptorProto();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$ServiceDescriptorProto.class, descriptorProtos$ServiceDescriptorProto);
    }

    private DescriptorProtos$ServiceDescriptorProto() {
        Internal$ProtobufList internal$ProtobufList;
        this.method_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$ServiceDescriptorProto access$21900() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$22000(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, String string2) {
        descriptorProtos$ServiceDescriptorProto.setName(string2);
    }

    public static /* synthetic */ void access$22100(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.clearName();
    }

    public static /* synthetic */ void access$22200(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, ByteString byteString) {
        descriptorProtos$ServiceDescriptorProto.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$22300(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, int n3, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.setMethod(n3, descriptorProtos$MethodDescriptorProto);
    }

    public static /* synthetic */ void access$22400(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.addMethod(descriptorProtos$MethodDescriptorProto);
    }

    public static /* synthetic */ void access$22500(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, int n3, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.addMethod(n3, descriptorProtos$MethodDescriptorProto);
    }

    public static /* synthetic */ void access$22600(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, Iterable iterable) {
        descriptorProtos$ServiceDescriptorProto.addAllMethod(iterable);
    }

    public static /* synthetic */ void access$22700(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.clearMethod();
    }

    public static /* synthetic */ void access$22800(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, int n3) {
        descriptorProtos$ServiceDescriptorProto.removeMethod(n3);
    }

    public static /* synthetic */ void access$22900(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        descriptorProtos$ServiceDescriptorProto.setOptions(descriptorProtos$ServiceOptions);
    }

    public static /* synthetic */ void access$23000(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        descriptorProtos$ServiceDescriptorProto.mergeOptions(descriptorProtos$ServiceOptions);
    }

    public static /* synthetic */ void access$23100(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.clearOptions();
    }

    private void addAllMethod(Iterable iterable) {
        this.ensureMethodIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.method_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addMethod(int n3, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        this.ensureMethodIsMutable();
        this.method_.add(n3, descriptorProtos$MethodDescriptorProto);
    }

    private void addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        this.ensureMethodIsMutable();
        this.method_.add(descriptorProtos$MethodDescriptorProto);
    }

    private void clearMethod() {
        Internal$ProtobufList internal$ProtobufList;
        this.method_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.name_ = string2 = DescriptorProtos$ServiceDescriptorProto.getDefaultInstance().getName();
    }

    private void clearOptions() {
        int n3;
        this.options_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
    }

    private void ensureMethodIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.method_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.method_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static DescriptorProtos$ServiceDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        int n3;
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions2;
        descriptorProtos$ServiceOptions.getClass();
        DescriptorProtos$ServiceOptionsOrBuilder descriptorProtos$ServiceOptionsOrBuilder = this.options_;
        if (descriptorProtos$ServiceOptionsOrBuilder != null && descriptorProtos$ServiceOptionsOrBuilder != (descriptorProtos$ServiceOptions2 = DescriptorProtos$ServiceOptions.getDefaultInstance())) {
            descriptorProtos$ServiceOptionsOrBuilder = DescriptorProtos$ServiceOptions.newBuilder(this.options_);
            this.options_ = descriptorProtos$ServiceOptions = (DescriptorProtos$ServiceOptions)((DescriptorProtos$ServiceOptions$Builder)((GeneratedMessageLite$Builder)((Object)descriptorProtos$ServiceOptionsOrBuilder)).mergeFrom(descriptorProtos$ServiceOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$ServiceOptions;
        }
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    public static DescriptorProtos$ServiceDescriptorProto$Builder newBuilder() {
        return (DescriptorProtos$ServiceDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$ServiceDescriptorProto$Builder newBuilder(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        return (DescriptorProtos$ServiceDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] byArray) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeMethod(int n3) {
        this.ensureMethodIsMutable();
        this.method_.remove(n3);
    }

    private void setMethod(int n3, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        this.ensureMethodIsMutable();
        this.method_.set(n3, descriptorProtos$MethodDescriptorProto);
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

    private void setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        int n3;
        descriptorProtos$ServiceOptions.getClass();
        this.options_ = descriptorProtos$ServiceOptions;
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
                clazz = DescriptorProtos$ServiceDescriptorProto.class;
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
                objectArray[0] = "bitField0_";
                objectArray[n3] = "name_";
                objectArray[2] = "method_";
                objectArray[3] = DescriptorProtos$MethodDescriptorProto.class;
                objectArray[4] = "options_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u1008\u0000\u0002\u041b\u0003\u1409\u0001", objectArray);
            }
            case 2: {
                return new DescriptorProtos$ServiceDescriptorProto$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$ServiceDescriptorProto();
    }

    public DescriptorProtos$MethodDescriptorProto getMethod(int n3) {
        return (DescriptorProtos$MethodDescriptorProto)this.method_.get(n3);
    }

    public int getMethodCount() {
        return this.method_.size();
    }

    public List getMethodList() {
        return this.method_;
    }

    public DescriptorProtos$MethodDescriptorProtoOrBuilder getMethodOrBuilder(int n3) {
        return (DescriptorProtos$MethodDescriptorProtoOrBuilder)this.method_.get(n3);
    }

    public List getMethodOrBuilderList() {
        return this.method_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public DescriptorProtos$ServiceOptions getOptions() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
        if (descriptorProtos$ServiceOptions == null) {
            descriptorProtos$ServiceOptions = DescriptorProtos$ServiceOptions.getDefaultInstance();
        }
        return descriptorProtos$ServiceOptions;
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

