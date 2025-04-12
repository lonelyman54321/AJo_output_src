/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface MoneyOrBuilder
extends MessageLiteOrBuilder {
    public String getCurrencyCode();

    public ByteString getCurrencyCodeBytes();

    public int getNanos();

    public long getUnits();
}

