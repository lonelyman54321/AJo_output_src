/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface OperationInfoOrBuilder
extends MessageLiteOrBuilder {
    public String getMetadataType();

    public ByteString getMetadataTypeBytes();

    public String getResponseType();

    public ByteString getResponseTypeBytes();
}

