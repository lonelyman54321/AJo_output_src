/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.ListValue$1;
import com.google.protobuf.ListValue$Builder;
import com.google.protobuf.ListValueOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Value;
import com.google.protobuf.ValueOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class ListValue
extends GeneratedMessageLite
implements ListValueOrBuilder {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal$ProtobufList values_;

    static {
        ListValue listValue;
        DEFAULT_INSTANCE = listValue = new ListValue();
        GeneratedMessageLite.registerDefaultInstance(ListValue.class, listValue);
    }

    private ListValue() {
        Internal$ProtobufList internal$ProtobufList;
        this.values_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ ListValue access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(ListValue listValue, int n3, Value value) {
        listValue.setValues(n3, value);
    }

    public static /* synthetic */ void access$200(ListValue listValue, Value value) {
        listValue.addValues(value);
    }

    public static /* synthetic */ void access$300(ListValue listValue, int n3, Value value) {
        listValue.addValues(n3, value);
    }

    public static /* synthetic */ void access$400(ListValue listValue, Iterable iterable) {
        listValue.addAllValues(iterable);
    }

    public static /* synthetic */ void access$500(ListValue listValue) {
        listValue.clearValues();
    }

    public static /* synthetic */ void access$600(ListValue listValue, int n3) {
        listValue.removeValues(n3);
    }

    private void addAllValues(Iterable iterable) {
        this.ensureValuesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.values_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addValues(int n3, Value value) {
        value.getClass();
        this.ensureValuesIsMutable();
        this.values_.add(n3, value);
    }

    private void addValues(Value value) {
        value.getClass();
        this.ensureValuesIsMutable();
        this.values_.add(value);
    }

    private void clearValues() {
        Internal$ProtobufList internal$ProtobufList;
        this.values_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.values_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.values_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ListValue$Builder newBuilder() {
        return (ListValue$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static ListValue$Builder newBuilder(ListValue listValue) {
        return (ListValue$Builder)DEFAULT_INSTANCE.createBuilder(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) {
        return (ListValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListValue parseFrom(ByteString byteString) {
        return (ListValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static ListValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ListValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream) {
        return (ListValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ListValue parseFrom(InputStream inputStream) {
        return (ListValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) {
        return (ListValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ListValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ListValue parseFrom(byte[] byArray) {
        return (ListValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static ListValue parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ListValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeValues(int n3) {
        this.ensureValuesIsMutable();
        this.values_.remove(n3);
    }

    private void setValues(int n3, Value value) {
        value.getClass();
        this.ensureValuesIsMutable();
        this.values_.set(n3, value);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = ListValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = object.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                object = PARSER;
                if (object != null) return object;
                clazz = ListValue.class;
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
                object[0] = "values_";
                object[by2] = Value.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new ListValue$Builder(null);
            }
            case 1: 
        }
        return new ListValue();
    }

    public Value getValues(int n3) {
        return (Value)this.values_.get(n3);
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List getValuesList() {
        return this.values_;
    }

    public ValueOrBuilder getValuesOrBuilder(int n3) {
        return (ValueOrBuilder)this.values_.get(n3);
    }

    public List getValuesOrBuilderList() {
        return this.values_;
    }
}

