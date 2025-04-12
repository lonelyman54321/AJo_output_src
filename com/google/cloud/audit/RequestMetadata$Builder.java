/*
 * Decompiled with CFR 0.152.
 */
package com.google.cloud.audit;

import com.google.cloud.audit.RequestMetadata;
import com.google.cloud.audit.RequestMetadata$1;
import com.google.cloud.audit.RequestMetadataOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class RequestMetadata$Builder
extends GeneratedMessageLite$Builder
implements RequestMetadataOrBuilder {
    private RequestMetadata$Builder() {
        RequestMetadata requestMetadata = RequestMetadata.access$000();
        super(requestMetadata);
    }

    public /* synthetic */ RequestMetadata$Builder(RequestMetadata$1 requestMetadata$1) {
        this();
    }

    public RequestMetadata$Builder clearCallerIp() {
        this.copyOnWrite();
        RequestMetadata.access$200((RequestMetadata)this.instance);
        return this;
    }

    public RequestMetadata$Builder clearCallerSuppliedUserAgent() {
        this.copyOnWrite();
        RequestMetadata.access$500((RequestMetadata)this.instance);
        return this;
    }

    public String getCallerIp() {
        return ((RequestMetadata)this.instance).getCallerIp();
    }

    public ByteString getCallerIpBytes() {
        return ((RequestMetadata)this.instance).getCallerIpBytes();
    }

    public String getCallerSuppliedUserAgent() {
        return ((RequestMetadata)this.instance).getCallerSuppliedUserAgent();
    }

    public ByteString getCallerSuppliedUserAgentBytes() {
        return ((RequestMetadata)this.instance).getCallerSuppliedUserAgentBytes();
    }

    public RequestMetadata$Builder setCallerIp(String string2) {
        this.copyOnWrite();
        RequestMetadata.access$100((RequestMetadata)this.instance, string2);
        return this;
    }

    public RequestMetadata$Builder setCallerIpBytes(ByteString byteString) {
        this.copyOnWrite();
        RequestMetadata.access$300((RequestMetadata)this.instance, byteString);
        return this;
    }

    public RequestMetadata$Builder setCallerSuppliedUserAgent(String string2) {
        this.copyOnWrite();
        RequestMetadata.access$400((RequestMetadata)this.instance, string2);
        return this;
    }

    public RequestMetadata$Builder setCallerSuppliedUserAgentBytes(ByteString byteString) {
        this.copyOnWrite();
        RequestMetadata.access$600((RequestMetadata)this.instance, byteString);
        return this;
    }
}

