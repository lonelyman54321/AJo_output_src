/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.JwtLocation$InCase;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface JwtLocationOrBuilder
extends MessageLiteOrBuilder {
    public String getHeader();

    public ByteString getHeaderBytes();

    public JwtLocation$InCase getInCase();

    public String getQuery();

    public ByteString getQueryBytes();

    public String getValuePrefix();

    public ByteString getValuePrefixBytes();
}

