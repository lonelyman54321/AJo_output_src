/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Timestamp$Builder;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Auth;
import com.google.rpc.context.AttributeContext$Auth$Builder;
import com.google.rpc.context.AttributeContext$Request;
import com.google.rpc.context.AttributeContext$RequestOrBuilder;
import java.util.Collections;
import java.util.Map;

public final class AttributeContext$Request$Builder
extends GeneratedMessageLite$Builder
implements AttributeContext$RequestOrBuilder {
    private AttributeContext$Request$Builder() {
        AttributeContext$Request attributeContext$Request = AttributeContext$Request.access$4900();
        super(attributeContext$Request);
    }

    public /* synthetic */ AttributeContext$Request$Builder(AttributeContext$1 attributeContext$1) {
        this();
    }

    public AttributeContext$Request$Builder clearAuth() {
        this.copyOnWrite();
        AttributeContext$Request.access$8200((AttributeContext$Request)this.instance);
        return this;
    }

    public AttributeContext$Request$Builder clearHeaders() {
        this.copyOnWrite();
        AttributeContext$Request.access$5600((AttributeContext$Request)this.instance).clear();
        return this;
    }

    public AttributeContext$Request$Builder clearHost() {
        this.copyOnWrite();
        AttributeContext$Request.access$6100((AttributeContext$Request)this.instance);
        return this;
    }

    public AttributeContext$Request$Builder clearId() {
        this.copyOnWrite();
        AttributeContext$Request.access$5100((AttributeContext$Request)this.instance);
        return this;
    }

    public AttributeContext$Request$Builder clearMethod() {
        this.copyOnWrite();
        AttributeContext$Request.access$5400((AttributeContext$Request)this.instance);
        return this;
    }

    public AttributeContext$Request$Builder clearPath() {
        this.copyOnWrite();
        AttributeContext$Request.access$5800((AttributeContext$Request)this.instance);
        return this;
    }

    public AttributeContext$Request$Builder clearProtocol() {
        this.copyOnWrite();
        AttributeContext$Request.access$7500((AttributeContext$Request)this.instance);
        return this;
    }

    public AttributeContext$Request$Builder clearQuery() {
        this.copyOnWrite();
        AttributeContext$Request.access$6700((AttributeContext$Request)this.instance);
        return this;
    }

    public AttributeContext$Request$Builder clearReason() {
        this.copyOnWrite();
        AttributeContext$Request.access$7800((AttributeContext$Request)this.instance);
        return this;
    }

    public AttributeContext$Request$Builder clearScheme() {
        this.copyOnWrite();
        AttributeContext$Request.access$6400((AttributeContext$Request)this.instance);
        return this;
    }

    public AttributeContext$Request$Builder clearSize() {
        this.copyOnWrite();
        AttributeContext$Request.access$7300((AttributeContext$Request)this.instance);
        return this;
    }

    public AttributeContext$Request$Builder clearTime() {
        this.copyOnWrite();
        AttributeContext$Request.access$7100((AttributeContext$Request)this.instance);
        return this;
    }

    public boolean containsHeaders(String string2) {
        string2.getClass();
        return ((AttributeContext$Request)this.instance).getHeadersMap().containsKey(string2);
    }

    public AttributeContext$Auth getAuth() {
        return ((AttributeContext$Request)this.instance).getAuth();
    }

    public Map getHeaders() {
        return this.getHeadersMap();
    }

    public int getHeadersCount() {
        return ((AttributeContext$Request)this.instance).getHeadersMap().size();
    }

    public Map getHeadersMap() {
        return Collections.unmodifiableMap(((AttributeContext$Request)this.instance).getHeadersMap());
    }

    public String getHeadersOrDefault(String string2, String string3) {
        string2.getClass();
        Map map2 = ((AttributeContext$Request)this.instance).getHeadersMap();
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            string3 = string2 = map2.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getHeadersOrThrow(String object) {
        object.getClass();
        Map map2 = ((AttributeContext$Request)this.instance).getHeadersMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            return (String)map2.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public String getHost() {
        return ((AttributeContext$Request)this.instance).getHost();
    }

    public ByteString getHostBytes() {
        return ((AttributeContext$Request)this.instance).getHostBytes();
    }

    public String getId() {
        return ((AttributeContext$Request)this.instance).getId();
    }

    public ByteString getIdBytes() {
        return ((AttributeContext$Request)this.instance).getIdBytes();
    }

    public String getMethod() {
        return ((AttributeContext$Request)this.instance).getMethod();
    }

    public ByteString getMethodBytes() {
        return ((AttributeContext$Request)this.instance).getMethodBytes();
    }

    public String getPath() {
        return ((AttributeContext$Request)this.instance).getPath();
    }

    public ByteString getPathBytes() {
        return ((AttributeContext$Request)this.instance).getPathBytes();
    }

    public String getProtocol() {
        return ((AttributeContext$Request)this.instance).getProtocol();
    }

    public ByteString getProtocolBytes() {
        return ((AttributeContext$Request)this.instance).getProtocolBytes();
    }

    public String getQuery() {
        return ((AttributeContext$Request)this.instance).getQuery();
    }

    public ByteString getQueryBytes() {
        return ((AttributeContext$Request)this.instance).getQueryBytes();
    }

    public String getReason() {
        return ((AttributeContext$Request)this.instance).getReason();
    }

    public ByteString getReasonBytes() {
        return ((AttributeContext$Request)this.instance).getReasonBytes();
    }

    public String getScheme() {
        return ((AttributeContext$Request)this.instance).getScheme();
    }

    public ByteString getSchemeBytes() {
        return ((AttributeContext$Request)this.instance).getSchemeBytes();
    }

    public long getSize() {
        return ((AttributeContext$Request)this.instance).getSize();
    }

    public Timestamp getTime() {
        return ((AttributeContext$Request)this.instance).getTime();
    }

    public boolean hasAuth() {
        return ((AttributeContext$Request)this.instance).hasAuth();
    }

    public boolean hasTime() {
        return ((AttributeContext$Request)this.instance).hasTime();
    }

    public AttributeContext$Request$Builder mergeAuth(AttributeContext$Auth attributeContext$Auth) {
        this.copyOnWrite();
        AttributeContext$Request.access$8100((AttributeContext$Request)this.instance, attributeContext$Auth);
        return this;
    }

    public AttributeContext$Request$Builder mergeTime(Timestamp timestamp) {
        this.copyOnWrite();
        AttributeContext$Request.access$7000((AttributeContext$Request)this.instance, timestamp);
        return this;
    }

    public AttributeContext$Request$Builder putAllHeaders(Map map2) {
        this.copyOnWrite();
        AttributeContext$Request.access$5600((AttributeContext$Request)this.instance).putAll(map2);
        return this;
    }

    public AttributeContext$Request$Builder putHeaders(String string2, String string3) {
        string2.getClass();
        string3.getClass();
        this.copyOnWrite();
        AttributeContext$Request.access$5600((AttributeContext$Request)this.instance).put(string2, string3);
        return this;
    }

    public AttributeContext$Request$Builder removeHeaders(String string2) {
        string2.getClass();
        this.copyOnWrite();
        AttributeContext$Request.access$5600((AttributeContext$Request)this.instance).remove(string2);
        return this;
    }

    public AttributeContext$Request$Builder setAuth(AttributeContext$Auth$Builder attributeContext$AuthOrBuilder) {
        this.copyOnWrite();
        AttributeContext$Request attributeContext$Request = (AttributeContext$Request)this.instance;
        attributeContext$AuthOrBuilder = (AttributeContext$Auth)attributeContext$AuthOrBuilder.build();
        AttributeContext$Request.access$8000(attributeContext$Request, (AttributeContext$Auth)attributeContext$AuthOrBuilder);
        return this;
    }

    public AttributeContext$Request$Builder setAuth(AttributeContext$Auth attributeContext$Auth) {
        this.copyOnWrite();
        AttributeContext$Request.access$8000((AttributeContext$Request)this.instance, attributeContext$Auth);
        return this;
    }

    public AttributeContext$Request$Builder setHost(String string2) {
        this.copyOnWrite();
        AttributeContext$Request.access$6000((AttributeContext$Request)this.instance, string2);
        return this;
    }

    public AttributeContext$Request$Builder setHostBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Request.access$6200((AttributeContext$Request)this.instance, byteString);
        return this;
    }

    public AttributeContext$Request$Builder setId(String string2) {
        this.copyOnWrite();
        AttributeContext$Request.access$5000((AttributeContext$Request)this.instance, string2);
        return this;
    }

    public AttributeContext$Request$Builder setIdBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Request.access$5200((AttributeContext$Request)this.instance, byteString);
        return this;
    }

    public AttributeContext$Request$Builder setMethod(String string2) {
        this.copyOnWrite();
        AttributeContext$Request.access$5300((AttributeContext$Request)this.instance, string2);
        return this;
    }

    public AttributeContext$Request$Builder setMethodBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Request.access$5500((AttributeContext$Request)this.instance, byteString);
        return this;
    }

    public AttributeContext$Request$Builder setPath(String string2) {
        this.copyOnWrite();
        AttributeContext$Request.access$5700((AttributeContext$Request)this.instance, string2);
        return this;
    }

    public AttributeContext$Request$Builder setPathBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Request.access$5900((AttributeContext$Request)this.instance, byteString);
        return this;
    }

    public AttributeContext$Request$Builder setProtocol(String string2) {
        this.copyOnWrite();
        AttributeContext$Request.access$7400((AttributeContext$Request)this.instance, string2);
        return this;
    }

    public AttributeContext$Request$Builder setProtocolBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Request.access$7600((AttributeContext$Request)this.instance, byteString);
        return this;
    }

    public AttributeContext$Request$Builder setQuery(String string2) {
        this.copyOnWrite();
        AttributeContext$Request.access$6600((AttributeContext$Request)this.instance, string2);
        return this;
    }

    public AttributeContext$Request$Builder setQueryBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Request.access$6800((AttributeContext$Request)this.instance, byteString);
        return this;
    }

    public AttributeContext$Request$Builder setReason(String string2) {
        this.copyOnWrite();
        AttributeContext$Request.access$7700((AttributeContext$Request)this.instance, string2);
        return this;
    }

    public AttributeContext$Request$Builder setReasonBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Request.access$7900((AttributeContext$Request)this.instance, byteString);
        return this;
    }

    public AttributeContext$Request$Builder setScheme(String string2) {
        this.copyOnWrite();
        AttributeContext$Request.access$6300((AttributeContext$Request)this.instance, string2);
        return this;
    }

    public AttributeContext$Request$Builder setSchemeBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Request.access$6500((AttributeContext$Request)this.instance, byteString);
        return this;
    }

    public AttributeContext$Request$Builder setSize(long l2) {
        this.copyOnWrite();
        AttributeContext$Request.access$7200((AttributeContext$Request)this.instance, l2);
        return this;
    }

    public AttributeContext$Request$Builder setTime(Timestamp$Builder timestampOrBuilder) {
        this.copyOnWrite();
        AttributeContext$Request attributeContext$Request = (AttributeContext$Request)this.instance;
        timestampOrBuilder = (Timestamp)timestampOrBuilder.build();
        AttributeContext$Request.access$6900(attributeContext$Request, (Timestamp)timestampOrBuilder);
        return this;
    }

    public AttributeContext$Request$Builder setTime(Timestamp timestamp) {
        this.copyOnWrite();
        AttributeContext$Request.access$6900((AttributeContext$Request)this.instance, timestamp);
        return this;
    }
}

