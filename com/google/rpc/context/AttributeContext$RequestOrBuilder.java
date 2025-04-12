/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.rpc.context.AttributeContext$Auth;
import java.util.Map;

public interface AttributeContext$RequestOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsHeaders(String var1);

    public AttributeContext.Auth getAuth();

    public Map getHeaders();

    public int getHeadersCount();

    public Map getHeadersMap();

    public String getHeadersOrDefault(String var1, String var2);

    public String getHeadersOrThrow(String var1);

    public String getHost();

    public ByteString getHostBytes();

    public String getId();

    public ByteString getIdBytes();

    public String getMethod();

    public ByteString getMethodBytes();

    public String getPath();

    public ByteString getPathBytes();

    public String getProtocol();

    public ByteString getProtocolBytes();

    public String getQuery();

    public ByteString getQueryBytes();

    public String getReason();

    public ByteString getReasonBytes();

    public String getScheme();

    public ByteString getSchemeBytes();

    public long getSize();

    public Timestamp getTime();

    public boolean hasAuth();

    public boolean hasTime();
}

