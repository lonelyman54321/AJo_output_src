/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$MethodOptions$Builder;
import com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel;
import com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder;
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

public final class DescriptorProtos$MethodOptions
extends GeneratedMessageLite$ExtendableMessage
implements DescriptorProtos$MethodOptionsOrBuilder {
    private static final DescriptorProtos$MethodOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
    private static volatile Parser PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private int idempotencyLevel_;
    private byte memoizedIsInitialized = (byte)2;
    private Internal$ProtobufList uninterpretedOption_;

    static {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions;
        DEFAULT_INSTANCE = descriptorProtos$MethodOptions = new DescriptorProtos$MethodOptions();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$MethodOptions.class, descriptorProtos$MethodOptions);
    }

    private DescriptorProtos$MethodOptions() {
        Internal$ProtobufList internal$ProtobufList;
        this.uninterpretedOption_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$MethodOptions access$38500() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$38600(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions, boolean bl2) {
        descriptorProtos$MethodOptions.setDeprecated(bl2);
    }

    public static /* synthetic */ void access$38700(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        descriptorProtos$MethodOptions.clearDeprecated();
    }

    public static /* synthetic */ void access$38800(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions, DescriptorProtos$MethodOptions$IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevel) {
        descriptorProtos$MethodOptions.setIdempotencyLevel(descriptorProtos$MethodOptions$IdempotencyLevel);
    }

    public static /* synthetic */ void access$38900(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        descriptorProtos$MethodOptions.clearIdempotencyLevel();
    }

    public static /* synthetic */ void access$39000(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$MethodOptions.setUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$39100(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$MethodOptions.addUninterpretedOption(descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$39200(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$MethodOptions.addUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$39300(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions, Iterable iterable) {
        descriptorProtos$MethodOptions.addAllUninterpretedOption(iterable);
    }

    public static /* synthetic */ void access$39400(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        descriptorProtos$MethodOptions.clearUninterpretedOption();
    }

    public static /* synthetic */ void access$39500(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions, int n3) {
        descriptorProtos$MethodOptions.removeUninterpretedOption(n3);
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
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.deprecated_ = false;
    }

    private void clearIdempotencyLevel() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.idempotencyLevel_ = 0;
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

    public static DescriptorProtos$MethodOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$MethodOptions$Builder newBuilder() {
        return (DescriptorProtos$MethodOptions$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MethodOptions$Builder newBuilder(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        return (DescriptorProtos$MethodOptions$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$MethodOptions);
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$MethodOptions parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] byArray) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$MethodOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.deprecated_ = bl2;
    }

    private void setIdempotencyLevel(DescriptorProtos$MethodOptions$IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevel) {
        int n3;
        this.idempotencyLevel_ = n3 = descriptorProtos$MethodOptions$IdempotencyLevel.getNumber();
        this.bitField0_ = n3 = this.bitField0_ | 2;
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
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object objectArray, Object object2) {
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
                if (objectArray == null) {
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
                objectArray = DescriptorProtos$MethodOptions.class;
                synchronized (objectArray) {
                    try {
                        object = PARSER;
                        if (object != null) return object;
                        object2 = DEFAULT_INSTANCE;
                        object = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
                        PARSER = object;
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
                object = DescriptorProtos$MethodOptions$IdempotencyLevel.internalGetVerifier();
                objectArray = new Object[6];
                objectArray[0] = "bitField0_";
                objectArray[n3] = "deprecated_";
                objectArray[2] = "idempotencyLevel_";
                objectArray[3] = object;
                objectArray[4] = "uninterpretedOption_";
                objectArray[5] = DescriptorProtos$UninterpretedOption.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!\u03e7\u0003\u0000\u0001\u0001!\u1007\u0000\"\u100c\u0001\u03e7\u041b", objectArray);
            }
            case 2: {
                return new DescriptorProtos$MethodOptions$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$MethodOptions();
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public DescriptorProtos$MethodOptions$IdempotencyLevel getIdempotencyLevel() {
        int n3 = this.idempotencyLevel_;
        DescriptorProtos$MethodOptions$IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevel = DescriptorProtos$MethodOptions$IdempotencyLevel.forNumber(n3);
        if (descriptorProtos$MethodOptions$IdempotencyLevel == null) {
            descriptorProtos$MethodOptions$IdempotencyLevel = DescriptorProtos$MethodOptions$IdempotencyLevel.IDEMPOTENCY_UNKNOWN;
        }
        return descriptorProtos$MethodOptions$IdempotencyLevel;
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
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasIdempotencyLevel() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

