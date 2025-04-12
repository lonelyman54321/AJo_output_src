/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$EnumValueOptions;
import com.google.protobuf.DescriptorProtos$EnumValueOptions$Builder;
import com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DescriptorProtos$EnumValueDescriptorProto
extends GeneratedMessageLite
implements DescriptorProtos$EnumValueDescriptorProtoOrBuilder {
    private static final DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = (byte)2;
    private String name_ = "";
    private int number_;
    private DescriptorProtos$EnumValueOptions options_;

    static {
        DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto;
        DEFAULT_INSTANCE = descriptorProtos$EnumValueDescriptorProto = new DescriptorProtos$EnumValueDescriptorProto();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumValueDescriptorProto.class, descriptorProtos$EnumValueDescriptorProto);
    }

    private DescriptorProtos$EnumValueDescriptorProto() {
    }

    public static /* synthetic */ DescriptorProtos$EnumValueDescriptorProto access$20900() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$21000(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto, String string2) {
        descriptorProtos$EnumValueDescriptorProto.setName(string2);
    }

    public static /* synthetic */ void access$21100(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.clearName();
    }

    public static /* synthetic */ void access$21200(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto, ByteString byteString) {
        descriptorProtos$EnumValueDescriptorProto.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$21300(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto, int n3) {
        descriptorProtos$EnumValueDescriptorProto.setNumber(n3);
    }

    public static /* synthetic */ void access$21400(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.clearNumber();
    }

    public static /* synthetic */ void access$21500(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto, DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        descriptorProtos$EnumValueDescriptorProto.setOptions(descriptorProtos$EnumValueOptions);
    }

    public static /* synthetic */ void access$21600(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto, DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        descriptorProtos$EnumValueDescriptorProto.mergeOptions(descriptorProtos$EnumValueOptions);
    }

    public static /* synthetic */ void access$21700(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.clearOptions();
    }

    private void clearName() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.name_ = string2 = DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance().getName();
    }

    private void clearNumber() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.number_ = 0;
    }

    private void clearOptions() {
        int n3;
        this.options_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
    }

    public static DescriptorProtos$EnumValueDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        int n3;
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions2;
        descriptorProtos$EnumValueOptions.getClass();
        DescriptorProtos$EnumValueOptionsOrBuilder descriptorProtos$EnumValueOptionsOrBuilder = this.options_;
        if (descriptorProtos$EnumValueOptionsOrBuilder != null && descriptorProtos$EnumValueOptionsOrBuilder != (descriptorProtos$EnumValueOptions2 = DescriptorProtos$EnumValueOptions.getDefaultInstance())) {
            descriptorProtos$EnumValueOptionsOrBuilder = DescriptorProtos$EnumValueOptions.newBuilder(this.options_);
            this.options_ = descriptorProtos$EnumValueOptions = (DescriptorProtos$EnumValueOptions)((DescriptorProtos$EnumValueOptions$Builder)((GeneratedMessageLite$Builder)((Object)descriptorProtos$EnumValueOptionsOrBuilder)).mergeFrom(descriptorProtos$EnumValueOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$EnumValueOptions;
        }
        this.bitField0_ = n3 = this.bitField0_ | 4;
    }

    public static DescriptorProtos$EnumValueDescriptorProto$Builder newBuilder() {
        return (DescriptorProtos$EnumValueDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumValueDescriptorProto$Builder newBuilder(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        return (DescriptorProtos$EnumValueDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumValueDescriptorProto);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] byArray) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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

    private void setNumber(int n3) {
        int n4;
        this.bitField0_ = n4 = this.bitField0_ | 2;
        this.number_ = n3;
    }

    private void setOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        int n3;
        descriptorProtos$EnumValueOptions.getClass();
        this.options_ = descriptorProtos$EnumValueOptions;
        this.bitField0_ = n3 = this.bitField0_ | 4;
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
                clazz = DescriptorProtos$EnumValueDescriptorProto.class;
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
                objectArray = new Object[4];
                objectArray[0] = "bitField0_";
                objectArray[n3] = "name_";
                objectArray[2] = "number_";
                objectArray[3] = "options_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1409\u0002", objectArray);
            }
            case 2: {
                return new DescriptorProtos$EnumValueDescriptorProto$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$EnumValueDescriptorProto();
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public int getNumber() {
        return this.number_;
    }

    public DescriptorProtos$EnumValueOptions getOptions() {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
        if (descriptorProtos$EnumValueOptions == null) {
            descriptorProtos$EnumValueOptions = DescriptorProtos$EnumValueOptions.getDefaultInstance();
        }
        return descriptorProtos$EnumValueOptions;
    }

    public boolean hasName() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasNumber() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasOptions() {
        int n3 = this.bitField0_ & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

