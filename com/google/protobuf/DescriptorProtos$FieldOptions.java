/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$FieldOptions$Builder;
import com.google.protobuf.DescriptorProtos$FieldOptions$CType;
import com.google.protobuf.DescriptorProtos$FieldOptions$JSType;
import com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder;
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

public final class DescriptorProtos$FieldOptions
extends GeneratedMessageLite$ExtendableMessage
implements DescriptorProtos$FieldOptionsOrBuilder {
    public static final int CTYPE_FIELD_NUMBER = 1;
    private static final DescriptorProtos$FieldOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int JSTYPE_FIELD_NUMBER = 6;
    public static final int LAZY_FIELD_NUMBER = 5;
    public static final int PACKED_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int WEAK_FIELD_NUMBER = 10;
    private int bitField0_;
    private int ctype_;
    private boolean deprecated_;
    private int jstype_;
    private boolean lazy_;
    private byte memoizedIsInitialized = (byte)2;
    private boolean packed_;
    private Internal$ProtobufList uninterpretedOption_;
    private boolean weak_;

    static {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions;
        DEFAULT_INSTANCE = descriptorProtos$FieldOptions = new DescriptorProtos$FieldOptions();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FieldOptions.class, descriptorProtos$FieldOptions);
    }

    private DescriptorProtos$FieldOptions() {
        Internal$ProtobufList internal$ProtobufList;
        this.uninterpretedOption_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$FieldOptions access$32500() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$32600(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, DescriptorProtos$FieldOptions$CType descriptorProtos$FieldOptions$CType) {
        descriptorProtos$FieldOptions.setCtype(descriptorProtos$FieldOptions$CType);
    }

    public static /* synthetic */ void access$32700(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.clearCtype();
    }

    public static /* synthetic */ void access$32800(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, boolean bl2) {
        descriptorProtos$FieldOptions.setPacked(bl2);
    }

    public static /* synthetic */ void access$32900(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.clearPacked();
    }

    public static /* synthetic */ void access$33000(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, DescriptorProtos$FieldOptions$JSType descriptorProtos$FieldOptions$JSType) {
        descriptorProtos$FieldOptions.setJstype(descriptorProtos$FieldOptions$JSType);
    }

    public static /* synthetic */ void access$33100(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.clearJstype();
    }

    public static /* synthetic */ void access$33200(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, boolean bl2) {
        descriptorProtos$FieldOptions.setLazy(bl2);
    }

    public static /* synthetic */ void access$33300(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.clearLazy();
    }

    public static /* synthetic */ void access$33400(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, boolean bl2) {
        descriptorProtos$FieldOptions.setDeprecated(bl2);
    }

    public static /* synthetic */ void access$33500(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.clearDeprecated();
    }

    public static /* synthetic */ void access$33600(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, boolean bl2) {
        descriptorProtos$FieldOptions.setWeak(bl2);
    }

    public static /* synthetic */ void access$33700(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.clearWeak();
    }

    public static /* synthetic */ void access$33800(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$FieldOptions.setUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$33900(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$FieldOptions.addUninterpretedOption(descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$34000(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$FieldOptions.addUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$34100(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, Iterable iterable) {
        descriptorProtos$FieldOptions.addAllUninterpretedOption(iterable);
    }

    public static /* synthetic */ void access$34200(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.clearUninterpretedOption();
    }

    public static /* synthetic */ void access$34300(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions, int n3) {
        descriptorProtos$FieldOptions.removeUninterpretedOption(n3);
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

    private void clearCtype() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.ctype_ = 0;
    }

    private void clearDeprecated() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFEF;
        this.deprecated_ = false;
    }

    private void clearJstype() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
        this.jstype_ = 0;
    }

    private void clearLazy() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFF7;
        this.lazy_ = false;
    }

    private void clearPacked() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.packed_ = false;
    }

    private void clearUninterpretedOption() {
        Internal$ProtobufList internal$ProtobufList;
        this.uninterpretedOption_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWeak() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFDF;
        this.weak_ = false;
    }

    private void ensureUninterpretedOptionIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.uninterpretedOption_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.uninterpretedOption_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static DescriptorProtos$FieldOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$FieldOptions$Builder newBuilder() {
        return (DescriptorProtos$FieldOptions$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FieldOptions$Builder newBuilder(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        return (DescriptorProtos$FieldOptions$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldOptions);
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$FieldOptions parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] byArray) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeUninterpretedOption(int n3) {
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(n3);
    }

    private void setCtype(DescriptorProtos$FieldOptions$CType descriptorProtos$FieldOptions$CType) {
        int n3;
        this.ctype_ = n3 = descriptorProtos$FieldOptions$CType.getNumber();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    private void setDeprecated(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x10;
        this.deprecated_ = bl2;
    }

    private void setJstype(DescriptorProtos$FieldOptions$JSType descriptorProtos$FieldOptions$JSType) {
        int n3;
        this.jstype_ = n3 = descriptorProtos$FieldOptions$JSType.getNumber();
        this.bitField0_ = n3 = this.bitField0_ | 4;
    }

    private void setLazy(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 8;
        this.lazy_ = bl2;
    }

    private void setPacked(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 2;
        this.packed_ = bl2;
    }

    private void setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(n3, descriptorProtos$UninterpretedOption);
    }

    private void setWeak(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x20;
        this.weak_ = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        int n3 = 1;
        Object[] objectArray = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        int n4 = object.ordinal();
        n4 = objectArray[n4];
        objectArray = null;
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
                clazz = DescriptorProtos$FieldOptions.class;
                synchronized (clazz) {
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
                object = DescriptorProtos$FieldOptions$CType.internalGetVerifier();
                clazz = DescriptorProtos$FieldOptions$JSType.internalGetVerifier();
                objectArray = new Object[11];
                objectArray[0] = (int)"bitField0_";
                objectArray[n3] = (int)"ctype_";
                objectArray[2] = (int)object;
                objectArray[3] = (int)"packed_";
                objectArray[4] = (int)"deprecated_";
                objectArray[5] = (int)"lazy_";
                objectArray[6] = (int)"jstype_";
                objectArray[7] = (int)clazz;
                objectArray[8] = (int)"weak_";
                objectArray[9] = (int)"uninterpretedOption_";
                objectArray[10] = (int)DescriptorProtos$UninterpretedOption.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u03e7\u0007\u0000\u0001\u0001\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1007\u0004\u0005\u1007\u0003\u0006\u100c\u0002\n\u1007\u0005\u03e7\u041b", objectArray);
            }
            case 2: {
                return new DescriptorProtos$FieldOptions$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$FieldOptions();
    }

    public DescriptorProtos$FieldOptions$CType getCtype() {
        int n3 = this.ctype_;
        DescriptorProtos$FieldOptions$CType descriptorProtos$FieldOptions$CType = DescriptorProtos$FieldOptions$CType.forNumber(n3);
        if (descriptorProtos$FieldOptions$CType == null) {
            descriptorProtos$FieldOptions$CType = DescriptorProtos$FieldOptions$CType.STRING;
        }
        return descriptorProtos$FieldOptions$CType;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public DescriptorProtos$FieldOptions$JSType getJstype() {
        int n3 = this.jstype_;
        DescriptorProtos$FieldOptions$JSType descriptorProtos$FieldOptions$JSType = DescriptorProtos$FieldOptions$JSType.forNumber(n3);
        if (descriptorProtos$FieldOptions$JSType == null) {
            descriptorProtos$FieldOptions$JSType = DescriptorProtos$FieldOptions$JSType.JS_NORMAL;
        }
        return descriptorProtos$FieldOptions$JSType;
    }

    public boolean getLazy() {
        return this.lazy_;
    }

    public boolean getPacked() {
        return this.packed_;
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

    public boolean getWeak() {
        return this.weak_;
    }

    public boolean hasCtype() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasDeprecated() {
        int n3 = this.bitField0_ & 0x10;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasJstype() {
        int n3 = this.bitField0_ & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasLazy() {
        int n3 = this.bitField0_ & 8;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasPacked() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasWeak() {
        int n3 = this.bitField0_ & 0x20;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

