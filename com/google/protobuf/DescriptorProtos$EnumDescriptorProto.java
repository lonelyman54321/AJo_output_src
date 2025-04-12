/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRange;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$EnumOptions;
import com.google.protobuf.DescriptorProtos$EnumOptions$Builder;
import com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder;
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

public final class DescriptorProtos$EnumDescriptorProto
extends GeneratedMessageLite
implements DescriptorProtos$EnumDescriptorProtoOrBuilder {
    private static final DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int RESERVED_NAME_FIELD_NUMBER = 5;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = (byte)2;
    private String name_ = "";
    private DescriptorProtos$EnumOptions options_;
    private Internal$ProtobufList reservedName_;
    private Internal$ProtobufList reservedRange_;
    private Internal$ProtobufList value_;

    static {
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto;
        DEFAULT_INSTANCE = descriptorProtos$EnumDescriptorProto = new DescriptorProtos$EnumDescriptorProto();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumDescriptorProto.class, descriptorProtos$EnumDescriptorProto);
    }

    private DescriptorProtos$EnumDescriptorProto() {
        Internal$ProtobufList internal$ProtobufList;
        this.value_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.reservedRange_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.reservedName_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$EnumDescriptorProto access$18400() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$18500(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, String string2) {
        descriptorProtos$EnumDescriptorProto.setName(string2);
    }

    public static /* synthetic */ void access$18600(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.clearName();
    }

    public static /* synthetic */ void access$18700(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, ByteString byteString) {
        descriptorProtos$EnumDescriptorProto.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$18800(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, int n3, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.setValue(n3, descriptorProtos$EnumValueDescriptorProto);
    }

    public static /* synthetic */ void access$18900(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.addValue(descriptorProtos$EnumValueDescriptorProto);
    }

    public static /* synthetic */ void access$19000(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, int n3, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.addValue(n3, descriptorProtos$EnumValueDescriptorProto);
    }

    public static /* synthetic */ void access$19100(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, Iterable iterable) {
        descriptorProtos$EnumDescriptorProto.addAllValue(iterable);
    }

    public static /* synthetic */ void access$19200(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.clearValue();
    }

    public static /* synthetic */ void access$19300(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, int n3) {
        descriptorProtos$EnumDescriptorProto.removeValue(n3);
    }

    public static /* synthetic */ void access$19400(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumDescriptorProto.setOptions(descriptorProtos$EnumOptions);
    }

    public static /* synthetic */ void access$19500(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumDescriptorProto.mergeOptions(descriptorProtos$EnumOptions);
    }

    public static /* synthetic */ void access$19600(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.clearOptions();
    }

    public static /* synthetic */ void access$19700(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, int n3, DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        descriptorProtos$EnumDescriptorProto.setReservedRange(n3, descriptorProtos$EnumDescriptorProto$EnumReservedRange);
    }

    public static /* synthetic */ void access$19800(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        descriptorProtos$EnumDescriptorProto.addReservedRange(descriptorProtos$EnumDescriptorProto$EnumReservedRange);
    }

    public static /* synthetic */ void access$19900(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, int n3, DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        descriptorProtos$EnumDescriptorProto.addReservedRange(n3, descriptorProtos$EnumDescriptorProto$EnumReservedRange);
    }

    public static /* synthetic */ void access$20000(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, Iterable iterable) {
        descriptorProtos$EnumDescriptorProto.addAllReservedRange(iterable);
    }

    public static /* synthetic */ void access$20100(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.clearReservedRange();
    }

    public static /* synthetic */ void access$20200(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, int n3) {
        descriptorProtos$EnumDescriptorProto.removeReservedRange(n3);
    }

    public static /* synthetic */ void access$20300(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, int n3, String string2) {
        descriptorProtos$EnumDescriptorProto.setReservedName(n3, string2);
    }

    public static /* synthetic */ void access$20400(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, String string2) {
        descriptorProtos$EnumDescriptorProto.addReservedName(string2);
    }

    public static /* synthetic */ void access$20500(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, Iterable iterable) {
        descriptorProtos$EnumDescriptorProto.addAllReservedName(iterable);
    }

    public static /* synthetic */ void access$20600(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.clearReservedName();
    }

    public static /* synthetic */ void access$20700(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto, ByteString byteString) {
        descriptorProtos$EnumDescriptorProto.addReservedNameBytes(byteString);
    }

    private void addAllReservedName(Iterable iterable) {
        this.ensureReservedNameIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.reservedName_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllReservedRange(Iterable iterable) {
        this.ensureReservedRangeIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.reservedRange_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllValue(Iterable iterable) {
        this.ensureValueIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.value_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addReservedName(String string2) {
        string2.getClass();
        this.ensureReservedNameIsMutable();
        this.reservedName_.add(string2);
    }

    private void addReservedNameBytes(ByteString object) {
        this.ensureReservedNameIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.reservedName_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void addReservedRange(int n3, DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        descriptorProtos$EnumDescriptorProto$EnumReservedRange.getClass();
        this.ensureReservedRangeIsMutable();
        this.reservedRange_.add(n3, descriptorProtos$EnumDescriptorProto$EnumReservedRange);
    }

    private void addReservedRange(DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        descriptorProtos$EnumDescriptorProto$EnumReservedRange.getClass();
        this.ensureReservedRangeIsMutable();
        this.reservedRange_.add(descriptorProtos$EnumDescriptorProto$EnumReservedRange);
    }

    private void addValue(int n3, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        this.ensureValueIsMutable();
        this.value_.add(n3, descriptorProtos$EnumValueDescriptorProto);
    }

    private void addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        this.ensureValueIsMutable();
        this.value_.add(descriptorProtos$EnumValueDescriptorProto);
    }

    private void clearName() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.name_ = string2 = DescriptorProtos$EnumDescriptorProto.getDefaultInstance().getName();
    }

    private void clearOptions() {
        int n3;
        this.options_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
    }

    private void clearReservedName() {
        Internal$ProtobufList internal$ProtobufList;
        this.reservedName_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearReservedRange() {
        Internal$ProtobufList internal$ProtobufList;
        this.reservedRange_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearValue() {
        Internal$ProtobufList internal$ProtobufList;
        this.value_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureReservedNameIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.reservedName_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.reservedName_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureReservedRangeIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.reservedRange_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.reservedRange_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureValueIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.value_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.value_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static DescriptorProtos$EnumDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        int n3;
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions2;
        descriptorProtos$EnumOptions.getClass();
        DescriptorProtos$EnumOptionsOrBuilder descriptorProtos$EnumOptionsOrBuilder = this.options_;
        if (descriptorProtos$EnumOptionsOrBuilder != null && descriptorProtos$EnumOptionsOrBuilder != (descriptorProtos$EnumOptions2 = DescriptorProtos$EnumOptions.getDefaultInstance())) {
            descriptorProtos$EnumOptionsOrBuilder = DescriptorProtos$EnumOptions.newBuilder(this.options_);
            this.options_ = descriptorProtos$EnumOptions = (DescriptorProtos$EnumOptions)((DescriptorProtos$EnumOptions$Builder)((GeneratedMessageLite$Builder)((Object)descriptorProtos$EnumOptionsOrBuilder)).mergeFrom(descriptorProtos$EnumOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$EnumOptions;
        }
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    public static DescriptorProtos$EnumDescriptorProto$Builder newBuilder() {
        return (DescriptorProtos$EnumDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumDescriptorProto$Builder newBuilder(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        return (DescriptorProtos$EnumDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] byArray) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeReservedRange(int n3) {
        this.ensureReservedRangeIsMutable();
        this.reservedRange_.remove(n3);
    }

    private void removeValue(int n3) {
        this.ensureValueIsMutable();
        this.value_.remove(n3);
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

    private void setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        int n3;
        descriptorProtos$EnumOptions.getClass();
        this.options_ = descriptorProtos$EnumOptions;
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    private void setReservedName(int n3, String string2) {
        string2.getClass();
        this.ensureReservedNameIsMutable();
        this.reservedName_.set(n3, string2);
    }

    private void setReservedRange(int n3, DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        descriptorProtos$EnumDescriptorProto$EnumReservedRange.getClass();
        this.ensureReservedRangeIsMutable();
        this.reservedRange_.set(n3, descriptorProtos$EnumDescriptorProto$EnumReservedRange);
    }

    private void setValue(int n3, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        this.ensureValueIsMutable();
        this.value_.set(n3, descriptorProtos$EnumValueDescriptorProto);
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
                clazz = DescriptorProtos$EnumDescriptorProto.class;
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
                objectArray = new Object[8];
                objectArray[0] = "bitField0_";
                objectArray[n3] = "name_";
                objectArray[2] = "value_";
                objectArray[3] = DescriptorProtos$EnumValueDescriptorProto.class;
                objectArray[4] = "options_";
                objectArray[5] = "reservedRange_";
                objectArray[6] = DescriptorProtos$EnumDescriptorProto$EnumReservedRange.class;
                objectArray[7] = "reservedName_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001\u1008\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u001b\u0005\u001a", objectArray);
            }
            case 2: {
                return new DescriptorProtos$EnumDescriptorProto$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$EnumDescriptorProto();
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public DescriptorProtos$EnumOptions getOptions() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
        if (descriptorProtos$EnumOptions == null) {
            descriptorProtos$EnumOptions = DescriptorProtos$EnumOptions.getDefaultInstance();
        }
        return descriptorProtos$EnumOptions;
    }

    public String getReservedName(int n3) {
        return (String)this.reservedName_.get(n3);
    }

    public ByteString getReservedNameBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.reservedName_.get(n3));
    }

    public int getReservedNameCount() {
        return this.reservedName_.size();
    }

    public List getReservedNameList() {
        return this.reservedName_;
    }

    public DescriptorProtos$EnumDescriptorProto$EnumReservedRange getReservedRange(int n3) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)this.reservedRange_.get(n3);
    }

    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    public List getReservedRangeList() {
        return this.reservedRange_;
    }

    public DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder getReservedRangeOrBuilder(int n3) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder)this.reservedRange_.get(n3);
    }

    public List getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    public DescriptorProtos$EnumValueDescriptorProto getValue(int n3) {
        return (DescriptorProtos$EnumValueDescriptorProto)this.value_.get(n3);
    }

    public int getValueCount() {
        return this.value_.size();
    }

    public List getValueList() {
        return this.value_;
    }

    public DescriptorProtos$EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int n3) {
        return (DescriptorProtos$EnumValueDescriptorProtoOrBuilder)this.value_.get(n3);
    }

    public List getValueOrBuilderList() {
        return this.value_;
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

