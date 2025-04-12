/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.AuthRequirement;
import com.google.api.AuthRequirement$Builder;
import com.google.api.AuthenticationRule;
import com.google.api.AuthenticationRule$1;
import com.google.api.AuthenticationRuleOrBuilder;
import com.google.api.OAuthRequirements;
import com.google.api.OAuthRequirements$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class AuthenticationRule$Builder
extends GeneratedMessageLite$Builder
implements AuthenticationRuleOrBuilder {
    private AuthenticationRule$Builder() {
        AuthenticationRule authenticationRule = AuthenticationRule.access$000();
        super(authenticationRule);
    }

    public /* synthetic */ AuthenticationRule$Builder(AuthenticationRule$1 authenticationRule$1) {
        this();
    }

    public AuthenticationRule$Builder addAllRequirements(Iterable iterable) {
        this.copyOnWrite();
        AuthenticationRule.access$1200((AuthenticationRule)this.instance, iterable);
        return this;
    }

    public AuthenticationRule$Builder addRequirements(int n3, AuthRequirement$Builder authRequirementOrBuilder) {
        this.copyOnWrite();
        AuthenticationRule authenticationRule = (AuthenticationRule)this.instance;
        authRequirementOrBuilder = (AuthRequirement)authRequirementOrBuilder.build();
        AuthenticationRule.access$1100(authenticationRule, n3, (AuthRequirement)authRequirementOrBuilder);
        return this;
    }

    public AuthenticationRule$Builder addRequirements(int n3, AuthRequirement authRequirement) {
        this.copyOnWrite();
        AuthenticationRule.access$1100((AuthenticationRule)this.instance, n3, authRequirement);
        return this;
    }

    public AuthenticationRule$Builder addRequirements(AuthRequirement$Builder authRequirementOrBuilder) {
        this.copyOnWrite();
        AuthenticationRule authenticationRule = (AuthenticationRule)this.instance;
        authRequirementOrBuilder = (AuthRequirement)authRequirementOrBuilder.build();
        AuthenticationRule.access$1000(authenticationRule, (AuthRequirement)authRequirementOrBuilder);
        return this;
    }

    public AuthenticationRule$Builder addRequirements(AuthRequirement authRequirement) {
        this.copyOnWrite();
        AuthenticationRule.access$1000((AuthenticationRule)this.instance, authRequirement);
        return this;
    }

    public AuthenticationRule$Builder clearAllowWithoutCredential() {
        this.copyOnWrite();
        AuthenticationRule.access$800((AuthenticationRule)this.instance);
        return this;
    }

    public AuthenticationRule$Builder clearOauth() {
        this.copyOnWrite();
        AuthenticationRule.access$600((AuthenticationRule)this.instance);
        return this;
    }

    public AuthenticationRule$Builder clearRequirements() {
        this.copyOnWrite();
        AuthenticationRule.access$1300((AuthenticationRule)this.instance);
        return this;
    }

    public AuthenticationRule$Builder clearSelector() {
        this.copyOnWrite();
        AuthenticationRule.access$200((AuthenticationRule)this.instance);
        return this;
    }

    public boolean getAllowWithoutCredential() {
        return ((AuthenticationRule)this.instance).getAllowWithoutCredential();
    }

    public OAuthRequirements getOauth() {
        return ((AuthenticationRule)this.instance).getOauth();
    }

    public AuthRequirement getRequirements(int n3) {
        return ((AuthenticationRule)this.instance).getRequirements(n3);
    }

    public int getRequirementsCount() {
        return ((AuthenticationRule)this.instance).getRequirementsCount();
    }

    public List getRequirementsList() {
        return Collections.unmodifiableList(((AuthenticationRule)this.instance).getRequirementsList());
    }

    public String getSelector() {
        return ((AuthenticationRule)this.instance).getSelector();
    }

    public ByteString getSelectorBytes() {
        return ((AuthenticationRule)this.instance).getSelectorBytes();
    }

    public boolean hasOauth() {
        return ((AuthenticationRule)this.instance).hasOauth();
    }

    public AuthenticationRule$Builder mergeOauth(OAuthRequirements oAuthRequirements) {
        this.copyOnWrite();
        AuthenticationRule.access$500((AuthenticationRule)this.instance, oAuthRequirements);
        return this;
    }

    public AuthenticationRule$Builder removeRequirements(int n3) {
        this.copyOnWrite();
        AuthenticationRule.access$1400((AuthenticationRule)this.instance, n3);
        return this;
    }

    public AuthenticationRule$Builder setAllowWithoutCredential(boolean bl2) {
        this.copyOnWrite();
        AuthenticationRule.access$700((AuthenticationRule)this.instance, bl2);
        return this;
    }

    public AuthenticationRule$Builder setOauth(OAuthRequirements$Builder oAuthRequirementsOrBuilder) {
        this.copyOnWrite();
        AuthenticationRule authenticationRule = (AuthenticationRule)this.instance;
        oAuthRequirementsOrBuilder = (OAuthRequirements)oAuthRequirementsOrBuilder.build();
        AuthenticationRule.access$400(authenticationRule, (OAuthRequirements)oAuthRequirementsOrBuilder);
        return this;
    }

    public AuthenticationRule$Builder setOauth(OAuthRequirements oAuthRequirements) {
        this.copyOnWrite();
        AuthenticationRule.access$400((AuthenticationRule)this.instance, oAuthRequirements);
        return this;
    }

    public AuthenticationRule$Builder setRequirements(int n3, AuthRequirement$Builder authRequirementOrBuilder) {
        this.copyOnWrite();
        AuthenticationRule authenticationRule = (AuthenticationRule)this.instance;
        authRequirementOrBuilder = (AuthRequirement)authRequirementOrBuilder.build();
        AuthenticationRule.access$900(authenticationRule, n3, (AuthRequirement)authRequirementOrBuilder);
        return this;
    }

    public AuthenticationRule$Builder setRequirements(int n3, AuthRequirement authRequirement) {
        this.copyOnWrite();
        AuthenticationRule.access$900((AuthenticationRule)this.instance, n3, authRequirement);
        return this;
    }

    public AuthenticationRule$Builder setSelector(String string2) {
        this.copyOnWrite();
        AuthenticationRule.access$100((AuthenticationRule)this.instance, string2);
        return this;
    }

    public AuthenticationRule$Builder setSelectorBytes(ByteString byteString) {
        this.copyOnWrite();
        AuthenticationRule.access$300((AuthenticationRule)this.instance, byteString);
        return this;
    }
}

