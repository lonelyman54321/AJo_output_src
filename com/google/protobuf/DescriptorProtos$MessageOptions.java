/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$MessageOptions$Builder;
import com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder;
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

public final class DescriptorProtos$MessageOptions
extends GeneratedMessageLite$ExtendableMessage
implements DescriptorProtos$MessageOptionsOrBuilder {
    private static final DescriptorProtos$MessageOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int MAP_ENTRY_FIELD_NUMBER = 7;
    public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
    public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private boolean mapEntry_;
    private byte memoizedIsInitialized = (byte)2;
    private boolean messageSetWireFormat_;
    private boolean noStandardDescriptorAccessor_;
    private Internal$ProtobufList uninterpretedOption_;

    static {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions;
        DEFAULT_INSTANCE = descriptorProtos$MessageOptions = new DescriptorProtos$MessageOptions();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$MessageOptions.class, descriptorProtos$MessageOptions);
    }

    private DescriptorProtos$MessageOptions() {
        Internal$ProtobufList internal$ProtobufList;
        this.uninterpretedOption_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$MessageOptions access$30900() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$31000(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions, boolean bl2) {
        descriptorProtos$MessageOptions.setMessageSetWireFormat(bl2);
    }

    public static /* synthetic */ void access$31100(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.clearMessageSetWireFormat();
    }

    public static /* synthetic */ void access$31200(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions, boolean bl2) {
        descriptorProtos$MessageOptions.setNoStandardDescriptorAccessor(bl2);
    }

    public static /* synthetic */ void access$31300(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.clearNoStandardDescriptorAccessor();
    }

    public static /* synthetic */ void access$31400(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions, boolean bl2) {
        descriptorProtos$MessageOptions.setDeprecated(bl2);
    }

    public static /* synthetic */ void access$31500(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.clearDeprecated();
    }

    public static /* synthetic */ void access$31600(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions, boolean bl2) {
        descriptorProtos$MessageOptions.setMapEntry(bl2);
    }

    public static /* synthetic */ void access$31700(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.clearMapEntry();
    }

    public static /* synthetic */ void access$31800(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$MessageOptions.setUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$31900(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$MessageOptions.addUninterpretedOption(descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$32000(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$MessageOptions.addUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$32100(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions, Iterable iterable) {
        descriptorProtos$MessageOptions.addAllUninterpretedOption(iterable);
    }

    public static /* synthetic */ void access$32200(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.clearUninterpretedOption();
    }

    public static /* synthetic */ void access$32300(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions, int n3) {
        descriptorProtos$MessageOptions.removeUninterpretedOption(n3);
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

    private void clearDeprecated() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
        this.deprecated_ = false;
    }

    private void clearMapEntry() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFF7;
        this.mapEntry_ = false;
    }

    private void clearMessageSetWireFormat() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.messageSetWireFormat_ = false;
    }

    private void clearNoStandardDescriptorAccessor() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.noStandardDescriptorAccessor_ = false;
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

    public static DescriptorProtos$MessageOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$MessageOptions$Builder newBuilder() {
        return (DescriptorProtos$MessageOptions$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MessageOptions$Builder newBuilder(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        return (DescriptorProtos$MessageOptions$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$MessageOptions);
    }

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$MessageOptions parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] byArray) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MessageOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeUninterpretedOption(int n3) {
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(n3);
    }

    private void setDeprecated(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 4;
        this.deprecated_ = bl2;
    }

    private void setMapEntry(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 8;
        this.mapEntry_ = bl2;
    }

    private void setMessageSetWireFormat(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.messageSetWireFormat_ = bl2;
    }

    private void setNoStandardDescriptorAccessor(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 2;
        this.noStandardDescriptorAccessor_ = bl2;
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
                clazz = DescriptorProtos$MessageOptions.class;
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
                objectArray[n3] = "messageSetWireFormat_";
                objectArray[2] = "noStandardDescriptorAccessor_";
                objectArray[3] = "deprecated_";
                objectArray[4] = "mapEntry_";
                objectArray[5] = "uninterpretedOption_";
                objectArray[6] = DescriptorProtos$UninterpretedOption.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u03e7\u0005\u0000\u0001\u0001\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0007\u1007\u0003\u03e7\u041b", objectArray);
            }
            case 2: {
                return new DescriptorProtos$MessageOptions$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$MessageOptions();
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public boolean getMapEntry() {
        return this.mapEntry_;
    }

    public boolean getMessageSetWireFormat() {
        return this.messageSetWireFormat_;
    }

    public boolean getNoStandardDescriptorAccessor() {
        return this.noStandardDescriptorAccessor_;
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

    public boolean hasDeprecated() {
        int n3 = this.bitField0_ & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasMapEntry() {
        int n3 = this.bitField0_ & 8;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasMessageSetWireFormat() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasNoStandardDescriptorAccessor() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

