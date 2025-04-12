/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface CustomHttpPatternOrBuilder
extends MessageLiteOrBuilder {
    public String getKind();

    public ByteString getKindBytes();

    public String getPath();

    public ByteString getPathBytes();
}

