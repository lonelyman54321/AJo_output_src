/*
 * Decompiled with CFR 0.152.
 */
package com.google.cloud.audit;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface RequestMetadataOrBuilder
extends MessageLiteOrBuilder {
    public String getCallerIp();

    public ByteString getCallerIpBytes();

    public String getCallerSuppliedUserAgent();

    public ByteString getCallerSuppliedUserAgentBytes();
}

