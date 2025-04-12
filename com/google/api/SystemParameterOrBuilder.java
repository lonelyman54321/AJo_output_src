/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface SystemParameterOrBuilder
extends MessageLiteOrBuilder {
    public String getHttpHeader();

    public ByteString getHttpHeaderBytes();

    public String getName();

    public ByteString getNameBytes();

    public String getUrlQueryParameter();

    public ByteString getUrlQueryParameterBytes();
}

