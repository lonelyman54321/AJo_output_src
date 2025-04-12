/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface TimeZoneOrBuilder
extends MessageLiteOrBuilder {
    public String getId();

    public ByteString getIdBytes();

    public String getVersion();

    public ByteString getVersionBytes();
}

