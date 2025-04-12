/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.RequestInfo;
import com.google.rpc.RequestInfo$1;
import com.google.rpc.RequestInfoOrBuilder;

public final class RequestInfo$Builder
extends GeneratedMessageLite$Builder
implements RequestInfoOrBuilder {
    private RequestInfo$Builder() {
        RequestInfo requestInfo = RequestInfo.access$000();
        super(requestInfo);
    }

    public /* synthetic */ RequestInfo$Builder(RequestInfo$1 requestInfo$1) {
        this();
    }

    public RequestInfo$Builder clearRequestId() {
        this.copyOnWrite();
        RequestInfo.access$200((RequestInfo)this.instance);
        return this;
    }

    public RequestInfo$Builder clearServingData() {
        this.copyOnWrite();
        RequestInfo.access$500((RequestInfo)this.instance);
        return this;
    }

    public String getRequestId() {
        return ((RequestInfo)this.instance).getRequestId();
    }

    public ByteString getRequestIdBytes() {
        return ((RequestInfo)this.instance).getRequestIdBytes();
    }

    public String getServingData() {
        return ((RequestInfo)this.instance).getServingData();
    }

    public ByteString getServingDataBytes() {
        return ((RequestInfo)this.instance).getServingDataBytes();
    }

    public RequestInfo$Builder setRequestId(String string2) {
        this.copyOnWrite();
        RequestInfo.access$100((RequestInfo)this.instance, string2);
        return this;
    }

    public RequestInfo$Builder setRequestIdBytes(ByteString byteString) {
        this.copyOnWrite();
        RequestInfo.access$300((RequestInfo)this.instance, byteString);
        return this;
    }

    public RequestInfo$Builder setServingData(String string2) {
        this.copyOnWrite();
        RequestInfo.access$400((RequestInfo)this.instance, string2);
        return this;
    }

    public RequestInfo$Builder setServingDataBytes(ByteString byteString) {
        this.copyOnWrite();
        RequestInfo.access$600((RequestInfo)this.instance, byteString);
        return this;
    }
}

