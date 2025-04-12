/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.EnumValue$1;
import com.google.protobuf.EnumValue$Builder;
import com.google.protobuf.EnumValueOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
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

public final class EnumValue
extends GeneratedMessageLite
implements EnumValueOrBuilder {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    private String name_ = "";
    private int number_;
    private Internal$ProtobufList options_;

    static {
        EnumValue enumValue;
        DEFAULT_INSTANCE = enumValue = new EnumValue();
        GeneratedMessageLite.registerDefaultInstance(EnumValue.class, enumValue);
    }

    private EnumValue() {
        Internal$ProtobufList internal$ProtobufList;
        this.options_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ EnumValue access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(EnumValue enumValue, String string2) {
        enumValue.setName(string2);
    }

    public static /* synthetic */ void access$1000(EnumValue enumValue) {
        enumValue.clearOptions();
    }

    public static /* synthetic */ void access$1100(EnumValue enumValue, int n3) {
        enumValue.removeOptions(n3);
    }

    public static /* synthetic */ void access$200(EnumValue enumValue) {
        enumValue.clearName();
    }

    public static /* synthetic */ void access$300(EnumValue enumValue, ByteString byteString) {
        enumValue.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(EnumValue enumValue, int n3) {
        enumValue.setNumber(n3);
    }

    public static /* synthetic */ void access$500(EnumValue enumValue) {
        enumValue.clearNumber();
    }

    public static /* synthetic */ void access$600(EnumValue enumValue, int n3, Option option) {
        enumValue.setOptions(n3, option);
    }

    public static /* synthetic */ void access$700(EnumValue enumValue, Option option) {
        enumValue.addOptions(option);
    }

    public static /* synthetic */ void access$800(EnumValue enumValue, int n3, Option option) {
        enumValue.addOptions(n3, option);
    }

    public static /* synthetic */ void access$900(EnumValue enumValue, Iterable iterable) {
        enumValue.addAllOptions(iterable);
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

    private void clearName() {
        String string2;
        this.name_ = string2 = EnumValue.getDefaultInstance().getName();
    }

    private void clearNumber() {
        this.number_ = 0;
    }

    private void clearOptions() {
        Internal$ProtobufList internal$ProtobufList;
        this.options_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureOptionsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.options_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.options_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static EnumValue$Builder newBuilder() {
        return (EnumValue$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static EnumValue$Builder newBuilder(EnumValue enumValue) {
        return (EnumValue$Builder)DEFAULT_INSTANCE.createBuilder(enumValue);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) {
        return (EnumValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (EnumValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EnumValue parseFrom(ByteString byteString) {
        return (EnumValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static EnumValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (EnumValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream) {
        return (EnumValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (EnumValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static EnumValue parseFrom(InputStream inputStream) {
        return (EnumValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (EnumValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) {
        return (EnumValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (EnumValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EnumValue parseFrom(byte[] byArray) {
        return (EnumValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static EnumValue parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (EnumValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeOptions(int n3) {
        this.ensureOptionsIsMutable();
        this.options_.remove(n3);
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

    private void setOptions(int n3, Option option) {
        option.getClass();
        this.ensureOptionsIsMutable();
        this.options_.set(n3, option);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = EnumValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = EnumValue.class;
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
                objectArray[0] = "name_";
                objectArray[by2] = "number_";
                objectArray[2] = "options_";
                objectArray[3] = Option.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u0004\u0003\u001b", objectArray);
            }
            case 2: {
                return new EnumValue$Builder(null);
            }
            case 1: 
        }
        return new EnumValue();
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
}

