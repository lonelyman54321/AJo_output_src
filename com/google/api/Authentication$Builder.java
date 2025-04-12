/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.AuthProvider;
import com.google.api.AuthProvider$Builder;
import com.google.api.Authentication;
import com.google.api.Authentication$1;
import com.google.api.AuthenticationOrBuilder;
import com.google.api.AuthenticationRule;
import com.google.api.AuthenticationRule$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Authentication$Builder
extends GeneratedMessageLite$Builder
implements AuthenticationOrBuilder {
    private Authentication$Builder() {
        Authentication authentication = Authentication.access$000();
        super(authentication);
    }

    public /* synthetic */ Authentication$Builder(Authentication$1 authentication$1) {
        this();
    }

    public Authentication$Builder addAllProviders(Iterable iterable) {
        this.copyOnWrite();
        Authentication.access$1000((Authentication)this.instance, iterable);
        return this;
    }

    public Authentication$Builder addAllRules(Iterable iterable) {
        this.copyOnWrite();
        Authentication.access$400((Authentication)this.instance, iterable);
        return this;
    }

    public Authentication$Builder addProviders(int n3, AuthProvider$Builder authProviderOrBuilder) {
        this.copyOnWrite();
        Authentication authentication = (Authentication)this.instance;
        authProviderOrBuilder = (AuthProvider)authProviderOrBuilder.build();
        Authentication.access$900(authentication, n3, (AuthProvider)authProviderOrBuilder);
        return this;
    }

    public Authentication$Builder addProviders(int n3, AuthProvider authProvider) {
        this.copyOnWrite();
        Authentication.access$900((Authentication)this.instance, n3, authProvider);
        return this;
    }

    public Authentication$Builder addProviders(AuthProvider$Builder authProviderOrBuilder) {
        this.copyOnWrite();
        Authentication authentication = (Authentication)this.instance;
        authProviderOrBuilder = (AuthProvider)authProviderOrBuilder.build();
        Authentication.access$800(authentication, (AuthProvider)authProviderOrBuilder);
        return this;
    }

    public Authentication$Builder addProviders(AuthProvider authProvider) {
        this.copyOnWrite();
        Authentication.access$800((Authentication)this.instance, authProvider);
        return this;
    }

    public Authentication$Builder addRules(int n3, AuthenticationRule$Builder authenticationRuleOrBuilder) {
        this.copyOnWrite();
        Authentication authentication = (Authentication)this.instance;
        authenticationRuleOrBuilder = (AuthenticationRule)authenticationRuleOrBuilder.build();
        Authentication.access$300(authentication, n3, (AuthenticationRule)authenticationRuleOrBuilder);
        return this;
    }

    public Authentication$Builder addRules(int n3, AuthenticationRule authenticationRule) {
        this.copyOnWrite();
        Authentication.access$300((Authentication)this.instance, n3, authenticationRule);
        return this;
    }

    public Authentication$Builder addRules(AuthenticationRule$Builder authenticationRuleOrBuilder) {
        this.copyOnWrite();
        Authentication authentication = (Authentication)this.instance;
        authenticationRuleOrBuilder = (AuthenticationRule)authenticationRuleOrBuilder.build();
        Authentication.access$200(authentication, (AuthenticationRule)authenticationRuleOrBuilder);
        return this;
    }

    public Authentication$Builder addRules(AuthenticationRule authenticationRule) {
        this.copyOnWrite();
        Authentication.access$200((Authentication)this.instance, authenticationRule);
        return this;
    }

    public Authentication$Builder clearProviders() {
        this.copyOnWrite();
        Authentication.access$1100((Authentication)this.instance);
        return this;
    }

    public Authentication$Builder clearRules() {
        this.copyOnWrite();
        Authentication.access$500((Authentication)this.instance);
        return this;
    }

    public AuthProvider getProviders(int n3) {
        return ((Authentication)this.instance).getProviders(n3);
    }

    public int getProvidersCount() {
        return ((Authentication)this.instance).getProvidersCount();
    }

    public List getProvidersList() {
        return Collections.unmodifiableList(((Authentication)this.instance).getProvidersList());
    }

    public AuthenticationRule getRules(int n3) {
        return ((Authentication)this.instance).getRules(n3);
    }

    public int getRulesCount() {
        return ((Authentication)this.instance).getRulesCount();
    }

    public List getRulesList() {
        return Collections.unmodifiableList(((Authentication)this.instance).getRulesList());
    }

    public Authentication$Builder removeProviders(int n3) {
        this.copyOnWrite();
        Authentication.access$1200((Authentication)this.instance, n3);
        return this;
    }

    public Authentication$Builder removeRules(int n3) {
        this.copyOnWrite();
        Authentication.access$600((Authentication)this.instance, n3);
        return this;
    }

    public Authentication$Builder setProviders(int n3, AuthProvider$Builder authProviderOrBuilder) {
        this.copyOnWrite();
        Authentication authentication = (Authentication)this.instance;
        authProviderOrBuilder = (AuthProvider)authProviderOrBuilder.build();
        Authentication.access$700(authentication, n3, (AuthProvider)authProviderOrBuilder);
        return this;
    }

    public Authentication$Builder setProviders(int n3, AuthProvider authProvider) {
        this.copyOnWrite();
        Authentication.access$700((Authentication)this.instance, n3, authProvider);
        return this;
    }

    public Authentication$Builder setRules(int n3, AuthenticationRule$Builder authenticationRuleOrBuilder) {
        this.copyOnWrite();
        Authentication authentication = (Authentication)this.instance;
        authenticationRuleOrBuilder = (AuthenticationRule)authenticationRuleOrBuilder.build();
        Authentication.access$100(authentication, n3, (AuthenticationRule)authenticationRuleOrBuilder);
        return this;
    }

    public Authentication$Builder setRules(int n3, AuthenticationRule authenticationRule) {
        this.copyOnWrite();
        Authentication.access$100((Authentication)this.instance, n3, authenticationRule);
        return this;
    }
}

