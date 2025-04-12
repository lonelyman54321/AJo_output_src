/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface SourceInfoOrBuilder
extends MessageLiteOrBuilder {
    public Any getSourceFiles(int var1);

    public int getSourceFilesCount();

    public List getSourceFilesList();
}

