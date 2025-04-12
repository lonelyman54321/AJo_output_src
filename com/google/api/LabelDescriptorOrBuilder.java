/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor$ValueType;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface LabelDescriptorOrBuilder
extends MessageLiteOrBuilder {
    public String getDescription();

    public ByteString getDescriptionBytes();

    public String getKey();

    public ByteString getKeyBytes();

    public LabelDescriptor$ValueType getValueType();

    public int getValueTypeValue();
}

