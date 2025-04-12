/*
 * Decompiled with CFR 0.152.
 */
package com.google.logging.type;

import com.google.logging.type.HttpRequest;
import com.google.logging.type.HttpRequest$1;
import com.google.logging.type.HttpRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.Duration$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class HttpRequest$Builder
extends GeneratedMessageLite$Builder
implements HttpRequestOrBuilder {
    private HttpRequest$Builder() {
        HttpRequest httpRequest = HttpRequest.access$000();
        super(httpRequest);
    }

    public /* synthetic */ HttpRequest$Builder(HttpRequest$1 httpRequest$1) {
        this();
    }

    public HttpRequest$Builder clearCacheFillBytes() {
        this.copyOnWrite();
        HttpRequest.access$3500((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearCacheHit() {
        this.copyOnWrite();
        HttpRequest.access$3100((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearCacheLookup() {
        this.copyOnWrite();
        HttpRequest.access$2900((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearCacheValidatedWithOriginServer() {
        this.copyOnWrite();
        HttpRequest.access$3300((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearLatency() {
        this.copyOnWrite();
        HttpRequest.access$2700((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearProtocol() {
        this.copyOnWrite();
        HttpRequest.access$3700((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearReferer() {
        this.copyOnWrite();
        HttpRequest.access$2300((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearRemoteIp() {
        this.copyOnWrite();
        HttpRequest.access$1700((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearRequestMethod() {
        this.copyOnWrite();
        HttpRequest.access$200((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearRequestSize() {
        this.copyOnWrite();
        HttpRequest.access$800((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearRequestUrl() {
        this.copyOnWrite();
        HttpRequest.access$500((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearResponseSize() {
        this.copyOnWrite();
        HttpRequest.access$1200((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearServerIp() {
        this.copyOnWrite();
        HttpRequest.access$2000((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearStatus() {
        this.copyOnWrite();
        HttpRequest.access$1000((HttpRequest)this.instance);
        return this;
    }

    public HttpRequest$Builder clearUserAgent() {
        this.copyOnWrite();
        HttpRequest.access$1400((HttpRequest)this.instance);
        return this;
    }

    public long getCacheFillBytes() {
        return ((HttpRequest)this.instance).getCacheFillBytes();
    }

    public boolean getCacheHit() {
        return ((HttpRequest)this.instance).getCacheHit();
    }

    public boolean getCacheLookup() {
        return ((HttpRequest)this.instance).getCacheLookup();
    }

    public boolean getCacheValidatedWithOriginServer() {
        return ((HttpRequest)this.instance).getCacheValidatedWithOriginServer();
    }

    public Duration getLatency() {
        return ((HttpRequest)this.instance).getLatency();
    }

    public String getProtocol() {
        return ((HttpRequest)this.instance).getProtocol();
    }

    public ByteString getProtocolBytes() {
        return ((HttpRequest)this.instance).getProtocolBytes();
    }

    public String getReferer() {
        return ((HttpRequest)this.instance).getReferer();
    }

    public ByteString getRefererBytes() {
        return ((HttpRequest)this.instance).getRefererBytes();
    }

    public String getRemoteIp() {
        return ((HttpRequest)this.instance).getRemoteIp();
    }

    public ByteString getRemoteIpBytes() {
        return ((HttpRequest)this.instance).getRemoteIpBytes();
    }

    public String getRequestMethod() {
        return ((HttpRequest)this.instance).getRequestMethod();
    }

    public ByteString getRequestMethodBytes() {
        return ((HttpRequest)this.instance).getRequestMethodBytes();
    }

    public long getRequestSize() {
        return ((HttpRequest)this.instance).getRequestSize();
    }

    public String getRequestUrl() {
        return ((HttpRequest)this.instance).getRequestUrl();
    }

    public ByteString getRequestUrlBytes() {
        return ((HttpRequest)this.instance).getRequestUrlBytes();
    }

    public long getResponseSize() {
        return ((HttpRequest)this.instance).getResponseSize();
    }

    public String getServerIp() {
        return ((HttpRequest)this.instance).getServerIp();
    }

    public ByteString getServerIpBytes() {
        return ((HttpRequest)this.instance).getServerIpBytes();
    }

    public int getStatus() {
        return ((HttpRequest)this.instance).getStatus();
    }

    public String getUserAgent() {
        return ((HttpRequest)this.instance).getUserAgent();
    }

    public ByteString getUserAgentBytes() {
        return ((HttpRequest)this.instance).getUserAgentBytes();
    }

    public boolean hasLatency() {
        return ((HttpRequest)this.instance).hasLatency();
    }

    public HttpRequest$Builder mergeLatency(Duration duration) {
        this.copyOnWrite();
        HttpRequest.access$2600((HttpRequest)this.instance, duration);
        return this;
    }

    public HttpRequest$Builder setCacheFillBytes(long l2) {
        this.copyOnWrite();
        HttpRequest.access$3400((HttpRequest)this.instance, l2);
        return this;
    }

    public HttpRequest$Builder setCacheHit(boolean bl2) {
        this.copyOnWrite();
        HttpRequest.access$3000((HttpRequest)this.instance, bl2);
        return this;
    }

    public HttpRequest$Builder setCacheLookup(boolean bl2) {
        this.copyOnWrite();
        HttpRequest.access$2800((HttpRequest)this.instance, bl2);
        return this;
    }

    public HttpRequest$Builder setCacheValidatedWithOriginServer(boolean bl2) {
        this.copyOnWrite();
        HttpRequest.access$3200((HttpRequest)this.instance, bl2);
        return this;
    }

    public HttpRequest$Builder setLatency(Duration$Builder durationOrBuilder) {
        this.copyOnWrite();
        HttpRequest httpRequest = (HttpRequest)this.instance;
        durationOrBuilder = (Duration)durationOrBuilder.build();
        HttpRequest.access$2500(httpRequest, (Duration)durationOrBuilder);
        return this;
    }

    public HttpRequest$Builder setLatency(Duration duration) {
        this.copyOnWrite();
        HttpRequest.access$2500((HttpRequest)this.instance, duration);
        return this;
    }

    public HttpRequest$Builder setProtocol(String string2) {
        this.copyOnWrite();
        HttpRequest.access$3600((HttpRequest)this.instance, string2);
        return this;
    }

    public HttpRequest$Builder setProtocolBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRequest.access$3800((HttpRequest)this.instance, byteString);
        return this;
    }

    public HttpRequest$Builder setReferer(String string2) {
        this.copyOnWrite();
        HttpRequest.access$2200((HttpRequest)this.instance, string2);
        return this;
    }

    public HttpRequest$Builder setRefererBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRequest.access$2400((HttpRequest)this.instance, byteString);
        return this;
    }

    public HttpRequest$Builder setRemoteIp(String string2) {
        this.copyOnWrite();
        HttpRequest.access$1600((HttpRequest)this.instance, string2);
        return this;
    }

    public HttpRequest$Builder setRemoteIpBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRequest.access$1800((HttpRequest)this.instance, byteString);
        return this;
    }

    public HttpRequest$Builder setRequestMethod(String string2) {
        this.copyOnWrite();
        HttpRequest.access$100((HttpRequest)this.instance, string2);
        return this;
    }

    public HttpRequest$Builder setRequestMethodBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRequest.access$300((HttpRequest)this.instance, byteString);
        return this;
    }

    public HttpRequest$Builder setRequestSize(long l2) {
        this.copyOnWrite();
        HttpRequest.access$700((HttpRequest)this.instance, l2);
        return this;
    }

    public HttpRequest$Builder setRequestUrl(String string2) {
        this.copyOnWrite();
        HttpRequest.access$400((HttpRequest)this.instance, string2);
        return this;
    }

    public HttpRequest$Builder setRequestUrlBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRequest.access$600((HttpRequest)this.instance, byteString);
        return this;
    }

    public HttpRequest$Builder setResponseSize(long l2) {
        this.copyOnWrite();
        HttpRequest.access$1100((HttpRequest)this.instance, l2);
        return this;
    }

    public HttpRequest$Builder setServerIp(String string2) {
        this.copyOnWrite();
        HttpRequest.access$1900((HttpRequest)this.instance, string2);
        return this;
    }

    public HttpRequest$Builder setServerIpBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRequest.access$2100((HttpRequest)this.instance, byteString);
        return this;
    }

    public HttpRequest$Builder setStatus(int n3) {
        this.copyOnWrite();
        HttpRequest.access$900((HttpRequest)this.instance, n3);
        return this;
    }

    public HttpRequest$Builder setUserAgent(String string2) {
        this.copyOnWrite();
        HttpRequest.access$1300((HttpRequest)this.instance, string2);
        return this;
    }

    public HttpRequest$Builder setUserAgentBytes(ByteString byteString) {
        this.copyOnWrite();
        HttpRequest.access$1500((HttpRequest)this.instance, byteString);
        return this;
    }
}

