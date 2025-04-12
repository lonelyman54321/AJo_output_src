/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.Map;

public interface AttributeContext$ResponseOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsHeaders(String var1);

    public long getCode();

    public Map getHeaders();

    public int getHeadersCount();

    public Map getHeadersMap();

    public String getHeadersOrDefault(String var1, String var2);

    public String getHeadersOrThrow(String var1);

    public long getSize();

    public Timestamp getTime();

    public boolean hasTime();
}

