/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Backend;
import com.google.api.Backend$1;
import com.google.api.BackendOrBuilder;
import com.google.api.BackendRule;
import com.google.api.BackendRule$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Backend$Builder
extends GeneratedMessageLite$Builder
implements BackendOrBuilder {
    private Backend$Builder() {
        Backend backend = Backend.access$000();
        super(backend);
    }

    public /* synthetic */ Backend$Builder(Backend$1 backend$1) {
        this();
    }

    public Backend$Builder addAllRules(Iterable iterable) {
        this.copyOnWrite();
        Backend.access$400((Backend)this.instance, iterable);
        return this;
    }

    public Backend$Builder addRules(int n3, BackendRule$Builder backendRuleOrBuilder) {
        this.copyOnWrite();
        Backend backend = (Backend)this.instance;
        backendRuleOrBuilder = (BackendRule)backendRuleOrBuilder.build();
        Backend.access$300(backend, n3, (BackendRule)backendRuleOrBuilder);
        return this;
    }

    public Backend$Builder addRules(int n3, BackendRule backendRule) {
        this.copyOnWrite();
        Backend.access$300((Backend)this.instance, n3, backendRule);
        return this;
    }

    public Backend$Builder addRules(BackendRule$Builder backendRuleOrBuilder) {
        this.copyOnWrite();
        Backend backend = (Backend)this.instance;
        backendRuleOrBuilder = (BackendRule)backendRuleOrBuilder.build();
        Backend.access$200(backend, (BackendRule)backendRuleOrBuilder);
        return this;
    }

    public Backend$Builder addRules(BackendRule backendRule) {
        this.copyOnWrite();
        Backend.access$200((Backend)this.instance, backendRule);
        return this;
    }

    public Backend$Builder clearRules() {
        this.copyOnWrite();
        Backend.access$500((Backend)this.instance);
        return this;
    }

    public BackendRule getRules(int n3) {
        return ((Backend)this.instance).getRules(n3);
    }

    public int getRulesCount() {
        return ((Backend)this.instance).getRulesCount();
    }

    public List getRulesList() {
        return Collections.unmodifiableList(((Backend)this.instance).getRulesList());
    }

    public Backend$Builder removeRules(int n3) {
        this.copyOnWrite();
        Backend.access$600((Backend)this.instance, n3);
        return this;
    }

    public Backend$Builder setRules(int n3, BackendRule$Builder backendRuleOrBuilder) {
        this.copyOnWrite();
        Backend backend = (Backend)this.instance;
        backendRuleOrBuilder = (BackendRule)backendRuleOrBuilder.build();
        Backend.access$100(backend, n3, (BackendRule)backendRuleOrBuilder);
        return this;
    }

    public Backend$Builder setRules(int n3, BackendRule backendRule) {
        this.copyOnWrite();
        Backend.access$100((Backend)this.instance, n3, backendRule);
        return this;
    }
}

