/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

public interface ErrorInfoOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsMetadata(String var1);

    public String getDomain();

    public ByteString getDomainBytes();

    public Map getMetadata();

    public int getMetadataCount();

    public Map getMetadataMap();

    public String getMetadataOrDefault(String var1, String var2);

    public String getMetadataOrThrow(String var1);

    public String getReason();

    public ByteString getReasonBytes();
}

