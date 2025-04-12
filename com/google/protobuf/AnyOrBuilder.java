/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface AnyOrBuilder
extends MessageLiteOrBuilder {
    public String getTypeUrl();

    public ByteString getTypeUrlBytes();

    public ByteString getValue();
}

