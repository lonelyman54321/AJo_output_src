/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.DescriptorProtos$FieldOptions$Builder;
import com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DescriptorProtos$FieldDescriptorProto
extends GeneratedMessageLite
implements DescriptorProtos$FieldDescriptorProtoOrBuilder {
    private static final DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
    public static final int EXTENDEE_FIELD_NUMBER = 2;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int LABEL_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    private static volatile Parser PARSER;
    public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_NAME_FIELD_NUMBER = 6;
    private int bitField0_;
    private String defaultValue_;
    private String extendee_;
    private String jsonName_;
    private int label_;
    private byte memoizedIsInitialized = (byte)2;
    private String name_;
    private int number_;
    private int oneofIndex_;
    private DescriptorProtos$FieldOptions options_;
    private boolean proto3Optional_;
    private String typeName_;
    private int type_;

    static {
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto;
        DEFAULT_INSTANCE = descriptorProtos$FieldDescriptorProto = new DescriptorProtos$FieldDescriptorProto();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FieldDescriptorProto.class, descriptorProtos$FieldDescriptorProto);
    }

    private DescriptorProtos$FieldDescriptorProto() {
        int n3;
        String string2;
        this.name_ = string2 = "";
        this.label_ = n3 = 1;
        this.type_ = n3;
        this.typeName_ = string2;
        this.extendee_ = string2;
        this.defaultValue_ = string2;
        this.jsonName_ = string2;
    }

    public static /* synthetic */ DescriptorProtos$FieldDescriptorProto access$14000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$14100(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, String string2) {
        descriptorProtos$FieldDescriptorProto.setName(string2);
    }

    public static /* synthetic */ void access$14200(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.clearName();
    }

    public static /* synthetic */ void access$14300(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, ByteString byteString) {
        descriptorProtos$FieldDescriptorProto.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$14400(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, int n3) {
        descriptorProtos$FieldDescriptorProto.setNumber(n3);
    }

    public static /* synthetic */ void access$14500(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.clearNumber();
    }

    public static /* synthetic */ void access$14600(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, DescriptorProtos$FieldDescriptorProto$Label descriptorProtos$FieldDescriptorProto$Label) {
        descriptorProtos$FieldDescriptorProto.setLabel(descriptorProtos$FieldDescriptorProto$Label);
    }

    public static /* synthetic */ void access$14700(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.clearLabel();
    }

    public static /* synthetic */ void access$14800(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type) {
        descriptorProtos$FieldDescriptorProto.setType(descriptorProtos$FieldDescriptorProto$Type);
    }

    public static /* synthetic */ void access$14900(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.clearType();
    }

    public static /* synthetic */ void access$15000(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, String string2) {
        descriptorProtos$FieldDescriptorProto.setTypeName(string2);
    }

    public static /* synthetic */ void access$15100(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.clearTypeName();
    }

    public static /* synthetic */ void access$15200(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, ByteString byteString) {
        descriptorProtos$FieldDescriptorProto.setTypeNameBytes(byteString);
    }

    public static /* synthetic */ void access$15300(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, String string2) {
        descriptorProtos$FieldDescriptorProto.setExtendee(string2);
    }

    public static /* synthetic */ void access$15400(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.clearExtendee();
    }

    public static /* synthetic */ void access$15500(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, ByteString byteString) {
        descriptorProtos$FieldDescriptorProto.setExtendeeBytes(byteString);
    }

    public static /* synthetic */ void access$15600(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, String string2) {
        descriptorProtos$FieldDescriptorProto.setDefaultValue(string2);
    }

    public static /* synthetic */ void access$15700(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.clearDefaultValue();
    }

    public static /* synthetic */ void access$15800(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, ByteString byteString) {
        descriptorProtos$FieldDescriptorProto.setDefaultValueBytes(byteString);
    }

    public static /* synthetic */ void access$15900(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, int n3) {
        descriptorProtos$FieldDescriptorProto.setOneofIndex(n3);
    }

    public static /* synthetic */ void access$16000(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.clearOneofIndex();
    }

    public static /* synthetic */ void access$16100(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, String string2) {
        descriptorProtos$FieldDescriptorProto.setJsonName(string2);
    }

    public static /* synthetic */ void access$16200(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.clearJsonName();
    }

    public static /* synthetic */ void access$16300(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, ByteString byteString) {
        descriptorProtos$FieldDescriptorProto.setJsonNameBytes(byteString);
    }

    public static /* synthetic */ void access$16400(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldDescriptorProto.setOptions(descriptorProtos$FieldOptions);
    }

    public static /* synthetic */ void access$16500(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldDescriptorProto.mergeOptions(descriptorProtos$FieldOptions);
    }

    public static /* synthetic */ void access$16600(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.clearOptions();
    }

    public static /* synthetic */ void access$16700(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, boolean bl2) {
        descriptorProtos$FieldDescriptorProto.setProto3Optional(bl2);
    }

    public static /* synthetic */ void access$16800(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.clearProto3Optional();
    }

    private void clearDefaultValue() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFBF;
        this.defaultValue_ = string2 = DescriptorProtos$FieldDescriptorProto.getDefaultInstance().getDefaultValue();
    }

    private void clearExtendee() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFDF;
        this.extendee_ = string2 = DescriptorProtos$FieldDescriptorProto.getDefaultInstance().getExtendee();
    }

    private void clearJsonName() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFEFF;
        this.jsonName_ = string2 = DescriptorProtos$FieldDescriptorProto.getDefaultInstance().getJsonName();
    }

    private void clearLabel() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
        this.label_ = 1;
    }

    private void clearName() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.name_ = string2 = DescriptorProtos$FieldDescriptorProto.getDefaultInstance().getName();
    }

    private void clearNumber() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.number_ = 0;
    }

    private void clearOneofIndex() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFF7F;
        this.oneofIndex_ = 0;
    }

    private void clearOptions() {
        int n3;
        this.options_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFDFF;
    }

    private void clearProto3Optional() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFBFF;
        this.proto3Optional_ = false;
    }

    private void clearType() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFF7;
        this.type_ = 1;
    }

    private void clearTypeName() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFEF;
        this.typeName_ = string2 = DescriptorProtos$FieldDescriptorProto.getDefaultInstance().getTypeName();
    }

    public static DescriptorProtos$FieldDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        int n3;
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions2;
        descriptorProtos$FieldOptions.getClass();
        DescriptorProtos$FieldOptionsOrBuilder descriptorProtos$FieldOptionsOrBuilder = this.options_;
        if (descriptorProtos$FieldOptionsOrBuilder != null && descriptorProtos$FieldOptionsOrBuilder != (descriptorProtos$FieldOptions2 = DescriptorProtos$FieldOptions.getDefaultInstance())) {
            descriptorProtos$FieldOptionsOrBuilder = DescriptorProtos$FieldOptions.newBuilder(this.options_);
            this.options_ = descriptorProtos$FieldOptions = (DescriptorProtos$FieldOptions)((DescriptorProtos$FieldOptions$Builder)((GeneratedMessageLite$Builder)((Object)descriptorProtos$FieldOptionsOrBuilder)).mergeFrom(descriptorProtos$FieldOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$FieldOptions;
        }
        this.bitField0_ = n3 = this.bitField0_ | 0x200;
    }

    public static DescriptorProtos$FieldDescriptorProto$Builder newBuilder() {
        return (DescriptorProtos$FieldDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FieldDescriptorProto$Builder newBuilder(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        return (DescriptorProtos$FieldDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldDescriptorProto);
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] byArray) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDefaultValue(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x40;
        this.defaultValue_ = string2;
    }

    private void setDefaultValueBytes(ByteString object) {
        int n3;
        this.defaultValue_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x40;
    }

    private void setExtendee(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x20;
        this.extendee_ = string2;
    }

    private void setExtendeeBytes(ByteString object) {
        int n3;
        this.extendee_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x20;
    }

    private void setJsonName(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x100;
        this.jsonName_ = string2;
    }

    private void setJsonNameBytes(ByteString object) {
        int n3;
        this.jsonName_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x100;
    }

    private void setLabel(DescriptorProtos$FieldDescriptorProto$Label descriptorProtos$FieldDescriptorProto$Label) {
        int n3;
        this.label_ = n3 = descriptorProtos$FieldDescriptorProto$Label.getNumber();
        this.bitField0_ = n3 = this.bitField0_ | 4;
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

    private void setOneofIndex(int n3) {
        int n4;
        this.bitField0_ = n4 = this.bitField0_ | 0x80;
        this.oneofIndex_ = n3;
    }

    private void setOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        int n3;
        descriptorProtos$FieldOptions.getClass();
        this.options_ = descriptorProtos$FieldOptions;
        this.bitField0_ = n3 = this.bitField0_ | 0x200;
    }

    private void setProto3Optional(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x400;
        this.proto3Optional_ = bl2;
    }

    private void setType(DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type) {
        int n3;
        this.type_ = n3 = descriptorProtos$FieldDescriptorProto$Type.getNumber();
        this.bitField0_ = n3 = this.bitField0_ | 8;
    }

    private void setTypeName(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x10;
        this.typeName_ = string2;
    }

    private void setTypeNameBytes(ByteString object) {
        int n3;
        this.typeName_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x10;
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
                clazz = DescriptorProtos$FieldDescriptorProto.class;
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
                object = DescriptorProtos$FieldDescriptorProto$Label.internalGetVerifier();
                clazz = DescriptorProtos$FieldDescriptorProto$Type.internalGetVerifier();
                objectArray = new Object[14];
                objectArray[0] = (int)"bitField0_";
                objectArray[n3] = (int)"name_";
                objectArray[2] = (int)"extendee_";
                objectArray[3] = (int)"number_";
                objectArray[4] = (int)"label_";
                objectArray[5] = (int)object;
                objectArray[6] = (int)"type_";
                objectArray[7] = (int)clazz;
                objectArray[8] = (int)"typeName_";
                objectArray[9] = (int)"defaultValue_";
                objectArray[10] = (int)"options_";
                objectArray[11] = (int)"oneofIndex_";
                objectArray[12] = (int)"jsonName_";
                objectArray[13] = (int)"proto3Optional_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0005\u0003\u1004\u0001\u0004\u100c\u0002\u0005\u100c\u0003\u0006\u1008\u0004\u0007\u1008\u0006\b\u1409\t\t\u1004\u0007\n\u1008\b\u0011\u1007\n", objectArray);
            }
            case 2: {
                return new DescriptorProtos$FieldDescriptorProto$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$FieldDescriptorProto();
    }

    public String getDefaultValue() {
        return this.defaultValue_;
    }

    public ByteString getDefaultValueBytes() {
        return ByteString.copyFromUtf8(this.defaultValue_);
    }

    public String getExtendee() {
        return this.extendee_;
    }

    public ByteString getExtendeeBytes() {
        return ByteString.copyFromUtf8(this.extendee_);
    }

    public String getJsonName() {
        return this.jsonName_;
    }

    public ByteString getJsonNameBytes() {
        return ByteString.copyFromUtf8(this.jsonName_);
    }

    public DescriptorProtos$FieldDescriptorProto$Label getLabel() {
        int n3 = this.label_;
        DescriptorProtos$FieldDescriptorProto$Label descriptorProtos$FieldDescriptorProto$Label = DescriptorProtos$FieldDescriptorProto$Label.forNumber(n3);
        if (descriptorProtos$FieldDescriptorProto$Label == null) {
            descriptorProtos$FieldDescriptorProto$Label = DescriptorProtos$FieldDescriptorProto$Label.LABEL_OPTIONAL;
        }
        return descriptorProtos$FieldDescriptorProto$Label;
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

    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    public DescriptorProtos$FieldOptions getOptions() {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = this.options_;
        if (descriptorProtos$FieldOptions == null) {
            descriptorProtos$FieldOptions = DescriptorProtos$FieldOptions.getDefaultInstance();
        }
        return descriptorProtos$FieldOptions;
    }

    public boolean getProto3Optional() {
        return this.proto3Optional_;
    }

    public DescriptorProtos$FieldDescriptorProto$Type getType() {
        int n3 = this.type_;
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type = DescriptorProtos$FieldDescriptorProto$Type.forNumber(n3);
        if (descriptorProtos$FieldDescriptorProto$Type == null) {
            descriptorProtos$FieldDescriptorProto$Type = DescriptorProtos$FieldDescriptorProto$Type.TYPE_DOUBLE;
        }
        return descriptorProtos$FieldDescriptorProto$Type;
    }

    public String getTypeName() {
        return this.typeName_;
    }

    public ByteString getTypeNameBytes() {
        return ByteString.copyFromUtf8(this.typeName_);
    }

    public boolean hasDefaultValue() {
        int n3 = this.bitField0_ & 0x40;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasExtendee() {
        int n3 = this.bitField0_ & 0x20;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasJsonName() {
        int n3 = this.bitField0_ & 0x100;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasLabel() {
        int n3 = this.bitField0_ & 4;
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

    public boolean hasNumber() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasOneofIndex() {
        int n3 = this.bitField0_ & 0x80;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasOptions() {
        int n3 = this.bitField0_ & 0x200;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasProto3Optional() {
        int n3 = this.bitField0_ & 0x400;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasType() {
        int n3 = this.bitField0_ & 8;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasTypeName() {
        int n3 = this.bitField0_ & 0x10;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

