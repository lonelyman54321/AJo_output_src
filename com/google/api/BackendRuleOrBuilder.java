/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.BackendRule$AuthenticationCase;
import com.google.api.BackendRule$PathTranslation;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface BackendRuleOrBuilder
extends MessageLiteOrBuilder {
    public String getAddress();

    public ByteString getAddressBytes();

    public BackendRule$AuthenticationCase getAuthenticationCase();

    public double getDeadline();

    public boolean getDisableAuth();

    public String getJwtAudience();

    public ByteString getJwtAudienceBytes();

    public double getMinDeadline();

    public double getOperationDeadline();

    public BackendRule$PathTranslation getPathTranslation();

    public int getPathTranslationValue();

    public String getProtocol();

    public ByteString getProtocolBytes();

    public String getSelector();

    public ByteString getSelectorBytes();
}

