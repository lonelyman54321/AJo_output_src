/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$OneofOptions$Builder;
import com.google.protobuf.DescriptorProtos$OneofOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos$OneofOptions
extends GeneratedMessageLite$ExtendableMessage
implements DescriptorProtos$OneofOptionsOrBuilder {
    private static final DescriptorProtos$OneofOptions DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private byte memoizedIsInitialized = (byte)2;
    private Internal$ProtobufList uninterpretedOption_;

    static {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions;
        DEFAULT_INSTANCE = descriptorProtos$OneofOptions = new DescriptorProtos$OneofOptions();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$OneofOptions.class, descriptorProtos$OneofOptions);
    }

    private DescriptorProtos$OneofOptions() {
        Internal$ProtobufList internal$ProtobufList;
        this.uninterpretedOption_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$OneofOptions access$34500() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$34600(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$OneofOptions.setUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$34700(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$OneofOptions.addUninterpretedOption(descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$34800(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$OneofOptions.addUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$34900(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions, Iterable iterable) {
        descriptorProtos$OneofOptions.addAllUninterpretedOption(iterable);
    }

    public static /* synthetic */ void access$35000(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        descriptorProtos$OneofOptions.clearUninterpretedOption();
    }

    public static /* synthetic */ void access$35100(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions, int n3) {
        descriptorProtos$OneofOptions.removeUninterpretedOption(n3);
    }

    private void addAllUninterpretedOption(Iterable iterable) {
        this.ensureUninterpretedOptionIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.uninterpretedOption_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(n3, descriptorProtos$UninterpretedOption);
    }

    private void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    private void clearUninterpretedOption() {
        Internal$ProtobufList internal$ProtobufList;
        this.uninterpretedOption_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.uninterpretedOption_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.uninterpretedOption_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static DescriptorProtos$OneofOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$OneofOptions$Builder newBuilder() {
        return (DescriptorProtos$OneofOptions$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$OneofOptions$Builder newBuilder(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        return (DescriptorProtos$OneofOptions$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$OneofOptions);
    }

    public static DescriptorProtos$OneofOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$OneofOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$OneofOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$OneofOptions parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$OneofOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$OneofOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$OneofOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$OneofOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$OneofOptions parseFrom(byte[] byArray) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$OneofOptions parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$OneofOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeUninterpretedOption(int n3) {
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(n3);
    }

    private void setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(n3, descriptorProtos$UninterpretedOption);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        int n3 = 1;
        int[] nArray = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        int n4 = object.ordinal();
        n4 = nArray[n4];
        nArray = null;
        switch (n4) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 7: {
                if (clazz == null) {
                    n3 = 0;
                    object2 = null;
                }
                n4 = (byte)n3;
                this.memoizedIsInitialized = (byte)n4;
                return null;
            }
            case 6: {
                return this.memoizedIsInitialized;
            }
            case 5: {
                object = PARSER;
                if (object != null) return object;
                clazz = DescriptorProtos$OneofOptions.class;
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
                object[0] = "uninterpretedOption_";
                object[n3] = DescriptorProtos$UninterpretedOption.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u03e7\u03e7\u0001\u0000\u0001\u0001\u03e7\u041b", object);
            }
            case 2: {
                return new DescriptorProtos$OneofOptions$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$OneofOptions();
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int n3) {
        return (DescriptorProtos$UninterpretedOption)this.uninterpretedOption_.get(n3);
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public List getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int n3) {
        return (DescriptorProtos$UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(n3);
    }

    public List getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }
}

