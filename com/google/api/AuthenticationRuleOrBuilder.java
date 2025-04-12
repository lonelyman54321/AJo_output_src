/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.AuthRequirement;
import com.google.api.OAuthRequirements;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface AuthenticationRuleOrBuilder
extends MessageLiteOrBuilder {
    public boolean getAllowWithoutCredential();

    public OAuthRequirements getOauth();

    public AuthRequirement getRequirements(int var1);

    public int getRequirementsCount();

    public List getRequirementsList();

    public String getSelector();

    public ByteString getSelectorBytes();

    public boolean hasOauth();
}

