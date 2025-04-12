/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface DocumentationRuleOrBuilder
extends MessageLiteOrBuilder {
    public String getDeprecationDescription();

    public ByteString getDeprecationDescriptionBytes();

    public String getDescription();

    public ByteString getDescriptionBytes();

    public String getSelector();

    public ByteString getSelectorBytes();
}

