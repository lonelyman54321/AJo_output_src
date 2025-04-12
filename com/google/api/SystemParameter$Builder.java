/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.SystemParameter;
import com.google.api.SystemParameter$1;
import com.google.api.SystemParameterOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class SystemParameter$Builder
extends GeneratedMessageLite$Builder
implements SystemParameterOrBuilder {
    private SystemParameter$Builder() {
        SystemParameter systemParameter = SystemParameter.access$000();
        super(systemParameter);
    }

    public /* synthetic */ SystemParameter$Builder(SystemParameter$1 systemParameter$1) {
        this();
    }

    public SystemParameter$Builder clearHttpHeader() {
        this.copyOnWrite();
        SystemParameter.access$500((SystemParameter)this.instance);
        return this;
    }

    public SystemParameter$Builder clearName() {
        this.copyOnWrite();
        SystemParameter.access$200((SystemParameter)this.instance);
        return this;
    }

    public SystemParameter$Builder clearUrlQueryParameter() {
        this.copyOnWrite();
        SystemParameter.access$800((SystemParameter)this.instance);
        return this;
    }

    public String getHttpHeader() {
        return ((SystemParameter)this.instance).getHttpHeader();
    }

    public ByteString getHttpHeaderBytes() {
        return ((SystemParameter)this.instance).getHttpHeaderBytes();
    }

    public String getName() {
        return ((SystemParameter)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((SystemParameter)this.instance).getNameBytes();
    }

    public String getUrlQueryParameter() {
        return ((SystemParameter)this.instance).getUrlQueryParameter();
    }

    public ByteString getUrlQueryParameterBytes() {
        return ((SystemParameter)this.instance).getUrlQueryParameterBytes();
    }

    public SystemParameter$Builder setHttpHeader(String string2) {
        this.copyOnWrite();
        SystemParameter.access$400((SystemParameter)this.instance, string2);
        return this;
    }

    public SystemParameter$Builder setHttpHeaderBytes(ByteString byteString) {
        this.copyOnWrite();
        SystemParameter.access$600((SystemParameter)this.instance, byteString);
        return this;
    }

    public SystemParameter$Builder setName(String string2) {
        this.copyOnWrite();
        SystemParameter.access$100((SystemParameter)this.instance, string2);
        return this;
    }

    public SystemParameter$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        SystemParameter.access$300((SystemParameter)this.instance, byteString);
        return this;
    }

    public SystemParameter$Builder setUrlQueryParameter(String string2) {
        this.copyOnWrite();
        SystemParameter.access$700((SystemParameter)this.instance, string2);
        return this;
    }

    public SystemParameter$Builder setUrlQueryParameterBytes(ByteString byteString) {
        this.copyOnWrite();
        SystemParameter.access$900((SystemParameter)this.instance, byteString);
        return this;
    }
}

