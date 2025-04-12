/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.OAuthRequirements;
import com.google.api.OAuthRequirements$1;
import com.google.api.OAuthRequirementsOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class OAuthRequirements$Builder
extends GeneratedMessageLite$Builder
implements OAuthRequirementsOrBuilder {
    private OAuthRequirements$Builder() {
        OAuthRequirements oAuthRequirements = OAuthRequirements.access$000();
        super(oAuthRequirements);
    }

    public /* synthetic */ OAuthRequirements$Builder(OAuthRequirements$1 oAuthRequirements$1) {
        this();
    }

    public OAuthRequirements$Builder clearCanonicalScopes() {
        this.copyOnWrite();
        OAuthRequirements.access$200((OAuthRequirements)this.instance);
        return this;
    }

    public String getCanonicalScopes() {
        return ((OAuthRequirements)this.instance).getCanonicalScopes();
    }

    public ByteString getCanonicalScopesBytes() {
        return ((OAuthRequirements)this.instance).getCanonicalScopesBytes();
    }

    public OAuthRequirements$Builder setCanonicalScopes(String string2) {
        this.copyOnWrite();
        OAuthRequirements.access$100((OAuthRequirements)this.instance, string2);
        return this;
    }

    public OAuthRequirements$Builder setCanonicalScopesBytes(ByteString byteString) {
        this.copyOnWrite();
        OAuthRequirements.access$300((OAuthRequirements)this.instance, byteString);
        return this;
    }
}

