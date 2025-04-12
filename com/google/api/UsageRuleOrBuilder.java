/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface UsageRuleOrBuilder
extends MessageLiteOrBuilder {
    public boolean getAllowUnregisteredCalls();

    public String getSelector();

    public ByteString getSelectorBytes();

    public boolean getSkipServiceControl();
}

