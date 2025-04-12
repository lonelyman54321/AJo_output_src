/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.JwtLocation;
import com.google.api.JwtLocation$1;
import com.google.api.JwtLocation$InCase;
import com.google.api.JwtLocationOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class JwtLocation$Builder
extends GeneratedMessageLite$Builder
implements JwtLocationOrBuilder {
    private JwtLocation$Builder() {
        JwtLocation jwtLocation = JwtLocation.access$000();
        super(jwtLocation);
    }

    public /* synthetic */ JwtLocation$Builder(JwtLocation$1 jwtLocation$1) {
        this();
    }

    public JwtLocation$Builder clearHeader() {
        this.copyOnWrite();
        JwtLocation.access$300((JwtLocation)this.instance);
        return this;
    }

    public JwtLocation$Builder clearIn() {
        this.copyOnWrite();
        JwtLocation.access$100((JwtLocation)this.instance);
        return this;
    }

    public JwtLocation$Builder clearQuery() {
        this.copyOnWrite();
        JwtLocation.access$600((JwtLocation)this.instance);
        return this;
    }

    public JwtLocation$Builder clearValuePrefix() {
        this.copyOnWrite();
        JwtLocation.access$900((JwtLocation)this.instance);
        return this;
    }

    public String getHeader() {
        return ((JwtLocation)this.instance).getHeader();
    }

    public ByteString getHeaderBytes() {
        return ((JwtLocation)this.instance).getHeaderBytes();
    }

    public JwtLocation$InCase getInCase() {
        return ((JwtLocation)this.instance).getInCase();
    }

    public String getQuery() {
        return ((JwtLocation)this.instance).getQuery();
    }

    public ByteString getQueryBytes() {
        return ((JwtLocation)this.instance).getQueryBytes();
    }

    public String getValuePrefix() {
        return ((JwtLocation)this.instance).getValuePrefix();
    }

    public ByteString getValuePrefixBytes() {
        return ((JwtLocation)this.instance).getValuePrefixBytes();
    }

    public JwtLocation$Builder setHeader(String string2) {
        this.copyOnWrite();
        JwtLocation.access$200((JwtLocation)this.instance, string2);
        return this;
    }

    public JwtLocation$Builder setHeaderBytes(ByteString byteString) {
        this.copyOnWrite();
        JwtLocation.access$400((JwtLocation)this.instance, byteString);
        return this;
    }

    public JwtLocation$Builder setQuery(String string2) {
        this.copyOnWrite();
        JwtLocation.access$500((JwtLocation)this.instance, string2);
        return this;
    }

    public JwtLocation$Builder setQueryBytes(ByteString byteString) {
        this.copyOnWrite();
        JwtLocation.access$700((JwtLocation)this.instance, byteString);
        return this;
    }

    public JwtLocation$Builder setValuePrefix(String string2) {
        this.copyOnWrite();
        JwtLocation.access$800((JwtLocation)this.instance, string2);
        return this;
    }

    public JwtLocation$Builder setValuePrefixBytes(ByteString byteString) {
        this.copyOnWrite();
        JwtLocation.access$1000((JwtLocation)this.instance, byteString);
        return this;
    }
}

