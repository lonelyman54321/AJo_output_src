/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.AuthRequirement;
import com.google.api.AuthRequirement$1;
import com.google.api.AuthRequirementOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class AuthRequirement$Builder
extends GeneratedMessageLite$Builder
implements AuthRequirementOrBuilder {
    private AuthRequirement$Builder() {
        AuthRequirement authRequirement = AuthRequirement.access$000();
        super(authRequirement);
    }

    public /* synthetic */ AuthRequirement$Builder(AuthRequirement$1 authRequirement$1) {
        this();
    }

    public AuthRequirement$Builder clearAudiences() {
        this.copyOnWrite();
        AuthRequirement.access$500((AuthRequirement)this.instance);
        return this;
    }

    public AuthRequirement$Builder clearProviderId() {
        this.copyOnWrite();
        AuthRequirement.access$200((AuthRequirement)this.instance);
        return this;
    }

    public String getAudiences() {
        return ((AuthRequirement)this.instance).getAudiences();
    }

    public ByteString getAudiencesBytes() {
        return ((AuthRequirement)this.instance).getAudiencesBytes();
    }

    public String getProviderId() {
        return ((AuthRequirement)this.instance).getProviderId();
    }

    public ByteString getProviderIdBytes() {
        return ((AuthRequirement)this.instance).getProviderIdBytes();
    }

    public AuthRequirement$Builder setAudiences(String string2) {
        this.copyOnWrite();
        AuthRequirement.access$400((AuthRequirement)this.instance, string2);
        return this;
    }

    public AuthRequirement$Builder setAudiencesBytes(ByteString byteString) {
        this.copyOnWrite();
        AuthRequirement.access$600((AuthRequirement)this.instance, byteString);
        return this;
    }

    public AuthRequirement$Builder setProviderId(String string2) {
        this.copyOnWrite();
        AuthRequirement.access$100((AuthRequirement)this.instance, string2);
        return this;
    }

    public AuthRequirement$Builder setProviderIdBytes(ByteString byteString) {
        this.copyOnWrite();
        AuthRequirement.access$300((AuthRequirement)this.instance, byteString);
        return this;
    }
}

