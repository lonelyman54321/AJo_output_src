/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$OneofOptions;
import com.google.protobuf.MessageLiteOrBuilder;

public interface DescriptorProtos$OneofDescriptorProtoOrBuilder
extends MessageLiteOrBuilder {
    public String getName();

    public ByteString getNameBytes();

    public DescriptorProtos.OneofOptions getOptions();

    public boolean hasName();

    public boolean hasOptions();
}

