/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Context;
import com.google.api.Context$1;
import com.google.api.ContextOrBuilder;
import com.google.api.ContextRule;
import com.google.api.ContextRule$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Context$Builder
extends GeneratedMessageLite$Builder
implements ContextOrBuilder {
    private Context$Builder() {
        Context context = Context.access$000();
        super(context);
    }

    public /* synthetic */ Context$Builder(Context$1 context$1) {
        this();
    }

    public Context$Builder addAllRules(Iterable iterable) {
        this.copyOnWrite();
        Context.access$400((Context)this.instance, iterable);
        return this;
    }

    public Context$Builder addRules(int n3, ContextRule$Builder contextRuleOrBuilder) {
        this.copyOnWrite();
        Context context = (Context)this.instance;
        contextRuleOrBuilder = (ContextRule)contextRuleOrBuilder.build();
        Context.access$300(context, n3, (ContextRule)contextRuleOrBuilder);
        return this;
    }

    public Context$Builder addRules(int n3, ContextRule contextRule) {
        this.copyOnWrite();
        Context.access$300((Context)this.instance, n3, contextRule);
        return this;
    }

    public Context$Builder addRules(ContextRule$Builder contextRuleOrBuilder) {
        this.copyOnWrite();
        Context context = (Context)this.instance;
        contextRuleOrBuilder = (ContextRule)contextRuleOrBuilder.build();
        Context.access$200(context, (ContextRule)contextRuleOrBuilder);
        return this;
    }

    public Context$Builder addRules(ContextRule contextRule) {
        this.copyOnWrite();
        Context.access$200((Context)this.instance, contextRule);
        return this;
    }

    public Context$Builder clearRules() {
        this.copyOnWrite();
        Context.access$500((Context)this.instance);
        return this;
    }

    public ContextRule getRules(int n3) {
        return ((Context)this.instance).getRules(n3);
    }

    public int getRulesCount() {
        return ((Context)this.instance).getRulesCount();
    }

    public List getRulesList() {
        return Collections.unmodifiableList(((Context)this.instance).getRulesList());
    }

    public Context$Builder removeRules(int n3) {
        this.copyOnWrite();
        Context.access$600((Context)this.instance, n3);
        return this;
    }

    public Context$Builder setRules(int n3, ContextRule$Builder contextRuleOrBuilder) {
        this.copyOnWrite();
        Context context = (Context)this.instance;
        contextRuleOrBuilder = (ContextRule)contextRuleOrBuilder.build();
        Context.access$100(context, n3, (ContextRule)contextRuleOrBuilder);
        return this;
    }

    public Context$Builder setRules(int n3, ContextRule contextRule) {
        this.copyOnWrite();
        Context.access$100((Context)this.instance, n3, contextRule);
        return this;
    }
}

