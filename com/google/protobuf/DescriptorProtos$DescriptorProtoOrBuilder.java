/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$DescriptorProto;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRange;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos$MessageOptions;
import com.google.protobuf.DescriptorProtos$OneofDescriptorProto;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DescriptorProtos$DescriptorProtoOrBuilder
extends MessageLiteOrBuilder {
    public DescriptorProtos.EnumDescriptorProto getEnumType(int var1);

    public int getEnumTypeCount();

    public List getEnumTypeList();

    public DescriptorProtos.FieldDescriptorProto getExtension(int var1);

    public int getExtensionCount();

    public List getExtensionList();

    public DescriptorProtos.DescriptorProto.ExtensionRange getExtensionRange(int var1);

    public int getExtensionRangeCount();

    public List getExtensionRangeList();

    public DescriptorProtos.FieldDescriptorProto getField(int var1);

    public int getFieldCount();

    public List getFieldList();

    public String getName();

    public ByteString getNameBytes();

    public DescriptorProtos.DescriptorProto getNestedType(int var1);

    public int getNestedTypeCount();

    public List getNestedTypeList();

    public DescriptorProtos.OneofDescriptorProto getOneofDecl(int var1);

    public int getOneofDeclCount();

    public List getOneofDeclList();

    public DescriptorProtos$MessageOptions getOptions();

    public String getReservedName(int var1);

    public ByteString getReservedNameBytes(int var1);

    public int getReservedNameCount();

    public List getReservedNameList();

    public DescriptorProtos.DescriptorProto.ReservedRange getReservedRange(int var1);

    public int getReservedRangeCount();

    public List getReservedRangeList();

    public boolean hasName();

    public boolean hasOptions();
}

