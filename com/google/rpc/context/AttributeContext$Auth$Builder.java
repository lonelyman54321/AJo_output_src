/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Struct;
import com.google.protobuf.Struct$Builder;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Auth;
import com.google.rpc.context.AttributeContext$AuthOrBuilder;
import java.util.Collections;
import java.util.List;

public final class AttributeContext$Auth$Builder
extends GeneratedMessageLite$Builder
implements AttributeContext$AuthOrBuilder {
    private AttributeContext$Auth$Builder() {
        AttributeContext$Auth attributeContext$Auth = AttributeContext$Auth.access$2800();
        super(attributeContext$Auth);
    }

    public /* synthetic */ AttributeContext$Auth$Builder(AttributeContext$1 attributeContext$1) {
        this();
    }

    public AttributeContext$Auth$Builder addAccessLevels(String string2) {
        this.copyOnWrite();
        AttributeContext$Auth.access$4400((AttributeContext$Auth)this.instance, string2);
        return this;
    }

    public AttributeContext$Auth$Builder addAccessLevelsBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Auth.access$4700((AttributeContext$Auth)this.instance, byteString);
        return this;
    }

    public AttributeContext$Auth$Builder addAllAccessLevels(Iterable iterable) {
        this.copyOnWrite();
        AttributeContext$Auth.access$4500((AttributeContext$Auth)this.instance, iterable);
        return this;
    }

    public AttributeContext$Auth$Builder addAllAudiences(Iterable iterable) {
        this.copyOnWrite();
        AttributeContext$Auth.access$3400((AttributeContext$Auth)this.instance, iterable);
        return this;
    }

    public AttributeContext$Auth$Builder addAudiences(String string2) {
        this.copyOnWrite();
        AttributeContext$Auth.access$3300((AttributeContext$Auth)this.instance, string2);
        return this;
    }

    public AttributeContext$Auth$Builder addAudiencesBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Auth.access$3600((AttributeContext$Auth)this.instance, byteString);
        return this;
    }

    public AttributeContext$Auth$Builder clearAccessLevels() {
        this.copyOnWrite();
        AttributeContext$Auth.access$4600((AttributeContext$Auth)this.instance);
        return this;
    }

    public AttributeContext$Auth$Builder clearAudiences() {
        this.copyOnWrite();
        AttributeContext$Auth.access$3500((AttributeContext$Auth)this.instance);
        return this;
    }

    public AttributeContext$Auth$Builder clearClaims() {
        this.copyOnWrite();
        AttributeContext$Auth.access$4200((AttributeContext$Auth)this.instance);
        return this;
    }

    public AttributeContext$Auth$Builder clearPresenter() {
        this.copyOnWrite();
        AttributeContext$Auth.access$3800((AttributeContext$Auth)this.instance);
        return this;
    }

    public AttributeContext$Auth$Builder clearPrincipal() {
        this.copyOnWrite();
        AttributeContext$Auth.access$3000((AttributeContext$Auth)this.instance);
        return this;
    }

    public String getAccessLevels(int n3) {
        return ((AttributeContext$Auth)this.instance).getAccessLevels(n3);
    }

    public ByteString getAccessLevelsBytes(int n3) {
        return ((AttributeContext$Auth)this.instance).getAccessLevelsBytes(n3);
    }

    public int getAccessLevelsCount() {
        return ((AttributeContext$Auth)this.instance).getAccessLevelsCount();
    }

    public List getAccessLevelsList() {
        return Collections.unmodifiableList(((AttributeContext$Auth)this.instance).getAccessLevelsList());
    }

    public String getAudiences(int n3) {
        return ((AttributeContext$Auth)this.instance).getAudiences(n3);
    }

    public ByteString getAudiencesBytes(int n3) {
        return ((AttributeContext$Auth)this.instance).getAudiencesBytes(n3);
    }

    public int getAudiencesCount() {
        return ((AttributeContext$Auth)this.instance).getAudiencesCount();
    }

    public List getAudiencesList() {
        return Collections.unmodifiableList(((AttributeContext$Auth)this.instance).getAudiencesList());
    }

    public Struct getClaims() {
        return ((AttributeContext$Auth)this.instance).getClaims();
    }

    public String getPresenter() {
        return ((AttributeContext$Auth)this.instance).getPresenter();
    }

    public ByteString getPresenterBytes() {
        return ((AttributeContext$Auth)this.instance).getPresenterBytes();
    }

    public String getPrincipal() {
        return ((AttributeContext$Auth)this.instance).getPrincipal();
    }

    public ByteString getPrincipalBytes() {
        return ((AttributeContext$Auth)this.instance).getPrincipalBytes();
    }

    public boolean hasClaims() {
        return ((AttributeContext$Auth)this.instance).hasClaims();
    }

    public AttributeContext$Auth$Builder mergeClaims(Struct struct) {
        this.copyOnWrite();
        AttributeContext$Auth.access$4100((AttributeContext$Auth)this.instance, struct);
        return this;
    }

    public AttributeContext$Auth$Builder setAccessLevels(int n3, String string2) {
        this.copyOnWrite();
        AttributeContext$Auth.access$4300((AttributeContext$Auth)this.instance, n3, string2);
        return this;
    }

    public AttributeContext$Auth$Builder setAudiences(int n3, String string2) {
        this.copyOnWrite();
        AttributeContext$Auth.access$3200((AttributeContext$Auth)this.instance, n3, string2);
        return this;
    }

    public AttributeContext$Auth$Builder setClaims(Struct$Builder structOrBuilder) {
        this.copyOnWrite();
        AttributeContext$Auth attributeContext$Auth = (AttributeContext$Auth)this.instance;
        structOrBuilder = (Struct)structOrBuilder.build();
        AttributeContext$Auth.access$4000(attributeContext$Auth, (Struct)structOrBuilder);
        return this;
    }

    public AttributeContext$Auth$Builder setClaims(Struct struct) {
        this.copyOnWrite();
        AttributeContext$Auth.access$4000((AttributeContext$Auth)this.instance, struct);
        return this;
    }

    public AttributeContext$Auth$Builder setPresenter(String string2) {
        this.copyOnWrite();
        AttributeContext$Auth.access$3700((AttributeContext$Auth)this.instance, string2);
        return this;
    }

    public AttributeContext$Auth$Builder setPresenterBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Auth.access$3900((AttributeContext$Auth)this.instance, byteString);
        return this;
    }

    public AttributeContext$Auth$Builder setPrincipal(String string2) {
        this.copyOnWrite();
        AttributeContext$Auth.access$2900((AttributeContext$Auth)this.instance, string2);
        return this;
    }

    public AttributeContext$Auth$Builder setPrincipalBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Auth.access$3100((AttributeContext$Auth)this.instance, byteString);
        return this;
    }
}

