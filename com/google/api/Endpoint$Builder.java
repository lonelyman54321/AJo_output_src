/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Endpoint;
import com.google.api.Endpoint$1;
import com.google.api.EndpointOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Endpoint$Builder
extends GeneratedMessageLite$Builder
implements EndpointOrBuilder {
    private Endpoint$Builder() {
        Endpoint endpoint = Endpoint.access$000();
        super(endpoint);
    }

    public /* synthetic */ Endpoint$Builder(Endpoint$1 endpoint$1) {
        this();
    }

    public Endpoint$Builder addAliases(String string2) {
        this.copyOnWrite();
        Endpoint.access$500((Endpoint)this.instance, string2);
        return this;
    }

    public Endpoint$Builder addAliasesBytes(ByteString byteString) {
        this.copyOnWrite();
        Endpoint.access$800((Endpoint)this.instance, byteString);
        return this;
    }

    public Endpoint$Builder addAllAliases(Iterable iterable) {
        this.copyOnWrite();
        Endpoint.access$600((Endpoint)this.instance, iterable);
        return this;
    }

    public Endpoint$Builder addAllFeatures(Iterable iterable) {
        this.copyOnWrite();
        Endpoint.access$1100((Endpoint)this.instance, iterable);
        return this;
    }

    public Endpoint$Builder addFeatures(String string2) {
        this.copyOnWrite();
        Endpoint.access$1000((Endpoint)this.instance, string2);
        return this;
    }

    public Endpoint$Builder addFeaturesBytes(ByteString byteString) {
        this.copyOnWrite();
        Endpoint.access$1300((Endpoint)this.instance, byteString);
        return this;
    }

    public Endpoint$Builder clearAliases() {
        this.copyOnWrite();
        Endpoint.access$700((Endpoint)this.instance);
        return this;
    }

    public Endpoint$Builder clearAllowCors() {
        this.copyOnWrite();
        Endpoint.access$1800((Endpoint)this.instance);
        return this;
    }

    public Endpoint$Builder clearFeatures() {
        this.copyOnWrite();
        Endpoint.access$1200((Endpoint)this.instance);
        return this;
    }

    public Endpoint$Builder clearName() {
        this.copyOnWrite();
        Endpoint.access$200((Endpoint)this.instance);
        return this;
    }

    public Endpoint$Builder clearTarget() {
        this.copyOnWrite();
        Endpoint.access$1500((Endpoint)this.instance);
        return this;
    }

    public String getAliases(int n3) {
        return ((Endpoint)this.instance).getAliases(n3);
    }

    public ByteString getAliasesBytes(int n3) {
        return ((Endpoint)this.instance).getAliasesBytes(n3);
    }

    public int getAliasesCount() {
        return ((Endpoint)this.instance).getAliasesCount();
    }

    public List getAliasesList() {
        return Collections.unmodifiableList(((Endpoint)this.instance).getAliasesList());
    }

    public boolean getAllowCors() {
        return ((Endpoint)this.instance).getAllowCors();
    }

    public String getFeatures(int n3) {
        return ((Endpoint)this.instance).getFeatures(n3);
    }

    public ByteString getFeaturesBytes(int n3) {
        return ((Endpoint)this.instance).getFeaturesBytes(n3);
    }

    public int getFeaturesCount() {
        return ((Endpoint)this.instance).getFeaturesCount();
    }

    public List getFeaturesList() {
        return Collections.unmodifiableList(((Endpoint)this.instance).getFeaturesList());
    }

    public String getName() {
        return ((Endpoint)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Endpoint)this.instance).getNameBytes();
    }

    public String getTarget() {
        return ((Endpoint)this.instance).getTarget();
    }

    public ByteString getTargetBytes() {
        return ((Endpoint)this.instance).getTargetBytes();
    }

    public Endpoint$Builder setAliases(int n3, String string2) {
        this.copyOnWrite();
        Endpoint.access$400((Endpoint)this.instance, n3, string2);
        return this;
    }

    public Endpoint$Builder setAllowCors(boolean bl2) {
        this.copyOnWrite();
        Endpoint.access$1700((Endpoint)this.instance, bl2);
        return this;
    }

    public Endpoint$Builder setFeatures(int n3, String string2) {
        this.copyOnWrite();
        Endpoint.access$900((Endpoint)this.instance, n3, string2);
        return this;
    }

    public Endpoint$Builder setName(String string2) {
        this.copyOnWrite();
        Endpoint.access$100((Endpoint)this.instance, string2);
        return this;
    }

    public Endpoint$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Endpoint.access$300((Endpoint)this.instance, byteString);
        return this;
    }

    public Endpoint$Builder setTarget(String string2) {
        this.copyOnWrite();
        Endpoint.access$1400((Endpoint)this.instance, string2);
        return this;
    }

    public Endpoint$Builder setTargetBytes(ByteString byteString) {
        this.copyOnWrite();
        Endpoint.access$1600((Endpoint)this.instance, byteString);
        return this;
    }
}

