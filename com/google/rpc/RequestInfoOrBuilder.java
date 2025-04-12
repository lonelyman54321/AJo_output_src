/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface RequestInfoOrBuilder
extends MessageLiteOrBuilder {
    public String getRequestId();

    public ByteString getRequestIdBytes();

    public String getServingData();

    public ByteString getServingDataBytes();
}

