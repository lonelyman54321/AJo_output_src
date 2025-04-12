/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Property$PropertyType;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface PropertyOrBuilder
extends MessageLiteOrBuilder {
    public String getDescription();

    public ByteString getDescriptionBytes();

    public String getName();

    public ByteString getNameBytes();

    public Property$PropertyType getType();

    public int getTypeValue();
}

