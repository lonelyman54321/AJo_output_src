/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ResourceReferenceOrBuilder
extends MessageLiteOrBuilder {
    public String getChildType();

    public ByteString getChildTypeBytes();

    public String getType();

    public ByteString getTypeBytes();
}

