/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface BadRequest$FieldViolationOrBuilder
extends MessageLiteOrBuilder {
    public String getDescription();

    public ByteString getDescriptionBytes();

    public String getField();

    public ByteString getFieldBytes();
}

