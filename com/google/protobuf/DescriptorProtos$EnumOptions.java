/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$EnumOptions$Builder;
import com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder;
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

public final class DescriptorProtos$EnumOptions
extends GeneratedMessageLite$ExtendableMessage
implements DescriptorProtos$EnumOptionsOrBuilder {
    public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
    private static final DescriptorProtos$EnumOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private boolean allowAlias_;
    private int bitField0_;
    private boolean deprecated_;
    private byte memoizedIsInitialized = (byte)2;
    private Internal$ProtobufList uninterpretedOption_;

    static {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions;
        DEFAULT_INSTANCE = descriptorProtos$EnumOptions = new DescriptorProtos$EnumOptions();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumOptions.class, descriptorProtos$EnumOptions);
    }

    private DescriptorProtos$EnumOptions() {
        Internal$ProtobufList internal$ProtobufList;
        this.uninterpretedOption_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$EnumOptions access$35300() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$35400(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions, boolean bl2) {
        descriptorProtos$EnumOptions.setAllowAlias(bl2);
    }

    public static /* synthetic */ void access$35500(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumOptions.clearAllowAlias();
    }

    public static /* synthetic */ void access$35600(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions, boolean bl2) {
        descriptorProtos$EnumOptions.setDeprecated(bl2);
    }

    public static /* synthetic */ void access$35700(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumOptions.clearDeprecated();
    }

    public static /* synthetic */ void access$35800(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$EnumOptions.setUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$35900(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$EnumOptions.addUninterpretedOption(descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$36000(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$EnumOptions.addUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$36100(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions, Iterable iterable) {
        descriptorProtos$EnumOptions.addAllUninterpretedOption(iterable);
    }

    public static /* synthetic */ void access$36200(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumOptions.clearUninterpretedOption();
    }

    public static /* synthetic */ void access$36300(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions, int n3) {
        descriptorProtos$EnumOptions.removeUninterpretedOption(n3);
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

    private void clearAllowAlias() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.allowAlias_ = false;
    }

    private void clearDeprecated() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.deprecated_ = false;
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

    public static DescriptorProtos$EnumOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$EnumOptions$Builder newBuilder() {
        return (DescriptorProtos$EnumOptions$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumOptions$Builder newBuilder(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        return (DescriptorProtos$EnumOptions$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumOptions);
    }

    public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumOptions parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$EnumOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumOptions parseFrom(byte[] byArray) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$EnumOptions parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeUninterpretedOption(int n3) {
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(n3);
    }

    private void setAllowAlias(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.allowAlias_ = bl2;
    }

    private void setDeprecated(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 2;
        this.deprecated_ = bl2;
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
                clazz = DescriptorProtos$EnumOptions.class;
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
                objectArray[n3] = "allowAlias_";
                objectArray[2] = "deprecated_";
                objectArray[3] = "uninterpretedOption_";
                objectArray[4] = DescriptorProtos$UninterpretedOption.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002\u03e7\u0003\u0000\u0001\u0001\u0002\u1007\u0000\u0003\u1007\u0001\u03e7\u041b", objectArray);
            }
            case 2: {
                return new DescriptorProtos$EnumOptions$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$EnumOptions();
    }

    public boolean getAllowAlias() {
        return this.allowAlias_;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
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

    public boolean hasAllowAlias() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasDeprecated() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

