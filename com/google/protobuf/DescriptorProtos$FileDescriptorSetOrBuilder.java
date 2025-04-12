/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DescriptorProtos$FileDescriptorSetOrBuilder
extends MessageLiteOrBuilder {
    public DescriptorProtos.FileDescriptorProto getFile(int var1);

    public int getFileCount();

    public List getFileList();
}

