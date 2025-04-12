/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;

public interface RetryInfoOrBuilder
extends MessageLiteOrBuilder {
    public Duration getRetryDelay();

    public boolean hasRetryDelay();
}

