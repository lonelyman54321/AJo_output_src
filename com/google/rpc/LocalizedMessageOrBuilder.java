/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface LocalizedMessageOrBuilder
extends MessageLiteOrBuilder {
    public String getLocale();

    public ByteString getLocaleBytes();

    public String getMessage();

    public ByteString getMessageBytes();
}

