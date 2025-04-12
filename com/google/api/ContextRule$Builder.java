/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ContextRule;
import com.google.api.ContextRule$1;
import com.google.api.ContextRuleOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class ContextRule$Builder
extends GeneratedMessageLite$Builder
implements ContextRuleOrBuilder {
    private ContextRule$Builder() {
        ContextRule contextRule = ContextRule.access$000();
        super(contextRule);
    }

    public /* synthetic */ ContextRule$Builder(ContextRule$1 contextRule$1) {
        this();
    }

    public ContextRule$Builder addAllAllowedRequestExtensions(Iterable iterable) {
        this.copyOnWrite();
        ContextRule.access$1600((ContextRule)this.instance, iterable);
        return this;
    }

    public ContextRule$Builder addAllAllowedResponseExtensions(Iterable iterable) {
        this.copyOnWrite();
        ContextRule.access$2100((ContextRule)this.instance, iterable);
        return this;
    }

    public ContextRule$Builder addAllProvided(Iterable iterable) {
        this.copyOnWrite();
        ContextRule.access$1100((ContextRule)this.instance, iterable);
        return this;
    }

    public ContextRule$Builder addAllRequested(Iterable iterable) {
        this.copyOnWrite();
        ContextRule.access$600((ContextRule)this.instance, iterable);
        return this;
    }

    public ContextRule$Builder addAllowedRequestExtensions(String string2) {
        this.copyOnWrite();
        ContextRule.access$1500((ContextRule)this.instance, string2);
        return this;
    }

    public ContextRule$Builder addAllowedRequestExtensionsBytes(ByteString byteString) {
        this.copyOnWrite();
        ContextRule.access$1800((ContextRule)this.instance, byteString);
        return this;
    }

    public ContextRule$Builder addAllowedResponseExtensions(String string2) {
        this.copyOnWrite();
        ContextRule.access$2000((ContextRule)this.instance, string2);
        return this;
    }

    public ContextRule$Builder addAllowedResponseExtensionsBytes(ByteString byteString) {
        this.copyOnWrite();
        ContextRule.access$2300((ContextRule)this.instance, byteString);
        return this;
    }

    public ContextRule$Builder addProvided(String string2) {
        this.copyOnWrite();
        ContextRule.access$1000((ContextRule)this.instance, string2);
        return this;
    }

    public ContextRule$Builder addProvidedBytes(ByteString byteString) {
        this.copyOnWrite();
        ContextRule.access$1300((ContextRule)this.instance, byteString);
        return this;
    }

    public ContextRule$Builder addRequested(String string2) {
        this.copyOnWrite();
        ContextRule.access$500((ContextRule)this.instance, string2);
        return this;
    }

    public ContextRule$Builder addRequestedBytes(ByteString byteString) {
        this.copyOnWrite();
        ContextRule.access$800((ContextRule)this.instance, byteString);
        return this;
    }

    public ContextRule$Builder clearAllowedRequestExtensions() {
        this.copyOnWrite();
        ContextRule.access$1700((ContextRule)this.instance);
        return this;
    }

    public ContextRule$Builder clearAllowedResponseExtensions() {
        this.copyOnWrite();
        ContextRule.access$2200((ContextRule)this.instance);
        return this;
    }

    public ContextRule$Builder clearProvided() {
        this.copyOnWrite();
        ContextRule.access$1200((ContextRule)this.instance);
        return this;
    }

    public ContextRule$Builder clearRequested() {
        this.copyOnWrite();
        ContextRule.access$700((ContextRule)this.instance);
        return this;
    }

    public ContextRule$Builder clearSelector() {
        this.copyOnWrite();
        ContextRule.access$200((ContextRule)this.instance);
        return this;
    }

    public String getAllowedRequestExtensions(int n3) {
        return ((ContextRule)this.instance).getAllowedRequestExtensions(n3);
    }

    public ByteString getAllowedRequestExtensionsBytes(int n3) {
        return ((ContextRule)this.instance).getAllowedRequestExtensionsBytes(n3);
    }

    public int getAllowedRequestExtensionsCount() {
        return ((ContextRule)this.instance).getAllowedRequestExtensionsCount();
    }

    public List getAllowedRequestExtensionsList() {
        return Collections.unmodifiableList(((ContextRule)this.instance).getAllowedRequestExtensionsList());
    }

    public String getAllowedResponseExtensions(int n3) {
        return ((ContextRule)this.instance).getAllowedResponseExtensions(n3);
    }

    public ByteString getAllowedResponseExtensionsBytes(int n3) {
        return ((ContextRule)this.instance).getAllowedResponseExtensionsBytes(n3);
    }

    public int getAllowedResponseExtensionsCount() {
        return ((ContextRule)this.instance).getAllowedResponseExtensionsCount();
    }

    public List getAllowedResponseExtensionsList() {
        return Collections.unmodifiableList(((ContextRule)this.instance).getAllowedResponseExtensionsList());
    }

    public String getProvided(int n3) {
        return ((ContextRule)this.instance).getProvided(n3);
    }

    public ByteString getProvidedBytes(int n3) {
        return ((ContextRule)this.instance).getProvidedBytes(n3);
    }

    public int getProvidedCount() {
        return ((ContextRule)this.instance).getProvidedCount();
    }

    public List getProvidedList() {
        return Collections.unmodifiableList(((ContextRule)this.instance).getProvidedList());
    }

    public String getRequested(int n3) {
        return ((ContextRule)this.instance).getRequested(n3);
    }

    public ByteString getRequestedBytes(int n3) {
        return ((ContextRule)this.instance).getRequestedBytes(n3);
    }

    public int getRequestedCount() {
        return ((ContextRule)this.instance).getRequestedCount();
    }

    public List getRequestedList() {
        return Collections.unmodifiableList(((ContextRule)this.instance).getRequestedList());
    }

    public String getSelector() {
        return ((ContextRule)this.instance).getSelector();
    }

    public ByteString getSelectorBytes() {
        return ((ContextRule)this.instance).getSelectorBytes();
    }

    public ContextRule$Builder setAllowedRequestExtensions(int n3, String string2) {
        this.copyOnWrite();
        ContextRule.access$1400((ContextRule)this.instance, n3, string2);
        return this;
    }

    public ContextRule$Builder setAllowedResponseExtensions(int n3, String string2) {
        this.copyOnWrite();
        ContextRule.access$1900((ContextRule)this.instance, n3, string2);
        return this;
    }

    public ContextRule$Builder setProvided(int n3, String string2) {
        this.copyOnWrite();
        ContextRule.access$900((ContextRule)this.instance, n3, string2);
        return this;
    }

    public ContextRule$Builder setRequested(int n3, String string2) {
        this.copyOnWrite();
        ContextRule.access$400((ContextRule)this.instance, n3, string2);
        return this;
    }

    public ContextRule$Builder setSelector(String string2) {
        this.copyOnWrite();
        ContextRule.access$100((ContextRule)this.instance, string2);
        return this;
    }

    public ContextRule$Builder setSelectorBytes(ByteString byteString) {
        this.copyOnWrite();
        ContextRule.access$300((ContextRule)this.instance, byteString);
        return this;
    }
}

