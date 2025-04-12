/*
 * Decompiled with CFR 0.152.
 */
package com.google.cloud.audit;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface AuthenticationInfoOrBuilder
extends MessageLiteOrBuilder {
    public String getPrincipalEmail();

    public ByteString getPrincipalEmailBytes();
}

