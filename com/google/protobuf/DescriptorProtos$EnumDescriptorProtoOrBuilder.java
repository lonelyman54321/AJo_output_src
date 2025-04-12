/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRange;
import com.google.protobuf.DescriptorProtos$EnumOptions;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DescriptorProtos$EnumDescriptorProtoOrBuilder
extends MessageLiteOrBuilder {
    public String getName();

    public ByteString getNameBytes();

    public DescriptorProtos.EnumOptions getOptions();

    public String getReservedName(int var1);

    public ByteString getReservedNameBytes(int var1);

    public int getReservedNameCount();

    public List getReservedNameList();

    public DescriptorProtos$EnumDescriptorProto.EnumReservedRange getReservedRange(int var1);

    public int getReservedRangeCount();

    public List getReservedRangeList();

    public DescriptorProtos.EnumValueDescriptorProto getValue(int var1);

    public int getValueCount();

    public List getValueList();

    public boolean hasName();

    public boolean hasOptions();
}

