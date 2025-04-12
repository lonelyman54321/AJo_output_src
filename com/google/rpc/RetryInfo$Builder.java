/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.Duration;
import com.google.protobuf.Duration$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.RetryInfo;
import com.google.rpc.RetryInfo$1;
import com.google.rpc.RetryInfoOrBuilder;

public final class RetryInfo$Builder
extends GeneratedMessageLite$Builder
implements RetryInfoOrBuilder {
    private RetryInfo$Builder() {
        RetryInfo retryInfo = RetryInfo.access$000();
        super(retryInfo);
    }

    public /* synthetic */ RetryInfo$Builder(RetryInfo$1 retryInfo$1) {
        this();
    }

    public RetryInfo$Builder clearRetryDelay() {
        this.copyOnWrite();
        RetryInfo.access$300((RetryInfo)this.instance);
        return this;
    }

    public Duration getRetryDelay() {
        return ((RetryInfo)this.instance).getRetryDelay();
    }

    public boolean hasRetryDelay() {
        return ((RetryInfo)this.instance).hasRetryDelay();
    }

    public RetryInfo$Builder mergeRetryDelay(Duration duration) {
        this.copyOnWrite();
        RetryInfo.access$200((RetryInfo)this.instance, duration);
        return this;
    }

    public RetryInfo$Builder setRetryDelay(Duration$Builder durationOrBuilder) {
        this.copyOnWrite();
        RetryInfo retryInfo = (RetryInfo)this.instance;
        durationOrBuilder = (Duration)durationOrBuilder.build();
        RetryInfo.access$100(retryInfo, (Duration)durationOrBuilder);
        return this;
    }

    public RetryInfo$Builder setRetryDelay(Duration duration) {
        this.copyOnWrite();
        RetryInfo.access$100((RetryInfo)this.instance, duration);
        return this;
    }
}

