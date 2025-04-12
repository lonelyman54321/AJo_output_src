/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface AuthRequirementOrBuilder
extends MessageLiteOrBuilder {
    public String getAudiences();

    public ByteString getAudiencesBytes();

    public String getProviderId();

    public ByteString getProviderIdBytes();
}

