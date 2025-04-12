/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.CustomHttpPattern;
import com.google.api.CustomHttpPattern$Builder;
import com.google.api.HttpRule;
import com.google.api.HttpRule$1;
import com.google.api.HttpRule$PatternCase;
import com.google.api.HttpRuleOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class HttpRule$Builder
extends GeneratedMessageLite$Builder
implements HttpRuleOrBuilder {
    private HttpRule$Builder() {
        HttpRule httpRule = HttpRule.access$000();
        super(httpRule);
    }

    public /* synthetic */ HttpRule$Builder(HttpRule$1 httpRule$1) {
        this();
    }

    public HttpRule$Builder addAdditionalBindings(int n3, HttpRule$Builder httpRuleOrBuilder) {
        this.copyOnWrite();
        HttpRule httpRule = (HttpRule)this.instance;
        httpRuleOrBuilder = (HttpRule)httpRuleOrBuilder.build();
        HttpRule.access$3100(httpRule, n3, (HttpRule)httpRuleOrBuilder);
        return this;
    }

    public HttpRule$Builder addAdditionalBindings(int n3, HttpRule httpRule) {
        this.copyOnWrite();
        HttpRule.access$3100((HttpRule)this.instance, n3, httpRule);
        return this;
    }

    public HttpRule$Builder addAdditionalBindings(HttpRule$Builder httpRuleOrBuilder) {
        this.copyOnWrite();
        HttpRule httpRule = (HttpRule)this.instance;
        httpRuleOrBuilder = (HttpRule)httpRuleOrBuilder.build();
        HttpRule.access$3000(httpRule, (HttpRule)httpRuleOrBuilder);
        return this;
    }

    public HttpRule$Builder addAdditionalBindings(HttpRule httpRule) {
        this.copyOnWrite();
        HttpRule.access$3000((HttpRule)this.instance, httpRule);
        return this;
    }

    public HttpRule$Builder addAllAdditionalBindings(Iterable iterable) {
        this.copyOnWrite();
        HttpRule.access$3200((HttpRule)this.instance, iterable);
        return this;
    }

    public HttpRule$Builder clearAdditionalBindings() {
        this.copyOnWrite();
        HttpRule.access$3300((HttpRule)this.instance);
        return this;
    }

    public HttpRule$Builder clearBody() {
        this.copyOnWrite();
        HttpRule.access$2400((HttpRule)this.instance);
        return this;
    }

    public HttpRule$Builder clearCustom() {
        this.copyOnWrite();
        HttpRule.access$2200((HttpRule)this.instance);
        return this;
    }

    public HttpRule$Builder clearDelete() {
        this.copyOnWrite();
        HttpRule.access$1500((HttpRule)this.instance);
        return this;
    }

    public HttpRule$Builder clearGet() {
        this.copyOnWrite();
        HttpRule.access$600((HttpRule)this.instance);
        return this;
    }

    public HttpRule$Builder clearPatch() {
        this.copyOnWrite();
        HttpRule.access$1800((HttpRule)this.instance);
        return this;
    }

    public HttpRule$Builder clearPattern() {
        this.copyOnWrite();
        HttpRule.access$100((HttpRule)this.instance);
        return this;
    }

    public HttpRule$Builder clearPost() {
        this.copyOnWrite();
        HttpRule.access$1200((HttpRule)this.instance);
        return this;
    }

    public HttpRule$Builder clearPut() {
        this.copyOnWrite();
        HttpRule.access$900((HttpRule)this.instance);
        return this;
    }

    public HttpRule$Builder clearResponseBody() {
        this.copyOnWrite();
        HttpRule.access$2700((HttpRule)this.instance);
        return this;
    }

    public HttpRule$Builder clearSelector() {
        this.copyOnWrite();
        HttpRule.access$300((HttpRule)this.instance);
        return this;
    }

    public HttpRule getAdditionalBindings(int n3) {
        return ((HttpRule)this.instance).getAdditionalBindings(n3);
    }

    public int getAdditionalBindingsCount() {
        return ((HttpRule)this.instance).getAdditionalBindingsCount();
    }

    public List getAdditionalBindingsList() {
        return Collections.unmodifiableList(((HttpRule)this.instance).getAdditionalBindingsList());
    }

    public String getBody() {
        return ((HttpRule)this.instance).getBody();
    }

    public ByteString getBodyBytes() {
        return ((HttpRule)this.instance).getBodyBytes();
    }

    public CustomHttpPattern getCustom() {
        return ((HttpRule)this.instance).getCustom();
    }

    public String getDelete() {
        return ((HttpRule)this.instance).getDelete();
    }

    public ByteString getDeleteBytes() {
        return ((HttpRule)this.instance).getDeleteBytes();
    }

    public String getGet() {
        return ((HttpRule)this.instance).getGet();
    }

    public ByteString getGetBytes() {
        return ((HttpRule)this.instance).getGetBytes();
    }

    public String getPatch() {
        return ((HttpRule)this.instance).getPatch();
    }

    public ByteString getPatchBytes() {
        return ((HttpRule)this.instance).getPatchBytes();
    }

    public HttpRule$PatternCase getPatternCase() {
        return ((HttpRule)this.instance).getPatternCase();
    }

    public String getPost() {
        return ((HttpRule)this.instance).getPost();
    }

    public ByteString getPostBytes() {
        return ((HttpRule)this.instance).getPostBytes();
    }

    public String getPut() {
        return ((HttpRule)this.instance).getPut();
    }

    public ByteString getPutBytes() {
        return ((HttpRule)this.instance).getPutBytes();
    }

    public String getResponseBody() {
        return ((HttpRule)this.instance).getResponseBody();
    }

    public ByteString getResponseBodyBytes() {
        return ((HttpRule)this.instance).getResponseBodyBytes();
    }

    public String getSelector() {
        return ((HttpRule)this.instance).getSelector();
    }

    public ByteString getSelectorBytes() {
        return ((HttpRule)this.instance).getSelectorBytes();
    }

    public boolean hasCustom() {
        return ((HttpRule)this.instance).hasCustom();
    }

    public HttpRule$Builder mergeCustom(CustomHttpPattern customHttpPattern) {
        this.copyOnWrite();
        HttpRule.access$2100((HttpRule)this.instance, customHttpPattern);
        return this;
    }

    public HttpRule$Builder removeAdditionalBindings(int n3) {
        this.copyOnWrite();
        HttpRule.access$3400((HttpRule)this.instance, n3);
        return this;
    }

    public HttpRule$Builder setAdditionalBindings(int n3, HttpRule$Builder httpRuleOrBuilder) {
        this.copyOnWrite();
        HttpRule httpRule = (HttpRule)this.instance;
        httpRuleOrBuilder = (HttpRule)httpRuleOrBuilder.build();
        HttpRule.access$2900(httpRule, n3, (HttpRule)httpRuleOrBuilder);
        return this;
    }

    public HttpRule$Builder setAdditionalBindings(int n3, HttpRule httpRule) {
        this.copyOnWrite();
        HttpRule.access$2900((HttpRule)this.instance, n3, httpRule);
        return this;
    }

    public HttpRule$Builder setBody(String string2) {
        this.copyOnWrite();
        HttpRule.access$2300((HttpRule)this.instance, string2);
        return this;
    }

    public HttpRule$Builder setBodyBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRule.access$2500((HttpRule)this.instance, byteString);
        return this;
    }

    public HttpRule$Builder setCustom(CustomHttpPattern$Builder customHttpPatternOrBuilder) {
        this.copyOnWrite();
        HttpRule httpRule = (HttpRule)this.instance;
        customHttpPatternOrBuilder = (CustomHttpPattern)customHttpPatternOrBuilder.build();
        HttpRule.access$2000(httpRule, (CustomHttpPattern)customHttpPatternOrBuilder);
        return this;
    }

    public HttpRule$Builder setCustom(CustomHttpPattern customHttpPattern) {
        this.copyOnWrite();
        HttpRule.access$2000((HttpRule)this.instance, customHttpPattern);
        return this;
    }

    public HttpRule$Builder setDelete(String string2) {
        this.copyOnWrite();
        HttpRule.access$1400((HttpRule)this.instance, string2);
        return this;
    }

    public HttpRule$Builder setDeleteBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRule.access$1600((HttpRule)this.instance, byteString);
        return this;
    }

    public HttpRule$Builder setGet(String string2) {
        this.copyOnWrite();
        HttpRule.access$500((HttpRule)this.instance, string2);
        return this;
    }

    public HttpRule$Builder setGetBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRule.access$700((HttpRule)this.instance, byteString);
        return this;
    }

    public HttpRule$Builder setPatch(String string2) {
        this.copyOnWrite();
        HttpRule.access$1700((HttpRule)this.instance, string2);
        return this;
    }

    public HttpRule$Builder setPatchBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRule.access$1900((HttpRule)this.instance, byteString);
        return this;
    }

    public HttpRule$Builder setPost(String string2) {
        this.copyOnWrite();
        HttpRule.access$1100((HttpRule)this.instance, string2);
        return this;
    }

    public HttpRule$Builder setPostBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRule.access$1300((HttpRule)this.instance, byteString);
        return this;
    }

    public HttpRule$Builder setPut(String string2) {
        this.copyOnWrite();
        HttpRule.access$800((HttpRule)this.instance, string2);
        return this;
    }

    public HttpRule$Builder setPutBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRule.access$1000((HttpRule)this.instance, byteString);
        return this;
    }

    public HttpRule$Builder setResponseBody(String string2) {
        this.copyOnWrite();
        HttpRule.access$2600((HttpRule)this.instance, string2);
        return this;
    }

    public HttpRule$Builder setResponseBodyBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRule.access$2800((HttpRule)this.instance, byteString);
        return this;
    }

    public HttpRule$Builder setSelector(String string2) {
        this.copyOnWrite();
        HttpRule.access$200((HttpRule)this.instance, string2);
        return this;
    }

    public HttpRule$Builder setSelectorBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRule.access$400((HttpRule)this.instance, byteString);
        return this;
    }
}

