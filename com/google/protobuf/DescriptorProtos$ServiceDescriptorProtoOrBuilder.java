/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$MethodDescriptorProto;
import com.google.protobuf.DescriptorProtos$ServiceOptions;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DescriptorProtos$ServiceDescriptorProtoOrBuilder
extends MessageLiteOrBuilder {
    public DescriptorProtos.MethodDescriptorProto getMethod(int var1);

    public int getMethodCount();

    public List getMethodList();

    public String getName();

    public ByteString getNameBytes();

    public DescriptorProtos$ServiceOptions getOptions();

    public boolean hasName();

    public boolean hasOptions();
}

