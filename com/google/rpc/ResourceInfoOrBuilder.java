/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ResourceInfoOrBuilder
extends MessageLiteOrBuilder {
    public String getDescription();

    public ByteString getDescriptionBytes();

    public String getOwner();

    public ByteString getOwnerBytes();

    public String getResourceName();

    public ByteString getResourceNameBytes();

    public String getResourceType();

    public ByteString getResourceTypeBytes();
}

