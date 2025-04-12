/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
extends MessageLiteOrBuilder {
    public int getBegin();

    public int getEnd();

    public int getPath(int var1);

    public int getPathCount();

    public List getPathList();

    public String getSourceFile();

    public ByteString getSourceFileBytes();

    public boolean hasBegin();

    public boolean hasEnd();

    public boolean hasSourceFile();
}

