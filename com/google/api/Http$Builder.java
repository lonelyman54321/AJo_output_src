/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Http;
import com.google.api.Http$1;
import com.google.api.HttpOrBuilder;
import com.google.api.HttpRule;
import com.google.api.HttpRule$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Http$Builder
extends GeneratedMessageLite$Builder
implements HttpOrBuilder {
    private Http$Builder() {
        Http http = Http.access$000();
        super(http);
    }

    public /* synthetic */ Http$Builder(Http$1 http$1) {
        this();
    }

    public Http$Builder addAllRules(Iterable iterable) {
        this.copyOnWrite();
        Http.access$400((Http)this.instance, iterable);
        return this;
    }

    public Http$Builder addRules(int n3, HttpRule$Builder httpRuleOrBuilder) {
        this.copyOnWrite();
        Http http = (Http)this.instance;
        httpRuleOrBuilder = (HttpRule)httpRuleOrBuilder.build();
        Http.access$300(http, n3, (HttpRule)httpRuleOrBuilder);
        return this;
    }

    public Http$Builder addRules(int n3, HttpRule httpRule) {
        this.copyOnWrite();
        Http.access$300((Http)this.instance, n3, httpRule);
        return this;
    }

    public Http$Builder addRules(HttpRule$Builder httpRuleOrBuilder) {
        this.copyOnWrite();
        Http http = (Http)this.instance;
        httpRuleOrBuilder = (HttpRule)httpRuleOrBuilder.build();
        Http.access$200(http, (HttpRule)httpRuleOrBuilder);
        return this;
    }

    public Http$Builder addRules(HttpRule httpRule) {
        this.copyOnWrite();
        Http.access$200((Http)this.instance, httpRule);
        return this;
    }

    public Http$Builder clearFullyDecodeReservedExpansion() {
        this.copyOnWrite();
        Http.access$800((Http)this.instance);
        return this;
    }

    public Http$Builder clearRules() {
        this.copyOnWrite();
        Http.access$500((Http)this.instance);
        return this;
    }

    public boolean getFullyDecodeReservedExpansion() {
        return ((Http)this.instance).getFullyDecodeReservedExpansion();
    }

    public HttpRule getRules(int n3) {
        return ((Http)this.instance).getRules(n3);
    }

    public int getRulesCount() {
        return ((Http)this.instance).getRulesCount();
    }

    public List getRulesList() {
        return Collections.unmodifiableList(((Http)this.instance).getRulesList());
    }

    public Http$Builder removeRules(int n3) {
        this.copyOnWrite();
        Http.access$600((Http)this.instance, n3);
        return this;
    }

    public Http$Builder setFullyDecodeReservedExpansion(boolean bl2) {
        this.copyOnWrite();
        Http.access$700((Http)this.instance, bl2);
        return this;
    }

    public Http$Builder setRules(int n3, HttpRule$Builder httpRuleOrBuilder) {
        this.copyOnWrite();
        Http http = (Http)this.instance;
        httpRuleOrBuilder = (HttpRule)httpRuleOrBuilder.build();
        Http.access$100(http, n3, (HttpRule)httpRuleOrBuilder);
        return this;
    }

    public Http$Builder setRules(int n3, HttpRule httpRule) {
        this.copyOnWrite();
        Http.access$100((Http)this.instance, n3, httpRule);
        return this;
    }
}

