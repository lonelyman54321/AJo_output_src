/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.BackendRule;
import com.google.api.BackendRule$1;
import com.google.api.BackendRule$AuthenticationCase;
import com.google.api.BackendRule$PathTranslation;
import com.google.api.BackendRuleOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class BackendRule$Builder
extends GeneratedMessageLite$Builder
implements BackendRuleOrBuilder {
    private BackendRule$Builder() {
        BackendRule backendRule = BackendRule.access$000();
        super(backendRule);
    }

    public /* synthetic */ BackendRule$Builder(BackendRule$1 backendRule$1) {
        this();
    }

    public BackendRule$Builder clearAddress() {
        this.copyOnWrite();
        BackendRule.access$600((BackendRule)this.instance);
        return this;
    }

    public BackendRule$Builder clearAuthentication() {
        this.copyOnWrite();
        BackendRule.access$100((BackendRule)this.instance);
        return this;
    }

    public BackendRule$Builder clearDeadline() {
        this.copyOnWrite();
        BackendRule.access$900((BackendRule)this.instance);
        return this;
    }

    public BackendRule$Builder clearDisableAuth() {
        this.copyOnWrite();
        BackendRule.access$2100((BackendRule)this.instance);
        return this;
    }

    public BackendRule$Builder clearJwtAudience() {
        this.copyOnWrite();
        BackendRule.access$1800((BackendRule)this.instance);
        return this;
    }

    public BackendRule$Builder clearMinDeadline() {
        this.copyOnWrite();
        BackendRule.access$1100((BackendRule)this.instance);
        return this;
    }

    public BackendRule$Builder clearOperationDeadline() {
        this.copyOnWrite();
        BackendRule.access$1300((BackendRule)this.instance);
        return this;
    }

    public BackendRule$Builder clearPathTranslation() {
        this.copyOnWrite();
        BackendRule.access$1600((BackendRule)this.instance);
        return this;
    }

    public BackendRule$Builder clearProtocol() {
        this.copyOnWrite();
        BackendRule.access$2300((BackendRule)this.instance);
        return this;
    }

    public BackendRule$Builder clearSelector() {
        this.copyOnWrite();
        BackendRule.access$300((BackendRule)this.instance);
        return this;
    }

    public String getAddress() {
        return ((BackendRule)this.instance).getAddress();
    }

    public ByteString getAddressBytes() {
        return ((BackendRule)this.instance).getAddressBytes();
    }

    public BackendRule$AuthenticationCase getAuthenticationCase() {
        return ((BackendRule)this.instance).getAuthenticationCase();
    }

    public double getDeadline() {
        return ((BackendRule)this.instance).getDeadline();
    }

    public boolean getDisableAuth() {
        return ((BackendRule)this.instance).getDisableAuth();
    }

    public String getJwtAudience() {
        return ((BackendRule)this.instance).getJwtAudience();
    }

    public ByteString getJwtAudienceBytes() {
        return ((BackendRule)this.instance).getJwtAudienceBytes();
    }

    public double getMinDeadline() {
        return ((BackendRule)this.instance).getMinDeadline();
    }

    public double getOperationDeadline() {
        return ((BackendRule)this.instance).getOperationDeadline();
    }

    public BackendRule$PathTranslation getPathTranslation() {
        return ((BackendRule)this.instance).getPathTranslation();
    }

    public int getPathTranslationValue() {
        return ((BackendRule)this.instance).getPathTranslationValue();
    }

    public String getProtocol() {
        return ((BackendRule)this.instance).getProtocol();
    }

    public ByteString getProtocolBytes() {
        return ((BackendRule)this.instance).getProtocolBytes();
    }

    public String getSelector() {
        return ((BackendRule)this.instance).getSelector();
    }

    public ByteString getSelectorBytes() {
        return ((BackendRule)this.instance).getSelectorBytes();
    }

    public BackendRule$Builder setAddress(String string2) {
        this.copyOnWrite();
        BackendRule.access$500((BackendRule)this.instance, string2);
        return this;
    }

    public BackendRule$Builder setAddressBytes(ByteString byteString) {
        this.copyOnWrite();
        BackendRule.access$700((BackendRule)this.instance, byteString);
        return this;
    }

    public BackendRule$Builder setDeadline(double d2) {
        this.copyOnWrite();
        BackendRule.access$800((BackendRule)this.instance, d2);
        return this;
    }

    public BackendRule$Builder setDisableAuth(boolean bl2) {
        this.copyOnWrite();
        BackendRule.access$2000((BackendRule)this.instance, bl2);
        return this;
    }

    public BackendRule$Builder setJwtAudience(String string2) {
        this.copyOnWrite();
        BackendRule.access$1700((BackendRule)this.instance, string2);
        return this;
    }

    public BackendRule$Builder setJwtAudienceBytes(ByteString byteString) {
        this.copyOnWrite();
        BackendRule.access$1900((BackendRule)this.instance, byteString);
        return this;
    }

    public BackendRule$Builder setMinDeadline(double d2) {
        this.copyOnWrite();
        BackendRule.access$1000((BackendRule)this.instance, d2);
        return this;
    }

    public BackendRule$Builder setOperationDeadline(double d2) {
        this.copyOnWrite();
        BackendRule.access$1200((BackendRule)this.instance, d2);
        return this;
    }

    public BackendRule$Builder setPathTranslation(BackendRule$PathTranslation backendRule$PathTranslation) {
        this.copyOnWrite();
        BackendRule.access$1500((BackendRule)this.instance, backendRule$PathTranslation);
        return this;
    }

    public BackendRule$Builder setPathTranslationValue(int n3) {
        this.copyOnWrite();
        BackendRule.access$1400((BackendRule)this.instance, n3);
        return this;
    }

    public BackendRule$Builder setProtocol(String string2) {
        this.copyOnWrite();
        BackendRule.access$2200((BackendRule)this.instance, string2);
        return this;
    }

    public BackendRule$Builder setProtocolBytes(ByteString byteString) {
        this.copyOnWrite();
        BackendRule.access$2400((BackendRule)this.instance, byteString);
        return this;
    }

    public BackendRule$Builder setSelector(String string2) {
        this.copyOnWrite();
        BackendRule.access$200((BackendRule)this.instance, string2);
        return this;
    }

    public BackendRule$Builder setSelectorBytes(ByteString byteString) {
        this.copyOnWrite();
        BackendRule.access$400((BackendRule)this.instance, byteString);
        return this;
    }
}

