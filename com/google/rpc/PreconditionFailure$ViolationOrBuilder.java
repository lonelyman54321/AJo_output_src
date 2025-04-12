/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface PreconditionFailure$ViolationOrBuilder
extends MessageLiteOrBuilder {
    public String getDescription();

    public ByteString getDescriptionBytes();

    public String getSubject();

    public ByteString getSubjectBytes();

    public String getType();

    public ByteString getTypeBytes();
}

