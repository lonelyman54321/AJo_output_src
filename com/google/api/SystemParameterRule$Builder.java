/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.SystemParameter;
import com.google.api.SystemParameter$Builder;
import com.google.api.SystemParameterRule;
import com.google.api.SystemParameterRule$1;
import com.google.api.SystemParameterRuleOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class SystemParameterRule$Builder
extends GeneratedMessageLite$Builder
implements SystemParameterRuleOrBuilder {
    private SystemParameterRule$Builder() {
        SystemParameterRule systemParameterRule = SystemParameterRule.access$000();
        super(systemParameterRule);
    }

    public /* synthetic */ SystemParameterRule$Builder(SystemParameterRule$1 systemParameterRule$1) {
        this();
    }

    public SystemParameterRule$Builder addAllParameters(Iterable iterable) {
        this.copyOnWrite();
        SystemParameterRule.access$700((SystemParameterRule)this.instance, iterable);
        return this;
    }

    public SystemParameterRule$Builder addParameters(int n3, SystemParameter$Builder systemParameterOrBuilder) {
        this.copyOnWrite();
        SystemParameterRule systemParameterRule = (SystemParameterRule)this.instance;
        systemParameterOrBuilder = (SystemParameter)systemParameterOrBuilder.build();
        SystemParameterRule.access$600(systemParameterRule, n3, (SystemParameter)systemParameterOrBuilder);
        return this;
    }

    public SystemParameterRule$Builder addParameters(int n3, SystemParameter systemParameter) {
        this.copyOnWrite();
        SystemParameterRule.access$600((SystemParameterRule)this.instance, n3, systemParameter);
        return this;
    }

    public SystemParameterRule$Builder addParameters(SystemParameter$Builder systemParameterOrBuilder) {
        this.copyOnWrite();
        SystemParameterRule systemParameterRule = (SystemParameterRule)this.instance;
        systemParameterOrBuilder = (SystemParameter)systemParameterOrBuilder.build();
        SystemParameterRule.access$500(systemParameterRule, (SystemParameter)systemParameterOrBuilder);
        return this;
    }

    public SystemParameterRule$Builder addParameters(SystemParameter systemParameter) {
        this.copyOnWrite();
        SystemParameterRule.access$500((SystemParameterRule)this.instance, systemParameter);
        return this;
    }

    public SystemParameterRule$Builder clearParameters() {
        this.copyOnWrite();
        SystemParameterRule.access$800((SystemParameterRule)this.instance);
        return this;
    }

    public SystemParameterRule$Builder clearSelector() {
        this.copyOnWrite();
        SystemParameterRule.access$200((SystemParameterRule)this.instance);
        return this;
    }

    public SystemParameter getParameters(int n3) {
        return ((SystemParameterRule)this.instance).getParameters(n3);
    }

    public int getParametersCount() {
        return ((SystemParameterRule)this.instance).getParametersCount();
    }

    public List getParametersList() {
        return Collections.unmodifiableList(((SystemParameterRule)this.instance).getParametersList());
    }

    public String getSelector() {
        return ((SystemParameterRule)this.instance).getSelector();
    }

    public ByteString getSelectorBytes() {
        return ((SystemParameterRule)this.instance).getSelectorBytes();
    }

    public SystemParameterRule$Builder removeParameters(int n3) {
        this.copyOnWrite();
        SystemParameterRule.access$900((SystemParameterRule)this.instance, n3);
        return this;
    }

    public SystemParameterRule$Builder setParameters(int n3, SystemParameter$Builder systemParameterOrBuilder) {
        this.copyOnWrite();
        SystemParameterRule systemParameterRule = (SystemParameterRule)this.instance;
        systemParameterOrBuilder = (SystemParameter)systemParameterOrBuilder.build();
        SystemParameterRule.access$400(systemParameterRule, n3, (SystemParameter)systemParameterOrBuilder);
        return this;
    }

    public SystemParameterRule$Builder setParameters(int n3, SystemParameter systemParameter) {
        this.copyOnWrite();
        SystemParameterRule.access$400((SystemParameterRule)this.instance, n3, systemParameter);
        return this;
    }

    public SystemParameterRule$Builder setSelector(String string2) {
        this.copyOnWrite();
        SystemParameterRule.access$100((SystemParameterRule)this.instance, string2);
        return this;
    }

    public SystemParameterRule$Builder setSelectorBytes(ByteString byteString) {
        this.copyOnWrite();
        SystemParameterRule.access$300((SystemParameterRule)this.instance, byteString);
        return this;
    }
}

