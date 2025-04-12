/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$EnumValueOptions;
import com.google.protobuf.MessageLiteOrBuilder;

public interface DescriptorProtos$EnumValueDescriptorProtoOrBuilder
extends MessageLiteOrBuilder {
    public String getName();

    public ByteString getNameBytes();

    public int getNumber();

    public DescriptorProtos.EnumValueOptions getOptions();

    public boolean hasName();

    public boolean hasNumber();

    public boolean hasOptions();
}

