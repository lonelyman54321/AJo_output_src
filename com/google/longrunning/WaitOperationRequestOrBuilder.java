/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;

public interface WaitOperationRequestOrBuilder
extends MessageLiteOrBuilder {
    public String getName();

    public ByteString getNameBytes();

    public Duration getTimeout();

    public boolean hasTimeout();
}

