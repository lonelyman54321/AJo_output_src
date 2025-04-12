/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface HttpBodyOrBuilder
extends MessageLiteOrBuilder {
    public String getContentType();

    public ByteString getContentTypeBytes();

    public ByteString getData();

    public Any getExtensions(int var1);

    public int getExtensionsCount();

    public List getExtensionsList();
}

