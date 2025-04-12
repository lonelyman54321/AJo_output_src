/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos$UninterpretedOption
extends GeneratedMessageLite
implements DescriptorProtos$UninterpretedOptionOrBuilder {
    public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
    private static final DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
    public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
    private static volatile Parser PARSER;
    public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
    public static final int STRING_VALUE_FIELD_NUMBER = 7;
    private String aggregateValue_;
    private int bitField0_;
    private double doubleValue_;
    private String identifierValue_;
    private byte memoizedIsInitialized = (byte)2;
    private Internal$ProtobufList name_;
    private long negativeIntValue_;
    private long positiveIntValue_;
    private ByteString stringValue_;

    static {
        DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption;
        DEFAULT_INSTANCE = descriptorProtos$UninterpretedOption = new DescriptorProtos$UninterpretedOption();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$UninterpretedOption.class, descriptorProtos$UninterpretedOption);
    }

    private DescriptorProtos$UninterpretedOption() {
        ByteString byteString;
        Object object = GeneratedMessageLite.emptyProtobufList();
        this.name_ = object;
        this.identifierValue_ = object = "";
        this.stringValue_ = byteString = ByteString.EMPTY;
        this.aggregateValue_ = object;
    }

    public static /* synthetic */ DescriptorProtos$UninterpretedOption access$40400() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$40500(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, int n3, DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        descriptorProtos$UninterpretedOption.setName(n3, descriptorProtos$UninterpretedOption$NamePart);
    }

    public static /* synthetic */ void access$40600(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        descriptorProtos$UninterpretedOption.addName(descriptorProtos$UninterpretedOption$NamePart);
    }

    public static /* synthetic */ void access$40700(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, int n3, DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        descriptorProtos$UninterpretedOption.addName(n3, descriptorProtos$UninterpretedOption$NamePart);
    }

    public static /* synthetic */ void access$40800(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, Iterable iterable) {
        descriptorProtos$UninterpretedOption.addAllName(iterable);
    }

    public static /* synthetic */ void access$40900(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.clearName();
    }

    public static /* synthetic */ void access$41000(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, int n3) {
        descriptorProtos$UninterpretedOption.removeName(n3);
    }

    public static /* synthetic */ void access$41100(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, String string2) {
        descriptorProtos$UninterpretedOption.setIdentifierValue(string2);
    }

    public static /* synthetic */ void access$41200(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.clearIdentifierValue();
    }

    public static /* synthetic */ void access$41300(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, ByteString byteString) {
        descriptorProtos$UninterpretedOption.setIdentifierValueBytes(byteString);
    }

    public static /* synthetic */ void access$41400(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, long l2) {
        descriptorProtos$UninterpretedOption.setPositiveIntValue(l2);
    }

    public static /* synthetic */ void access$41500(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.clearPositiveIntValue();
    }

    public static /* synthetic */ void access$41600(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, long l2) {
        descriptorProtos$UninterpretedOption.setNegativeIntValue(l2);
    }

    public static /* synthetic */ void access$41700(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.clearNegativeIntValue();
    }

    public static /* synthetic */ void access$41800(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, double d2) {
        descriptorProtos$UninterpretedOption.setDoubleValue(d2);
    }

    public static /* synthetic */ void access$41900(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.clearDoubleValue();
    }

    public static /* synthetic */ void access$42000(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, ByteString byteString) {
        descriptorProtos$UninterpretedOption.setStringValue(byteString);
    }

    public static /* synthetic */ void access$42100(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.clearStringValue();
    }

    public static /* synthetic */ void access$42200(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, String string2) {
        descriptorProtos$UninterpretedOption.setAggregateValue(string2);
    }

    public static /* synthetic */ void access$42300(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.clearAggregateValue();
    }

    public static /* synthetic */ void access$42400(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption, ByteString byteString) {
        descriptorProtos$UninterpretedOption.setAggregateValueBytes(byteString);
    }

    private void addAllName(Iterable iterable) {
        this.ensureNameIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.name_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addName(int n3, DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        descriptorProtos$UninterpretedOption$NamePart.getClass();
        this.ensureNameIsMutable();
        this.name_.add(n3, descriptorProtos$UninterpretedOption$NamePart);
    }

    private void addName(DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        descriptorProtos$UninterpretedOption$NamePart.getClass();
        this.ensureNameIsMutable();
        this.name_.add(descriptorProtos$UninterpretedOption$NamePart);
    }

    private void clearAggregateValue() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFDF;
        this.aggregateValue_ = string2 = DescriptorProtos$UninterpretedOption.getDefaultInstance().getAggregateValue();
    }

    private void clearDoubleValue() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFF7;
        this.doubleValue_ = 0.0;
    }

    private void clearIdentifierValue() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.identifierValue_ = string2 = DescriptorProtos$UninterpretedOption.getDefaultInstance().getIdentifierValue();
    }

    private void clearName() {
        Internal$ProtobufList internal$ProtobufList;
        this.name_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearNegativeIntValue() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
        this.negativeIntValue_ = 0L;
    }

    private void clearPositiveIntValue() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.positiveIntValue_ = 0L;
    }

    private void clearStringValue() {
        ByteString byteString;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFEF;
        this.stringValue_ = byteString = DescriptorProtos$UninterpretedOption.getDefaultInstance().getStringValue();
    }

    private void ensureNameIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.name_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.name_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static DescriptorProtos$UninterpretedOption getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$UninterpretedOption$Builder newBuilder() {
        return (DescriptorProtos$UninterpretedOption$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$UninterpretedOption$Builder newBuilder(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        return (DescriptorProtos$UninterpretedOption$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteString byteString) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] byArray) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeName(int n3) {
        this.ensureNameIsMutable();
        this.name_.remove(n3);
    }

    private void setAggregateValue(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x20;
        this.aggregateValue_ = string2;
    }

    private void setAggregateValueBytes(ByteString object) {
        int n3;
        this.aggregateValue_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x20;
    }

    private void setDoubleValue(double d2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 8;
        this.doubleValue_ = d2;
    }

    private void setIdentifierValue(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.identifierValue_ = string2;
    }

    private void setIdentifierValueBytes(ByteString object) {
        int n3;
        this.identifierValue_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    private void setName(int n3, DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        descriptorProtos$UninterpretedOption$NamePart.getClass();
        this.ensureNameIsMutable();
        this.name_.set(n3, descriptorProtos$UninterpretedOption$NamePart);
    }

    private void setNegativeIntValue(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 4;
        this.negativeIntValue_ = l2;
    }

    private void setPositiveIntValue(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 2;
        this.positiveIntValue_ = l2;
    }

    private void setStringValue(ByteString byteString) {
        int n3;
        byteString.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x10;
        this.stringValue_ = byteString;
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
                clazz = DescriptorProtos$UninterpretedOption.class;
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
                objectArray = new Object[9];
                objectArray[0] = "bitField0_";
                objectArray[n3] = "name_";
                objectArray[2] = DescriptorProtos$UninterpretedOption$NamePart.class;
                objectArray[3] = "identifierValue_";
                objectArray[4] = "positiveIntValue_";
                objectArray[5] = "negativeIntValue_";
                objectArray[6] = "doubleValue_";
                objectArray[7] = "stringValue_";
                objectArray[8] = "aggregateValue_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002\u041b\u0003\u1008\u0000\u0004\u1003\u0001\u0005\u1002\u0002\u0006\u1000\u0003\u0007\u100a\u0004\b\u1008\u0005", objectArray);
            }
            case 2: {
                return new DescriptorProtos$UninterpretedOption$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$UninterpretedOption();
    }

    public String getAggregateValue() {
        return this.aggregateValue_;
    }

    public ByteString getAggregateValueBytes() {
        return ByteString.copyFromUtf8(this.aggregateValue_);
    }

    public double getDoubleValue() {
        return this.doubleValue_;
    }

    public String getIdentifierValue() {
        return this.identifierValue_;
    }

    public ByteString getIdentifierValueBytes() {
        return ByteString.copyFromUtf8(this.identifierValue_);
    }

    public DescriptorProtos$UninterpretedOption$NamePart getName(int n3) {
        return (DescriptorProtos$UninterpretedOption$NamePart)this.name_.get(n3);
    }

    public int getNameCount() {
        return this.name_.size();
    }

    public List getNameList() {
        return this.name_;
    }

    public DescriptorProtos$UninterpretedOption$NamePartOrBuilder getNameOrBuilder(int n3) {
        return (DescriptorProtos$UninterpretedOption$NamePartOrBuilder)this.name_.get(n3);
    }

    public List getNameOrBuilderList() {
        return this.name_;
    }

    public long getNegativeIntValue() {
        return this.negativeIntValue_;
    }

    public long getPositiveIntValue() {
        return this.positiveIntValue_;
    }

    public ByteString getStringValue() {
        return this.stringValue_;
    }

    public boolean hasAggregateValue() {
        int n3 = this.bitField0_ & 0x20;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasDoubleValue() {
        int n3 = this.bitField0_ & 8;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasIdentifierValue() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasNegativeIntValue() {
        int n3 = this.bitField0_ & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasPositiveIntValue() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasStringValue() {
        int n3 = this.bitField0_ & 0x10;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

