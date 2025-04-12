/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.ListValue;
import com.google.protobuf.ListValue$Builder;
import com.google.protobuf.NullValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Struct$Builder;
import com.google.protobuf.Value;
import com.google.protobuf.Value$1;
import com.google.protobuf.Value$KindCase;
import com.google.protobuf.ValueOrBuilder;

public final class Value$Builder
extends GeneratedMessageLite$Builder
implements ValueOrBuilder {
    private Value$Builder() {
        Value value = Value.access$000();
        super(value);
    }

    public /* synthetic */ Value$Builder(Value$1 value$1) {
        this();
    }

    public Value$Builder clearBoolValue() {
        this.copyOnWrite();
        Value.access$1100((Value)this.instance);
        return this;
    }

    public Value$Builder clearKind() {
        this.copyOnWrite();
        Value.access$100((Value)this.instance);
        return this;
    }

    public Value$Builder clearListValue() {
        this.copyOnWrite();
        Value.access$1700((Value)this.instance);
        return this;
    }

    public Value$Builder clearNullValue() {
        this.copyOnWrite();
        Value.access$400((Value)this.instance);
        return this;
    }

    public Value$Builder clearNumberValue() {
        this.copyOnWrite();
        Value.access$600((Value)this.instance);
        return this;
    }

    public Value$Builder clearStringValue() {
        this.copyOnWrite();
        Value.access$800((Value)this.instance);
        return this;
    }

    public Value$Builder clearStructValue() {
        this.copyOnWrite();
        Value.access$1400((Value)this.instance);
        return this;
    }

    public boolean getBoolValue() {
        return ((Value)this.instance).getBoolValue();
    }

    public Value$KindCase getKindCase() {
        return ((Value)this.instance).getKindCase();
    }

    public ListValue getListValue() {
        return ((Value)this.instance).getListValue();
    }

    public NullValue getNullValue() {
        return ((Value)this.instance).getNullValue();
    }

    public int getNullValueValue() {
        return ((Value)this.instance).getNullValueValue();
    }

    public double getNumberValue() {
        return ((Value)this.instance).getNumberValue();
    }

    public String getStringValue() {
        return ((Value)this.instance).getStringValue();
    }

    public ByteString getStringValueBytes() {
        return ((Value)this.instance).getStringValueBytes();
    }

    public Struct getStructValue() {
        return ((Value)this.instance).getStructValue();
    }

    public boolean hasBoolValue() {
        return ((Value)this.instance).hasBoolValue();
    }

    public boolean hasListValue() {
        return ((Value)this.instance).hasListValue();
    }

    public boolean hasNullValue() {
        return ((Value)this.instance).hasNullValue();
    }

    public boolean hasNumberValue() {
        return ((Value)this.instance).hasNumberValue();
    }

    public boolean hasStringValue() {
        return ((Value)this.instance).hasStringValue();
    }

    public boolean hasStructValue() {
        return ((Value)this.instance).hasStructValue();
    }

    public Value$Builder mergeListValue(ListValue listValue) {
        this.copyOnWrite();
        Value.access$1600((Value)this.instance, listValue);
        return this;
    }

    public Value$Builder mergeStructValue(Struct struct) {
        this.copyOnWrite();
        Value.access$1300((Value)this.instance, struct);
        return this;
    }

    public Value$Builder setBoolValue(boolean bl2) {
        this.copyOnWrite();
        Value.access$1000((Value)this.instance, bl2);
        return this;
    }

    public Value$Builder setListValue(ListValue$Builder listValueOrBuilder) {
        this.copyOnWrite();
        Value value = (Value)this.instance;
        listValueOrBuilder = (ListValue)listValueOrBuilder.build();
        Value.access$1500(value, (ListValue)listValueOrBuilder);
        return this;
    }

    public Value$Builder setListValue(ListValue listValue) {
        this.copyOnWrite();
        Value.access$1500((Value)this.instance, listValue);
        return this;
    }

    public Value$Builder setNullValue(NullValue nullValue) {
        this.copyOnWrite();
        Value.access$300((Value)this.instance, nullValue);
        return this;
    }

    public Value$Builder setNullValueValue(int n3) {
        this.copyOnWrite();
        Value.access$200((Value)this.instance, n3);
        return this;
    }

    public Value$Builder setNumberValue(double d2) {
        this.copyOnWrite();
        Value.access$500((Value)this.instance, d2);
        return this;
    }

    public Value$Builder setStringValue(String string2) {
        this.copyOnWrite();
        Value.access$700((Value)this.instance, string2);
        return this;
    }

    public Value$Builder setStringValueBytes(ByteString byteString) {
        this.copyOnWrite();
        Value.access$900((Value)this.instance, byteString);
        return this;
    }

    public Value$Builder setStructValue(Struct$Builder structOrBuilder) {
        this.copyOnWrite();
        Value value = (Value)this.instance;
        structOrBuilder = (Struct)structOrBuilder.build();
        Value.access$1200(value, (Struct)structOrBuilder);
        return this;
    }

    public Value$Builder setStructValue(Struct struct) {
        this.copyOnWrite();
        Value.access$1200((Value)this.instance, struct);
        return this;
    }
}

