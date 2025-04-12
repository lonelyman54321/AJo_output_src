/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$DescriptorProto;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$ServiceDescriptorProto;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DescriptorProtos$FileDescriptorProtoOrBuilder
extends MessageLiteOrBuilder {
    public String getDependency(int var1);

    public ByteString getDependencyBytes(int var1);

    public int getDependencyCount();

    public List getDependencyList();

    public DescriptorProtos$EnumDescriptorProto getEnumType(int var1);

    public int getEnumTypeCount();

    public List getEnumTypeList();

    public DescriptorProtos$FieldDescriptorProto getExtension(int var1);

    public int getExtensionCount();

    public List getExtensionList();

    public DescriptorProtos$DescriptorProto getMessageType(int var1);

    public int getMessageTypeCount();

    public List getMessageTypeList();

    public String getName();

    public ByteString getNameBytes();

    public DescriptorProtos$FileOptions getOptions();

    public String getPackage();

    public ByteString getPackageBytes();

    public int getPublicDependency(int var1);

    public int getPublicDependencyCount();

    public List getPublicDependencyList();

    public DescriptorProtos.ServiceDescriptorProto getService(int var1);

    public int getServiceCount();

    public List getServiceList();

    public DescriptorProtos.SourceCodeInfo getSourceCodeInfo();

    public String getSyntax();

    public ByteString getSyntaxBytes();

    public int getWeakDependency(int var1);

    public int getWeakDependencyCount();

    public List getWeakDependencyList();

    public boolean hasName();

    public boolean hasOptions();

    public boolean hasPackage();

    public boolean hasSourceCodeInfo();

    public boolean hasSyntax();
}

