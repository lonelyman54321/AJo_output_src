/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Field$1;
import com.google.protobuf.Field$Builder;
import com.google.protobuf.Field$Cardinality;
import com.google.protobuf.Field$Kind;
import com.google.protobuf.FieldOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Option;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Field
extends GeneratedMessageLite
implements FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile Parser PARSER;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private String defaultValue_;
    private String jsonName_;
    private int kind_;
    private String name_;
    private int number_;
    private int oneofIndex_;
    private Internal$ProtobufList options_;
    private boolean packed_;
    private String typeUrl_;

    static {
        Field field;
        DEFAULT_INSTANCE = field = new Field();
        GeneratedMessageLite.registerDefaultInstance(Field.class, field);
    }

    private Field() {
        Internal$ProtobufList internal$ProtobufList;
        String string2;
        this.name_ = string2 = "";
        this.typeUrl_ = string2;
        this.options_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.jsonName_ = string2;
        this.defaultValue_ = string2;
    }

    public static /* synthetic */ Field access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Field field, int n3) {
        field.setKindValue(n3);
    }

    public static /* synthetic */ void access$1000(Field field) {
        field.clearName();
    }

    public static /* synthetic */ void access$1100(Field field, ByteString byteString) {
        field.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$1200(Field field, String string2) {
        field.setTypeUrl(string2);
    }

    public static /* synthetic */ void access$1300(Field field) {
        field.clearTypeUrl();
    }

    public static /* synthetic */ void access$1400(Field field, ByteString byteString) {
        field.setTypeUrlBytes(byteString);
    }

    public static /* synthetic */ void access$1500(Field field, int n3) {
        field.setOneofIndex(n3);
    }

    public static /* synthetic */ void access$1600(Field field) {
        field.clearOneofIndex();
    }

    public static /* synthetic */ void access$1700(Field field, boolean bl2) {
        field.setPacked(bl2);
    }

    public static /* synthetic */ void access$1800(Field field) {
        field.clearPacked();
    }

    public static /* synthetic */ void access$1900(Field field, int n3, Option option) {
        field.setOptions(n3, option);
    }

    public static /* synthetic */ void access$200(Field field, Field$Kind field$Kind) {
        field.setKind(field$Kind);
    }

    public static /* synthetic */ void access$2000(Field field, Option option) {
        field.addOptions(option);
    }

    public static /* synthetic */ void access$2100(Field field, int n3, Option option) {
        field.addOptions(n3, option);
    }

    public static /* synthetic */ void access$2200(Field field, Iterable iterable) {
        field.addAllOptions(iterable);
    }

    public static /* synthetic */ void access$2300(Field field) {
        field.clearOptions();
    }

    public static /* synthetic */ void access$2400(Field field, int n3) {
        field.removeOptions(n3);
    }

    public static /* synthetic */ void access$2500(Field field, String string2) {
        field.setJsonName(string2);
    }

    public static /* synthetic */ void access$2600(Field field) {
        field.clearJsonName();
    }

    public static /* synthetic */ void access$2700(Field field, ByteString byteString) {
        field.setJsonNameBytes(byteString);
    }

    public static /* synthetic */ void access$2800(Field field, String string2) {
        field.setDefaultValue(string2);
    }

    public static /* synthetic */ void access$2900(Field field) {
        field.clearDefaultValue();
    }

    public static /* synthetic */ void access$300(Field field) {
        field.clearKind();
    }

    public static /* synthetic */ void access$3000(Field field, ByteString byteString) {
        field.setDefaultValueBytes(byteString);
    }

    public static /* synthetic */ void access$400(Field field, int n3) {
        field.setCardinalityValue(n3);
    }

    public static /* synthetic */ void access$500(Field field, Field$Cardinality field$Cardinality) {
        field.setCardinality(field$Cardinality);
    }

    public static /* synthetic */ void access$600(Field field) {
        field.clearCardinality();
    }

    public static /* synthetic */ void access$700(Field field, int n3) {
        field.setNumber(n3);
    }

    public static /* synthetic */ void access$800(Field field) {
        field.clearNumber();
    }

    public static /* synthetic */ void access$900(Field field, String string2) {
        field.setName(string2);
    }

    private void addAllOptions(Iterable iterable) {
        this.ensureOptionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.options_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addOptions(int n3, Option option) {
        option.getClass();
        this.ensureOptionsIsMutable();
        this.options_.add(n3, option);
    }

    private void addOptions(Option option) {
        option.getClass();
        this.ensureOptionsIsMutable();
        this.options_.add(option);
    }

    private void clearCardinality() {
        this.cardinality_ = 0;
    }

    private void clearDefaultValue() {
        String string2;
        this.defaultValue_ = string2 = Field.getDefaultInstance().getDefaultValue();
    }

    private void clearJsonName() {
        String string2;
        this.jsonName_ = string2 = Field.getDefaultInstance().getJsonName();
    }

    private void clearKind() {
        this.kind_ = 0;
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Field.getDefaultInstance().getName();
    }

    private void clearNumber() {
        this.number_ = 0;
    }

    private void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    private void clearOptions() {
        Internal$ProtobufList internal$ProtobufList;
        this.options_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearPacked() {
        this.packed_ = false;
    }

    private void clearTypeUrl() {
        String string2;
        this.typeUrl_ = string2 = Field.getDefaultInstance().getTypeUrl();
    }

    private void ensureOptionsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.options_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.options_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Field$Builder newBuilder() {
        return (Field$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Field$Builder newBuilder(Field field) {
        return (Field$Builder)DEFAULT_INSTANCE.createBuilder(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream) {
        return (Field)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Field)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Field parseFrom(ByteString byteString) {
        return (Field)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Field parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Field)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Field parseFrom(CodedInputStream codedInputStream) {
        return (Field)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Field parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Field)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Field parseFrom(InputStream inputStream) {
        return (Field)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Field)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) {
        return (Field)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Field)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Field parseFrom(byte[] byArray) {
        return (Field)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Field parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Field)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeOptions(int n3) {
        this.ensureOptionsIsMutable();
        this.options_.remove(n3);
    }

    private void setCardinality(Field$Cardinality field$Cardinality) {
        int n3;
        this.cardinality_ = n3 = field$Cardinality.getNumber();
    }

    private void setCardinalityValue(int n3) {
        this.cardinality_ = n3;
    }

    private void setDefaultValue(String string2) {
        string2.getClass();
        this.defaultValue_ = string2;
    }

    private void setDefaultValueBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.defaultValue_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setJsonName(String string2) {
        string2.getClass();
        this.jsonName_ = string2;
    }

    private void setJsonNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.jsonName_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setKind(Field$Kind field$Kind) {
        int n3;
        this.kind_ = n3 = field$Kind.getNumber();
    }

    private void setKindValue(int n3) {
        this.kind_ = n3;
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setNumber(int n3) {
        this.number_ = n3;
    }

    private void setOneofIndex(int n3) {
        this.oneofIndex_ = n3;
    }

    private void setOptions(int n3, Option option) {
        option.getClass();
        this.ensureOptionsIsMutable();
        this.options_.set(n3, option);
    }

    private void setPacked(boolean bl2) {
        this.packed_ = bl2;
    }

    private void setTypeUrl(String string2) {
        string2.getClass();
        this.typeUrl_ = string2;
    }

    private void setTypeUrlBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.typeUrl_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Field$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = Field.class;
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
                objectArray = new Object[11];
                objectArray[0] = "kind_";
                objectArray[by2] = "cardinality_";
                objectArray[2] = "number_";
                objectArray[3] = "name_";
                objectArray[4] = "typeUrl_";
                objectArray[5] = "oneofIndex_";
                objectArray[6] = "packed_";
                objectArray[7] = "options_";
                objectArray[8] = Option.class;
                objectArray[9] = "jsonName_";
                objectArray[10] = "defaultValue_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004\u0208\u0006\u0208\u0007\u0004\b\u0007\t\u001b\n\u0208\u000b\u0208", objectArray);
            }
            case 2: {
                return new Field$Builder(null);
            }
            case 1: 
        }
        return new Field();
    }

    public Field$Cardinality getCardinality() {
        int n3 = this.cardinality_;
        Field$Cardinality field$Cardinality = Field$Cardinality.forNumber(n3);
        if (field$Cardinality == null) {
            field$Cardinality = Field$Cardinality.UNRECOGNIZED;
        }
        return field$Cardinality;
    }

    public int getCardinalityValue() {
        return this.cardinality_;
    }

    public String getDefaultValue() {
        return this.defaultValue_;
    }

    public ByteString getDefaultValueBytes() {
        return ByteString.copyFromUtf8(this.defaultValue_);
    }

    public String getJsonName() {
        return this.jsonName_;
    }

    public ByteString getJsonNameBytes() {
        return ByteString.copyFromUtf8(this.jsonName_);
    }

    public Field$Kind getKind() {
        int n3 = this.kind_;
        Field$Kind field$Kind = Field$Kind.forNumber(n3);
        if (field$Kind == null) {
            field$Kind = Field$Kind.UNRECOGNIZED;
        }
        return field$Kind;
    }

    public int getKindValue() {
        return this.kind_;
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

    public Option getOptions(int n3) {
        return (Option)this.options_.get(n3);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int n3) {
        return (OptionOrBuilder)this.options_.get(n3);
    }

    public List getOptionsOrBuilderList() {
        return this.options_;
    }

    public boolean getPacked() {
        return this.packed_;
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public ByteString getTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.typeUrl_);
    }
}

