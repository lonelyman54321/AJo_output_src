/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.ListValue;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.NullValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Value$KindCase;

public interface ValueOrBuilder
extends MessageLiteOrBuilder {
    public boolean getBoolValue();

    public Value$KindCase getKindCase();

    public ListValue getListValue();

    public NullValue getNullValue();

    public int getNullValueValue();

    public double getNumberValue();

    public String getStringValue();

    public ByteString getStringValueBytes();

    public Struct getStructValue();

    public boolean hasBoolValue();

    public boolean hasListValue();

    public boolean hasNullValue();

    public boolean hasNumberValue();

    public boolean hasStringValue();

    public boolean hasStructValue();
}

