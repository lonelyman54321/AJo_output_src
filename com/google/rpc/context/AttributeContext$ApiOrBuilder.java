/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface AttributeContext$ApiOrBuilder
extends MessageLiteOrBuilder {
    public String getOperation();

    public ByteString getOperationBytes();

    public String getProtocol();

    public ByteString getProtocolBytes();

    public String getService();

    public ByteString getServiceBytes();

    public String getVersion();

    public ByteString getVersionBytes();
}

