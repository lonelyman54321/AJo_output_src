/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface OAuthRequirementsOrBuilder
extends MessageLiteOrBuilder {
    public String getCanonicalScopes();

    public ByteString getCanonicalScopesBytes();
}

