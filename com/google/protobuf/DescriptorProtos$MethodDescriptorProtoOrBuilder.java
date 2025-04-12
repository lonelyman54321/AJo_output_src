/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.google.protobuf.MessageLiteOrBuilder;

public interface DescriptorProtos$MethodDescriptorProtoOrBuilder
extends MessageLiteOrBuilder {
    public boolean getClientStreaming();

    public String getInputType();

    public ByteString getInputTypeBytes();

    public String getName();

    public ByteString getNameBytes();

    public DescriptorProtos$MethodOptions getOptions();

    public String getOutputType();

    public ByteString getOutputTypeBytes();

    public boolean getServerStreaming();

    public boolean hasClientStreaming();

    public boolean hasInputType();

    public boolean hasName();

    public boolean hasOptions();

    public boolean hasOutputType();

    public boolean hasServerStreaming();
}

