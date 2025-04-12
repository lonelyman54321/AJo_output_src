/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.WaitOperationRequest;
import com.google.longrunning.WaitOperationRequest$1;
import com.google.longrunning.WaitOperationRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.Duration$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class WaitOperationRequest$Builder
extends GeneratedMessageLite$Builder
implements WaitOperationRequestOrBuilder {
    private WaitOperationRequest$Builder() {
        WaitOperationRequest waitOperationRequest = WaitOperationRequest.access$000();
        super(waitOperationRequest);
    }

    public /* synthetic */ WaitOperationRequest$Builder(WaitOperationRequest$1 waitOperationRequest$1) {
        this();
    }

    public WaitOperationRequest$Builder clearName() {
        this.copyOnWrite();
        WaitOperationRequest.access$200((WaitOperationRequest)this.instance);
        return this;
    }

    public WaitOperationRequest$Builder clearTimeout() {
        this.copyOnWrite();
        WaitOperationRequest.access$600((WaitOperationRequest)this.instance);
        return this;
    }

    public String getName() {
        return ((WaitOperationRequest)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((WaitOperationRequest)this.instance).getNameBytes();
    }

    public Duration getTimeout() {
        return ((WaitOperationRequest)this.instance).getTimeout();
    }

    public boolean hasTimeout() {
        return ((WaitOperationRequest)this.instance).hasTimeout();
    }

    public WaitOperationRequest$Builder mergeTimeout(Duration duration) {
        this.copyOnWrite();
        WaitOperationRequest.access$500((WaitOperationRequest)this.instance, duration);
        return this;
    }

    public WaitOperationRequest$Builder setName(String string2) {
        this.copyOnWrite();
        WaitOperationRequest.access$100((WaitOperationRequest)this.instance, string2);
        return this;
    }

    public WaitOperationRequest$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        WaitOperationRequest.access$300((WaitOperationRequest)this.instance, byteString);
        return this;
    }

    public WaitOperationRequest$Builder setTimeout(Duration$Builder durationOrBuilder) {
        this.copyOnWrite();
        WaitOperationRequest waitOperationRequest = (WaitOperationRequest)this.instance;
        durationOrBuilder = (Duration)durationOrBuilder.build();
        WaitOperationRequest.access$400(waitOperationRequest, (Duration)durationOrBuilder);
        return this;
    }

    public WaitOperationRequest$Builder setTimeout(Duration duration) {
        this.copyOnWrite();
        WaitOperationRequest.access$400((WaitOperationRequest)this.instance, duration);
        return this;
    }
}

