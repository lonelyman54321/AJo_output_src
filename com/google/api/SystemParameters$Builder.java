/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.SystemParameterRule;
import com.google.api.SystemParameterRule$Builder;
import com.google.api.SystemParameters;
import com.google.api.SystemParameters$1;
import com.google.api.SystemParametersOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class SystemParameters$Builder
extends GeneratedMessageLite$Builder
implements SystemParametersOrBuilder {
    private SystemParameters$Builder() {
        SystemParameters systemParameters = SystemParameters.access$000();
        super(systemParameters);
    }

    public /* synthetic */ SystemParameters$Builder(SystemParameters$1 systemParameters$1) {
        this();
    }

    public SystemParameters$Builder addAllRules(Iterable iterable) {
        this.copyOnWrite();
        SystemParameters.access$400((SystemParameters)this.instance, iterable);
        return this;
    }

    public SystemParameters$Builder addRules(int n3, SystemParameterRule$Builder systemParameterRuleOrBuilder) {
        this.copyOnWrite();
        SystemParameters systemParameters = (SystemParameters)this.instance;
        systemParameterRuleOrBuilder = (SystemParameterRule)systemParameterRuleOrBuilder.build();
        SystemParameters.access$300(systemParameters, n3, (SystemParameterRule)systemParameterRuleOrBuilder);
        return this;
    }

    public SystemParameters$Builder addRules(int n3, SystemParameterRule systemParameterRule) {
        this.copyOnWrite();
        SystemParameters.access$300((SystemParameters)this.instance, n3, systemParameterRule);
        return this;
    }

    public SystemParameters$Builder addRules(SystemParameterRule$Builder systemParameterRuleOrBuilder) {
        this.copyOnWrite();
        SystemParameters systemParameters = (SystemParameters)this.instance;
        systemParameterRuleOrBuilder = (SystemParameterRule)systemParameterRuleOrBuilder.build();
        SystemParameters.access$200(systemParameters, (SystemParameterRule)systemParameterRuleOrBuilder);
        return this;
    }

    public SystemParameters$Builder addRules(SystemParameterRule systemParameterRule) {
        this.copyOnWrite();
        SystemParameters.access$200((SystemParameters)this.instance, systemParameterRule);
        return this;
    }

    public SystemParameters$Builder clearRules() {
        this.copyOnWrite();
        SystemParameters.access$500((SystemParameters)this.instance);
        return this;
    }

    public SystemParameterRule getRules(int n3) {
        return ((SystemParameters)this.instance).getRules(n3);
    }

    public int getRulesCount() {
        return ((SystemParameters)this.instance).getRulesCount();
    }

    public List getRulesList() {
        return Collections.unmodifiableList(((SystemParameters)this.instance).getRulesList());
    }

    public SystemParameters$Builder removeRules(int n3) {
        this.copyOnWrite();
        SystemParameters.access$600((SystemParameters)this.instance, n3);
        return this;
    }

    public SystemParameters$Builder setRules(int n3, SystemParameterRule$Builder systemParameterRuleOrBuilder) {
        this.copyOnWrite();
        SystemParameters systemParameters = (SystemParameters)this.instance;
        systemParameterRuleOrBuilder = (SystemParameterRule)systemParameterRuleOrBuilder.build();
        SystemParameters.access$100(systemParameters, n3, (SystemParameterRule)systemParameterRuleOrBuilder);
        return this;
    }

    public SystemParameters$Builder setRules(int n3, SystemParameterRule systemParameterRule) {
        this.copyOnWrite();
        SystemParameters.access$100((SystemParameters)this.instance, n3, systemParameterRule);
        return this;
    }
}

